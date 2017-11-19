package com.unifor.trabalhowildflyswarm.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;


@Path("/disciplina")
public class Disciplina {

	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response.ok("Projeto e Arquitetura de Software!").build();
	}
	

}