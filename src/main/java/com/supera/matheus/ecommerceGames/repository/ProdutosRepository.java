package com.supera.matheus.ecommerceGames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.supera.matheus.ecommerceGames.model.entity.Produtos;

public interface ProdutosRepository extends PagingAndSortingRepository<Produtos, Long>{
	List<Produtos> findByNomeIgnoreCaseContaining(String nome);
	
	List<Produtos> findByPrecoIgnoreCaseContaining(BigDecimal preco);
	
	List<Produtos> findByScoreIgnoreCaseContaining(short score);
	
	Produtos findByNome(String nome);
}
