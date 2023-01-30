package com.uendel.gerenciamento.livros.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LivroNaoEncontradoExcecao extends Exception  {

	public LivroNaoEncontradoExcecao(Long id) {
		super(String.format("Livro com id não encontrado", id));
		// TODO Auto-generated constructor stub
	}

	
	
}
