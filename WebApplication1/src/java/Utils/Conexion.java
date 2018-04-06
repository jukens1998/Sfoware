package Utils;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    
    public static Connection obtenerConexion(){
            
            Connection cnx = null;
            
            try{
                Class.forName("com.mysql.jdbc.Driver");
cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/cursojsp?user=root&password=Sabana568");
System.out.println("Conexion Satisfactoria con la base de datos cursojsp");    
           
            }catch(Exception e){
                System.out.println("Error de Conexion"+e);       

            }
            
            return cnx;
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion.getConexion();
        
        
        
    }

    public static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
