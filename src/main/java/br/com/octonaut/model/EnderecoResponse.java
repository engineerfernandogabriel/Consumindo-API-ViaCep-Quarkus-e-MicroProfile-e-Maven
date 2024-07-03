package br.com.octonaut.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record EnderecoResponse(
        @JsonProperty("cep") String cep,
        @JsonProperty("logradouro") String logradouro,
        @JsonProperty("bairro") String bairro,
        @JsonProperty("localidade") String localidade,
        @JsonProperty("uf") String uf,
        @JsonProperty("ibge") String ibge,
        @JsonProperty("gia") String gia,
        @JsonProperty("ddd") String ddd,
        @JsonProperty("siafi") String siafi) {
}
