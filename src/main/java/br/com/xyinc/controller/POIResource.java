package br.com.xyinc.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.xyinc.domain.PontoInteresse;
import br.com.xyinc.repository.POIRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")


public class POIResource {
	
	@Autowired
	POIRepository poi;
	
	@GetMapping("/pois")
	@ApiOperation(value="Retorna lista de POIs")
	public List<PontoInteresse> listaPOI(){
		return poi.findAll();
	}
	
	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um Ponto de Interesse único")
	public PontoInteresse listaProdutoUnico(@PathVariable(value="id") long id){
		return poi.findById(id);
	}

	@PostMapping("/poi")
	@ApiOperation(value="Salva uma POI")
	public PontoInteresse salvaPOI(@RequestBody PontoInteresse produto){
		return poi.save(produto);
	}
	
	@DeleteMapping("/produto")
	@ApiOperation(value="Deleta uma POI")
	public void deletaProduto(@RequestBody PontoInteresse produto){
		poi.delete(produto);
	}
	
	@PutMapping("/poi")
	@ApiOperation(value="Atualiza uma POI")
	public PontoInteresse atualizaProduto(@RequestBody PontoInteresse produto){
		return poi.save(produto);
	}
	
	@RequestMapping(value="/listByProximity/{x}/{y}/{range}", method =RequestMethod.GET)
	public List<PontoInteresse> listByProximity(@PathVariable("x") Integer x, @PathVariable("y") Integer y, @PathVariable("range") Integer range) {
		return poi.listByProximity(x, y, new Double(range.toString()));
	}
	
}
