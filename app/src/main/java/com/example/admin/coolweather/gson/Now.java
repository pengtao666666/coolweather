package com.example.admin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017/6/20.
 */

public class Now {

    /**
     * tmp : 29
     * cond : {"txt":"阵雨"}
     */

    @SerializedName("tmp")
    private String tmp;
    @SerializedName("cond")
    private CondBean cond;

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public CondBean getCond() {
        return cond;
    }

    public void setCond(CondBean cond) {
        this.cond = cond;
    }

    public static class CondBean {
        /**
         * txt : 阵雨
         */

        @SerializedName("txt")
        private String txt;

        public String getTxt() {
            return txt;
        }

        public void setTxt(String txt) {
            this.txt = txt;
        }
    }
}
