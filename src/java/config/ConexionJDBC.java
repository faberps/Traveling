/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author faber
 */
public class ConexionJDBC {
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement st;
    //private final String URL = "jdbc:hsqldb:file:/home/libardo/Documentos/NetBeansProjects/Taller4-cliente-servidor/AgenciaViajes/bd/clientes;hsqldb.lock_file=false";
    //Cambie la URL de su bd local, por ejemplo, si tiene Windows,sería algo como:
    private final String URL = "jdbc:hsqldb:file:C:/Users/faber/OneDrive/Documentos/NetBeansProjects/Traveling/db/clientes;hsqldb.lock_file=false";
    
    private final String USER = "agencia";
    private final String PASSWORD = "123";

    public ConexionJDBC() {

    }

    public void conectarse() throws ClassNotFoundException, SQLException {
        Class.forName("org.hsqldb.jdbcDriver");
        cn = DriverManager.getConnection(URL, USER, PASSWORD);
        
    }

    /**
     * Ejecuta una consulta de tipo select
     * @param sql
     * @throws SQLException 
     */
    public void crearConsulta(String sql) throws SQLException {
        st = (PreparedStatement) cn.createStatement();
        rs = st.executeQuery(sql);
    }

    /**
     * Ejecuta una consulta de tipo insert, update o delete
     *
     * @param sql
     * @throws SQLException
     */
    public void actualizar(String sql) throws SQLException {
        st = (PreparedStatement) cn.createStatement();
        st.executeUpdate(sql);
    }
    /**
     * Cierra las variables de rs, st y cn que estén abiertas
     * @throws SQLException 
     */
    public void desconectarse() throws SQLException {
        if ( rs != null){
            rs.close();
        }
        st.close();
        cn.close();
    }
    /**
     * Devuelve todo el conjunto de resultados
     * @return 
     */
    public ResultSet getResultado() {
        return rs;
    }
}
