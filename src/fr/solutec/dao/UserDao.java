/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.solutec.model.User;
/**
 *
 * @author Joel Banka
 */
public class UserDao {
    
    public static User getByLoginPass(String pseudo, String mdp)throws SQLException{
        User resultat = null;
        
        String sql = "SELECT * FROM user WHERE mail = ? AND mdp = ?";
        Connection connexion = AccessBD.getConnection();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, pseudo);
        requete.setString(2, mdp);
        
        ResultSet rs = requete.executeQuery();
        
        if (rs.next()){
            resultat = new User();
            resultat.setId(rs.getInt("iduser"));
            resultat.setPseudo(rs.getString("pseudo"));            
            resultat.setMail(rs.getString("mail"));            
            resultat.setSexe(rs.getString("sexe"));            
            resultat.setAge(rs.getInt("age"));            
            resultat.setTaille(rs.getInt("taille"));            
            resultat.setPoids(rs.getDouble("poids"));            
        }               
        return resultat;
    }
    
}
