package com.ndangducbn.ducterrycloud.model.common;


import com.ndangducbn.ducterrycloud.constants.Constants;
import lombok.Data;

@Data
public class ResponseData<T> {
    private Integer code;
    private boolean result;
    private String message;
    private T data;

    public ResponseData(Integer code, boolean result) {
        this.code = code;
        this.result = result;
    }

    public ResponseData(boolean result) {
        this.result = result;
    }

    public ResponseData() {
    }

    public static <T> ResponseData<T> createSuccess() {
        return new ResponseData<>(Constants.RESPONSE_CODE_SUCCESS, true);
    }
    public ResponseData<T> message(String message) {
        this.message = message;
        return this;
    }

    public static <T> ResponseData<T> createFailed() {
        return new ResponseData<>(Constants.RESPONSE_CODE_FAILED, false
        );
    }

    public static <T> ResponseData<T> success() {
        return new ResponseData<T>(
                true
        );
    }

    public static <T> ResponseData<T> failed() {
        return new ResponseData<T>(false);
    }

    public ResponseData<T> result(boolean result) {
        this.result = result;
        return this;
    }

    public ResponseData<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public ResponseData<T> data(T data) {
        this.data = data;
        return this;
    }
}
