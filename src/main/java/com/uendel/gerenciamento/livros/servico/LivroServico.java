package com.uendel.gerenciamento.livros.servico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uendel.gerenciamento.livros.dto.LivroDTO;
import com.uendel.gerenciamento.livros.dto.MessageResponseDTO;
import com.uendel.gerenciamento.livros.entidade.Livro;
import com.uendel.gerenciamento.livros.mapeamento.LivroMapear;
import com.uendel.gerenciamento.livros.repositorio.LivroRepositorio;

@Service
public class LivroServico {

	private LivroRepositorio livroRepositorio;
	
	private final LivroMapear livroMapear = LivroMapear.INSTANCE;

	@Autowired
	public LivroServico(LivroRepositorio livroRepositorio) {
		super();
		this.livroRepositorio = livroRepositorio;
	}
	
	
	public MessageResponseDTO create(LivroDTO livroDTO) {
		Livro livroParaSalvar = livroMapear.toModel(livroDTO);
		
		Livro salvadoLivro = livroRepositorio.save(livroParaSalvar);
		return MessageResponseDTO.builder().mensagem("Livro criado com Id"
				+ salvadoLivro.getId())
				.build();
	}


	public LivroDTO buscaPorId(Long id) {
		Optional<Livro> optinalLivro = livroRepositorio.findById(id);
		return livroMapear.toDTO(optinalLivro.get());
		
	}
	
}
