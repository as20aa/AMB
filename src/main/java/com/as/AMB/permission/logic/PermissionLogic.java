package com.as.AMB.permission.logic;

import com.as.AMB.permission.dao.PermissionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PermissionLogic {
    @Autowired
    private PermissionDAO permissionDAO;


}
