package com.supera.matheus.ecommerceGames.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.supera.matheus.ecommerceGames.model.entity.Produtos;

public interface ProdutosRepository extends PagingAndSortingRepository<Produtos, Long>{
		
	Produtos findByNome(String nome);
}
