package juegos;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int todasVidas, int numAdivinar) {
        super(todasVidas, numAdivinar);
    }


    @Override
    public void muestraNombre() {
        System.out.println("Adivina el numero PAR");
    }

    @Override
    public void muestrainfo() {
        System.out.println("Encuentra el  numero PAR entre 0 y 10");
    }

    @Override
    public boolean validaNumero(int numUser) {

        boolean numValidado = super.validaNumero(numUser);

        if (numValidado) {
            if (numUser % 2 == 0) {
                return true;
            } else {
                System.out.println("Incorrecto, el numero debe ser PAR");
                return false;
            }
        }

        return false;
    }


}
