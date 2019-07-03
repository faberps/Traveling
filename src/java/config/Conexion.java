/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import Modelo.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author faber
 */
public class Conexion {
    Connection conexion = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public Connection conectar(){
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conexion = DriverManager.getConnection("jdbc:hsqldb:file:home/Users/faber/OneDrive/Documentos/NetBeansProjects/Traveling/bd/clientes", "agencia", "123");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        return conexion;
    }
    public LinkedList<Cliente>consultarCliente(String conSQL){
        LinkedList<Cliente> client = new LinkedList<Cliente>();
        try {
            ps = conectar().prepareStatement(conSQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setId("id");
                cliente.setNombres("nombres");
                cliente.setApellidos("apellidos");
                cliente.setDireccion("direccion");
                cliente.setCelular("celular");
                cliente.setEmail("email");
                cliente.setSexo("sexo");
                cliente.setFec_Nac("fec_nac");
                cliente.setCiudad("ciudad");
                client.add(cliente);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        return client;
    }
}
