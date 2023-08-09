package br.edu.ufcg.computacao.psoft.commerce.model;

import lombok.Data;

@Data
public class Endereco {
    private int id;
    private String tipoDeLogradouro;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

}
