package conexionBD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DAOPokemonTest {


    DAOPokemon dao;

    @BeforeEach
    void setUp() {
        dao = new DAOPokemon();
    }

    @Test
    @DisplayName("Debería insertar correctamente un nuevo Pokémon en la base de datos")
    void testInsertarPokemonExito() {
        int numeroPokedex = 25;
        int idUsuario = 1;
        String nombrePokemon = "Pikachu";

        boolean resultado = dao.insertarNuevoPokemon(numeroPokedex, idUsuario, nombrePokemon);
        assertTrue(resultado, "El Pokémon debería insertarse correctamente en la base de datos");
    }

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