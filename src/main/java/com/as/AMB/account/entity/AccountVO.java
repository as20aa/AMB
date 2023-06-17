package com.as.AMB.account.entity;

public class AccountVO {
    // user id
    public String userId;
    //user name
    public String userName;
    //user password
    public String pwd;
    //user's phone number
    public String phone;
    //user's email address
    public String email;
    //role id the user belong
    public String roleId;
    //status
    public String indStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userID) {
        this.userId = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getIndStatus() {
        return indStatus;
    }

    public void setIndStatus(String indStatus) {
        this.indStatus = indStatus;
    }

    @Override
    public String toString() {
        return "AccountVO{" +
                "userID='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", roleId='" + roleId + '\'' +
                ", indStatus='" + indStatus + '\'' +
                '}';
    }
}
