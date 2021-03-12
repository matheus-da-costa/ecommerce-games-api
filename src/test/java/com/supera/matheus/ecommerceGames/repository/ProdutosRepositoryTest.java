package com.supera.matheus.ecommerceGames.repository;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.supera.matheus.ecommerceGames.model.entity.Produtos;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ProdutosRepository.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ActiveProfiles("teste")
public class ProdutosRepositoryTest {

	@Autowired
	ProdutosRepository repository;
	
	@Test
	public void devePersistirUmUsuárioNaBaseDeDados() {
		Produtos produto = Produtos
				.builder()
				.id(5l)
				.nome("Super Mario Odyssey")
				.preco(BigDecimal.valueOf(197.88))
				.score(Short.valueOf("100"))
				.image("super-mario-odyssey.png")
				.build();
		
		Produtos produtoNovo = repository.save(produto);
		
		Assertions.assertThat(produtoNovo.getId()).isNotNull();
	}

}
