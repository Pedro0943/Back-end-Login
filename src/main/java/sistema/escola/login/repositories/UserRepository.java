package sistema.escola.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sistema.escola.login.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
