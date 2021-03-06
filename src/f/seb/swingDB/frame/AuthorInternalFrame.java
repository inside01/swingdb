/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.seb.swingDB.frame;

import fr.seb.database.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrateur
 */
public class AuthorInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AuthorInternalFrame
     */
    public AuthorInternalFrame() {
        initComponents();
        initTable();
    }

    private void initTable() {
        //recuperation du modele de la jtable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        //suppression de lignes existantes sur la table
        model.setRowCount(0);

        //recuperation des donnees depuis la base des donnees
        //le requete sql
        String sql = "SELECT * FROM auteurs";

        try {
            //la connexion a la base de donnees
            Connection cn = DatabaseConnection.getInstance();
            //le statement
            Statement stm = cn.createStatement();
            //execution de la requete
            ResultSet rs = stm.executeQuery(sql);

            //tableau d'objet qui represente une ligne de la table
            Object[] tableRow;

            //boucle sur le resulSet
            while (rs.next()) {
                //constitution du tableau de donnees
                tableRow = new Object[3];
                tableRow[0] = rs.getObject("id");
                tableRow[1] = rs.getObject("prenom");
                tableRow[2] = rs.getObject("nom");

                //ajout du tableau dans une nouvelle du modele
                model.addRow(tableRow);
            }

            //fermeture des objets de connexion
            rs.close();
            stm.close();

        } catch (SQLException ex) {
            Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        majUser = new javax.swing.JButton();
        ajoutUser = new javax.swing.JButton();
        supprimerUser = new javax.swing.JButton();
        razButton = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("gestion des auteurs");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "prenom", "nom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("id");

        jLabel2.setText("prenom");

        jLabel4.setText("nom");

        majUser.setText("mise a jour client");
        majUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                majUserActionPerformed(evt);
            }
        });

        ajoutUser.setText("ajouter client");
        ajoutUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutUserActionPerformed(evt);
            }
        });

        supprimerUser.setText("supprimer client");
        supprimerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerUserActionPerformed(evt);
            }
        });

        razButton.setText("RAZ");
        razButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(ajoutUser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(razButton)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(majUser)
                                    .addGap(28, 28, 28)
                                    .addComponent(supprimerUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutUser)
                    .addComponent(majUser)
                    .addComponent(supprimerUser))
                .addGap(18, 18, 18)
                .addComponent(razButton)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //la ligne selectionnée
        int selectedIndex = jTable1.getSelectedRow();
        //redefinition de l'index pour obtenir la bonne selection
        //en cas de tri sur la table
        selectedIndex = jTable1.convertRowIndexToModel(selectedIndex);
        //recuperation du modele
        TableModel model = jTable1.getModel();

        //recup des donnees de la ligne selectionné
        String id = model.getValueAt(selectedIndex, 0).toString();
        String name = model.getValueAt(selectedIndex, 2).toString();
        String firstName = String.valueOf(model.getValueAt(selectedIndex, 1));
        
        //si firstName est null
        if(firstName == null)  {
            firstName = "";
        }

        //insertion des donnees dans les textfield
        idField.setText(id);
        nameField.setText(name);
        firstNameField.setText(firstName);

    }//GEN-LAST:event_jTable1MouseClicked

    private void majUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_majUserActionPerformed
        //recup de la saisie
        String name = nameField.getText();
        String firstName = firstNameField.getText();
        Integer id = Integer.valueOf(idField.getText());
        
        
        if(! name.equals("") && id >0) {
            //transformation de la chaine vide en null
            if(firstName.equals("")){
                firstName = null;
            }
            try {
                //recup de la connexion
                Connection cn = DatabaseConnection.getInstance();
                
                String sql = "UPDATE auteurs SET nom=?, prenom=?, WHERE id=?";
                
                PreparedStatement pstm = cn.prepareStatement(sql);
                
                pstm.setString(1, name);
                pstm.setString(2, firstName);
                pstm.setInt(3, id);
                
                pstm.executeUpdate();
                
                //mise a jour de la table
                initTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_majUserActionPerformed

    private void supprimerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerUserActionPerformed
       //recuperation de l'identifiants
        Integer id = Integer.valueOf(idField.getText());
        
        //suppression uniquement si l'identifiants n'est pas vide
        if(id>0) {
            try {
                //requete sql de suppression
                String sql = "DELETE FROM auteurs WHERE id = ? ";
                
                //recuperation de la connexion
                Connection cn = DatabaseConnection.getInstance();
                
                PreparedStatement pstm = cn.prepareStatement(sql);
                
                pstm.setInt(1, id);
                
                pstm.executeUpdate();
                
                initTable();
                
                
                /* try {
                Connection cn = DatabaseConnection.getInstance();
                String sql = "DELETE FROM auteurs WHERE id = ? ";
                PreparedStatement pstm = cn.prepareStatement(sql);
                pstm.setString(1, idField.getText());
                pstm.executeUpdate();
                
                } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                initTable();*/
            } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_supprimerUserActionPerformed
    }
    private void ajoutUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutUserActionPerformed
        //recup de la saisie
        String name = nameField.getText();
        String firstName = firstNameField.getText();
        
        if(! name.equals("")) {
            //transformation de la chaine vide en null
            if(firstName.equals("")){
                firstName = null;
            }
            try {
                //recup de la connexion
                Connection cn = DatabaseConnection.getInstance();
                
                String sql = "INSERT INTO auteurs (nom,prenom) VALUES(?,?)";
                
                PreparedStatement pstm = cn.prepareStatement(sql);
                
                pstm.setString(1, name);
                pstm.setString(2, firstName);
                pstm.executeUpdate();
                
                //mise a jour de la table
                initTable();
                
            } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
        /*try {
            //recuperation de la connection
            Connection cn = DatabaseConnection.getInstance();

            String sql = "INSERT INTO auteurs (nom,prenom) VALUES(?,?)";

            //preparation de la requete
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, nameField.getText());
            pstm.setString(2, firstNameField.getText());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        initTable();*/
    }//GEN-LAST:event_ajoutUserActionPerformed
    }
    private void razButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razButtonActionPerformed
        idField.setText("");
        nameField.setText("");
        firstNameField.setText("");
    }//GEN-LAST:event_razButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajoutUser;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton majUser;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton razButton;
    private javax.swing.JButton supprimerUser;
    // End of variables declaration//GEN-END:variables
}
