package com.teste.producer;

import javax.enterprise.inject.Produces;

import com.google.gson.Gson;

public class GsonProducer {

	@Produces
	public Gson create() {
		return new Gson();
	}
}
