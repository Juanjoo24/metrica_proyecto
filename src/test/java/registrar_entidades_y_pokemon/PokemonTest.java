package registrar_entidades_y_pokemon;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase .
 * 
 * Incluye verificación de getters, setters y método {@code toString()}
 * en distintas condiciones (un tipo, dos tipos, tipo2 vacío).
 * 
 * @author Kevin Fuentes & Juan José Hoyos & Alejandro Campos
 * @since 1.0
 */
public class PokemonTest extends TestCase {

    /** Instancia de Pokemon utilizada en las pruebas. */
    private Pokemon pokemon;

    /**
     * Configura una instancia de Pokemon antes de cada prueba.
     * Inicializa con número de Pokédex 25, nombre "Pikachu" y tipo1 "Eléctrico".
     */
    @BeforeEach
    protected void setUp() {
        pokemon = new Pokemon(25, "Pikachu", "Eléctrico", null);
    }

    /**
     * Comprueba que Pokemon getNumeroPokedex() retorna el número correcto.
     * Caso de prueba: 25
     */
    @Test
    @DisplayName("Deberia devolver el numero de la Pokedex")
    void testGetNumeroPokedex() {
        assertEquals(25, pokemon.getNumeroPokedex());
    }

    /**
     * Verifica que Pokemon getNombre() retorna el nombre asignado.
     * Caso de prueba: "Pikachu"
     */
    @Test
    @DisplayName("Deberia devolver el nombre del Pokemon")
    void testGetNombre() {
        assertEquals("Pikachu", pokemon.getNombre());
    }

    /**
     * Comprueba que Pokemon getTipo1() devuelve el primer tipo correctamente.
     * Caso de prueba: "Eléctrico"
     */
    @Test
    @DisplayName("Deberia devolver el primer tipo")
    void testGetTipo1() {
        assertEquals("Eléctrico", pokemon.getTipo1());
    }

    /**
     * Verifica que Pokemon getTipo2() retorna null cuando no se asigna.
     */
    @Test
    @DisplayName("Deberia devolver null como segundo tipo")
    void testGetTipo2EsNull() {
        assertNull(pokemon.getTipo2());
    }

    /**
     * Prueba el método Pokemon#setNombre(String) modificando el nombre.
     * Caso de prueba: cambia de "Pikachu" a "Raichu".
     */
    @Test
    @DisplayName("Deberia permitir cambiar el nombre del Pokemon")
    void testSetNombre() {
        pokemon.setNombre("Raichu");
        assertEquals("Raichu", pokemon.getNombre());
    }

    /**
     * Comprueba Pokemon toString() con un solo tipo.
     * Formato esperado: "25 - Pikachu (Eléctrico)".
     */
    @Test
    @DisplayName("Deberia representar correctamente con un solo tipo")
    void testToStringConUnTipo() {
        String esperado = "25 - Pikachu (Eléctrico)";
        assertEquals(esperado, pokemon.toString());
    }

    /**
     * Verifica Pokemon toString() con dos tipos.
     * Reconfigura a número 145, nombre "Zapdos", tipos "Eléctrico" y "Volador".
     * Formato esperado: "145 - Zapdos (Eléctrico/Volador)".
     */
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

    /**
     * Comprueba que toString() ignora tipo2 vacío.
     * Si tipo2 es cadena vacía, solo muestra el primer tipo.
     */
    @Test
    @DisplayName("Deberia ignorar tipo2 si esta vacio")
    void testToStringTipo2Vacio() {
        pokemon.setTipo2("");
        String esperado = "25 - Pikachu (Eléctrico)";
        assertEquals(esperado, pokemon.toString());
    }

}

