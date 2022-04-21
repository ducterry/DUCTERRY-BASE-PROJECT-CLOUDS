package com.ndangducbn.ducterrycloud.constants;

import java.util.HashMap;


public class Constants {
    public static final String ENV_ALIAS_STAGE = "ALIAS_STAGE";
    public static final String ROLES_FIELD_NAME = "roles";
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String LEVEL_FIELD_NAME = "level";

    public static final Long TIME_OUT_FOR_CREATE_NEW_LOG_STREAM = 30L * 60000;
    public static final Long TIME_OUT_FOR_CREATE_NEW_LOG_STREAM_BY_LAST_EVENT = 5L * 60000;


    public static final int RESPONSE_CODE_SUCCESS = 1000;
    public static final int RESPONSE_CODE_FAILED = 2000;

    public static Integer LIMIT_CCU = System.getenv("LIMIT_CCU") == null ?
            2000 :
            Integer.parseInt(System.getenv("LIMIT_CCU"));

    public static String COMMON_FG_INSIDE_TOKEN = System.getenv("FG_INSIDE_TOKEN");
    public static String COMMON_CID = System.getenv("CID");
    public static String FMM_TAS_URL = System.getenv("FMM_TAS_URL");

    public static HashMap<String, String> MAP_EF = new HashMap<>();
}
