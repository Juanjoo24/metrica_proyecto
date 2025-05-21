package conexionBD;

import static org.junit.jupiter.api.Assertions.*;
import registrar_entidades_y_pokemon.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class DAOUsuariosTest {

    /**
     * Instancia de  DAOPokemon utilizada para pruebas de inserción.
     */
    private DAOPokemon daoPokemon;

    /**
     * Instancia de  DAOUsuarios utilizada para pruebas de recuperación.
     */
    private DAOUsuarios daoUsuarios;

    /**
     * Prepara los objetos DAO antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        daoPokemon = new DAOPokemon();
        daoUsuarios = new DAOUsuarios();
    }

    /**
     * Comprueba que  DAOPokemon metodo insertarNuevoPokemon
     * inserta correctamente un Pokémon válido.
     * Parámetros de prueba: número 25, ID de usuario 1, nombre "Pikachu".
     * Se espera retorno.
     */
    @Test
    @DisplayName("Debería insertar correctamente un nuevo Pokémon en la base de datos")
    void testInsertarPokemonExito() {
        boolean resultado = daoPokemon.insertarNuevoPokemon(25, 1, "Pikachu");
        assertTrue(resultado, "El Pokémon debería insertarse correctamente en la base de datos");
    }

    /**
     * Verifica que  DAOPokemon metodo insertarNuevoPokemon
     * rechaza la inserción cuando el ID de usuario es inválido.
     * Parámetros de prueba: número 150, ID de usuario -99, nombre "Mewtwo".
     * Se espera retorno.
     */
    @Test
    @DisplayName("No debería insertar un Pokémon con ID de usuario inválido")
    void testInsertarPokemonConIDInvalido() {
        boolean resultado = daoPokemon.insertarNuevoPokemon(150, -99, "Mewtwo");
        assertFalse(resultado, "No debería insertarse con un ID de usuario inexistente");
    }

    /**
     * Comprueba que  DAOUsuarios metodo getUsuario
     * devuelve correctamente un usuario existente.
     * Se solicita registro "Admin". Se espera instancia no nula con login igual.
     */
    @Test
    @DisplayName("Debería devolver un usuario existente correctamente")
    void testGetUsuarioExistente() {
        String registro = "Admin";
        Usuario usuario = daoUsuarios.getUsuario(registro);
        assertNotNull(usuario, "El usuario no debería ser null");
        assertEquals(registro, usuario.getLogin(), "El registro del usuario debería coincidir");
    }

    /**
     * Verifica que  DAOUsuarios metodo getUsuario
     * retorna  null cuando el usuario no existe.
     */
    @Test
    @DisplayName("Debería devolver null si el usuario no existe")
    void testGetUsuarioNoExistente() {
        Usuario usuario = daoUsuarios.getUsuario("juan");
        assertNull(usuario, "El usuario debería ser null si no existe");
    }


}