package com.ndangducbn.ducterrycloud.utils;


import com.ndangducbn.ducterrycloud.enums.ResponseCodeInterface;
import com.ndangducbn.ducterrycloud.model.common.ResponseData;


public class ResponseUtils {

    public static void setErrorResponseDataMessage(ResponseData responseData, Exception e) {
        StringBuilder message = new StringBuilder(e.getMessage() != null ? e.getMessage() : "");
        for (StackTraceElement stackTraceElement : e.getStackTrace()) {
            message.append("\n \t at ").append(stackTraceElement);
        }
        responseData.setMessage(message.toString());
    }

    public static void setCodeMessage(ResponseData responseData, ResponseCodeInterface pair) {
        responseData.setCode(pair.getCode());
        responseData.setMessage(pair.getMessage());
    }
}
