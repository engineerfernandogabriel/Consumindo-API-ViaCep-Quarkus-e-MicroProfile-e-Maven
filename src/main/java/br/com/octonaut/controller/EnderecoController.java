package br.com.octonaut.controller;

import br.com.octonaut.service.EnderecoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import lombok.RequiredArgsConstructor;
import org.jboss.resteasy.reactive.RestResponse;

@RequiredArgsConstructor
@Path("/cep")
public class EnderecoController {

    @Inject
    private EnderecoService service;

    @GET
    @Path("/consulta/{cep}")
    public RestResponse<?> consultaCep(@PathParam("cep") String cep) {
        return service.consultaCep(cep);
    }
}
