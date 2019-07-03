/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;

import Interfaces.Crud;
import Modelo.Cliente;
import config.ConexionJDBC;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faber
 */
public class ClienteDAO implements Crud{
    
    private ConexionJDBC conector;

    public ClienteDAO() {
        conector = new ConexionJDBC();
    }

    
    @Override
    public ArrayList<Cliente> listar() {
        return null;
        /*ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {
            conector.conectarse();
            conector.crearConsulta("SELECT * FROM Cliente");

        

        while (conector.getResultado().next()) {
            Cliente cli = new Cliente(conector.getResultado().getString("id"), conector.getResultado().getString("nombres"), conector.getResultado().getString("apellidos"), conector.getResultado().getString("direccion"), conector.getResultado().getString("celular"), conector.getResultado().getString("email"), conector.getResultado().getString("sexo"),conector.getResultado().getString("fec_nac"),conector.getResultado().getString("ciudad"));
            clientes.add(cli);
        }
        conector.desconectarse();
        System.out.println("Conectado");
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clientes;*/
       
    }

    @Override
    public Cliente list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public boolean editar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
