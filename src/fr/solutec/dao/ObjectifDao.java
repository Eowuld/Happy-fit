/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import static fr.solutec.dao.UserDao.getCurrentUserPoids;
import fr.solutec.model.Objectif;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author stagiaire
 */
public class ObjectifDao {
    
   public static void insertObjectif(Objectif obj) throws SQLException {
        String sql = "INSERT INTO objectif (poids, objPoids, objDistance, objTemps, User_idUser) VALUES (?, ?, ?, ?, ?)";

        Connection connexion = AccessBD.getConnection();

        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setDouble(1, obj.getPoids());
        if (obj.getObjectifPoids() == 0) {
            requete.setString(2, "0");
        } else {
            requete.setString(2, Double.toString(obj.getObjectifPoids()));
        }
        if (obj.getObjectifDistance() == 0) {
            requete.setString(3, "0");
        } else {
            requete.setString(3, Double.toString(obj.getObjectifDistance()));
        }
        if (obj.getObjectifDuree() == 0) {
            requete.setString(4, "0");
        } else {
            requete.setString(4, Double.toString(obj.getObjectifDuree()));
        }
        /*java.sql.Date current_date = new java.sql.Date(Calendar.getInstance().getTimeInMillis());
        requete.setDate(5, current_date);*/
        requete.setInt(5, obj.getU().getId());

        requete.execute();
    } 
}
