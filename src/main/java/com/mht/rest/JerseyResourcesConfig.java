package com.mht.rest;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyResourcesConfig extends ResourceConfig{
    public JerseyResourcesConfig(){
        //服务器所在位置
        packages("com.mht.rest.resources");
    }

}
