package com.desafio.simbiose.crud.api.pessoa.web.controller.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class PessoaResponse {

    private String id;

    private String nome;

    private String email;

    private Date nascimento;
}
