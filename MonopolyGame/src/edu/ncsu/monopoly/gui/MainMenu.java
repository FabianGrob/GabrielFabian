package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.DataBase;
import edu.ncsu.monopoly.GameBoard;
import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.ParametersCheckSelection;
import edu.ncsu.monopoly.Player;
import edu.ncsu.monopoly.User;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    private DataBase dB;
    private WelcomeMenu previous;
    private ArrayList<Player> players;
    private int guestsQ;

    private ArrayList<JComboBox> comboBoxesColor;
    private ArrayList<JComboBox> comboBoxesUsers;
    private ArrayList<JCheckBox> checkBoxes;

    public MainMenu(DataBase dBs, WelcomeMenu prev) {
        comboBoxesColor = new ArrayList<JComboBox>();
        comboBoxesUsers = new ArrayList<JComboBox>();
        checkBoxes = new ArrayList<JCheckBox>();
        players = new ArrayList<Player>();
        previous = prev;
        guestsQ = 1;

        dB = dBs;
        initComponents();
        jCheckBoxUser1.setEnabled(false);

        jComboBoxUser2.setEnabled(false);
        jComboBoxUser3.setEnabled(false);
        jComboBoxUser4.setEnabled(false);
        jComboBoxUser8.setEnabled(false);
        jComboBoxUser7.setEnabled(false);
        jComboBoxUser6.setEnabled(false);
        jComboBoxUser5.setEnabled(false);

        comboBoxesColor.add(jComboBoxColor1);
        comboBoxesColor.add(jComboBoxColor2);
        comboBoxesColor.add(jComboBoxColor3);
        comboBoxesColor.add(jComboBoxColor4);
        comboBoxesColor.add(jComboBoxColor5);
        comboBoxesColor.add(jComboBoxColor6);
        comboBoxesColor.add(jComboBoxColor7);
        comboBoxesColor.add(jComboBoxColor8);
        String[] colors = {"Green", "Orange", "Red", "Violet", "Yellow", "Gray", "Blue", "Black"};

        for (int i = 0; i < comboBoxesColor.size(); i++) {
            if (i > 0) {
                comboBoxesColor.get(i).setEnabled(false);
            }
            for (int j = 0; j < colors.length; j++) {
                comboBoxesColor.get(i).addItem(colors[j]);
            }
        }
        comboBoxesUsers.add(jComboBoxUser1);
        comboBoxesUsers.add(jComboBoxUser2);
        comboBoxesUsers.add(jComboBoxUser3);
        comboBoxesUsers.add(jComboBoxUser4);
        comboBoxesUsers.add(jComboBoxUser5);
        comboBoxesUsers.add(jComboBoxUser6);
        comboBoxesUsers.add(jComboBoxUser7);
        comboBoxesUsers.add(jComboBoxUser8);
        checkBoxes.add(jCheckBoxUser1);
        checkBoxes.add(jCheckBoxUser2);
        checkBoxes.add(jCheckBoxUser3);
        checkBoxes.add(jCheckBoxUser4);
        checkBoxes.add(jCheckBoxUser5);
        checkBoxes.add(jCheckBoxUser6);
        checkBoxes.add(jCheckBoxUser7);
        checkBoxes.add(jCheckBoxUser8);

        for (int j = 0; j < comboBoxesUsers.size(); j++) {
            for (int i = 0; i < dB.getUsers().size(); i++) {
                comboBoxesUsers.get(j).addItem(dB.getUsers().get(i).getName());
            }
        }

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxUser1 = new javax.swing.JComboBox<>();
        jLabelChoose = new javax.swing.JLabel();
        jCheckBoxUser1 = new javax.swing.JCheckBox();
        jCheckBoxUser2 = new javax.swing.JCheckBox();
        jComboBoxUser2 = new javax.swing.JComboBox<>();
        jCheckBoxUser3 = new javax.swing.JCheckBox();
        jComboBoxUser3 = new javax.swing.JComboBox<>();
        jComboBoxUser4 = new javax.swing.JComboBox<>();
        jCheckBoxUser4 = new javax.swing.JCheckBox();
        jCheckBoxUser8 = new javax.swing.JCheckBox();
        jCheckBoxUser7 = new javax.swing.JCheckBox();
        jCheckBoxUser6 = new javax.swing.JCheckBox();
        jCheckBoxUser5 = new javax.swing.JCheckBox();
        jComboBoxUser8 = new javax.swing.JComboBox<>();
        jComboBoxUser7 = new javax.swing.JComboBox<>();
        jComboBoxUser6 = new javax.swing.JComboBox<>();
        jComboBoxUser5 = new javax.swing.JComboBox<>();
        jButtonStart = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jComboBoxColor1 = new javax.swing.JComboBox<>();
        jComboBoxColor2 = new javax.swing.JComboBox<>();
        jComboBoxColor3 = new javax.swing.JComboBox<>();
        jComboBoxColor4 = new javax.swing.JComboBox<>();
        jComboBoxColor5 = new javax.swing.JComboBox<>();
        jComboBoxColor6 = new javax.swing.JComboBox<>();
        jComboBoxColor7 = new javax.swing.JComboBox<>();
        jComboBoxColor8 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jComboBoxUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser1ActionPerformed(evt);
            }
        });

        jLabelChoose.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabelChoose.setText("Select Users");

        jCheckBoxUser1.setSelected(true);
        jCheckBoxUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser1ActionPerformed(evt);
            }
        });

        jCheckBoxUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser2ActionPerformed(evt);
            }
        });

        jComboBoxUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser2ActionPerformed(evt);
            }
        });

        jCheckBoxUser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser3ActionPerformed(evt);
            }
        });

        jComboBoxUser3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser3ActionPerformed(evt);
            }
        });

        jComboBoxUser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser4ActionPerformed(evt);
            }
        });

        jCheckBoxUser4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser4ActionPerformed(evt);
            }
        });

        jCheckBoxUser8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser8ActionPerformed(evt);
            }
        });

        jCheckBoxUser7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser7ActionPerformed(evt);
            }
        });

        jCheckBoxUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser6ActionPerformed(evt);
            }
        });

        jCheckBoxUser5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxUser5ActionPerformed(evt);
            }
        });

        jComboBoxUser8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser8ActionPerformed(evt);
            }
        });

        jComboBoxUser7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser7ActionPerformed(evt);
            }
        });

        jComboBoxUser6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser6ActionPerformed(evt);
            }
        });

        jComboBoxUser5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxUser5ActionPerformed(evt);
            }
        });

        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PredefPic/Monpoly_users.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelChoose)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxUser1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBoxUser2)
                                .addComponent(jCheckBoxUser3)
                                .addComponent(jCheckBoxUser4)
                                .addComponent(jCheckBoxUser5)
                                .addComponent(jCheckBoxUser6)
                                .addComponent(jCheckBoxUser7)
                                .addComponent(jCheckBoxUser8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxUser8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxUser2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxUser3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxUser4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxUser5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxUser6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxUser7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBoxColor2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxColor3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxColor4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxColor5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxColor6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxColor7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxColor8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxUser1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxUser2)
                            .addComponent(jComboBoxUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxUser3)
                            .addComponent(jComboBoxUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxUser4)
                            .addComponent(jComboBoxUser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxUser5)
                            .addComponent(jComboBoxUser5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxUser6)
                            .addComponent(jComboBoxUser6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxUser7)
                            .addComponent(jComboBoxUser7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxUser8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxUser8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void checkSelection(ParametersCheckSelection pcs,JComboBox comboBoxColor) {
        JComboBox comboBox = pcs.getComboBox();
        ArrayList<User> actualUsers = pcs.getActualUsers();
        ArrayList<String> names = pcs.getNames();
        boolean[] repeated = pcs.getRepeated();
        boolean[] repeatedColors = pcs.getRepeatedColors();
        ArrayList<String> chosenColors = pcs.getChosenColors();
        int choseColorIndex = pcs.getChoseColorIndex();

        if (pcs.isSelectedToPlay()) {
            String actualName = "";
            if (!((String) comboBox.getSelectedItem()).equals("Play as guest")) {
                actualName = (String) comboBox.getSelectedItem();

                User ui = dB.getUser((String) comboBox.getSelectedItem());
                actualUsers.add(ui);
            } else {
                actualName = "Guest" + guestsQ;
                guestsQ++;
                User ui = null;
                actualUsers.add(ui);
            }
            if (names.contains(actualName) && !actualName.equals("Guest" + (guestsQ - 1))) {
                repeated[names.size()] = true;
            }
            names.add(actualName);
            if (chosenColors.contains((String) comboBoxColor.getSelectedItem())) {
                repeatedColors[names.size()] = true;
            }
            chosenColors.add((String) comboBoxColor.getSelectedItem());
            choseColorIndex++;

            pcs.setActualUsers(actualUsers);
            pcs.setNames(names);
            pcs.setRepeated(repeated);
            pcs.setRepeatedColors(repeatedColors);
            pcs.setChosenColors(chosenColors);
            pcs.setChoseColorIndex(choseColorIndex);

        }
    }

    public boolean repetitions(ParametersCheckSelection pcs) {
        boolean[] repeated = pcs.getRepeated();
        boolean hasRepetitions = false;

        String fstErrorMessage = "The player(s): ";
        String sndErrorMessage = " are choosing chosen users";
        for (int j = 1; j < 9; j++) {
            if (repeated[j]) {
                if (hasRepetitions) {
                    fstErrorMessage += ", ";
                }
                fstErrorMessage += j + 1;
                hasRepetitions = true;
            }
        }
        if (hasRepetitions) {
            JOptionPane.showMessageDialog(this, fstErrorMessage + sndErrorMessage, "Error", WIDTH);
            guestsQ=1;
        }
        return hasRepetitions;
    }
    public boolean colorRepetitions(ParametersCheckSelection pcs, boolean shouldCheck){
        boolean colorsAreRepeated = false;
        boolean[] repeatedColors = pcs.getRepeatedColors();
        String fstColorErrorMessage = "The player(s): ";
        String sndColorErrorMessage = " are choosing repeated colors";
        for (int j = 0; j < 9; j++) {
            if (repeatedColors[j]) {
                if (colorsAreRepeated) {
                    fstColorErrorMessage += ", ";
                }
                fstColorErrorMessage += j;
                colorsAreRepeated = true;
            }
        }
         if (colorsAreRepeated && shouldCheck) {
            JOptionPane.showMessageDialog(this, fstColorErrorMessage + sndColorErrorMessage, "Error", WIDTH);
            guestsQ=1;
        }
    return colorsAreRepeated;
    }
    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed
        ParametersCheckSelection pcs = new ParametersCheckSelection();
        for (int j = 0; j < comboBoxesUsers.size(); j++) {
            pcs.setComboBox(comboBoxesUsers.get(j));
            pcs.setSelectedToPlay(checkBoxes.get(j).isSelected());
            checkSelection(pcs,comboBoxesColor.get(j));
        }

      
        boolean hasRepetitions = repetitions(pcs);
        
        
        boolean colorsAreRepeated = colorRepetitions(pcs,!hasRepetitions);
       
        ArrayList<String> names = pcs.getNames();
        ArrayList<User> actualUsers = pcs.getActualUsers();
        ArrayList<String> chosenColors = pcs.getChosenColors();
        
        if (!hasRepetitions && !colorsAreRepeated) {
            GameMaster master = GameMaster.instance();
            MainWindow window = new MainWindow(dB);
            GameBoard gameBoard = new GameBoardFull();

            master.setGameBoard(gameBoard);
            GameMaster.instance().setNumberOfPlayers(names.size());

            for (int j = 0; j < names.size(); j++) {
                Player pi = GameMaster.instance().getPlayer(j);
                if (actualUsers.get(j) != null) {
                    pi.setUser(actualUsers.get(j));
                }
                pi.setName(names.get(j));
                pi.setColor(chosenColors.get(j));

            }
            window.setupGameBoard(gameBoard);
            window.show();
            master.setGUI(window);
            master.startGame();
            this.setVisible(false);
        }

    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jComboBoxUser5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser5ActionPerformed

    }//GEN-LAST:event_jComboBoxUser5ActionPerformed

    private void jComboBoxUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser6ActionPerformed

    }//GEN-LAST:event_jComboBoxUser6ActionPerformed

    private void jComboBoxUser7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser7ActionPerformed

    }//GEN-LAST:event_jComboBoxUser7ActionPerformed

    private void jComboBoxUser8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser8ActionPerformed

    }//GEN-LAST:event_jComboBoxUser8ActionPerformed

    private void jCheckBoxUser5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser5ActionPerformed
        boolean isEnable = jCheckBoxUser5.isSelected();
        jComboBoxUser5.setEnabled(isEnable);
        comboBoxesColor.get(4).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser5ActionPerformed

    private void jCheckBoxUser6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser6ActionPerformed
        boolean isEnable = jCheckBoxUser6.isSelected();
        jComboBoxUser6.setEnabled(isEnable);
        comboBoxesColor.get(5).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser6ActionPerformed

    private void jCheckBoxUser7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser7ActionPerformed
        boolean isEnable = jCheckBoxUser7.isSelected();
        jComboBoxUser7.setEnabled(isEnable);
        comboBoxesColor.get(6).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser7ActionPerformed

    private void jCheckBoxUser8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser8ActionPerformed
        boolean isEnable = jCheckBoxUser8.isSelected();
        jComboBoxUser8.setEnabled(isEnable);
        comboBoxesColor.get(7).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser8ActionPerformed

    private void jCheckBoxUser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser4ActionPerformed
        boolean isEnable = jCheckBoxUser4.isSelected();
        jComboBoxUser4.setEnabled(isEnable);
        comboBoxesColor.get(3).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser4ActionPerformed

    private void jComboBoxUser4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser4ActionPerformed

    }//GEN-LAST:event_jComboBoxUser4ActionPerformed

    private void jComboBoxUser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser3ActionPerformed

    }//GEN-LAST:event_jComboBoxUser3ActionPerformed

    private void jCheckBoxUser3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser3ActionPerformed
        boolean isEnable = jCheckBoxUser3.isSelected();
        jComboBoxUser3.setEnabled(isEnable);
        comboBoxesColor.get(2).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser3ActionPerformed

    private void jComboBoxUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser2ActionPerformed

    }//GEN-LAST:event_jComboBoxUser2ActionPerformed

    private void jCheckBoxUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser2ActionPerformed
        boolean isEnable = jCheckBoxUser2.isSelected();
        jComboBoxUser2.setEnabled(isEnable);
        comboBoxesColor.get(1).setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser2ActionPerformed

    private void jCheckBoxUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxUser1ActionPerformed
        boolean isEnable = jCheckBoxUser1.isSelected();
        jComboBoxUser1.setEnabled(isEnable);

    }//GEN-LAST:event_jCheckBoxUser1ActionPerformed

    private void jComboBoxUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxUser1ActionPerformed

    }//GEN-LAST:event_jComboBoxUser1ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        this.setVisible(false);
        previous.setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.previous.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JCheckBox jCheckBoxUser1;
    private javax.swing.JCheckBox jCheckBoxUser2;
    private javax.swing.JCheckBox jCheckBoxUser3;
    private javax.swing.JCheckBox jCheckBoxUser4;
    private javax.swing.JCheckBox jCheckBoxUser5;
    private javax.swing.JCheckBox jCheckBoxUser6;
    private javax.swing.JCheckBox jCheckBoxUser7;
    private javax.swing.JCheckBox jCheckBoxUser8;
    private javax.swing.JComboBox<String> jComboBoxColor1;
    private javax.swing.JComboBox<String> jComboBoxColor2;
    private javax.swing.JComboBox<String> jComboBoxColor3;
    private javax.swing.JComboBox<String> jComboBoxColor4;
    private javax.swing.JComboBox<String> jComboBoxColor5;
    private javax.swing.JComboBox<String> jComboBoxColor6;
    private javax.swing.JComboBox<String> jComboBoxColor7;
    private javax.swing.JComboBox<String> jComboBoxColor8;
    private javax.swing.JComboBox<String> jComboBoxUser1;
    private javax.swing.JComboBox<String> jComboBoxUser2;
    private javax.swing.JComboBox<String> jComboBoxUser3;
    private javax.swing.JComboBox<String> jComboBoxUser4;
    private javax.swing.JComboBox<String> jComboBoxUser5;
    private javax.swing.JComboBox<String> jComboBoxUser6;
    private javax.swing.JComboBox<String> jComboBoxUser7;
    private javax.swing.JComboBox<String> jComboBoxUser8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelChoose;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
