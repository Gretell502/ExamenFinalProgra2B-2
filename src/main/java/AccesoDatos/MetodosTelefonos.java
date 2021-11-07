
package AccesoDatos;
import Entidades.Telefonos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Presentacion.conexion;

public class MetodosTelefonos {
    
     public int guardar(Telefonos telefono) {     
        String sql_guardar;
        int numFilas = 0;
        sql_guardar = "INSERT INTO telefonos (IME, marca, modelo,MACAddress) VALUES ('"+ telefono.getIme() + "', '"+ telefono.getMarca().getCodigo() + "', '"+ telefono.getModelos().getCodigo() + "', '"+ telefono.getMACAddress() + "')";
        try {
            conexion cc=new conexion();
            Connection conn=cc.conexionFunc();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_guardar);
            numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }

        return -1;
    }
     
     public ArrayList<Telefonos> consultar(String IME) {
        ArrayList<Telefonos> estudiantesConsulta = new ArrayList<Telefonos>();

        String sql_select = "SELECT * FROM telefonos     ";       
         if (!IME.isEmpty()) {
            sql_select += "WHERE ";
        }
        if (!IME.isEmpty()) {
            sql_select += "IME LIKE '%" + IME + "%' AND ";
        }
        
     

        sql_select = sql_select.substring(0, sql_select.length() - 5);

        try {
            conexion cc=new conexion();
            Connection conn=cc.conexionFunc();
            System.out.println("SQL Consulta: " + sql_select);
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            int counter = 0;
            while (tabla.next()) {
                estudiantesConsulta.add(new Telefonos());
                estudiantesConsulta.get(counter).setCodigo(tabla.getString(1));
                estudiantesConsulta.get(counter).setIme(tabla.getString(2));               
                estudiantesConsulta.get(counter).setMarca(new MetodosMarcas().consultarMARCAS(tabla.getString(3)));
                estudiantesConsulta.get(counter).setModelos(new MetodosModelos().consultarMODELOS(tabla.getString(4)));
                estudiantesConsulta.get(counter).setMACAddress(tabla.getString(5));     
                counter++;
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        return estudiantesConsulta;
    }

    public void modificar(Telefonos telefono) {
        try {
            String sql_modificar = "UPDATE telefonos";
            sql_modificar += " set IME = '" + telefono.getIme() + "',";
            sql_modificar += " marca = '" + telefono.getMarca().getCodigo() + "',";
            sql_modificar += " modelo = '" + telefono.getModelos().getCodigo() + "',";
            sql_modificar += " MACAddress = '" + telefono.getMACAddress() + "'";
            sql_modificar += " WHERE idTelefono = '" + telefono.getCodigo() + "'";

            conexion cc=new conexion();
            Connection conn=cc.conexionFunc();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_modificar);
            sentencia.executeUpdate(sql_modificar);
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
    }

    public void eliminar(Telefonos telefono) {       
        try {
            String sql_eliminar = "DELETE FROM telefonos";
            sql_eliminar += " WHERE idTelefono = '" + telefono.getCodigo() + "'";

            conexion cc=new conexion();
            Connection conn=cc.conexionFunc();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_eliminar);
            sentencia.executeUpdate(sql_eliminar);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
    }
}
