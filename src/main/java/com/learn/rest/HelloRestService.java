package com.learn.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

@Controller
@Path("/hello")
public class HelloRestService {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String plainTextTypeReply()
	{
		return "Hello REST, this is a string response using Jersey";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String xmlTypeReply()
	{
		return "<?xml version=\"1.0\"?>" + "<hello> Hello  REST, this is an XML response using Jersey" + "</hello>";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String htmlTypeReply()
	{
		return "<html> " + "<title>" + "Hello Jersey" + "</title>"
		        + "<body><h1>" + "Hello REST, this is HTML response using Jersey" + "</body></h1>" + "</html> ";
	}
	
}
