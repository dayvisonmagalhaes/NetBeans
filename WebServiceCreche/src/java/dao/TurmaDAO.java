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
import modelo.Turma;
/**
 *
 * @author u6390869
 */


public class TurmaDAO {
    
   
    
    public boolean inserir(Turma turma)
    {
        String sql = "insert into tbl_turma (tbl_turma.turma_sala, tbl_turma.turma_turno,\n" +
"					tbl_turma.tbl_escola_escola_cnpj, tbl_turma.tbl_tipoTurma_tipoTurma_id) VALUES(?,?,?,?)";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, turma.getSala());
            pst.setString(2, turma.getTurno());
            pst.setDouble(3, turma.getEscolaCnpj());
            pst.setInt(4, turma.getTipoTurmaId());
            
            
            pst.executeUpdate();
                retorno = true;
            
                
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        
        return retorno;
    
    }
    
    public List<Turma> listar()
    {
         String sql = "SELECT * FROM tbl_turma";
        List<Turma> retorno = new ArrayList<Turma>();
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Turma item = new Turma();
                item.setId(res.getInt("turma_id"));
                item.setSala(res.getString("turma_sala"));
                item.setTurno(res.getString("turma_turno"));
                item.setEscolaCnpj(res.getDouble("tbl_escola_escola_cnpj"));
                item.setTipoTurmaId(res.getInt("tbl_tipoTurma_tipoTurma_id"));
                
                
                retorno.add(item);
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return retorno;
    
    }
    
    public Turma buscar(int id)
    {
        String sql = "SELECT * FROM tbl_turma where turma_id=?";
        
        Turma item = null;
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
           
            pst.setInt(1, id);
            ResultSet res = pst.executeQuery();
            
            if(res.next())
            {
                item = new Turma();
                item.setId(res.getInt("turma_id"));
                item.setSala(res.getString("turma_sala"));
                item.setTurno(res.getString("turma_turno"));
                item.setEscolaCnpj(res.getDouble("tbl_escola_escola_cnpj"));
                item.setTipoTurmaId(res.getInt("tbl_tipoTurma_tipoTurma_id"));
             
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        return item;
    
    }
    
    public boolean excluir(int id)
    {
        String sql = "DELETE FROM tbl_turma where turma_id=?";
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
    
    public boolean atualizar(Turma turma)
    {
        String sql = "UPDATE tbl_turma set turma_sala=?,turma_turno=?,tbl_escola_escola_cnpj=?,tbl_tipoTurma_tipoTurma_id=? where turma_id=?";
        Boolean retorno = false;
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
          
            pst.setString(1, turma.getSala());
            pst.setString(2, turma.getTurno());
            pst.setDouble(3, turma.getEscolaCnpj());
            pst.setInt(4, turma.getTipoTurmaId());
            pst.setInt(5, turma.getId());
            
            
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