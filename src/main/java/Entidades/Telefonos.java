package Entidades;

public class Telefonos {
    private String codigo;
    private String nombre;
    private String ime;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    private String MACAddress;

    public String getMACAddress() {
        return MACAddress;
    }

    public void setMACAddress(String MACAddress) {
        this.MACAddress = MACAddress;
    }
    Marcas marcas;
    Modelos modelos;

    public Marcas getMarcas() {
        return marcas;
    }

    public void setMarcas(Marcas marcas) {
        this.marcas = marcas;
    }

    public Modelos getModelos() {
        return modelos;
    }

    public void setModelos(Modelos modelos) {
        this.modelos = modelos;
    }

    public Telefonos(){
    }

    public Telefonos(String nombre) {
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
    
    public void setMarca(Marcas marcas) {
        this.marcas = marcas;
    }

    public Marcas getMarca() {
        return marcas;
    }
}
