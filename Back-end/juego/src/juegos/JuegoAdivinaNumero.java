package juegos;

import juegos.Interfaces.Jugable;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Jugable {

    private int numAdivinar;

    public JuegoAdivinaNumero(int todasVidas, int numAdivinar) {
        super(todasVidas);
        this.numAdivinar = numAdivinar;
    }


    @Override
    public void muestraNombre() {
        System.out.println("ADIVINA NUMERO");
    }

    @Override
    public void muestrainfo() {
        System.out.println("Encuentra el  numero secreto entre 0 y 10," + " tendras un total de " + getTodasVidas() + " vidas" );
    }

    public boolean validaNumero(int numUser) {

        if(numUser >= 0 && numUser <= 10){
            return true;
        }else {
            System.out.println("Numero incorrecto, introduce un numero entre 0 y 10");
            return false;
        }

    }


    @Override
    public void juega() {
        muestraNombre();
        muestrainfo();
        reiniciarPartida();//llamada al metodo
        System.out.println("Dame un numero entre 0 y 10");//mensaje para el user
        Scanner teclado = new Scanner(System.in);//esto es para poder recibir por el teclado (importa la clase scanner )
        int numUser;//varible para alojar el numero introducido por el user y poder comparar

        do {
            numUser = teclado.nextInt();

            if (validaNumero(numUser)) {
                if (numUser == numAdivinar) {
                    System.out.println("Acertaste!!");
                    actualizaRecord();

                } else if (numUser != numAdivinar) {

                    boolean mostrarMensaje = quitarVida();

                    if (mostrarMensaje) {//esto se ejecuta solo cuando quitarVida es true
                        if (numUser > numAdivinar) {
                            System.out.println("El numero es menor");
                        } else {
                            System.out.println("El numero es mayor");
                        }

                    }
                }
            }

        } while (getVidasRestantes() != 0);



    }



}
