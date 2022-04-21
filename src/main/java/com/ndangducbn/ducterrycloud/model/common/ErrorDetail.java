package com.ndangducbn.ducterrycloud.model.common;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ErrorDetail {
    private String errorCode;
    private String errorMsg;
}
