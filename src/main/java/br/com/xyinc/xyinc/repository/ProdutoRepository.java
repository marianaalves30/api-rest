package br.com.xyinc.xyinc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xyinc.xyinc.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	Produto findById(long id);
}
