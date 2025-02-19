package sistema.escola.login.entities;

import jakarta.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private Integer idade;
	private String email;
	private Integer telefone;
	private Integer dateNasc;
	private Integer cpf;
	private String imgUrl;
	private String senha;
	
	
	public User() {
		
	}


	public User(Long id, String nome, Integer idade, String email, Integer telefone,Integer dateNasc, Integer cpf, String imgUrl,
			String senha) {

		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
		this.dateNasc = dateNasc;
		this.cpf = cpf;
		this.imgUrl = imgUrl;
		this.senha = senha;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getTelefone() {
		return telefone;
	}


	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}


	public Integer getCpf() {
		return cpf;
	}
	

	public Integer getDateNasc() {
		return dateNasc;
	}


	public void setDateNasc(Integer dateNasc) {
		this.dateNasc = dateNasc;
	}


	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
