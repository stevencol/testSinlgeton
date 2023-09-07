package singleton;


import singleton.ventanas.VentanaPrincipal;
import singleton.vo.PersonaVo;

public class Principal {
    
    public static void main(String[] args) {
        Principal miPrincipal = new Principal();
        PersonaVo[] personas=miPrincipal.crearPersonas();
        VentanaPrincipal miVentanaPrincipal=new  VentanaPrincipal(personas);
        miVentanaPrincipal.setVisible(true);
        }



    

        private PersonaVo[] crearPersonas() {
        PersonaVo persona1= new PersonaVo();
        persona1.setNombre("Pedro");
        persona1.setId(1);
        PersonaVo persona2= new PersonaVo();
        persona2.setNombre("Pablo");
        persona2.setId(2);
        PersonaVo persona3= new PersonaVo();
        persona3.setNombre("Paco");
        persona3.setId(3);
        PersonaVo personas[] = {persona1,persona2,persona3};
        return personas;
        }
        
    
}
