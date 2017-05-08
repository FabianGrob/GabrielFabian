package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.Criteria;
import edu.ncsu.monopoly.DataBase;
import edu.ncsu.monopoly.User;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

public class Ranking extends javax.swing.JFrame {

    private DataBase dB;
    private WelcomeMenu previous;

    public Ranking(DataBase dBs, WelcomeMenu prev) {
        initComponents();
        dB = dBs;
        previous = prev;
        jLabelTrophy.setVisible(false);
        jListUsers.removeAll();
        Collections.sort(dB.getUsers(), new Criteria());
        ArrayList <User>users = dB.getUsers(); 
        User none = new User();
        none.setName("Play as guest");
        users.remove(none);
        String[] names = new String[users.size()];
        int j =0;
        for (int i = 0; i < users.size(); i++) {
            names[j]=users.get(i).getName();
            j++;
        }
        jListUsers.setListData(names);
        jListUsers.setSelectedIndex(0);
        ImageIcon imgThisImg = new javax.swing.ImageIcon("src/PredefPic/trophy-1.png");
        Image image=imgThisImg.getImage();
        Image img= image.getScaledInstance(34, 34,java.awt.Image.SCALE_DEFAULT);
        ImageIcon imageicon = new ImageIcon(img);
        jLabelTrophy.setIcon(imageicon);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jLabelScore = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListUsers = new javax.swing.JList<>();
        jButtonBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRank = new javax.swing.JLabel();
        jLabelTrophy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PredefPic/predefPic.png"))); // NOI18N
        jLabelPicture.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelScore.setText("Score:");

        jLabelName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelName.setText("Name:");

        jListUsers.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jListUsers.setSelectionBackground(new java.awt.Color(0, 153, 255));
        jListUsers.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListUsersValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListUsers);

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Ranking");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("    Choose a user");

        jLabelRank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRank.setText("Rank:");

        jLabelTrophy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PredefPic/trophy-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPicture)
                        .addGap(43, 43, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelRank, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTrophy, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTrophy, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabelRank, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPicture))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        previous.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jListUsersValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListUsersValueChanged
        String name = jListUsers.getSelectedValue();
        User selectedUser = dB.getUser(name);
        jLabelName.setText("Name: " + selectedUser.getName());
        jLabelScore.setText("Score: " + selectedUser.getWonGames() + "/" + selectedUser.getPlayedGames());
        jLabelRank.setText("Rank: " + ((int)jListUsers.getSelectedIndex() + 1));
        if (jListUsers.getSelectedIndex()==0) {
            jLabelTrophy.setVisible(true);
        }else{
        jLabelTrophy.setVisible(false);
        }
        String path = selectedUser.getPicture().getPath();
        ImageIcon imgThisImg = new javax.swing.ImageIcon(path);
        Image image=imgThisImg.getImage();
        Image img= image.getScaledInstance(99, 99,java.awt.Image.SCALE_DEFAULT);
        ImageIcon imageicon = new ImageIcon(img);
        jLabelPicture.setIcon(imageicon);
        //jLabelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource(selectedUser.getPicture().getPath())));   
    }//GEN-LAST:event_jListUsersValueChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelRank;
    private javax.swing.JLabel jLabelScore;
    private javax.swing.JLabel jLabelTrophy;
    private javax.swing.JList<String> jListUsers;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
