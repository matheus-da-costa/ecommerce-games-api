package com.supera.matheus.ecommerceGames.api.resource;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supera.matheus.ecommerceGames.api.dto.ProdutosDTO;
import com.supera.matheus.ecommerceGames.exception.RegraNegocioException;
import com.supera.matheus.ecommerceGames.model.entity.Produtos;
import com.supera.matheus.ecommerceGames.service.ProdutosService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/produtos")
@RequiredArgsConstructor
public class ProdutosResource {

	private final ProdutosService service;
	
	@GetMapping
	public ResponseEntity listar(Pageable pageable) {
		return new ResponseEntity<>(service.listar(pageable), HttpStatus.OK);
	}
	
	@PostMapping 
	public ResponseEntity salvar( @RequestBody ProdutosDTO dto) {
		Produtos produto = Produtos.builder()
				.id(dto.getId())
				.nome(dto.getNome())
				.preco(dto.getPreco())
				.score(dto.getScore())
				.image(dto.getImage()).build();
		
		try {
			Produtos produtos = service.inserir(produto);
			return new ResponseEntity(produto, HttpStatus.CREATED);
		} catch (RegraNegocioException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
		
	}
	
	
}
