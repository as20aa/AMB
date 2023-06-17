package com.as.AMB.role.service;

import com.as.AMB.account.entity.AccountVO;
import com.as.AMB.account.logic.AccountLogic;
import com.as.AMB.role.entity.RoleVO;
import com.as.AMB.role.logic.RoleLogic;
import com.as.AMB.util.Constants;
import com.as.AMB.util.Response;
import com.as.AMB.util.RestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/role")
public class RoleService {
    @Autowired
    private RoleLogic roleLogic;

    @Autowired
    private AccountLogic accountLogic;

    @RequestMapping(method=RequestMethod.POST, path="/addRole")
    public Response addRole(@RequestBody RoleVO roleVO) throws Exception {
        // check roleId
        if(roleLogic.roleNameExist(roleVO.getRoleName())) {
            return RestUtil.Error("role has already exist!");
        } else {
            if(roleLogic.addRole(roleVO)!=1) {
                return RestUtil.Error("add role error!");
            } else {
                return RestUtil.Ok();
            }
        }
    }

    @RequestMapping(method=RequestMethod.POST, path="/deleteRole")
    public Response deleteRole(@RequestBody RoleVO roleVO) throws Exception {
        //check whether is root role!
        if(roleVO.getRoleId().equals(Constants.ROOT_ROLE_ID))return RestUtil.Error("you cannot delete the root role");
        //check whether some users belong this role
        AccountVO accountVO = new AccountVO();
        accountVO.setRoleId(roleVO.getRoleId());
        List<AccountVO> accountVOList = accountLogic.select(accountVO);
        if(accountVOList.size()!=0)return RestUtil.Error("This role still has users!");
        int affectRows = roleLogic.deleteRole(roleVO);
        if(affectRows==1) {
            return RestUtil.Ok();
        } else {
            return RestUtil.Error("role is not exists");
        }

    }

    @RequestMapping(method=RequestMethod.POST, path="/updateRole")
    public Response updateRole(@RequestBody RoleVO roleVO) throws Exception {
        // check role name
        if(roleLogic.roleNameExist(roleVO.getRoleName()))return RestUtil.Error("role name has already exist");
        roleLogic.updateRole(roleVO);
        return RestUtil.Ok();
    }

    @RequestMapping(method=RequestMethod.POST, path="/selectRole")
    public Response selectRole(@RequestBody RoleVO roleVO) throws Exception {
        return RestUtil.Ok(roleLogic.select(roleVO));
    }
}
