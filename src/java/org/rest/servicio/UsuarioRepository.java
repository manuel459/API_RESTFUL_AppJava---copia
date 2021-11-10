package org.rest.servicio;

import java.util.LinkedList;
import java.util.List;
import org.rest.modelo.Usuario;


public class UsuarioRepository implements CrudRepository {

  LinkedList<Usuario> data;

  public UsuarioRepository () {
    this.data = new LinkedList();
  }

  @Override
  public Usuario addUsuario(Usuario usuario) {
    return usuario;
  }


  @Override
 public LinkedList<Usuario> list(){
  return this.data;
 }

  @Override
  public Usuario getUsuario(Usuario usuario) {

    Usuario u = null;
    if (data.contains(usuario)) {
      u = usuario;
    }
    return u;
  }

   
}
