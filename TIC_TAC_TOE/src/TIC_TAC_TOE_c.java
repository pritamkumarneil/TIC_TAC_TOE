
import java.awt.Color;
import static java.awt.Color.magenta;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pritam
 */
public class TIC_TAC_TOE_c extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE_c
     */
    private String turn ="O";
    private int xCount=0;
    private int oCount=0;
    private boolean gameOver=false;
    
    public TIC_TAC_TOE_c() {
        initComponents();
    }
    private void choosePlayer(){
        if(turn.equals("O"))
            turn="X";
        else turn="O";
    }
    private void setScore(){
        scoreO.setText(String.valueOf(oCount));
        scoreX.setText(String.valueOf(xCount));
    }
    private void lockButton(){
        txtbtn1.setEnabled(false);
        txtbtn2.setEnabled(false);
        txtbtn3.setEnabled(false);
        txtbtn4.setEnabled(false);
        txtbtn5.setEnabled(false);
        txtbtn6.setEnabled(false);
        txtbtn7.setEnabled(false);
        txtbtn8.setEnabled(false);
        txtbtn9.setEnabled(false);
    }
    private void whoWon(){
        String bt1=txtbtn1.getText();
        String bt2=txtbtn2.getText();
        String bt3=txtbtn3.getText();
        String bt4=txtbtn4.getText();
        String bt5=txtbtn5.getText();
        String bt6=txtbtn6.getText();
        String bt7=txtbtn7.getText();
        String bt8=txtbtn8.getText();
        String bt9=txtbtn9.getText();
        String msg="";
        if(bt1.equals(bt2)&& bt2.equals(bt3)&&bt1!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn1.setEnabled(true);
            txtbtn2.setEnabled(true);
            txtbtn3.setEnabled(true);
//            lockButton();
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            gameOver=true;
        }
        else if(bt4.equals(bt5)&& bt5.equals(bt6)&& bt4!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn4.setEnabled(true);
            txtbtn5.setEnabled(true);
            txtbtn6.setEnabled(true);
//            lockButton();
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            gameOver=true;
        }
        else if(bt7.equals(bt8)&& bt8.equals(bt9)&& bt7!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn7.setEnabled(true);
            txtbtn8.setEnabled(true);
            txtbtn9.setEnabled(true);
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
//            lockButton();
            gameOver=true;
        }
        else if(bt7.equals(bt5)&& bt5.equals(bt3)&& bt7!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn3.setEnabled(true);
            txtbtn5.setEnabled(true);
            txtbtn7.setEnabled(true);
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
//            lockButton();
            gameOver=true;
        }
        else if(bt1.equals(bt5)&& bt5.equals(bt9)&& bt1!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn1.setEnabled(true);
            txtbtn5.setEnabled(true);
            txtbtn9.setEnabled(true);
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
//            lockButton();
            gameOver=true;
        }
        else if(bt1.equals(bt4)&& bt4.equals(bt7)&& bt1!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn1.setEnabled(true);
            txtbtn4.setEnabled(true);
            txtbtn7.setEnabled(true);
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
//            lockButton();
            gameOver=true;
        }
        else  if(bt2.equals(bt5)&& bt5.equals(bt8)&& bt2!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn2.setEnabled(true);
            txtbtn5.setEnabled(true);
            txtbtn8.setEnabled(true);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
//            lockButton();
            gameOver=true;
        }
        else if(bt3.equals(bt6)&& bt6.equals(bt9)&& bt3!=""){
            if(turn.equals("X")){
                oCount++;
                msg="Player O has won!";
            }
            else {
                xCount++;
                msg="Player X has won!";
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            setScore();
            txtbtn3.setEnabled(true);
            txtbtn6.setEnabled(true);
            txtbtn9.setEnabled(true);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
//            lockButton();
            gameOver=true;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();
        scoreX = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtbtn1.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn2.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.setForeground(new java.awt.Color(255, 255, 255));
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 51, 51));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(255, 255, 255));
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 204, 204));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("PlayerX :-");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("PlayerO :-");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SCORE CARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel7)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scoreO.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scoreO.setText("0");

        scoreX.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        scoreX.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreO, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(scoreX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreX))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
