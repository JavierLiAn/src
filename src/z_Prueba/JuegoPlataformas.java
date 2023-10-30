package z_Prueba;
/*
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class JuegoPlataformas extends Application {
    private static final int ANCHO_VENTANA = 800;
    private static final int ALTO_VENTANA = 600;
    private static final int ALTO_SUELO = ALTO_VENTANA - 50;

    private int jugadorPosX = 50;
    private int jugadorPosY = ALTO_SUELO;
    private int velocidadSalto = 0;
    private boolean enAire = false;

    private boolean izquierdaPresionada = false;
    private boolean derechaPresionada = false;

    private List<Plataforma> plataformas = new ArrayList<>();
    private List<Moneda> monedas = new ArrayList<>();

    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(ANCHO_VENTANA, ALTO_VENTANA);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        inicializarNivel(); // Configurar plataformas y monedas

        Pane root = new Pane();
        root.getChildren().add(canvas);

        Scene scene = new Scene(root, ANCHO_VENTANA, ALTO_VENTANA);
        scene.setOnKeyPressed(e -> {
            KeyCode keyCode = e.getCode();
            switch (keyCode) {
                case SPACE:
                    if (!enAire) {
                        enAire = true;
                        velocidadSalto = -15;
                    }
                    break;
                case LEFT:
                    izquierdaPresionada = true;
                    break;
                case RIGHT:
                    derechaPresionada = true;
                    break;
            }
        });

        scene.setOnKeyReleased(e -> {
            KeyCode keyCode = e.getCode();
            switch (keyCode) {
                case LEFT:
                    izquierdaPresionada = false;
                    break;
                case RIGHT:
                    derechaPresionada = false;
                    break;
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();

        new AnimationTimer() {
            public void handle(long now) {
                actualizar();
                dibujar(gc);
            }
        }.start();
    }

    private void inicializarNivel() {
        plataformas.add(new Plataforma(0, ALTO_SUELO - 30, ANCHO_VENTANA, 10));
        plataformas.add(new Plataforma(200, ALTO_SUELO - 50, 150, 10));
        plataformas.add(new Plataforma(400, ALTO_SUELO - 70, 150, 10));

        monedas.add(new Moneda(250, ALTO_SUELO - 80));
        monedas.add(new Moneda(450, ALTO_SUELO - 100));
    }

    private void actualizar() {
        if (enAire) {
            velocidadSalto += 1;
            jugadorPosY += velocidadSalto;
            if (jugadorPosY >= ALTO_SUELO) {
                enAire = false;
                velocidadSalto = 0;
                jugadorPosY = ALTO_SUELO;
            }
        }

        if (izquierdaPresionada) {
            jugadorPosX -= 5;
        }

        if (derechaPresionada) {
            jugadorPosX += 5;
        }

        // Comprobar colisiones con plataformas
        for (Plataforma plataforma : plataformas) {
            if (jugadorPosY + 30 >= plataforma.getY() && jugadorPosY + 30 <= plataforma.getY() + plataforma.getAlto()) {
                if (jugadorPosX + 30 >= plataforma.getX() && jugadorPosX <= plataforma.getX() + plataforma.getAncho()) {
                    enAire = false;
                    velocidadSalto = 0;
                    jugadorPosY = plataforma.getY() - 30;
                }
            }
        }

        // Comprobar recolección de monedas
        List<Moneda> monedasParaEliminar = new ArrayList<>();
        for (Moneda moneda : monedas) {
            if (jugadorPosY + 30 >= moneda.getY() && jugadorPosY <= moneda.getY() + 10) {
                if (jugadorPosX + 30 >= moneda.getX() && jugadorPosX <= moneda.getX() + 10) {
                    monedasParaEliminar.add(moneda);
                }
            }
        }
        monedas.removeAll(monedasParaEliminar);
    }

    private void dibujar(GraphicsContext gc) {
        gc.clearRect(0, 0, ANCHO_VENTANA, ALTO_VENTANA);

        // Dibujar suelo
        gc.setFill(Color.GRAY);
        gc.fillRect(0, ALTO_SUELO, ANCHO_VENTANA, 50);

        // Dibujar jugador
        gc.setFill(Color.BLUE);
        gc.fillRect(jugadorPosX, jugadorPosY, 30, 30);

        // Dibujar plataformas
        gc.setFill(Color.BLACK);
        for (Plataforma plataforma : plataformas) {
            gc.fillRect(plataforma.getX(), plataforma.getY(), plataforma.getAncho(), plataforma.getAlto());
        }

        // Dibujar monedas
        gc.setFill(Color.YELLOW);
        for (Moneda moneda : monedas) {
            gc.fillRect(moneda.getX(), moneda.getY(), 10, 10);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Plataforma {
    private double x;
    private double y;
    private double ancho;
    private double alto;

    public Plataforma(double x, double y, double ancho, double alto) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
}

class Moneda {
    private double x;
    private double y;

    public Moneda(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
*/