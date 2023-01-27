package com.uendel.gerenciamento.livros.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uendel.gerenciamento.livros.entidade.Livro;

public interface LivroRepositorio extends JpaRepository<Livro, Long>{

}
