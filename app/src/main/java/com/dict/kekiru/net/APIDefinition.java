package com.dict.kekiru.net;

import com.dict.kekiru.utility.Config;

/**
 * Created by ToanDV on 8/5/16.
 */
public class APIDefinition {
    private static final String DEBUG_URL = "http://192.168.1.109:3001/";
    private static final String RELEASE_URL = "http://192.168.1.109:3001/";

    public static String getBaseUrl() {
        return Config.DEBUG ? DEBUG_URL : RELEASE_URL;
    }

    public class TestApi {
        public static final String PATH = "/maps/...";
        public static final String PARAM_CONTENT = "content";
        public static final String PARAM_DESCRIPTION = "description";
        public static final String PARAM_KEY = "key";
    }
}
