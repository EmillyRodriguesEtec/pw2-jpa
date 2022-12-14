package br.com.etechoracio.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.jpa.enums.StatusAgenteEnum;
import br.com.etechoracio.jpa.enums.TipoAgenteEnum;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TBL_AGENTE_AUTUADOR")
public class AgenteAutuador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AGENTE_AUTUADOR")
	private Long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_FONE")
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TP_AGENTE")
	private TipoAgenteEnum tipo;
	
	@Column(name = "ST_AGENTE")
	@Enumerated(EnumType.ORDINAL)
	private StatusAgenteEnum  status;
}
