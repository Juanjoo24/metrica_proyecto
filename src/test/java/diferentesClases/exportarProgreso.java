/*
* Generación de fichero. Nos permite elegir la ruta y antes se asegura
* de que tengamos algo que guardar
*/
package diferentesClases;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.io.*;
/*
 * Alejandro Campos Sampedro
 */
public class exportarProgreso {
         public static void exportar(TableModel model, Component parent, String defaultName) {
        if (model.getRowCount() == 0) { //Comprobamos si el usuario tiene pokemon registrados para poder
            JOptionPane.showMessageDialog(parent,// generar el fichero
                "No hay datos que exportar.",
                "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Guardar progreso?");
        chooser.setSelectedFile(new File(defaultName));
        if (chooser.showSaveDialog(parent) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File file = chooser.getSelectedFile();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            int cols = model.getColumnCount();
            int rows = model.getRowCount();

            for (int c = 0; c < cols; c++) { // Columnas
                bw.write(model.getColumnName(c));
                if (c < cols - 1) bw.write("\t"); // \t para separar columnas
            }
            bw.newLine();

            for (int r = 0; r < rows; r++) { // Filas
                for (int c = 0; c < cols; c++) {
                    Object v = model.getValueAt(r, c);
                    bw.write(v == null ? "" : v.toString());
                    if (c < cols - 1) bw.write("\t");
                }
                bw.newLine();
            }
            JOptionPane.showMessageDialog(parent,
                "Exportado correctamente:\n" + file.getAbsolutePath(),
                "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(parent,
                "Error al escribir el fichero:\n" + e.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
