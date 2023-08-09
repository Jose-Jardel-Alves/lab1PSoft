package br.edu.ufcg.computacao.psoft.commerce.model;

import lombok.Data;

@Data
public class Pessoa {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String dataDeNascimento;
    private Endereco[] endereco;
    private String profissao;
}
