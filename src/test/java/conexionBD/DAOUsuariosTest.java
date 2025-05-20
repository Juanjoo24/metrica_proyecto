package conexionBD;

import static org.junit.jupiter.api.Assertions.*;
import registrar_entidades_y_pokemon.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class DAOUsuariosTest {

    DAOUsuarios dao;

    @BeforeEach
    void setUp() {
        dao = new DAOUsuarios();
    }

    @Test
    @DisplayName("Debería devolver un usuario existente correctamente")
    void testGetUsuarioExistente() {
        String registro = "admin";
        Usuario usuario = dao.getUsuario(registro);
        assertNotNull(usuario, "El usuario no debería ser null");
        assertEquals(registro, usuario.getLogin(), "El registro del usuario debería coincidir");
    }

    @Test
    @DisplayName("Debería devolver null si el usuario no existe")
    void testGetUsuarioNoExistente() {
        Usuario usuario = dao.getUsuario("Alejandro");
        assertNull(usuario, "El usuario debería ser null si no existe");
    }


}