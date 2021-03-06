/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import flow3.Controller;
import flow3.PersonalInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Valentina
 */
public class AddGame extends javax.swing.JFrame {

    /**
     * Creates new form AddGame
     */
    
    PersonalInterface quizz;
    private String fileName;
    private String gameFile;
    
    
    public AddGame() {
        initComponents();
        quizz = new Controller();
        fileName="Titles.txt";
        quizz.loadQuizz(fileName);
        gameFile=null;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        Answer = new javax.swing.JTextField();
        Question = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Game Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 110, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Question");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 200, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Answer");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(610, 50, 60, 20);

        Title.setBackground(new java.awt.Color(252, 212, 173));
        Title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleActionPerformed(evt);
            }
        });
        jPanel1.add(Title);
        Title.setBounds(150, 100, 250, 40);

        Answer.setBackground(new java.awt.Color(255, 204, 153));
        Answer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });
        jPanel1.add(Answer);
        Answer.setBounds(660, 40, 250, 40);

        Question.setBackground(new java.awt.Color(248, 209, 170));
        Question.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionActionPerformed(evt);
            }
        });
        jPanel1.add(Question);
        Question.setBounds(330, 190, 270, 40);

        create.setBackground(new java.awt.Color(255, 204, 102));
        create.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        jPanel1.add(create);
        create.setBounds(470, 120, 110, 40);

        jButton2.setBackground(new java.awt.Color(255, 204, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(840, 590, 100, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Valentina\\Documents\\NetBeansProjects\\Flow3big\\src\\Anime-Chibi-HD.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 660);

        jMenu1.setText("Player");

        jMenuItem2.setText("Choose how to play");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Scores");

        jMenuItem1.setText("Player&Score");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerScore().setVisible(true);
            }
        });
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerActionPerformed

    private void QuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
        String title = Title.getText();
        String question = Question.getText();
        String answer = Answer.getText();
        //method used to create a new quizz file and to check if the tile already exists
        if(quizz.checkTitle(title) != null)
        {
              InputStream in;
        try{
        in = new FileInputStream(new File ("C:\\Users\\Valentina\\Documents\\NetBeansProjects\\Flow3big\\src\\button-12.wav"));
            AudioStream audioS= new AudioStream(in);
            AudioPlayer.player.start(audioS);
           
           JOptionPane.showMessageDialog(this, "The game exists!",
                    "oneOfThem2", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
            
           
        }
         if (title.equals("") || question.equals("") || answer.equals("")) {
             
              InputStream in;
        try{
        in = new FileInputStream(new File ("C:\\Users\\Valentina\\Documents\\NetBeansProjects\\Flow3big\\src\\button-12.wav"));
            AudioStream audioS= new AudioStream(in);
            AudioPlayer.player.start(audioS);
           
           JOptionPane.showMessageDialog(this, "All the words should be added!",
                    "both", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);}
            
        
        } else {
            quizz.addGame(title);
            quizz.save(title);
            gameFile=title+".txt";
            quizz.add(question+","+ answer);
            quizz.save(gameFile);
            Title.setText("");
            Question.setText("");
            Answer.setText("");
        }
    }//GEN-LAST:event_createActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField Question;
    private javax.swing.JTextField Title;
    private javax.swing.JButton create;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
