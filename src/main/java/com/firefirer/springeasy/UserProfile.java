package com.firefirer.springeasy;

public class UserProfile {

    private String userName;
    private String nickName;
    private String bind;
    private Boolean authOtp;
    private String[] roles;

    UserProfile(String userName, String nickName, String bind, Boolean authOtp, String[] roles) {
        this.userName = userName;
        this.nickName = nickName;
        this.bind = bind;
        this.authOtp = authOtp;
        this.roles = roles;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    public Boolean getAuthOtp() {
        return authOtp;
    }

    public void setAuthOtp(Boolean authOtp) {
        this.authOtp = authOtp;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

}
