package com.esolutions.trainings.jsc2.web;

import com.esolutions.trainings.jsc2.model.Ejercicio3.NombreRedWifi;

public class NombreRedWifiResponse {
    private String ssid;

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public NombreRedWifiResponse(String ssid)
    {
        this.ssid=ssid;

    }

}
