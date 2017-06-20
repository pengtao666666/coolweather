package com.example.admin.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by admin on 2017/6/20.
 */

public class Daily_forecast {

    /**
     * date : 2016-08-08
     * cond : {"txt_d":"阵雨"}
     * tmp : {"max":"35","min":"27"}
     */

    @SerializedName("date")
    private String date;
    @SerializedName("cond")
    private CondBean cond;
    @SerializedName("tmp")
    private TmpBean tmp;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CondBean getCond() {
        return cond;
    }

    public void setCond(CondBean cond) {
        this.cond = cond;
    }

    public TmpBean getTmp() {
        return tmp;
    }

    public void setTmp(TmpBean tmp) {
        this.tmp = tmp;
    }

    public static class CondBean {
        /**
         * txt_d : 阵雨
         */

        @SerializedName("txt_d")
        private String txtD;

        public String getTxtD() {
            return txtD;
        }

        public void setTxtD(String txtD) {
            this.txtD = txtD;
        }
    }

    public static class TmpBean {
        /**
         * max : 35
         * min : 27
         */

        @SerializedName("max")
        private String max;
        @SerializedName("min")
        private String min;

        public String getMax() {
            return max;
        }

        public void setMax(String max) {
            this.max = max;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }
    }
}
