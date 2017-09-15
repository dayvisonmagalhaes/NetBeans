/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Estado;

/**
 *
 * @author u6390869
 */
public class EstadoDAO {
    
    public boolean inserir(Estado estado)
    {
        String sql = "INSERT INTO tbl_estado(estado_nome, estado_sigla) VALUES(?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, estado.getNome());
            pst.setString(2, estado.getSigla());
            
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean atualizar(Estado estado)
    {
        String sql = "UPDATE tbl_estado set estado_nome=?,estado_sigla=? where estado_id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setString(1, estado.getNome());
            pst.setString(2, estado.getSigla());
            
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    public boolean excluir(Estado estado)
    {
        String sql = "DELETE FROM tbl_estado where estado_id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
           
            pst.setInt(1, estado.getId());
            if(pst.executeUpdate()>0)
            {
                retorno = true;
            }
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public List<Estado> listar()
    {
         String sql = "SELECT * FROM tbl_estado";
        List<Estado> retorno = new ArrayList<Estado>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Estado item = new Estado();
                item.setId(res.getInt("estado_id"));
                item.setNome(res.getString("estado_nome"));
                item.setSigla(res.getString("estado_sigla"));
                
                
                retorno.add(item);
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }
    public Estado buscar(Estado estado)
    {
         String sql = "SELECT * FROM tbl_estado where estado_id=?";
        Estado retorno = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setInt(1, estado.getId());
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Estado();
                retorno.setNome(res.getString("nome"));
                retorno.setSigla(res.getString("sigla"));
                
                
                
                
            }
               
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    
    }

}
