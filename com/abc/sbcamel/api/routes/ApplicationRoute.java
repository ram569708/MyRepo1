package com.abc.sbcamel.api.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		restConfiguration()
			.component("servlet")
			.host("localhost")
			.port(8081)
			.bindingMode(RestBindingMode.auto);
		
		
		rest()
			.get("/home")
				.route()
				.setBody(constant("Welcome to ABC homepage"))
		.endRest();
	}

}
