package com.backbase.techtest.route;

import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route extends SpringRouteBuilder {


	@Override
	public void configure() {
		
			from("direct:teste")
				.process(c->
					System.out.println("Vai mané")
				)
				;
	}
	
}