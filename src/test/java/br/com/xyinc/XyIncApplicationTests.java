package br.com.xyinc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.xyinc.domain.PontoInteresse;
import br.com.xyinc.repository.POIRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XyIncApplicationTests {


	@Autowired
	POIRepository produtoRepository;
	
	@Test
	public void contextLoads() {
		
		produtoRepository.deleteAll();

		PontoInteresse lanchonete = new PontoInteresse("Lanchonete", 12, 27);
		produtoRepository.save(lanchonete);

		PontoInteresse posto = new PontoInteresse("Posto", 18, 31);
		produtoRepository.save(posto);

		PontoInteresse joalheria = new PontoInteresse("Joalheria", 12, 15);
		produtoRepository.save(joalheria);

		PontoInteresse floricultura = new PontoInteresse("Floricultura", 21, 19);
		produtoRepository.save(floricultura);

		PontoInteresse pub = new PontoInteresse("Pub", 8, 12);
		produtoRepository.save(pub);

		PontoInteresse supermercado = new PontoInteresse("Supermercado", 6, 23);
		produtoRepository.save(supermercado);

		PontoInteresse churrascaria = new PontoInteresse("Churrascaria", 2, 28);
		produtoRepository.save(churrascaria);
		
	}

}
