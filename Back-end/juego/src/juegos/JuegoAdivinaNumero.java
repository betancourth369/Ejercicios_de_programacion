package juegos;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego{
    private int numAdivinar;

    public JuegoAdivinaNumero(int todasVidas, int numAdivinar) {
        super(todasVidas);
        this.numAdivinar = numAdivinar;
    }

    public boolean validaNumero(int numeroValidar){

        return true;
    }


    @Override
    public void juega() {
        reiniciarPartida();//llamada al metodo
        System.out.println("Dame un numero entre 0 y 10");//mensaje para el user
        Scanner teclado = new Scanner(System.in);//esto es para poder recibir por el teclado (importa la clase scanner )
        int numUser;//varible para alojar el numero introducido por el user y poder comparar

        do {
            numUser = teclado.nextInt();

            if (validaNumero(numUser)){
            if (numUser == numAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();

            } else if (numUser != numAdivinar) {

                boolean mostrarMensaje = quitarVida();

                if (mostrarMensaje){//esto se ejecuta solo cuando quitarVida es true
                if (numUser > numAdivinar){
                    System.out.println("El numero es menor");
                }else{
                    System.out.println("El numero es mayor");
                }

            }}}
        }while (getVidasRestantes() != 0);

        teclado.close();

    }


}
