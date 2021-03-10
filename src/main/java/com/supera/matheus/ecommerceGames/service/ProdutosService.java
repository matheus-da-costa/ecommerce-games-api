package com.supera.matheus.ecommerceGames.service;

import java.util.List;

import com.supera.matheus.ecommerceGames.model.entity.Produtos;

public interface ProdutosService {

	List<Produtos> ordenarPorNome(Produtos produtoFiltro);
	
	List<Produtos> ordenarPorPreco(Produtos produtoFIltro);
	
	List<Produtos> ordenarPorScore(Produtos produtoFiltro);
	
	List<Produtos> adcionar(Produtos produto);
	
	void remover(Produtos produto);
	
}
