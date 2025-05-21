package conexionBD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DAOPokemonTest {


    /** Instancia de DAOPokemon para ejecutar las pruebas. */
    private DAOPokemon dao;

    /**
     * Inicializa el objeto  DAOPokemon antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        dao = new DAOPokemon();
    }

    /**
     * Verifica que DAOPokemon el metodo insertarNuevoPokemon
     * inserta correctamente un Pokémon cuando los parámetros son válidos.
     */

    @Test
    @DisplayName("Debería insertar correctamente un nuevo Pokémon en la base de datos")
    void testInsertarPokemonExito() {
        int numeroPokedex = 20;
        int idUsuario = 70;
        String nombrePokemon = "Pikachu";

        boolean resultado = dao.insertarNuevoPokemon(numeroPokedex, idUsuario, nombrePokemon);
        assertTrue(resultado, "El Pokémon debería insertarse correctamente en la base de datos");
    }

    /**
     * Comprueba que en DAOPokemon metodi insertarNuevoPokemon
     * rechaza la inserción cuando el ID de usuario es inválido o no existe.
     */
    @Test
    @DisplayName("No debería insertar un Pokémon con ID de usuario inválido")
    void testInsertarPokemonConIDInvalido() {
        int numeroPokedex = 150;
        int idUsuario = -45;
        String nombrePokemon = "Mewtwo";

        boolean resultado = dao.insertarNuevoPokemon(numeroPokedex, idUsuario, nombrePokemon);
        assertFalse(resultado, "No debería insertarse con un ID de usuario inexistente");
    }


}