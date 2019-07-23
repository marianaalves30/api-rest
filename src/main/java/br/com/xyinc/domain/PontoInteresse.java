package br.com.xyinc.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_poi")
public class PontoInteresse implements Serializable {

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	@Size(min = 0)
	private String nome;

	@NotNull
	@Min(value = 0, message = "A coordenada X deve ser um inteiro positivo")
//	@Column(name = "COORDINATE_X")
	private int coordinateX;

	@NotNull
	@Min(value = 0, message = "A coordenada Y deve ser um inteiro positivo")
//	@Column(name = "COORDINATE_Y")
	private int coordinateY;

	public PontoInteresse() {

	}


	public PontoInteresse(String nome, int i, int y) {
		super();
		this.nome = nome;
		this.coordinateX = i;
		this.coordinateY = y;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getX() {
		return coordinateX;
	}

	public void setX(int x) {
		this.coordinateX = x;
	}

	public int getY() {
		return coordinateY;
	}

	public void setY(int y) {
		this.coordinateY = y;
	}

}
