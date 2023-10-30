package z_Prueba;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JuegoPlataformasBásico extends JPanel implements KeyListener, ActionListener {
    private int jugadorPosX = 50;
    private int jugadorPosY = 150;
    private int velocidadSalto = 0;
    private boolean enAire = false;

    private Timer timer;
    private int delay = 10;

    private int[] plataformaX = {0, 150, 300, 450, 600, 750};
    private int[] plataformaY = {200, 300, 200, 300, 200, 300};

    public JuegoPlataformasBásico() {
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);

        timer = new Timer(delay, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar jugador
        g.setColor(Color.BLUE);
        g.fillRect(jugadorPosX, jugadorPosY, 30, 30);

        // Dibujar plataformas
        g.setColor(Color.BLACK);
        for (int i = 0; i < plataformaX.length; i++) {
            g.fillRect(plataformaX[i], plataformaY[i], 100, 10);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (enAire) {
            velocidadSalto += 1;
            jugadorPosY += velocidadSalto;

            for (int i = 0; i < plataformaX.length; i++) {
                if (jugadorPosY + 30 >= plataformaY[i] && jugadorPosY + 30 <= plataformaY[i] + 10) {
                    if (jugadorPosX + 30 >= plataformaX[i] && jugadorPosX <= plataformaX[i] + 100) {
                        enAire = false;
                        velocidadSalto = 0;
                        jugadorPosY = plataformaY[i] - 30;
                    }
                }
            }
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE && !enAire) {
            enAire = true;
            velocidadSalto = -10;
        }

        if (key == KeyEvent.VK_LEFT) {
            jugadorPosX -= 5; // Mover hacia la izquierda
        }

        if (key == KeyEvent.VK_RIGHT) {
            jugadorPosX += 5; // Mover hacia la derecha
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Juego de Plataformas");
        JuegoPlataformasBásico juego = new JuegoPlataformasBásico();

        frame.add(juego);
        frame.setSize(800, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
