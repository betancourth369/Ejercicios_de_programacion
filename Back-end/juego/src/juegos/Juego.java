package juegos;



public abstract class Juego {

    //Atributos
    private int todasVidas; //numero de vidas inicial del jugador
    private int vidasRestantes; //numero de vidas restantes del jugador
    private static int recordJugador;


    //Construtor
    public Juego(int todasVidas) {
        this.todasVidas = todasVidas;
        this.vidasRestantes = todasVidas;

    }

    //Metodos
    public boolean quitarVida(){

       vidasRestantes = vidasRestantes - 1;

       if (vidasRestantes == 0){
           System.out.println("GAME OVER!!");
           return false;
       }
        System.out.println("Incorrecto, vidas restantes: " + vidasRestantes);
       return true;
    }

    public void reiniciarPartida() {
        this.vidasRestantes = todasVidas;
    }

    public void muestraVidasRestantes(){
        System.out.println("mis vidas actuales son: " +this.vidasRestantes);
    }

    public void actualizaRecord(){

        if (vidasRestantes == recordJugador){
            System.out.println("Has alcanzado el record actual que es de: " + vidasRestantes);

        } else if (recordJugador < vidasRestantes) {
            recordJugador = vidasRestantes;
            System.out.println("Has superado el record actual, el nuevo record es: " + recordJugador);
        }

    }


    public abstract void juega();


    //Get and Set
    public int getTodasVidas() {
        return todasVidas;
    }

    public void setTodasVidas(int todasVidas) {
        this.todasVidas = todasVidas;
    }

    public int getVidasRestantes() {
        return vidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        this.vidasRestantes = vidasRestantes;
    }
}
