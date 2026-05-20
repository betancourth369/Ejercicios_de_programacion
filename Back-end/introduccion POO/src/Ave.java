public class Ave {
    //atributos de instancia (pertenece a cada obj)
    String sexo;
    int edad;

    //atributo de clase (compartido por todos)
    static int numAves = 0;

    //constructor
    public Ave(String sexo, int edad){
        this.sexo = sexo;
        this.edad = edad;
        numAves++;
    }

    //metodo numAves
    public void mostrarNumAves(){

        System.out.println("Numero de aves creadas " + numAves);
    }


    //metodo quienSoy
    public void quienSoy(){
        System.out.println("soy el ave " + sexo);
        System.out.println("mi edad es " + edad);
    }

}






