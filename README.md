# Consumindo API ViaCep - Quarkus, MicroProfile e Maven.

Este serviço é uma integração com a API da ViaCep usando o Quarkus, MicroProfile e Maven.

O serviço conta com:
- Tratamento das exceções (CEP inválido, CEP não encontrado);
- Tratamento da entrada do cep - a API só aceita 8 caracteres e tem de ser dígitos.

&nbsp;
# Como rodar e testar o software
### OPÇÃO 1
&emsp;Run da própria IDE

### OPÇÃO 2 _(pela CLI)_

    $ mvn quarkus:dev

&emsp;** _Para parar o serviço usar o CTRL + C_

### OPÇÃO 3 _(pela CLI)_

    $ mvn package

    $ java -jar target/quarkus-app/quarkus-run.jar

&emsp;** _Para parar o serviço usar o CTRL + C_


&nbsp;
# GET - consultaCep

  exibe as informações correspondentes ao cep informado;

    http://localhost:8080/cep/consulta/{cep}

EXEMPLO:

Request

    GET     localhost:8080/cep/consulta/81280-340

Response

    {
      "cep": "81280-340",
	  "logradouro": "Rua Deputado Heitor Alencar Furtado",
	  "bairro": "Cidade Industrial",
	  "localidade": "Curitiba",
	  "uf": "PR",
	  "ibge": "4106902",
	  "gia": "",
	  "ddd": "41",
	  "siafi": "7535"   
    }
