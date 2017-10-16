/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingdb;

import f.seb.swingDB.frame.LoginFrame;
import fr.seb.database.utils.DatabaseTools;

/**
 *
 * @author formation
 */
public class SwingDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creation d'une instance de la fenetre de login
        LoginFrame app = new LoginFrame();
        
        
        //affichage de la fenetre
        app.setVisible(true);
        //centrage de la fenetre sur l ecran
        app.setLocationRelativeTo(null);
    }

}