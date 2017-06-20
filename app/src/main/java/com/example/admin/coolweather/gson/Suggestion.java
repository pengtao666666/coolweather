package com.example.admin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017/6/20.
 */

public class Suggestion {

    /**
     * comf : {"txt":"天气说明"}
     * cw : {"txt":"天气说明"}
     * sport : {"txt":"天气说明"}
     */

    @SerializedName("comf")
    private ComfBean comf;
    @SerializedName("cw")
    private CwBean cw;
    @SerializedName("sport")
    private SportBean sport;

    public ComfBean getComf() {
        return comf;
    }

    public void setComf(ComfBean comf) {
        this.comf = comf;
    }

    public CwBean getCw() {
        return cw;
    }

    public void setCw(CwBean cw) {
        this.cw = cw;
    }

    public SportBean getSport() {
        return sport;
    }

    public void setSport(SportBean sport) {
        this.sport = sport;
    }

    public static class ComfBean {
        /**
         * txt : 天气说明
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

    public static class CwBean {
        /**
         * txt : 天气说明
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

    public static class SportBean {
        /**
         * txt : 天气说明
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
