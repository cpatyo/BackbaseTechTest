package com.backbase.techtest.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.model.RouteDefinition;
import org.springframework.beans.factory.annotation.Autowired;

import com.backbase.techtest.route.Route;

@WebServlet("/transactions/")
public class TransactionsList extends ServletBase{
	@Autowired
	Route routes;

	  @EndpointInject(uri="direct:teste", context="SpringCamelContext")
	  Endpoint endpoint;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 RouteDefinition route = routes.getRouteCollection().getRoutes().get(0);
		 route.autoStartup(true);
		 route.to("direct:teste");
		resp.getWriter().println("Foi!");
	}
	
}
