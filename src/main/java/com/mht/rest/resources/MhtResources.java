package com.mht.rest.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/Mht")
public class MhtResources {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String seyMht() {
        return "MHT NO1";
    }


}
