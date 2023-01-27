package com.uendel.gerenciamento.livros.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LivroDTO {

	
	private Long id;
	
	@NotBlank
	@Size(max = 500)
	private String nome;
	
	@NotNull
	private Integer numPaginas;
	
	@NotNull
	private Integer numCapitulos;
	
	@NotBlank
	private String isbn;
	
	@NotBlank
	private String editora;

	@Valid
	@NotNull
	private AutorDTO autor;
}
