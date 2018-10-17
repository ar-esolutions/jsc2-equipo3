package com.esolutions.trainings.jsc2.web;

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
