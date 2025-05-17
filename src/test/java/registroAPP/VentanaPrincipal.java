/*
 * Esta ventana (o ventanas) se abrirá tras completar el inicio de sesión.
 */
package registroAPP;
import diferentesClases.Tabla;
import conexionBD.DAOPokemon;
import diferentesClases.ImagenFondoPanel;
import diferentesClases.PorcentajePokemon;
import diferentesClases.exportarProgreso;
import diferentesClases.tablaPokemonRegistrado;
import registrar_entidades_y_pokemon.Usuario;
import javax.swing.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro Campos Sampedro
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Usuario usuario;
    
    public VentanaPrincipal(Usuario usuario) {
        ImagenFondoPanel fondo = new ImagenFondoPanel("/imagenes/imagenPrincipal.png");
        setContentPane(fondo);
        initComponents();
        this.usuario = usuario;
        labelUsuario.setText("¡Bienvenido, " + usuario.getNombre() + "!");
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        consultar151P = new javax.swing.JButton();
        salirPanelPrincipal = new javax.swing.JButton();
        consultarPokemonPorTipo = new javax.swing.JButton();
        agregarPokemon = new javax.swing.JButton();
        calcularProgreso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        imprimirProgreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        jLabel1.setText("Indique la acción a realizar :");

        consultar151P.setText("Consultar pokedex");
        consultar151P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar151PActionPerformed(evt);
            }
        });

        salirPanelPrincipal.setText("Salir");
        salirPanelPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirPanelPrincipalActionPerformed(evt);
            }
        });

        consultarPokemonPorTipo.setText("Consultar pokemon por tipo");
        consultarPokemonPorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarPokemonPorTipoActionPerformed(evt);
            }
        });

        agregarPokemon.setText("Agregar pokemon");
        agregarPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPokemonActionPerformed(evt);
            }
        });

        calcularProgreso.setText("Calcular progreso");
        calcularProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularProgresoActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar pokemon capturados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        imprimirProgreso.setText("Imprimir progreso");
        imprimirProgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirProgresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 408, Short.MAX_VALUE)
                        .addComponent(salirPanelPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(calcularProgreso)
                                .addComponent(agregarPokemon)
                                .addComponent(consultar151P)
                                .addComponent(consultarPokemonPorTipo)
                                .addComponent(imprimirProgreso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7))
                            .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 278, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(labelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(consultar151P)
                .addGap(18, 18, 18)
                .addComponent(consultarPokemonPorTipo)
                .addGap(18, 18, 18)
                .addComponent(agregarPokemon)
                .addGap(18, 18, 18)
                .addComponent(calcularProgreso)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(imprimirProgreso)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirPanelPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirPanelPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirPanelPrincipalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirPanelPrincipalActionPerformed

    private void consultarPokemonPorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarPokemonPorTipoActionPerformed
String[] tipoPokemon = {"Normal","Fuego","Agua","Eléctrico","Planta","Hielo","Lucha","Veneno", //Definimos los tipos entre los que podrá elegir el usuario 
                        "Tierra","Volador","Psíquico","Bicho","Roca","Fantasma","Dragón","Hada","Siniestro","Acero"};     //para ahorrar confusiones de tipos mal escritos
String tipoElegido = (String) JOptionPane.showInputDialog(
        null, "Selecciona el tipo de los pokemon:","Tipos de pokemon:", JOptionPane.QUESTION_MESSAGE,null,
        tipoPokemon,
        tipoPokemon[0]);
if (tipoElegido == null) {
    return;
}
String[] Columnas = {"Numero_Pokedex", "Nombre", "tipo_1", "tipo_2"};
DefaultTableModel tablaTipos = new DefaultTableModel(null, Columnas);
String consultarTipo = "SELECT * FROM pokemon WHERE tipo_1 = ? OR tipo_2 = ? ORDER BY Numero_Pokedex";

try (Connection connection = DriverManager.getConnection(
     "jdbc:oracle:thin:@localhost:1521:xe", "Pokemon", "Pokemon");
     PreparedStatement preparedstatement = connection.prepareStatement(consultarTipo)) {
    
    preparedstatement.setString(1, tipoElegido); //Muestra el tipo elegido
    preparedstatement.setString(2, tipoElegido); //Muestra el segundo tipo del pokemon en caso de que lo tenga
    
    ResultSet resultset = preparedstatement.executeQuery();
    
    while (resultset.next()) {
        String[] fila = new String[4];
        fila[0] = String.valueOf(resultset.getInt("Numero_Pokedex"));
        fila[1] = resultset.getString("Nombre");
        fila[2] = resultset.getString("tipo_1");
        String tipo2 = resultset.getString("tipo_2");
        fila[3] = (tipo2 != null) ? tipo2 : ""; //
        
        tablaTipos.addRow(fila);
    }
    
} catch (SQLException e) {
    e.printStackTrace();
}
// Mostrar la ventana 
Tabla ventana = new Tabla(tablaTipos);
ventana.setVisible(true);
ventana.setTitle("Consulta de Tipos");
    }//GEN-LAST:event_consultarPokemonPorTipoActionPerformed

    private void consultar151PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar151PActionPerformed
