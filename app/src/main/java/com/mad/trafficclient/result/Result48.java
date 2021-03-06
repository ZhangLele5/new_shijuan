package com.mad.trafficclient.result;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Android Studio.
 * Author: 蔡明鹏
 */
public class Result48 {
    /**
     * RESULT : S
     * ERRMSG : 查询成功
     * ROWS_DETAIL : [{"Highway":"荣乌高速","Number":"G18","isNormal":true,"Tolls":[{"Name":"新河收费站","isNormal":true},{"Name":"灰埠收费站","isNormal":true}]}]
     */

    @SerializedName("RESULT")
    private String RESULT;
    @SerializedName("ERRMSG")
    private String ERRMSG;
    @SerializedName("ROWS_DETAIL")
    private List<ROWSDETAIL> ROWSDETAIL;

    public static Result48 objectFromData(String str) {

        return new Gson().fromJson(str, Result48.class);
    }

    public String getRESULT() {
        return RESULT;
    }

    public void setRESULT(String RESULT) {
        this.RESULT = RESULT;
    }

    public String getERRMSG() {
        return ERRMSG;
    }

    public void setERRMSG(String ERRMSG) {
        this.ERRMSG = ERRMSG;
    }

    public List<ROWSDETAIL> getROWSDETAIL() {
        return ROWSDETAIL;
    }

    public void setROWSDETAIL(List<ROWSDETAIL> ROWSDETAIL) {
        this.ROWSDETAIL = ROWSDETAIL;
    }

    public static class ROWSDETAIL {
        /**
         * Highway : 荣乌高速
         * Number : G18
         * isNormal : true
         * Tolls : [{"Name":"新河收费站","isNormal":true},{"Name":"灰埠收费站","isNormal":true}]
         */

        @SerializedName("Highway")
        private String Highway;
        @SerializedName("Number")
        private String Number;
        @SerializedName("isNormal")
        private boolean isNormal;
        @SerializedName("Tolls")
        private List<Tolls> Tolls;

        public static ROWSDETAIL objectFromData(String str) {

            return new Gson().fromJson(str, ROWSDETAIL.class);
        }

        public String getHighway() {
            return Highway;
        }

        public void setHighway(String Highway) {
            this.Highway = Highway;
        }

        public String getNumber() {
            return Number;
        }

        public void setNumber(String Number) {
            this.Number = Number;
        }

        public boolean isIsNormal() {
            return isNormal;
        }

        public void setIsNormal(boolean isNormal) {
            this.isNormal = isNormal;
        }

        public List<Tolls> getTolls() {
            return Tolls;
        }

        public void setTolls(List<Tolls> Tolls) {
            this.Tolls = Tolls;
        }

        public static class Tolls {
            /**
             * Name : 新河收费站
             * isNormal : true
             */

            @SerializedName("Name")
            private String Name;
            @SerializedName("isNormal")
            private boolean isNormal;

            public static Tolls objectFromData(String str) {

                return new Gson().fromJson(str, Tolls.class);
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public boolean isIsNormal() {
                return isNormal;
            }

            public void setIsNormal(boolean isNormal) {
                this.isNormal = isNormal;
            }
        }
    }
}
