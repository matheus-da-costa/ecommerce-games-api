package com.supera.matheus.ecommerceGames.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produtos", schema = "ecommerceGames")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Produtos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "preco")
	private BigDecimal preco;
	
	@Column(name = "score")
	private short score;
	
	@Column(name = "image")
	private String image;

}
