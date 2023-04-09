package com.darkgreen.bankapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.darkgreen.bankapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
