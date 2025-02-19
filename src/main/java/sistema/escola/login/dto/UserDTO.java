package sistema.escola.login.dto;

import org.springframework.beans.BeanUtils;

import sistema.escola.login.entities.User;

public class UserDTO {
	
	private Long id;
	private String nome;
	private Integer idade;
	private String email;
	private Long telefone;
	private Long dateNasc;
	private Long cpf;
	private String imgUrl;
	private String senha;
	
	public UserDTO() {
		
	}
	
	public UserDTO(User entity) {
		BeanUtils.copyProperties(entity, this);
		
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
