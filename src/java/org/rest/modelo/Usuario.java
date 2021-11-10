
package org.rest.modelo;

import java.util.Objects;

public class Usuario {
    private int id;
    private String nombre;
    private String correoElectronico;
    private String contrasenia;
    private String fechaNacimiento;
    private int edad;

    private static int ultimoId;

    public Usuario() {
    }

    public Usuario( String nombre, String correoElectronico, String contrasenia, String fechaNacimiento, int edad) {
        this.id = ++ultimoId;

        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.contrasenia = contrasenia;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

   

    public void setContraseña(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(correoElectronico, usuario.correoElectronico) && Objects.equals(contrasenia, usuario.contrasenia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correoElectronico, contrasenia);
    }
    
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", edad=" + edad +
                ", contrasenia='" + contrasenia + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
