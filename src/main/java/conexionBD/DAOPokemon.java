/*
 * Insertar Pokemon en la base de datos
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Alejandro Campos Sampedro
 */
public class DAOPokemon {

    public Connection conectarBD() throws SQLException {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pokemon", "pokemon");
    }
    public void desconectarBD(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al desconectar BD: " + e.getMessage());
        }
    }

    public boolean insertarNuevoPokemon(int numeroPokedex, int idUsuario, String nombrePokemon) { // Metodo para insertar pokemon
        String sql = "INSERT INTO PokemonRegistrado (Nº_Pokedex, ID_usuario, Nombre) VALUES (?, ?, ?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = conectarBD();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, numeroPokedex);
            stmt.setInt(2, idUsuario);
            stmt.setString(3, nombrePokemon);

            int filas = stmt.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.err.println("Error al insertar Pokémon: " + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
            desconectarBD(conn);
        }
    }
}
