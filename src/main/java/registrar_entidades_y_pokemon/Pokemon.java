/*
 * Clase Pokemon.
 */
package registrar_entidades_y_pokemon;

/*
 * @author Alejandro Campos Sampedro
 */
public class Pokemon {
    
private int numeroPokedex;
    private String nombre;
    private String tipo1;
    private String tipo2;

    // Constructor de la clase Pokemon
    
    public Pokemon(int numeroPokedex, String nombre, String tipo1, String tipo2) {
        this.numeroPokedex = numeroPokedex;
        this.nombre = nombre;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
    }

    // Getters y Settersç
    
    public int getNumeroPokedex() {
        return numeroPokedex;
    }

    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    @Override // Definimos la forma de mostrar el pokemon contemplando el caso de que este tenga un solo tipo
    public String toString() {
        return numeroPokedex + " - " + nombre + " (" + tipo1 + (tipo2 != null && !tipo2.isEmpty() ? "/" + tipo2 : "") + ")";
    }
    
}
