package com.uendel.gerenciamento.livros.mapeamento;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.uendel.gerenciamento.livros.dto.LivroDTO;
import com.uendel.gerenciamento.livros.entidade.Livro;

@Mapper
public interface LivroMapear {

	LivroMapear INSTANCE = Mappers.getMapper(LivroMapear.class);

	Livro toModel(LivroDTO livroDTO);
	
	LivroDTO toDTO(Livro livro);
	
}
