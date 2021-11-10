
package org.rest.servicio;

import java.util.LinkedList;
import java.util.List;

import org.rest.modelo.Usuario;

public class UsuarioServicio {

   CrudRepository repositorio = new UsuarioRepository();

   public LinkedList<Usuario> getUsuarios(){
      return repositorio.list();
   }
   
   public Usuario addUsuario(Usuario usu){
      return repositorio.addUsuario(usu);
   }

   public Usuario getUsuarioByEmailAndPassword(Usuario usu) {
      return repositorio.getUsuario(usu);
   }
   
   
  
}
