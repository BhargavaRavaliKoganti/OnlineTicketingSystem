package com.pickmyreel.model;

public class UserBean {
	private String user;
    private String password;
   
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserBean() {
        // TODO Auto-generated constructor stub
    }
    public UserBean(String user, String password) {
        super();
        this.user = user;
        this.password = password;
    }
   


}
