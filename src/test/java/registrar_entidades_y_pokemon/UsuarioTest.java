package registrar_entidades_y_pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Usuario.
 * <p>
 * Comprueba getters, setters, equals, hashCode y toString.
 * </p>
 * @author Kevin
 * @since 1.0
 */
public class UsuarioTest {

    /** Instancia de Usuario con login "25637", password "1234" y nombre "Kevin". */
    private Usuario u1;
    /** Instancia de Usuario con login "10175", password "4321" y nombre "Ale". */
    private Usuario u2;

    /**
     * Inicializa dos usuarios antes de cada prueba.
     * 
     * @throws Exception si ocurre un error durante la configuración.
     */
    @BeforeEach
    void setUp() throws Exception {
        u1 = new Usuario("25637", "1234", "Kevin");
        u2 = new Usuario("10175", "4321", "Ale");
    }

    /**
     * Verifica que Usuario getLogin() retorna el registro correcto.
     */
    @Test
    @Order(1)
    @DisplayName("Debe obtener el registro del usuario")
    void testGetLogin() {
        assertEquals("25637", u1.getLogin(), "Los registros no coinciden");
    }

    /**
     * Prueba @link Usuario setLogin(String) cambiando el registro del usuario.
     */
    @Test
    @Order(2)
    @DisplayName("Debe cambiar el registro del usuario")
    void testSetLogin() {
        u1.setLogin("99999");
        assertEquals("99999", u1.getLogin(), "El registro no se modificó correctamente");
    }

    /**
     * Comprueba que Usuario getPassword() retorna la contraseña asignada.
     */
    @Test
    @Order(3)
    @DisplayName("Debe obtener la contraseña del usuario")
    void testGetPassword() {
        assertEquals("1234", u1.getPassword(), "Las contraseñas no coinciden");
    }

    /**
     * Verifica @link Usuario setPassword(String) cambiando la contraseña.
     */
    @Test
    @Order(4)
    @DisplayName("Debe cambiar la contraseña del usuario")
    void testSetPassword() {
        u1.setPassword("5678");
        assertEquals("5678", u1.getPassword(), "La contraseña no se modificó correctamente");
    }

    /**
     * Comprueba que Usuario getNombre() devuelve el nombre correcto.
     */
    @Test
    @Order(5)
    @DisplayName("Debe obtener el nombre del usuario")
    void testGetNombre() {
        assertEquals("Kevin", u1.getNombre(), "Los nombres no coinciden");
    }

    /**
     * Prueba Usuario setNombre(String) modificando el nombre.
     */
    @Test
    @Order(6)
    @DisplayName("Debe cambiar el nombre del usuario")
    void testSetNombre() {
        u1.setNombre("Juanjo");
        assertEquals("Juanjo", u1.getNombre(), "El nombre no se modificó correctamente");
    }

    /**
     * Verifica Usuario equals Object usuarios con mismo registro son iguales.
     */
    @Test
    @Order(7)
    @DisplayName("Debe verificar si dos usuarios son iguales")
    void testEquals() {
        Usuario u3 = new Usuario("25637", "5678", "Juan");
        assertEquals(u1, u3, "Los usuarios deberían ser iguales");
        assertNotEquals(u1, u2, "Los usuarios no deberían ser iguales");
    }

    /**
     * Comprueba Usuario hashCode() basado en el registro.
     */
    @Test
    @Order(8)
    @DisplayName("Debe verificar el hashCode basado en el registro")
    void testHashCode() {
        Usuario u3 = new Usuario("25637", "5678", "Juan");
        assertEquals(u1.hashCode(), u3.hashCode(), "Los hashCode deberían coincidir para usuarios con el mismo registro");
        assertNotEquals(u1.hashCode(), u2.hashCode(), "Los hashCode no deberían coincidir para usuarios con registros diferentes");
    }

    /**
     * Comprueba Usuario toString() debe devolver el nombre del usuario.
     */
    @Test
    @Order(9)
    @DisplayName("Debe devolver el nombre como representación en cadena")
    void testToString() {
        assertEquals("Kevin", u1.toString(), "El método toString no devuelve el nombre correctamente");
    }
}
