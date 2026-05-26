package Aplicacion.java;

import juegos.Interfaces.Jugable;
import juegos.JuegoAdivinaImpar;
import juegos.JuegoAdivinaNumero;
import juegos.JuegoAdivinaPar;

import java.util.Scanner;

public class Main {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        //pendiente ...
        eligeJuego();

    }

    public static Jugable eligeJuego () {

        JuegoAdivinaNumero jan = new JuegoAdivinaNumero(5, 5);
        JuegoAdivinaPar jap = new JuegoAdivinaPar(5, 6);
        JuegoAdivinaImpar jai = new JuegoAdivinaImpar(5, 7);

        Jugable[] juegos = new Jugable[3];
        juegos[0] = jan;
        juegos[1] = jap;
        juegos[2] = jai;

        boolean juegoCorrecto = false;
        Jugable respuesta = null;

        do {
            System.out.println("ELIJE UN JUEGO!!");
            for (int i = 0; i < juegos.length; i++) {

                Jugable j = juegos[i];
                System.out.println(i + "_");
                j.muestraNombre();

            }

            int juegoelegido = teclado.nextInt();

            if (juegoelegido >= 0 && juegoelegido < juegos.length) {
                juegoCorrecto = true;
                respuesta = juegos[juegoelegido];
            } else {
                juegoCorrecto = false;
                System.out.println("Elije un juego correcto");
            }

        } while (!juegoCorrecto);

        return respuesta;


    }


}