package br.com.octonaut.client;

import br.com.octonaut.model.EnderecoResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GET
    @Path("/{cep}/json")
    EnderecoResponse consultaCep(@PathParam("cep") String cep);
}
