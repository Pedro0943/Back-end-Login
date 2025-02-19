package sistema.escola.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistema.escola.login.dto.UserDTO;
import sistema.escola.login.dto.UserRequestDTO;
import sistema.escola.login.entities.User;
import sistema.escola.login.repositories.UserRepository;
import sistema.escola.login.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public void saveUser(@RequestBody UserRequestDTO saveUser) {
		User saveuser = new User(saveUser);
		userRepository.save(saveuser);
		
	}
	
	
	
	@GetMapping(value = "/{id}")
	public UserDTO findbyId(@PathVariable Long id) {
		return userService.findById(id);
		
	}
}
