package com.supera.matheus.ecommerceGames.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.supera.matheus.ecommerceGames.exception.RegraNegocioException;
import com.supera.matheus.ecommerceGames.model.entity.Produtos;
import com.supera.matheus.ecommerceGames.repository.ProdutosRepository;
import com.supera.matheus.ecommerceGames.service.ProdutosService;

@Service
public class ProdutosServiceImpl implements ProdutosService{
	
	private ProdutosRepository repository;
	
	private List<Produtos> carrinho;
	
	public ProdutosServiceImpl(ProdutosRepository repository, List<Produtos> carrinho) {
		this.repository = repository;
		this.carrinho = carrinho;
	}

	@Override
	public List<Produtos> ordenarPorNome(Produtos produtoFiltro) {
		String nome = produtoFiltro.getNome();
		
		return repository.findByNomeIgnoreCaseContaining(nome);
	}
	
	@Override
	public List<Produtos> ordenarPorPreco(Produtos produtoFIltro) {
		BigDecimal preco = produtoFIltro.getPreco();
		
		return repository.findByPrecoIgnoreCaseContaining(preco);
	}

	@Override
	public List<Produtos> ordenarPorScore(Produtos produtoFiltro) {
		short score = produtoFiltro.getScore();
		
		return repository.findByScoreIgnoreCaseContaining(score);
	}
	

	@Override
	public List<Produtos> adcionar(Produtos produtos) {
		String nome = produtos.getNome();
		
		produtos = repository.findByNome(nome);
		
		carrinho.add(produtos);
		
		return carrinho;
	}

	@Override
	public void remover(Produtos produto) {
		
		if(carrinho.contains(produto)) {
			carrinho.remove(produto);
		} else {
			throw new RegraNegocioException("Produto não encontrado");
		}
		
	}

}
