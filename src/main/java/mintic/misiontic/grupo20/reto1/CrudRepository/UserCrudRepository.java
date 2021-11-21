
package mintic.misiontic.grupo20.reto1.CrudRepository;

import java.util.Optional;
import mintic.misiontic.grupo20.reto1.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
