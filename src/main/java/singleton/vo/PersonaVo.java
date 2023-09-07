package singleton.vo;
public class PersonaVo {

    private int  idPersona;
    private String nombrePersona;

    public int getId() {
        return idPersona;
    }
    public void setId(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getNombre() {
        return nombrePersona;
    }
    public void setNombre(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    @Override
    public String toString() {
        return  idPersona + ": "+nombrePersona  ;
    }


    
}
