package z_Prueba;

import java.awt.*;
import java.awt.event.*;

public class JuegoBasico extends Frame implements KeyListener {
    private int jugadorX, jugadorY;
    private int jugadorVelocidad = 5;

    public JuegoBasico() {
        // Configuración de la ventana
        setSize(800, 600);
        setVisible(true);
        addKeyListener(this);

        // Posición inicial del jugador
        jugadorX = 400;
        jugadorY = 300;

        // Manejar cierre de la ventana
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        // Dibujar el jugador
        g.setColor(Color.BLUE);
        g.fillRect(jugadorX, jugadorY, 50, 50);
    }

    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();

        // Mover el jugador
        if (tecla == KeyEvent.VK_UP) {
            jugadorY -= jugadorVelocidad;
        } else if (tecla == KeyEvent.VK_DOWN) {
            jugadorY += jugadorVelocidad;
        } else if (tecla == KeyEvent.VK_LEFT) {
            jugadorX -= jugadorVelocidad;
        } else if (tecla == KeyEvent.VK_RIGHT) {
            jugadorX += jugadorVelocidad;
        }

        // Redibujar el jugador
        repaint();
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JuegoBasico juego = new JuegoBasico();
    }
}
