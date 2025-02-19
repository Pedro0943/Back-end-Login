package sistema.escola.login.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Integer idade;
	private String email;
	private Long telefone;
	private Long dateNasc;
	private Long cpf;
	private String imgUrl;
	private String senha;
	
	
	public User() {
		
	}


	public User(Long id, String nome, Integer idade, String email, Long telefone,Long dateNasc, Long cpf, String imgUrl,
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


	public Long getTelefone() {
		return telefone;
	}


	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}


	

	public Long getDateNasc() {
		return dateNasc;
	}


	public void setDateNasc(Long dateNasc) {
		this.dateNasc = dateNasc;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
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
