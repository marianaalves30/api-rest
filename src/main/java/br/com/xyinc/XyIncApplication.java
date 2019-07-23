package br.com.xyinc;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import br.com.xyinc.domain.PontoInteresse;
import br.com.xyinc.repository.POIRepository;

@SpringBootApplication
public class XyIncApplication {

	public static void main(String[] args) {
		// XyIncApplication.onLoad();
		SpringApplication.run(XyIncApplication.class, args);
	}

	// @Autowired
	// POIRepository poi;

	@Autowired
	ApplicationContext ctx;

	@PostConstruct
	public void onLoad() {

		POIRepository poi = ctx.getBean(POIRepository.class);
                                                                                                                                             
		poi.deleteAll();

		PontoInteresse lanchonete = new PontoInteresse("Lanchonete", 27, 12);
		poi.save(lanchonete);

		PontoInteresse posto = new PontoInteresse("Posto", 31, 18);
		poi.save(posto);

		PontoInteresse joalheria = new PontoInteresse("Joalheria", 15, 12);
		poi.save(joalheria);

		PontoInteresse floricultura = new PontoInteresse("Floricultura", 19, 21);
		poi.save(floricultura);

		PontoInteresse pub = new PontoInteresse("Pub", 12, 8);
		poi.save(pub);

		PontoInteresse supermercado = new PontoInteresse("Supermercado", 23, 6);
		poi.save(supermercado);

		PontoInteresse churrascaria = new PontoInteresse("Churrascaria", 28, 2);
		poi.save(churrascaria);

	}

}
