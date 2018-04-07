
package UsuarioBEANS;

import Utils.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDB {
       public static ArrayList<Usuario> obtenerparam(String cel) {

        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        try {
            Connection cnx=Conexion.obtenerConexion();
            Statement sp = cnx.createStatement();
            ResultSet rs = sp.executeQuery("SELECT * FROM persona where Cedula = '"+cel+"' ;");
            while (rs.next()) {
                Usuario pa = new Usuario(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8)
                );
                        
                
                lista.add(pa);
            }
        } catch (Exception e) {
            System.out.print("Error " + e);
        }
        return lista;
    } 
}
