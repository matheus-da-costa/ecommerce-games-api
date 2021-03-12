package com.supera.matheus.ecommerceGames.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.supera.matheus.ecommerceGames.model.entity.Produtos;

public interface ProdutosService {

	List<Produtos> listar(Pageable pageable);
	
	List<Produtos> adcionar(Produtos produto);
	
	Produtos inserir(Produtos produto);
	
	void remover(Produtos produto);
	
}
