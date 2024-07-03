package br.com.octonaut.service;

import br.com.octonaut.client.ViaCepClient;
import br.com.octonaut.exception.CepInvalidoException;
import br.com.octonaut.exception.CepNaoEncontradoException;
import br.com.octonaut.model.EnderecoResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.reactive.RestResponse;

@RequiredArgsConstructor
@ApplicationScoped
public class EnderecoService {

    @Inject
    @RestClient
    ViaCepClient client;

    public RestResponse<?> consultaCep(String cep) {
        cep = cep.replaceAll("\\D", "");

        try{
            if (cep.length() !=8 ) {
                throw new CepInvalidoException("Cep inválido: o número do cep deve conter 8 dígitos");
            }

            EnderecoResponse response = client.consultaCep(cep);

            if(response.cep() == null) {
                throw new CepNaoEncontradoException("Cep não encontrado");
            }

            return RestResponse.ok(response);

        } catch (CepInvalidoException | CepNaoEncontradoException e) {
            return RestResponse.status(RestResponse.Status.BAD_REQUEST, e.getMessage());
        }
    }
}
