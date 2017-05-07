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

    public CreatePlayerWindow(WelcomeMenu previous, DataBase dBs) {
        prev = previous;
        dB = dBs;
        user = new User();
        File playerPicture = new File("/PredefPic/PredefPicture.png");

        user.setPicture(playerPicture);
        initComponents();

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

        jLabelEnterName.setText("Ingrese su nombre:");

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Agreagar un Jugador");

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
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelEnterName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButtonAddPicture)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnterName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jButtonAddPicture)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCreate)
                    .addComponent(Back))
                .addGap(297, 297, 297))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, Short.MAX_VALUE)
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
            String name = file.getName();
            String newName = name.replace(".", "-");
            String[] fileName = newName.split("-");
            String extension = fileName[fileName.length - 1].toUpperCase();
            boolean isValid = extension.equals("JPEG") || extension.equals("JPG") || extension.equals("PNG");
            if (isValid) {
                user.setPicture(file);
                this.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Archivo inválido, debe ser jpg, jpeg o png", "Error", 0);
                this.setVisible(true);
            }
        } else {
            this.setVisible(true);
        }

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
