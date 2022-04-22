package com.example.bharatinews.Models;

import androidx.appcompat.widget.SwitchCompat;

public class SettingsModel {
    private int type;
    int icon;
    String text;
    SwitchCompat switchbtn;
    String version;
    private boolean switchState;

    public SettingsModel(int type,int icon, String text, boolean switchState) {
        this.type = type;
        this.icon = icon;
        this.text = text;
        this.switchState = switchState;
    }

   /* public SettingsModel(int type, int icon, String text, SwitchCompat switchbtn) {
        this.type = type;
        this.icon = icon;
        this.text = text;
        this.switchbtn = switchbtn;
    }*/

    public SettingsModel(int type, int icon, String text, String version) {
        this.type = type;
        this.icon = icon;
        this.text = text;
        this.version = version;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getVersion() {
        return version;
    }

    public int getType() {
        return type;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public boolean getSwitchState() {
        return switchState;
    }

    public void setSwitchState(boolean switchState) {
        this.switchState = switchState;
    }
}
