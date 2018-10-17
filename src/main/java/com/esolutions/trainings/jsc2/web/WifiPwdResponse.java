package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.Ejercicio4.WifiPwd;

public class WifiPwdResponse {
    String password;

    public String getPassword() {
        return password;
    }

    public void setPasswort(String password) {
        this.password = password;
    }

    public WifiPwdResponse(String password)
    {
        this.password=password;
    }
}
