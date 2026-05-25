package juegos;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero{

    public JuegoAdivinaImpar(int todasVidas, int numAdivinar) {
        super(todasVidas, numAdivinar);
    }


    @Override
    public void muestraNombre() {
        System.out.println("Adivina el numero IMPAR");
    }

    @Override
    public void muestrainfo() {
        System.out.println("Encuentra el  numero IMPAR entre 0 y 10");
    }

    @Override
    public boolean validaNumero(int numUser) {

        boolean numValidado = super.validaNumero(numUser);

        if (numValidado) {
            if (numUser % 2 == 1) {
                return true;
            } else {
                System.out.println("Incorrecto, el numero debe ser IMPAR");
                return false;
            }
        }

        return false;
    }



    
}
