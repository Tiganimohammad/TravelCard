package com.example.tigani.travelcard.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tigani on 11/4/2017.
 */

public class ResgisterationPojo
{
    @SerializedName("error")
    @Expose
    private boolean error;
    @SerializedName("error_msg")
    @Expose
    private String errorMsg;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
