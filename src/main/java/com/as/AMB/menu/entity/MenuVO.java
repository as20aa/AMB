package com.as.AMB.menu.entity;

public class MenuVO {
    //menu id
    private String menuId;
    //menu name
    private String menuName;
    // parent menu id
    private String parentMenuId;
    // status
    private String indStatus;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(String parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus;
    }

    @Override
    public String toString() {
        return "MenuVO{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", parentMenuId='" + parentMenuId + '\'' +
                ", indStatus='" + indStatus + '\'' +
                '}';
    }
}
