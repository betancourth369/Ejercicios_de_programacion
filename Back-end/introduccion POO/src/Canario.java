
public class Canario extends Ave{

    //atributo solo de canario
    int tamano;

    //Constructor 1
    public Canario(String sexo, int edad) {
        super(sexo, edad);
    }

    //Constructor 2
    public Canario(String sexo, int edad, int tamano) {
        super(sexo, edad);
        this.tamano = tamano;
    }

    //metodo altura
    public void altura(int tamano){
        if(tamano > 30){
            System.out.println("grande");
        }else if(tamano >= 15 && tamano <= 29){
            System.out.println("mediano");
        }else{
            System.out.println("pequeño");
        }
    }
}
