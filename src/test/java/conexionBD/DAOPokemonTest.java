package conexionBD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



/**
 * Clase de prueba unitaria para la clase {@link DAOPokemon}.
 * <p>
 * Esta clase utiliza JUnit 5 para verificar el correcto funcionamiento
 * del método {@code insertarNuevoPokemon} del DAO, asegurando que se
 * comporta como se espera ante distintos casos.
 */


class DAOPokemonTest {

    /** Instancia del DAO que se va a probar */
    DAOPokemon dao;

    /**
     * Inicializa el objeto {@code DAOPokemon} antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        dao = new DAOPokemon();
    }

    /**
     * Prueba que verifica que un nuevo Pokémon puede insertarse correctamente
     * en la base de datos cuando se proporcionan datos válidos.
     */
    @Test
    @DisplayName("Debería insertar correctamente un nuevo Pokémon en la base de datos")
    void testInsertarPokemonExito() {
        int numeroPokedex = 25;
        int idUsuario = 1;
        String nombrePokemon = "Pikachu";

        boolean resultado = dao.insertarNuevoPokemon(numeroPokedex, idUsuario, nombrePokemon);
        assertTrue(resultado, "El Pokémon debería insertarse correctamente en la base de datos");
    }

    /**
     * Prueba que verifica que no se puede insertar un Pokémon si se proporciona
     * un ID de usuario no válido o inexistente.
     */
    @Test
    @DisplayName("No debería insertar un Pokémon con ID de usuario inválido")
    void testInsertarPokemonConIDInvalido() {
        int numeroPokedex = 150;
        int idUsuario = -99;
        String nombrePokemon = "Mewtwo";

        boolean resultado = dao.insertarNuevoPokemon(numeroPokedex, idUsuario, nombrePokemon);
        assertFalse(resultado, "No debería insertarse con un ID de usuario inexistente");
    }


}