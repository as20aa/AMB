package com.as.AMB.permission.logic;

import com.as.AMB.permission.dao.PermissionDAO;
import com.as.AMB.permission.entity.PermissionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PermissionLogic {
    @Autowired
    private PermissionDAO permissionDAO;

    @Transactional
    public int addPermission(PermissionVO permissionVO) {
        return permissionDAO.addPermission(permissionVO);
    }

    @Transactional
    public int deletePermission(PermissionVO permissionVO) {
        return permissionDAO.deletePermission(permissionVO);
    }

    @Transactional
    public int updatePermission(PermissionVO permissionVO) {
        return permissionDAO.updatePermission(permissionVO);
    }

    @Transactional
    public List<PermissionVO> selectPermission(PermissionVO permissionVO) {
        return permissionDAO.selectPermission(permissionVO);
    }
}
