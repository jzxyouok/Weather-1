package me.santong.weather.models.weather.suggestion;

import me.santong.weather.framework.Entity;

/**
 * Created by santong.
 * At 16/5/24 22:03
 * 穿衣指数
 */
public class Drsg extends Entity {
    private String brf;
    private String txt;

    public String getBrf() {
        return brf;
    }

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "Flu{" +
                "brf='" + brf + '\'' +
                ", txt='" + txt + '\'' +
                '}';
    }
}
