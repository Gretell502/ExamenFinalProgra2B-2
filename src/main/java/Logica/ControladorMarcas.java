package Logica;
import AccesoDatos.MetodosMarcas;
import Entidades.Marcas;
import java.util.ArrayList;
public class ControladorMarcas {
    MetodosMarcas metodosMarcas;
    Marcas marcasSeleccionado;
    ArrayList<Marcas> ultimaConsulta;
    public ControladorMarcas() {
       metodosMarcas = new MetodosMarcas();
    }
    
    public String insertarMarca(String nombre) {
        //<editor-fold defaultstate="collapsed" desc="insertarEstudiante()">
        if (!nombre.isEmpty()) {
            Marcas marcas = new Marcas();
            marcas.setNombre(nombre);         
            if (metodosMarcas.guardarMarca(marcas) == -1) {
                return "No es posible registrar el pais:\n"
                        + "(1) Verifique la conexion con la base de datos no tenga problemas.\n"
                        + "(2) O que el Estudiante no se encuentre ya registrado";
            }
            System.out.println("Se insertó un nuevo Estudiante");
            return "OK";
        } else {
        }
        return "Es necesario ingresar la informacion de todos los campos";
        //</editor-fold>
    }
    
    public Object[][] consultarMarca(String nombre) {        
        ultimaConsulta = metodosMarcas.consultarMarca(nombre);
        Object resultado[][] = new Object[ultimaConsulta.size()][2];
        for (int i = 0; i < resultado.length; i++) {         
         resultado[i][0] = ultimaConsulta.get(i).getCodigo().toString();
         resultado[i][1] = ultimaConsulta.get(i).getNombre().toString();
        }
        return resultado;       
    }
    
     public String[] seleccionarMarca(int seleccionado) {
        
        String estudiante[] = new String[2];
        marcasSeleccionado = ultimaConsulta.get(seleccionado);
        
        estudiante[0] = marcasSeleccionado.getCodigo();
        estudiante[1] = marcasSeleccionado.getNombre();
        
        return estudiante;

    }

    public String actualizarMarca(String nombre) {
        if (!nombre.isEmpty()) {
            
            marcasSeleccionado.setNombre(nombre);         
            metodosMarcas.modificarMarca(marcasSeleccionado);
            
            return "OK";
        } else {
            return "Es necesario ingresar la informacion de todos los campos";
        }
    }
    
    public void eliminarMarca() {
        metodosMarcas.eliminarMarca(marcasSeleccionado);
    }
}
