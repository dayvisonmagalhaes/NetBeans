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
import modelo.Bairro;

/**
 *
 * @author u6390869
 */
public class BairroDAO {
    
    public boolean inserir(Bairro bairro)
    {
        String sql = "INSERT INTO tbl_bairro(bairro_nome,tbl_cidade_cidade_id) VALUES(?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, bairro.getNome());
            pst.setInt(2, bairro.getCidadeId());
            
            
            pst.executeUpdate();
                retorno = true;
            
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public List<Bairro> listar()
    {
         String sql = "SELECT * FROM tbl_bairro";
        List<Bairro> retorno = new ArrayList<Bairro>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Bairro item = new Bairro();
                item.setId(res.getInt("bairro_id"));
                item.setNome(res.getString("bairro_nome"));
                item.setCidadeId(res.getInt("tbl_cidade_cidade_id"));
                
                
                retorno.add(item);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    }
    
    public Bairro buscar(int id)
    {
        String sql = "SELECT * FROM tbl_bairro where bairro_id=?";
        Bairro retorno = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                retorno = new Bairro();
                retorno.setId(res.getInt("bairro_id"));
                retorno.setNome(res.getString("bairro_nome"));
                retorno.setCidadeId(res.getInt("tbl_cidade_cidade_id"));
             
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    }
    
    public boolean excluir(int id)
    {
        String sql = "DELETE FROM tbl_bairro where bairro_id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
                   
            pst.setInt(1, id);
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
    
    public boolean atualizar(Bairro bairro)
    {
        String sql = "UPDATE tbl_bairro set bairro_nome=?,tbl_cidade_cidade_id=? where bairro_id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setString(1, bairro.getNome());
            pst.setInt(2, bairro.getCidadeId());
            pst.setInt(3, bairro.getId());
            
            
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
}
