package com.esolutions.trainings.jsc2.web;

public class WifiPwdResponse {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public WifiPwdResponse(String password)
    {
        this.password=password;
    }
}
