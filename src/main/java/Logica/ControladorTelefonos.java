package Logica;
import AccesoDatos.MetodosTelefonos;
import AccesoDatos.MetodosMarcas;
import AccesoDatos.MetodosModelos;
import Entidades.Telefonos;
import Entidades.Marcas;
import Entidades.Modelos;
import java.util.ArrayList;
public class ControladorTelefonos {
    MetodosTelefonos mTelefonos;
    Telefonos estadiosSeleccionados;
    ArrayList<Telefonos> ultimaConsulta;
    public ControladorTelefonos() {
       mTelefonos = new MetodosTelefonos();
    }
    
    public String insertar(String nombre, String ime, String marca, String modelo, String mac) {
        if (!nombre.isEmpty() && !ime.equals(" ") && !marca.equals(" ") && !modelo.equals(" ") && !mac.equals(" ")) {
            Telefonos telefono = new Telefonos();
            telefono.setNombre(nombre);         
            telefono.setIme(ime);         
            telefono.setMarca(new MetodosMarcas().consultarMARCAS(marca.split(" -")[0]));
            telefono.setModelos(new MetodosModelos().consultarMODELOS(modelo.split(" -")[0]));
            telefono.setMACAddress(mac);
            if (mTelefonos.guardar(telefono) == -1) {
                return "No es posible registrar el pais:\n"
                        + "(1) Verifique la conexion con la base de datos no tenga problemas.\n"
                        + "(2) O que el Estudiante no se encuentre ya registrado";
            }
            System.out.println("Se insertó un nuevo Estudiante");
            return "OK";
        } else {
        }
        return "Es necesario ingresar la informacion de todos los campos";
    }
    
    public Object[][] consultar(String nombre) {        
        ultimaConsulta = mTelefonos.consultar(nombre);
        Object resultado[][] = new Object[ultimaConsulta.size()][5];
        for (int i = 0; i < resultado.length; i++) {         
         resultado[i][0] = ultimaConsulta.get(i).getCodigo().toString();
         resultado[i][1] = ultimaConsulta.get(i).getIme().toString();         
         resultado[i][2] = (ultimaConsulta.get(i).getMarca().getNombre());     
         resultado[i][3] = (ultimaConsulta.get(i).getModelos().getNombre());
         resultado[i][4] = ultimaConsulta.get(i).getMACAddress().toString();    
        }
        return resultado;       
    }
    
     public String[] seleccionar(int seleccionado) {
        
        String estudiante[] = new String[5];
        estadiosSeleccionados = ultimaConsulta.get(seleccionado);
        
        estudiante[0] = estadiosSeleccionados.getCodigo();
        estudiante[1] = estadiosSeleccionados.getIme();
        estudiante[2] = estadiosSeleccionados.getMarca().getCodigo()
                + " - " + estadiosSeleccionados.getMarca().getNombre();
        estudiante[3] = estadiosSeleccionados.getModelos().getCodigo()
              + " - " + estadiosSeleccionados.getModelos().getNombre();
        estudiante[4] = estadiosSeleccionados.getMACAddress();

        
        return estudiante;

    }

    public String actualizar(String ime, String marca, String modelo, String mac) {
        if (!ime.isEmpty()&& !marca.equals(" ") && !modelo.equals(" ") && !mac.equals(" ")) {           
            estadiosSeleccionados.setIme(ime);
            estadiosSeleccionados.setMarca(new MetodosMarcas().consultarMARCAS(marca.split(" -")[0]));
            estadiosSeleccionados.setModelos(new MetodosModelos().consultarMODELOS(modelo.split(" -")[0]));
            estadiosSeleccionados.setMACAddress(mac);
            mTelefonos.modificar(estadiosSeleccionados);
            System.out.println("ACTUALIZAR telefono");
            return "OK";
        } else {
            return "Es necesario ingresar la informacion de todos los campos";
        }
    }
    
    public void eliminar() {
        mTelefonos.eliminar(estadiosSeleccionados);
    }
    
    public String[] cargarMarcas() {
        ArrayList<Marcas> marcas = new MetodosMarcas().consultarMarca("");
        String[] marcasRegistrados = new String[marcas.size() + 1];
        
        marcasRegistrados[0] = " ";
        for (int i = 0; i < marcas.size(); i++) {
            marcasRegistrados[i + 1] = marcas.get(i).getCodigo() + " - " + marcas.get(i).getNombre();
        }
        return marcasRegistrados;
    }  
    
    public String[] cargarModelos() {
        ArrayList<Modelos> modelos = new MetodosModelos().consultar("");
        String[] modelosRegistrados = new String[modelos.size() + 1];
        
        modelosRegistrados[0] = " ";
        for (int i = 0; i < modelos.size(); i++) {
            modelosRegistrados[i + 1] = modelos.get(i).getCodigo() + " - " + modelos.get(i).getNombre();
        }
        return modelosRegistrados;
    } 
}
