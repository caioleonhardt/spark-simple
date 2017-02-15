package com.teste;

import static spark.Spark.*;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.google.gson.Gson;

public class HelloWorld {
	
	@Inject
	private Gson gson;
	
	@Inject
	private HelloApi helloApi;
	
    public void main(@Observes ContainerInitialized container) {

		path("/api", () -> {
			get("/hello", helloApi::hello, gson::toJson);			 
		});

        after((req, res) -> {
            res.header("Server", "BigServer 1.0");
            res.header("Content-Encoding", "gzip");
            
            res.type("application/json");
        });
    }
}