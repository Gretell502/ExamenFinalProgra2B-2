
package AccesoDatos;
import Entidades.Modelos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Presentacion.conexion;

public class MetodosModelos {
    
     public int guardar(Modelos modelo) {     
        String sql_guardar;
        int numFilas = 0;
        sql_guardar = "INSERT INTO modelos (nombreModelos) VALUES ('"+ modelo.getNombre() + "')";
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
     
     public ArrayList<Modelos> consultar(String nombre) {
        ArrayList<Modelos> estudiantesConsulta = new ArrayList<Modelos>();

        String sql_select = "SELECT * FROM modelos     ";       
         if (!nombre.isEmpty()) {
            sql_select += "WHERE ";
        }
        if (!nombre.isEmpty()) {
            sql_select += "nombreModelos LIKE '%" + nombre + "%' AND ";
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
                estudiantesConsulta.add(new Modelos());
                estudiantesConsulta.get(counter).setCodigo(tabla.getString(1));
                estudiantesConsulta.get(counter).setNombre(tabla.getString(2));               
                counter++;
            }

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        return estudiantesConsulta;
    }

    public void modificar(Modelos modelo) {
        try {
            String sql_modificar = "UPDATE modelos";
            sql_modificar += " set nombreModelos = '" + modelo.getNombre() + "'";
            sql_modificar += " WHERE idModelos = '" + modelo.getCodigo() + "'";

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

    public void eliminar(Modelos modelo) {       
        try {
            String sql_eliminar = "DELETE FROM modelos";
            sql_eliminar += " WHERE idModelos = '" + modelo.getCodigo() + "'";

            conexion cc=new conexion();
            Connection conn=cc.conexionFunc();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_eliminar);
            sentencia.executeUpdate(sql_eliminar);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
    }
    
    public Modelos consultarMODELOS(String codigo) {
        Modelos tPersonas = new Modelos();
        String sql_select;
        sql_select = "SELECT idModelos, nombreModelos FROM modelos WHERE idModelos='" + codigo + "'";
 
        try {
            conexion cc=new conexion();
            Connection conn=cc.conexionFunc();
            System.out.println("CONSULTA: " + sql_select);
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {
                tPersonas.setCodigo(tabla.getString(1));
                tPersonas.setNombre(tabla.getString(2));
            }

            conn.close();

            return tPersonas;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }

        return null;
    
    } 
}
