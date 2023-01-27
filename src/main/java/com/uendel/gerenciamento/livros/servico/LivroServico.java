package com.uendel.gerenciamento.livros.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.uendel.gerenciamento.livros.dto.LivroDTO;
import com.uendel.gerenciamento.livros.dto.MessageResponseDTO;
import com.uendel.gerenciamento.livros.entidade.Livro;
import com.uendel.gerenciamento.livros.repositorio.LivroRepositorio;

@Service
public class LivroServico {

	private LivroRepositorio livroRepositorio;

	@Autowired
	public LivroServico(LivroRepositorio livroRepositorio) {
		super();
		this.livroRepositorio = livroRepositorio;
	}
	
	
	public MessageResponseDTO create(LivroDTO livroDTO) {
		Livro livroParaSalvar = Livro.builder().build();
		
		Livro salvaLivro = livroRepositorio.save(livroParaSalvar);
		return MessageResponseDTO.builder().mensagem("Livro criado com Id"
				+ salvaLivro.getId())
				.build();
	}
	
}
