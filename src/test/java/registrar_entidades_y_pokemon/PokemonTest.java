package registrar_entidades_y_pokemon;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PokemonTest extends TestCase{

    Pokemon pokemon;

    @BeforeEach
    protected void setUp() {
        pokemon = new Pokemon(25, "Pikachu", "Eléctrico", null);
    }

    @Test
    @DisplayName("Deberia devolver el numero de la Pokedex")
    void testGetNumeroPokedex() {
        assertEquals(25, pokemon.getNumeroPokedex());
    }

    @Test
    @DisplayName("Deberia devolver el nombre del Pokemon")
    void testGetNombre() {
        assertEquals("Pikachu", pokemon.getNombre());
    }

    @Test
    @DisplayName("Deberia devolver el primer tipo")
    void testGetTipo1() {
        assertEquals("Eléctrico", pokemon.getTipo1());
    }

    @Test
    @DisplayName("Deberia devolver null como segundo tipo")
    void testGetTipo2EsNull() {
        assertNull(pokemon.getTipo2());
    }

    @Test
    @DisplayName("Deberia permitir cambiar el nombre del Pokemon")
    void testSetNombre() {
        pokemon.setNombre("Raichu");
        assertEquals("Raichu", pokemon.getNombre());
    }

    @Test
    @DisplayName("Deberia representar correctamente con un solo tipo")
    void testToStringConUnTipo() {
        String esperado = "25 - Pikachu (Eléctrico)";
        assertEquals(esperado, pokemon.toString());
    }

    @Test
    @DisplayName("Deberia representar correctamente con dos tipos")
    void testToStringConDosTipos() {
        pokemon.setTipo2("Volador");
        pokemon.setNombre("Zapdos");
        pokemon.setNumeroPokedex(145);
        pokemon.setTipo1("Eléctrico");

        String esperado = "145 - Zapdos (Eléctrico/Volador)";
        assertEquals(esperado, pokemon.toString());
    }

    @Test
    @DisplayName("Deberia ignorar tipo2 si esta vacio")
    void testToStringTipo2Vacio() {
        pokemon.setTipo2("");
        String esperado = "25 - Pikachu (Eléctrico)";
        assertEquals(esperado, pokemon.toString());
    }

}