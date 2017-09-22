/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}
