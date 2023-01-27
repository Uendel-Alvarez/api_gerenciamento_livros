package com.uendel.gerenciamento.livros.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uendel.gerenciamento.livros.dto.LivroDTO;
import com.uendel.gerenciamento.livros.dto.MessageResponseDTO;
import com.uendel.gerenciamento.livros.entidade.Livro;
import com.uendel.gerenciamento.livros.repositorio.LivroRepositorio;
import com.uendel.gerenciamento.livros.servico.LivroServico;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroControlador {

	private LivroServico livroServico;

	@Autowired
	public LivroControlador(LivroServico livroServico) {
		super();
		this.livroServico = livroServico;
	}


	@PostMapping
	public MessageResponseDTO create(@RequestBody @Valid LivroDTO livroDTO) {
		
		return livroServico.create(livroDTO);
	}

	
}
