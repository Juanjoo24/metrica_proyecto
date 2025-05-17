/*
 * DAOUsusarios.
 * Operaciones de acceso a datos para la entidad Usuario.
 */
package conexionBD;

import registrar_entidades_y_pokemon.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Alejandro Campos Sampedro
 */
public class DAOUsuarios {
    
    public Connection conectarBD() throws SQLException  {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
                "Pokemon", "Pokemon");
        return conn;
    }
    public void desconectarBD(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error al desconectar BD: " + e.getMessage());
        }
    }
    
    public Usuario getUsuario(String Nombre) {
        Usuario u = null;
        Connection conn = null;
        try {
            conn = conectarBD();
            PreparedStatement pst = conn.prepareStatement(
                    "select * from usuarios where registro = ?");
            pst.setString(1, Nombre);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                u = new Usuario(Nombre, rs.getString("Contraseña"), rs.getString("Nombre") );
            }
        } catch (SQLException e) {
            System.err.println("getUsuario:" + e.getMessage());
        } finally {
            desconectarBD(conn);
        }
        return u;
    }
    
}
