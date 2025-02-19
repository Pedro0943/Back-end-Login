package sistema.escola.login.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sistema.escola.login.dto.UserDTO;
import sistema.escola.login.entities.User;
import sistema.escola.login.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserDTO findById(Long id){
		
		User result = userRepository.findById(id).get();
		return new UserDTO(result);
		
		
	}
}
