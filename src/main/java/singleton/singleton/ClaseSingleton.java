package singleton.singleton;

public class ClaseSingleton {

    private static ClaseSingleton claseSingleton;
    private String contenido;

    private ClaseSingleton(){

    }

    public static ClaseSingleton getStance(){
      
        if(claseSingleton==null){
            claseSingleton = new ClaseSingleton();
        }
        return claseSingleton;
    }
    

    public  String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }


   
    
}
