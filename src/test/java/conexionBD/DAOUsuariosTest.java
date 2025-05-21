package conexionBD;

import static org.junit.jupiter.api.Assertions.*;
import registrar_entidades_y_pokemon.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * Clase de prueba unitaria para la clase {@link DAOUsuarios}.
 * Esta clase verifica el funcionamiento del método getUsuario,
 * que recupera un usuario de la base de datos a partir de su login.
 */

public class DAOUsuariosTest {

    /** Instancia del DAO de usuarios que se va a probar */
    DAOUsuarios dao;

    /**
     * Inicializa el objeto DAOUsuarios antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        dao = new DAOUsuarios();
    }

    /**
     * Verifica que se devuelve correctamente un usuario existente
     * en la base de datos.
     */
    @Test
    @DisplayName("Debería devolver un usuario existente correctamente")
    void testGetUsuarioExistente() {
        String registro = "Admin";
        Usuario usuario = dao.getUsuario(registro);
        assertNotNull(usuario, "El usuario no debería ser null");
        assertEquals(registro, usuario.getLogin(), "El registro del usuario debería coincidir");
    }

    /**
     * Verifica que se devuelve null cuando se busca un usuario
     * que no existe en la base de datos.
     */
    @Test
    @DisplayName("Debería devolver null si el usuario no existe")
    void testGetUsuarioNoExistente() {
        Usuario usuario = dao.getUsuario("juan");
        assertNull(usuario, "El usuario debería ser null si no existe");
    }


}