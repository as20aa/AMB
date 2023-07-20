package com.as.AMB.authorization;

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
public class Authorization {
    @Autowired
    private AccountLogic accountLogic;
    @RequestMapping(value="/login", method= RequestMethod.POST)
    public Response login(@RequestBody AccountVO accountVO) {
        // use the phone and password to check whether user is exists and return the result
        // you should think about to use phone or name or userid to login.
        String phone = accountVO.getPhone();
        String passWord = accountVO.getPwd();
        // construct a new accountvo
        AccountVO tmpVO = new AccountVO();
        tmpVO.setPhone(phone);
        tmpVO.setPwd(passWord);
        try{
            List<AccountVO> accountVOList = accountLogic.select(tmpVO);
            if (accountVOList.size()==1) {
                //TODO you can implement the login status here
                tmpVO = accountVOList.get(0);
                tmpVO.setPwd("");
                // return user information
                return RestUtil.Ok(tmpVO);
            }else {
                return RestUtil.Error("cannot not find user");
            }
        } catch (Exception e) {
            return RestUtil.Error("exception:" + e.toString());
        }
    }

    @RequestMapping(value="/logout", method=RequestMethod.POST)
    public Response logout(@RequestBody AccountVO accountVO) {
        // use the userid to logout
        String userId = accountVO.getUserId();
        // TODO use the user id to update the logout status
        return RestUtil.Ok();
    }
}
