package com.supera.matheus.ecommerceGames.api.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutosDTO {
	
	private Integer id;
	private String nome;
	private BigDecimal preco;
	private short score;
	private String image;
}
