package com.ndangducbn.ducterrycloud.model.common;

import lombok.Data;

@Data
public class ServiceRegister {
    private String cid;
    private String zid;
    private String app;
    private String module;
    private String subModule;
    private String functionName;
    private String endpointLocal;
    private String endpointInternal;
    private String endpointExternal;
    private String projectName;
}
