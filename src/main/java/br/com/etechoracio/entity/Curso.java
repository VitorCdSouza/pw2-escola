package br.com.etechoracio.entity;

import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "CURSO")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDCURSO")
	private int idCurso;
	
	@Column(name = "NOME_CURSO")
	private String nomeCurso;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "MODALIDADE")
	private String modalidade;
	
	@Column(name = "CARGA_HORARIA")
	private int cargaHoraria;
}
