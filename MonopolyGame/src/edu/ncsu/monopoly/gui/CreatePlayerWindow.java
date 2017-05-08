package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.DataBase;
import edu.ncsu.monopoly.User;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CreatePlayerWindow extends javax.swing.JFrame {

    private User user;
    private DataBase dB;
    private WelcomeMenu prev;
    private String[] args;

    public CreatePlayerWindow(WelcomeMenu previous, DataBase dBs,String[] arg) {
        prev = previous;
        dB = dBs;
        args=arg;
        user = new User();
        File playerPicture = new File("src/PredefPic/PredefPicture.png");
        user.setPicture(playerPicture);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEnterName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jButtonAddPicture = new javax.swing.JButton();
        jButtonCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Player");

        jLabelEnterName.setText("Name:");

        jButtonAddPicture.setText("Subir Foto");
        jButtonAddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddPictureActionPerformed(evt);
            }
        });

        jButtonCreate.setText("Crear");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Create player");

        Back.setText("Cancelar");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelEnterName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAddPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEnterName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAddPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButtonAddPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddPictureActionPerformed
        PictureChooser window = new PictureChooser(this);
        this.setVisible(false);
        javax.swing.JFileChooser jFCh = window.getfCh();
        int returnVal = jFCh.showOpenDialog(null);
        boolean opened = returnVal != jFCh.CANCEL_OPTION;
        if (opened) {
            String path = jFCh.getSelectedFile().getPath();
            File file = new File(path);
            user.setPicture(file);
            
            
        } 
            this.setVisible(true);

                                                  
    }//GEN-LAST:event_jButtonAddPictureActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        String userName = jTextFieldName.getText();
        user.setName(userName);
        if (userName.length() == 0) {
            JOptionPane.showMessageDialog(this, "A name must be entered", "Error", WIDTH);
        } else {
            if (userName.length() < 4) {
                JOptionPane.showMessageDialog(this, "The name must have at least 4 characters", "Error", WIDTH);
            } else {
                if (dB.alreadyExists(user)) {
                    JOptionPane.showMessageDialog(this, "An user with that name already exists", "Error", WIDTH);
                } else {

                    dB.addUser(user);
                    prev = new WelcomeMenu(dB,args);
                    prev.setVisible(true);
                    this.setVisible(false);
                }
            }
        }                                            
       
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        prev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButtonAddPicture;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelEnterName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
