package com.as.AMB.account.dao;

import org.apache.ibatis.annotations.Mapper;
import com.as.AMB.account.entity.AccountVO;

import java.util.List;

@Mapper
public interface AccountDAO {
    /**
     * add account
     * @param accountVO
     * @return
     */
    int addAccount(AccountVO accountVO);

    /**
     * delete account
     * @param accountVO
     * @return
     */
    int deleteAccount(AccountVO accountVO);

    /**
     * update account
     * @param accountVO
     * @return
     */

    int updateAccount(AccountVO accountVO);

    /**
     * select account(s)
     * @param accountVO
     * @return
     */
    List<AccountVO> select(AccountVO accountVO);
}
