package br.com.etechoracio.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "TBL_TELEFONE")
@Entity
public class Telefone {

	@Id 
	@GeneratedValue
	@Column(name = "ID_TELEFONE")
	private Long id;
	@Column(name = "TX_AREA")
	private String area;
	@Column(name = "TX_NUMERO")
	private String numero;
}
