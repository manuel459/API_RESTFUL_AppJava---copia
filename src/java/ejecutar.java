
import java.util.List;
import org.rest.modelo.Usuario;
import org.rest.servicio.CrudRepository;
import org.rest.servicio.UsuarioRepository;


public class ejecutar {
    public static void main(String[]args){
    CrudRepository repositorio = new UsuarioRepository();
   Usuario usuario1 = new Usuario("Chirre", "chirre@gmail.com", "chirre123", "fasd",22);
        Usuario usuario2 = new Usuario("Luis", "luis@gmail.com", "luis123", "sadasd",22);
        Usuario usuario3 = new Usuario("Carlos", "carlos@gmail.com", "carlos123", "dsadas",21);
        repositorio.addUsuario(usuario1);
        repositorio.addUsuario(usuario2);
      
        List<Usuario> usuarios = repositorio.list();
         usuarios.add(usuario2);
        usuarios.forEach(System.out::println);
        
}
}
