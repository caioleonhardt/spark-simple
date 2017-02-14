package com.teste;

import spark.Request;
import spark.Response;

public class HelloApi {

	public String hello(Request req, Response res) {
		return "Hello Caio!";
	}
}
