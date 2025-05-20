/*
 * Método para cargar la tabla PokemonRegistrado. Saca los pokemon registrados en nuestra base y los ordena 
 */
package diferentesClases;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro Campos Sampedro
 */
public class tablaPokemonRegistrado {

    public DefaultTableModel obtenerID(int idUsuario) {
        String[] columnas = {"Nº Pokedex", "ID Usuario", "Nombre", "Fecha/Hora Registro"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas);

        String sql = "SELECT Nº_Pokedex, ID_USUARIO, Nombre, Fecha_hora_registro FROM PokemonRegistrado WHERE ID_USUARIO = ? ORDER BY Nº_Pokedex";

        try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Pokemon", "Pokemon");
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idUsuario); // Aquí ponemos el ID del usuario

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int numPokedex = rs.getInt("Nº_Pokedex");
                    int idU = rs.getInt("ID_usuario");
                    String nombre = rs.getString("Nombre");
                    Timestamp fechaRegistro = rs.getTimestamp("Fecha_hora_registro");

                    Object[] fila = {numPokedex, idUsuario, nombre, fechaRegistro};
                    modelo.addRow(fila);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar datos de la base de datos: " + e.getMessage());
        }

        return modelo;
    }
}
