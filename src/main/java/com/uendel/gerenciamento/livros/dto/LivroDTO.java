package com.uendel.gerenciamento.livros.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LivroDTO {

	
	private Long id;
	
	@NotBlank
	@Size(max = 200)
	private String nome;
	
	@NotNull
	private Integer numPaginas;
	
	@NotNull
	private Integer numCapitulos;
	
	@NotBlank
	@Size(max = 100)
	@Pattern(message ="Atenção à formatação correta do ISBN", regexp = "")
	private String isbn;
	
	@NotBlank
	@Size(max = 200)
	private String editora;

    @Valid
    @NotNull
    
	private AutorDTO autor;
}
