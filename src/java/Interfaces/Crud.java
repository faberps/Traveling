/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author faber
 */
public interface Crud {
    public ArrayList<Cliente> listar();
    public Cliente list(int id);
    public boolean agregar(Cliente cliente);
    public boolean editar(Cliente cliente);
    public boolean eliminar(int id);
}
