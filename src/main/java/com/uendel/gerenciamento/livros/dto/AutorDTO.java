package com.uendel.gerenciamento.livros.dto;

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
public class AutorDTO {

	private Long id;
	
    @NotBlank
    @Size(max = 500)
	private String nome;
	
	@NotNull
	private Integer idade;
	
	
}
