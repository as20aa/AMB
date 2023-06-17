package com.as.AMB.role.logic;

import com.as.AMB.role.dao.RoleDAO;
import com.as.AMB.role.entity.RoleVO;
import com.as.AMB.util.Constants;
import com.as.AMB.util.sequence.SequenceUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class RoleLogic {
    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private SequenceUtil sequenceUtil;

    @Transactional
    public int addRole(RoleVO roleVO) throws Exception {
        //generate role id
        String roleId = sequenceUtil.generateId(Constants.SEQ_NAME_ROLE_ID);
        roleVO.setRoleId(roleId);
        return roleDAO.addRole(roleVO);
    }

    @Transactional
    public int deleteRole(RoleVO roleVO) throws Exception {
        return roleDAO.deleteRole(roleVO);
    }

    @Transactional
    public int updateRole(RoleVO roleVO) throws Exception {
        return roleDAO.updateRole(roleVO);
    }

    @Transactional
    public List<RoleVO> select(RoleVO roleVO) throws Exception{
        return roleDAO.select(roleVO);
    }

    public boolean roleIdExist(String roleId) throws Exception {
        if(StringUtils.isEmpty(roleId))return false;
        RoleVO roleVO = new RoleVO();
        roleVO.setRoleId(roleId);
        List<RoleVO> roleVOList = roleDAO.select(roleVO);
        if(0!=roleVOList.size()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean roleNameExist(String roleName) {
        if(StringUtils.isEmpty(roleName))return false;
        RoleVO roleVO=new RoleVO();
        roleVO.setRoleName(roleName);
        List<RoleVO> roleVOList = roleDAO.select(roleVO);
        if(0!=roleVOList.size()) {
            return true;
        } else {
            return false;
        }
    }
}
