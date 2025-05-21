/*
 * M�todo que nos permite saber el porcentaje exacto de pokemon registrados
 */
package diferentesClases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * @author Alejandro Campos Sampedro
 */
public class PorcentajePokemon {

    public Connection conectarBD() throws SQLException {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Pokemon", "Pokemon");
    }

    public int contarPokemonRegistrados(int idUsuario) {
        String sql = "SELECT COUNT(DISTINCT Nº_Pokedex) AS total FROM PokemonRegistrado WHERE ID_usuario = ?";
        int total = 0;
        try (Connection conn = conectarBD();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, idUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    total = rs.getInt("total");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al contar Pok�mon registrados: " + e.getMessage());
        }
        return total;
    }
}