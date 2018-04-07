/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsuarioBEANS;

import Utils.Conexion;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author oscar
 */
public class VotoDB {
        public static void Insertar(String cel, String can) {

        try {

            int contador = 0;

            Connection conn = Conexion.obtenerConexion();
            Statement s = null;
            s = conn.createStatement();
            contador = s.executeUpdate("insert into voto(Cedula,id_candidato) values ('"+cel+"',"+can+");");

        } catch (Exception e) {
            System.out.print("Error en " + e);
        }

    }
}
