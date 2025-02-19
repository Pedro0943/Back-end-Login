package sistema.escola.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sistema.escola.login.dto.UserDTO;
import sistema.escola.login.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/{id}")
	public UserDTO findbyId(@PathVariable Long id) {
		return userService.findById(id);
		
	}
}
