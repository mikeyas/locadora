package br.com.locadora.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Nome é informação obrigatória.")
	private String nome;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "E-mail é informação obrigatória.")
	private String email;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Telefone é informação obrigatória.")
	private String telefone;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "CPF é informação obrigatória.")
	private String CPF;
}
