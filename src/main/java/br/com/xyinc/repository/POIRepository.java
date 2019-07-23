package br.com.xyinc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import br.com.xyinc.domain.PontoInteresse;

public interface POIRepository extends JpaRepository<PontoInteresse, Long>{
	
	PontoInteresse findById(long id);
	
	@Query("SELECT tp FROM PontoInteresse tp WHERE SQRT((tp.coordinateX - :x) * (tp.coordinateX - :x) + (tp.coordinateY - :y) * (tp.coordinateY - :y)) < :range")
	public List<PontoInteresse> listByProximity(@Param("x") Integer coordinateX, @Param("y") Integer coordinateY, @Param("range") Double range);
}
