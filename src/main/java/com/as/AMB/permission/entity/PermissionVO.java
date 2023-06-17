package com.as.AMB.permission.entity;

import java.util.List;

public class PermissionVO {
    private String roleId;
    private List<String> menus;
    private String indStatus;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus;
    }

    @Override
    public String toString() {
        return "PermissionVO{" +
                "roleId='" + roleId + '\'' +
                ", menus=" + menus +
                ", indStatus='" + indStatus + '\'' +
                '}';
    }
}