//        if(turn.equals("X"))
//        turn="O";
//        else turn="X";
        gameOver=false;
        txtbtn1.setEnabled(true);
        txtbtn2.setEnabled(true);
        txtbtn3.setEnabled(true);
        txtbtn4.setEnabled(true);
        txtbtn5.setEnabled(true);
        txtbtn6.setEnabled(true);
        txtbtn7.setEnabled(true);
        txtbtn8.setEnabled(true);
        txtbtn9.setEnabled(true);
        
        txtbtn1.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn1.setText("");
        txtbtn2.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn2.setText("");
        txtbtn3.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn3.setText("");
        txtbtn4.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn4.setText("");
        txtbtn5.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn5.setText("");
        txtbtn6.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn6.setText("");
        txtbtn7.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn7.setText("");
        txtbtn8.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn8.setText("");
        txtbtn9.setBackground(new java.awt.Color(255, 255, 255));
        txtbtn9.setText("");
        
    }//GEN-LAST:event_resetbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
                // TODO add your handling code here:
                JFrame frame=new JFrame("Exit");
                if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
//        if(txtbtn1.getText()!=""){
//            return;
//        }
        txtbtn1.setText(turn);
        if(turn.equals("X")){
            txtbtn1.setForeground(Color.red);
        }
        else txtbtn1.setForeground(magenta);
        choosePlayer();
         txtbtn1.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
//        if(txtbtn2.getText()!=""){
//            return;
//        }
        txtbtn2.setText(turn);
        if(turn.equals("X"))
            txtbtn2.setForeground(Color.red);
        else txtbtn2.setForeground(magenta);
        choosePlayer();
         txtbtn2.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
//        if(txtbtn3.getText()!=""){
//            return;
//        }
        
        txtbtn3.setText(turn);
        if(turn.equals("X"))
            txtbtn3.setForeground(Color.red);
        else txtbtn3.setForeground(magenta);
        choosePlayer();
        txtbtn3.setEnabled(false);//use this or the above one
        if(!gameOver)
        whoWon();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
//        if(txtbtn4.getText()!=""){
//            return;
//        }
        txtbtn4.setText(turn);
        if(turn.equals("X"))
            txtbtn4.setForeground(Color.red);
        else txtbtn4.setForeground(magenta);
        choosePlayer();
         txtbtn4.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        if(txtbtn5.getText()!=""){
            return;
        }
        txtbtn5.setText(turn);
        if(turn.equals("X"))
            txtbtn5.setForeground(Color.red);
        else txtbtn5.setForeground(magenta);
        choosePlayer();
         txtbtn5.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        if(txtbtn6.getText()!=""){
            return;
        }
        txtbtn6.setText(turn);
        if(turn.equals("X"))
            txtbtn6.setForeground(Color.red);
        else txtbtn6.setForeground(magenta);
        choosePlayer();
         txtbtn6.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        if(txtbtn7.getText()!=""){
            return;
        }
        txtbtn7.setText(turn);
        if(turn.equals("X"))
            txtbtn7.setForeground(Color.red);
        else txtbtn7.setForeground(magenta);
        choosePlayer();
         txtbtn7.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        if(txtbtn8.getText()!=""){
            return;
        }
        txtbtn8.setText(turn);
        if(turn.equals("X"))
            txtbtn8.setForeground(Color.red);
        else txtbtn8.setForeground(magenta);
        choosePlayer();
         txtbtn8.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        if(txtbtn9.getText()!=""){
            return;
        }
        txtbtn9.setText(turn);
        if(turn.equals("X"))
            txtbtn9.setForeground(Color.red);
        else txtbtn9.setForeground(magenta);
        choosePlayer();
         txtbtn9.setEnabled(false);
         if(!gameOver)
          whoWon();
    }//GEN-LAST:event_txtbtn9ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_c().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    // End of variables declaration//GEN-END:variables
}
