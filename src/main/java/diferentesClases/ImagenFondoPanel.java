/*
 * Nuevo fondo para nuestros paneles
 */
package diferentesClases;
import javax.swing.*;
import java.awt.*;
/**
 * Alejandro Campos Sampedro
 */
public class ImagenFondoPanel extends JPanel {
    private final Image imagen;

    public ImagenFondoPanel(String rutaRecurso) {
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaRecurso));
        this.imagen = icon.getImage();
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) { // Prepara el fondo 
        super.paintComponent(g);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}