package com.ndangducbn.ducterrycloud.model.common;

import lombok.Data;

@Data
public class InstanceRegister {
    private String cid;
    private String zid;
    private String app;
    private String module;
    private String subModule;
    private String dockerId;
}
