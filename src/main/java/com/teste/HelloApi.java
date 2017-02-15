package com.teste;

import spark.Request;
import spark.Response;
import java.util.Arrays;
import java.util.List;

public class HelloApi {

	public List<String> hello(Request req, Response res) {
		return Arrays.asList("first", "second","third");
	}
}
