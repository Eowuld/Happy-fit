/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Objectif;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import fr.solutec.model.User;
import java.util.Calendar;

/**
 *
 * @author Joel Banka
 */
public class UserDao {

    public static User getByLoginPass(String login, String mdp) throws SQLException {
        User resultat = null;

        String sql = "SELECT * FROM user WHERE login = ? AND mdp = ?";
        Connection connexion = AccessBD.getConnection();

        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, login);
        requete.setString(2, mdp);

        ResultSet rs = requete.executeQuery();

        if (rs.next()) {
            resultat = new User();
            resultat.setId(rs.getInt("iduser"));
            resultat.setPseudo(rs.getString("login"));
            resultat.setMdp(rs.getString("mdp"));
            resultat.setMail(rs.getString("mail"));
            resultat.setSexe(rs.getString("sexe"));
            resultat.setAge(rs.getInt("age"));
            resultat.setTaille(rs.getInt("taille"));
            resultat.setPoids(rs.getDouble("poids"));
        }
        return resultat;
    }

    public static void insertUser(User personne) throws SQLException {
        String sql = "INSERT INTO user (login, mdp, mail, sexe, age, taille, poids) VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection connexion = AccessBD.getConnection();

        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, personne.getPseudo());
        requete.setString(2, personne.getMdp());
        requete.setString(3, personne.getMail());
        requete.setString(4, personne.getSexe());
        requete.setInt(5, personne.getAge());
        requete.setInt(6, personne.getTaille());
        requete.setDouble(7, personne.getPoids());

        requete.execute();
    }

    public static List<User> getAllUsers() throws SQLException {
        List<User> result = new ArrayList<>();

        String sql = "SELECT * FROM user";
        Connection connexion = AccessBD.getConnection();

        Statement requette = connexion.createStatement();

        ResultSet rs = requette.executeQuery(sql);

        while (rs.next()) {
            User u = new User();
            u.setId(rs.getInt("iduser"));
            u.setPseudo(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            u.setMail(rs.getString("mail"));
            u.setSexe(rs.getString("sexe"));
            u.setAge(rs.getInt("age"));
            u.setTaille(rs.getInt("taille"));
            u.setPoids(rs.getDouble("poids"));

            result.add(u);
        }

        return result;
    }

    public static void updateUser(User to_update, User newer) throws SQLException {
        String sql = "UPDATE user SET mdp=?, mail=?, sexe=?, age=?, taille=?, poids=? WHERE login=to_update.getPseudo()";

        Connection connexion = AccessBD.getConnection();

        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, newer.getMdp());
        requete.setString(2, newer.getMail());
        requete.setString(3, newer.getSexe());
        requete.setInt(4, newer.getAge());
        requete.setInt(5, newer.getTaille());
        requete.setDouble(6, newer.getPoids());
        requete.execute();
    }

    public static String getCurrentUserPoids(User current_u) throws SQLException {
        String current_poids = "0.00";
        String sql = " SELECT poids FROM OBJECTIF WHERE User_idUser = ? HAVING MAX(date)";
        Connection connexion = AccessBD.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, Integer.toString(current_u.getId()));
        ResultSet rs = requete.executeQuery();
        if (rs.next()) {
            current_poids = Double.toString(rs.getDouble("poids"));
        }
        return current_poids;
    }

    public static User getIdFromUser(User current_u) throws SQLException {
        User u = null;
        String sql = " SELECT idUser FROM USER WHERE mail = ?";

        Connection connexion = AccessBD.getConnection();
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, current_u.getMail());
        ResultSet rs = requete.executeQuery();
        if (rs.next()) {
            u = new User();
            u.setId(rs.getInt("idUser"));
        }

        return u;

    }

}
