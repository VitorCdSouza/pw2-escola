package br.com.etechoracio.entity;

import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ALUNO")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDALUNO")
	private int idAluno;
	
	@Column(name = "NOME_ALUNO")
	private String nomeAluno;
	
	@Column(name = "CELULAR_ALUNO")
	private String celularAluno;
	
	@Column(name = "CPF_ALUNO")
	private String cpfAluno;
	
	@ManyToOne
	@JoinColumn(name = "ID_CURSO", referencedColumnName = "IDCURSO")
	private int idCurso;
}
