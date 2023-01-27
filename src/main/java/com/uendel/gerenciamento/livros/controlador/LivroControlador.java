package com.uendel.gerenciamento.livros.controlador;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uendel.gerenciamento.livros.dto.MessageResponseDTO;
import com.uendel.gerenciamento.livros.entidade.Livro;
import com.uendel.gerenciamento.livros.repositorio.LivroRepositorio;

@RestController
@RequestMapping("/api/v1/livros")
public class LivroControlador {

	private LivroRepositorio livroRepositorio;

	public LivroControlador(LivroRepositorio livroRepositorio) {
		super();
		this.livroRepositorio = livroRepositorio;
	}

	@PostMapping
	public MessageResponseDTO create(@RequestBody Livro livro) {
		Livro salvaLivro = livroRepositorio.save(livro);
		return MessageResponseDTO.builder().mensagem("Livro criado com Id"
				+ salvaLivro.getId())
				.build();
	}

	
}
