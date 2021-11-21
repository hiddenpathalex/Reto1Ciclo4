package mintic.misiontic.grupo20.reto1.repository;

import mintic.misiontic.grupo20.reto1.CrudRepository.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import mintic.misiontic.grupo20.reto1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hiddenpath
 */
@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository userCrudRepository;
    
    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }    
    
    public  Optional<User> getUser(int id){
        
        return userCrudRepository.findById(id);             
    }
    
    public  Optional<User> autenticarUsuario(String email, String password){
        
        return userCrudRepository.findByEmailAndPassword(email, password);             
    }
          
    public User save(User u){
        
        return userCrudRepository.save(u);
    }
    
    public boolean existeEmail (String email){
        Optional<User> usuario =  userCrudRepository.findByEmail(email);
        return usuario.isPresent();
    }
    
}
