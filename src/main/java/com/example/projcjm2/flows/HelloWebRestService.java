package com.example.projcjm2.flows;

import org.springframework.stereotype.Component;
import org.springframework.web.service.annotation.GetExchange;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Component
@Path("/helloworld")
public class HelloWebRestService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return "hello world - Jersey is here :)";
    }
    
}
