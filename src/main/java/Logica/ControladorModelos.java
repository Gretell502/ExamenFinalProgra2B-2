package Logica;
import AccesoDatos.MetodosModelos;
import Entidades.Modelos;
import java.util.ArrayList;
public class ControladorModelos {
    MetodosModelos metodosTiposPersonas;
    Modelos tipospersonasSeleccionado;
    ArrayList<Modelos> ultimaConsulta;
    public ControladorModelos() {
       metodosTiposPersonas = new MetodosModelos();
    }
    
    public String insertarTiposPersonas(String nombre) {
        //<editor-fold defaultstate="collapsed" desc="insertarEstudiante()">
        if (!nombre.isEmpty()) {
            Modelos marcas = new Modelos();
            marcas.setNombre(nombre);         
            if (metodosTiposPersonas.guardar(marcas) == -1) {
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
    
    public Object[][] consultarTiposPersonas(String nombre) {        
        ultimaConsulta = metodosTiposPersonas.consultar(nombre);
        Object resultado[][] = new Object[ultimaConsulta.size()][2];
        for (int i = 0; i < resultado.length; i++) {         
         resultado[i][0] = ultimaConsulta.get(i).getCodigo().toString();
         resultado[i][1] = ultimaConsulta.get(i).getNombre().toString();
        }
        return resultado;       
    }
    
     public String[] seleccionarTiposPersonas(int seleccionado) {
        
        String estudiante[] = new String[2];
        tipospersonasSeleccionado = ultimaConsulta.get(seleccionado);
        
        estudiante[0] = tipospersonasSeleccionado.getCodigo();
        estudiante[1] = tipospersonasSeleccionado.getNombre();
        
        return estudiante;

    }

    public String actualizarTiposPersonas(String nombre) {
        if (!nombre.isEmpty()) {
            
            tipospersonasSeleccionado.setNombre(nombre);         
            metodosTiposPersonas.modificar(tipospersonasSeleccionado);
            
            return "OK";
        } else {
            return "Es necesario ingresar la informacion de todos los campos";
        }
    }
    
    public void eliminarTiposPersonas() {
        metodosTiposPersonas.eliminar(tipospersonasSeleccionado);
    }
}
