package Entidades;

public class Modelos {
    private String codigo;
    private String nombre;


    public Modelos(){
    }

    public Modelos(String nombre) {
        this.nombre = nombre;
      
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   
}