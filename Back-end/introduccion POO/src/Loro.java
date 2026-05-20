
public class Loro extends Ave{
    String region;

    //constructor solo de loro
    public Loro(String sexo, int edad, String region) {
        super(sexo, edad);
        this.region = region;
    }

    //metodo deDondeEres
    public void deDondeEres(){

        System.out.println("soy de " + region);//atajo es (sout y tab + enter)
    }


}
