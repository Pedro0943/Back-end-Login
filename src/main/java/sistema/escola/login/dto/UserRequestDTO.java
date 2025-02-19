package sistema.escola.login.dto;

public record UserRequestDTO(
		String nome,
		Long telefone,
		Long dateNasc,
		String email,
		String senha
) {

}
