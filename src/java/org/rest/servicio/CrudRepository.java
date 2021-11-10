package org.rest.servicio;


import java.util.LinkedList;
import org.rest.modelo.Usuario;



public interface CrudRepository {

  Usuario addUsuario(Usuario usuario);
  LinkedList<Usuario> list();
  Usuario getUsuario(Usuario usuario);

}