String[] columnas = {"Numero_Pokedex", "Nombre"}; //Esta consulta es simplemente orientativa para el usuario, no se podrá trabajar en esta 
DefaultTableModel tablaPokedex = new DefaultTableModel(null, columnas); // ni pedir ningún valor
String consulta = "SELECT * FROM Pokemon ORDER BY Numero_Pokedex";

try (Connection connection = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe", "Pokemon", "Pokemon");
     PreparedStatement statement = connection.prepareStatement(consulta);
     ResultSet resultSet = statement.executeQuery()) {
    
    while (resultSet.next()) {
        String[] fila = new String[2];
        fila[0] = String.valueOf(resultSet.getInt("Numero_Pokedex"));
        fila[1] = resultSet.getString("Nombre");
        tablaPokedex.addRow(fila);
    }

    Tabla ventana = new Tabla(tablaPokedex); 
    ventana.setTitle("Consulta de Pokedex");
    ventana.setVisible(true);

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error al consultar la Pokedex.");
}
    }//GEN-LAST:event_consultar151PActionPerformed

    private void agregarPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPokemonActionPerformed
      JTextField campoNumero = new JTextField();
    JTextField campoNombre = new JTextField();
    JTextField campoTipo1 = new JTextField();

    Object[] rellenarPokemon = {
        "Nº Pokedex pokemon:", campoNumero,
        "ID usuario:", campoNombre,
        "Nombre pokemon:", campoTipo1
    };

    int opcion = JOptionPane.showConfirmDialog(null, rellenarPokemon, 
            "Añadir nuevo Pokémon", JOptionPane.OK_CANCEL_OPTION);

    if (opcion == JOptionPane.OK_OPTION) {
        try {
            int numeroPokedex = Integer.parseInt(campoNumero.getText().trim());
            int idUsuario = Integer.parseInt(campoNombre.getText().trim());
            String nombrePokemon = campoTipo1.getText().trim();

            if (nombrePokemon.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre del Pokémon es obligatorio.");
                return;
            }
            DAOPokemon dao = new DAOPokemon(); // Implementación de la clase DAOPokemon
            
            boolean exito = dao.insertarNuevoPokemon(numeroPokedex, idUsuario, nombrePokemon);

            if (exito) {
                JOptionPane.showMessageDialog(this, "¡Pokémon añadido con éxito!");
            } else {
                JOptionPane.showMessageDialog(this, "Error al añadir Pokémon.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El número de Pokédex y el ID de usuario deben ser enteros.");
        }
        
    }
    }//GEN-LAST:event_agregarPokemonActionPerformed

    private void calcularProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularProgresoActionPerformed
  String idUsuarioStr = JOptionPane.showInputDialog(this, "Introduce tu ID de usuario:");
    if (idUsuarioStr == null || idUsuarioStr.trim().isEmpty()) {
        return;
    }
    try {
        int idUsuario = Integer.parseInt(idUsuarioStr.trim());

        PorcentajePokemon porcentaje = new PorcentajePokemon();
        int totalRegistrados = porcentaje.contarPokemonRegistrados(idUsuario);

        double porcentajeCompletado = (totalRegistrados / 151.0) * 100;

        String mensaje = String.format("Has registrado %d Pokémon.\nProgreso: %.2f%% de la Pokédex.", totalRegistrados, porcentajeCompletado);
        JOptionPane.showMessageDialog(this, mensaje); //%d y %.2f%% son placeholders, el primero para un int y el segundo para un double con dos decimales

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID de usuario debe ser un número entero.");
    }
    }//GEN-LAST:event_calcularProgresoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String idUsuarioStr = JOptionPane.showInputDialog(this, "Introduce el ID de usuario:");
    if (idUsuarioStr == null || idUsuarioStr.trim().isEmpty()) {
        return; 
    }

    try {
        int idUsuario = Integer.parseInt(idUsuarioStr.trim());

        tablaPokemonRegistrado tablaLoader = new tablaPokemonRegistrado();
        DefaultTableModel modelo = tablaLoader.obtenerID(idUsuario);
        Tabla ventanaTabla = new Tabla(modelo);
        ventanaTabla.setTitle("Pokémon registrados del usuario " + idUsuario);
        ventanaTabla.setVisible(true);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El ID de usuario debe ser un número válido.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imprimirProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirProgresoActionPerformed
    String idusuario = JOptionPane.showInputDialog(this, "Introduce el ID de usuario para exportar:");
    if (idusuario == null || idusuario.trim().isEmpty()) return;
    try {
        int idUsuario = Integer.parseInt(idusuario.trim());
        tablaPokemonRegistrado loader = new tablaPokemonRegistrado();
        DefaultTableModel model = loader.obtenerID(idUsuario);

        String defaultFile = "progreso_usuario_" + idUsuario + ".txt";
        exportarProgreso.exportar(model, this, defaultFile);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this,
            "El ID debe ser un entero.",
            "ID inválido", JOptionPane.WARNING_MESSAGE);
    }    
    }//GEN-LAST:event_imprimirProgresoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPokemon;
    private javax.swing.JButton calcularProgreso;
    private javax.swing.JButton consultar151P;
    private javax.swing.JButton consultarPokemonPorTipo;
    private javax.swing.JButton imprimirProgreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JButton salirPanelPrincipal;
    // End of variables declaration//GEN-END:variables
}
