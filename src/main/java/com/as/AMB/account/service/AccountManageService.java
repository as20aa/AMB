package com.as.AMB.account.service;

import com.as.AMB.role.logic.RoleLogic;
import org.apache.commons.lang3.StringUtils;
import com.as.AMB.account.entity.AccountVO;
import com.as.AMB.account.logic.AccountLogic;
import com.as.AMB.util.Response;
import com.as.AMB.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accountManage")
public class AccountManageService {
    @Autowired
    private AccountLogic accountLogic;
    @Autowired
    private RoleLogic roleLogic;
    @RequestMapping(method=RequestMethod.POST, path="/addAccount")
    public Response addAccount(@RequestBody AccountVO accountVO) throws Exception {
        //check role id
        if (roleLogic.roleIdExist(accountVO.getRoleId())) {
            accountLogic.addAccount(accountVO);
            return RestUtil.Ok();
        } else {
            return RestUtil.Error("role id is not exist!");
        }

    }

    @RequestMapping(method=RequestMethod.POST, path="/deleteAccount")
    public Response deleteAccount(@RequestBody AccountVO accountVO) throws Exception {
        // verify the user id
        if (StringUtils.isEmpty(accountVO.getUserId())) {
            return RestUtil.Error("You have to specify the user Id");
        }
        accountLogic.deleteAccount(accountVO);
        return RestUtil.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, path="/updateAccount")
    public Response updateAccount(@RequestBody AccountVO accountVO) throws Exception {
        // verify the user id
        if (StringUtils.isEmpty(accountVO.getUserId())) {
            return RestUtil.Error("You have to specify the user Id");
        }
        accountLogic.updateAccount(accountVO);
        return RestUtil.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, path="/selectAccount")
    public Response select(@RequestBody AccountVO accountVO) throws Exception {
        List<AccountVO> accountVOList = accountLogic.select(accountVO);
        // process the account list
        if (accountVOList.size()!=0) {
            for(int i=0;i<accountVOList.size();i++) {
                accountVOList.get(i).setPwd("");
            }
        }
        return RestUtil.Ok(accountVOList);
    }
}
