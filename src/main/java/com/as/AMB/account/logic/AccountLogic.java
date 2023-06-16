package com.as.AMB.account.logic;

import com.as.AMB.account.dao.AccountDAO;
import com.as.AMB.account.entity.AccountVO;
import com.as.AMB.util.CommonUtils;
import com.as.AMB.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AccountLogic {
    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    public void addAccount(AccountVO accountVO) throws Exception {
        // generate the user id
        String userId = CommonUtils.getSequence(Constants.SEQ_NAME_USER_ID);
        accountVO.setUserID(userId);
        //check role id

        int affectRows = accountDAO.addAccount(accountVO);
        if(affectRows!=1){
            throw new Exception("insert failed!");
        }
    }

    @Transactional
    public int deleteAccount(AccountVO accountVO) throws Exception {
        int affectRows = accountDAO.deleteAccount(accountVO);
        if (affectRows!=1) {
            throw new Exception("delete more than one account!");
        } else {
            return affectRows;
        }
    }

    @Transactional
    public int updateAccount(AccountVO accountVO) throws Exception {
        return accountDAO.updateAccount(accountVO);
    }

    @Transactional
    public List<AccountVO> select(AccountVO accountVO) throws Exception {
        return accountDAO.select(accountVO);
    }
}
