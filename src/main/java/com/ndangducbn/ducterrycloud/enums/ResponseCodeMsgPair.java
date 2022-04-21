package com.ndangducbn.ducterrycloud.enums;

public enum ResponseCodeMsgPair implements ResponseCodeInterface {
    SUCCESS(1000, "SERVICE_SUCCESS"),
    HEALTH_CHECK_SUCCESS(1001, "HEALTH_CHECK_SUCCESS"),
    INTERNAL_SERVER_ERROR(500, "INTERNAL_SERVER_ERROR"),
    INVALID_ACCESS_TOKEN(400, "INVALID_ACCESS_TOKEN"),
    UNAUTHORIZED_ERROR(401, "UNAUTHORIZED_ERROR"),
    PERMISSION_DENIED_ERROR(403, "PERMISSION_DENIED_ERROR"),
    CREATED_SUCCESS(10201, "CREATED_SUCCESS"),
    CLIENT_REQUEST_ERROR(10400, "CLIENT_REQUEST_ERROR"),
    MISSING_PARAMETER_ERROR(10401, "MISSING_PARAMETER_ERROR"),
    INVALID_PARAMETER_ERROR(10402, "INVALID_PARAMETER_ERROR"),
    ENTITY_NOT_FOUND_ERROR(10403, "ENTITY_NOT_FOUND_ERROR"),
    BUSINESS_LOGIC_ERROR(10500, "BUSINESS_LOGIC_ERROR"),
    CONSTRAINT_VIOLATION_ERROR(10501, "CONSTRAINT_VIOLATION_ERROR"),
    ACCOUNT_NOT_REGISTERED_YET(10501, "ACCOUNT_NOT_REGISTERED_YET"),
    TOKEN_EXPIRE_ERROR(402, "TOKEN_EXPIRED"),

    ;
    public String message;
    public int code;

    ResponseCodeMsgPair(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return message;
    }
}
