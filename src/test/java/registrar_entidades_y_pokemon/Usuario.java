/*
 * Entidad Usuario.
 */
package registrar_entidades_y_pokemon;

import java.util.Objects;

/**
 * @author Alejandro Campos Sampedro
 */
public class Usuario {
    private String registro;
    private String contrasena;
    private String nombre;
    
    public Usuario(String registro, String contrasena, String nombre) { //Constructor para la clase usuario
        this.registro = registro;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }

    public String getLogin() {
        return registro;
    }

    public void setLogin(String registro) {
        this.registro = registro;
    }

    public String getPassword() {
        return contrasena;
    }

    public void setPassword(String password) {
        this.contrasena = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.registro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.registro, other.registro)) {
            return false;
        }
        return true;
    }
    
}
