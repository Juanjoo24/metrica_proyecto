/*
 * Definimos la tabla que usaremos para mostrar los datos pedidos al usuario.
 * Creamos la tabla en una clase a parte para poder llamarla las veces que sea necesario.
 */
package diferentesClases;
/**
 *
 * @author Alejandro Campos Sampedro
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tabla extends JFrame {
    private JTable tabla;

    public Tabla(DefaultTableModel modeloTabla) {
        setTitle(""); //Lo ponemos sin nombre puesto que se lo asignaremos directamente en el metodo
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tabla = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);
    }
}
