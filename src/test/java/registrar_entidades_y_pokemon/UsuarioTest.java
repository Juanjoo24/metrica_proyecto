/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit3TestClass.java to edit this template
 */
package registrar_entidades_y_pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kevin
 */
public class UsuarioTest {
    
    //Atributos
    Usuario u1;
    Usuario u2;
    
    @BeforeEach
    void setUp() throws Exception {
        u1 = new Usuario("25637", "1234", "Kevin");
        u2 = new Usuario("10175", "4321", "Ale");
    }
    
    @Test
    @Order(1)
    @DisplayName("Debe obtener el registro del usuario")
    void testGetLogin() {
        String registroEsperado = "25637";
        assertEquals(registroEsperado, u1.getLogin(), "Los registros no coinciden");
        
    }

    @Test
    @Order(2)
    @DisplayName("Debe cambiar el registro del usuario")
    void testSetLogin() {
        String nuevoRegistro = "99999";
        u1.setLogin(nuevoRegistro);
        assertEquals(nuevoRegistro, u1.getLogin(), "El registro no se modificó correctamente");
    }

    @Test
    @Order(3)
    @DisplayName("Debe obtener la contraseña del usuario")
    void testGetPassword() {
        String contrasenaEsperada = "1234";
        assertEquals(contrasenaEsperada, u1.getPassword(), "Las contraseñas no coinciden");
    }

    @Test
    @Order(4)
    @DisplayName("Debe cambiar la contraseña del usuario")
    void testSetPassword() {
        String nuevaContrasena = "5678";
        u1.setPassword(nuevaContrasena);
        assertEquals(nuevaContrasena, u1.getPassword(), "La contraseña no se modificó correctamente");
    }

    @Test
    @Order(5)
    @DisplayName("Debe obtener el nombre del usuario")
    void testGetNombre() {
        String nombreEsperado = "Kevin";
        assertEquals(nombreEsperado, u1.getNombre(), "Los nombres no coinciden");
    }

    @Test
    @Order(6)
    @DisplayName("Debe cambiar el nombre del usuario")
    void testSetNombre() {
        String nuevoNombre = "Juanjo";
        u1.setNombre(nuevoNombre);
        assertEquals(nuevoNombre, u1.getNombre(), "El nombre no se modificó correctamente");
    }
    
    @Test
    @Order(7)
    @DisplayName("Debe verificar si dos usuarios son iguales")
    void testEquals() {
        Usuario u3 = new Usuario("25637", "5678", "Juan");
        assertEquals(u1, u3, "Los usuarios deberían ser iguales");
        
        assertNotEquals(u1, u2, "Los usuarios no deberían ser iguales");
    }

    @Test
    @Order(8)
    @DisplayName("Debe verificar el hashCode basado en el registro")
    void testHashCode() {
        Usuario u3 = new Usuario("25637", "5678", "Juan");
        assertEquals(u1.hashCode(), u3.hashCode(), "Los hashCode deberían coincidir para usuarios con el mismo registro");
        assertNotEquals(u1.hashCode(), u2.hashCode(), "Los hashCode no deberían coincidir para usuarios con registros diferentes");
    }
    
    @Test
    @Order(9)
    @DisplayName("Debe devolver el nombre como representación en cadena")
    void testToString() {
        String nombreEsperado = "Kevin";
        assertEquals(nombreEsperado, u1.toString(), "El método toString no devuelve el nombre correctamente");
    }
    

}
