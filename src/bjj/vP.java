/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bjj;

import bjj.Bjj;
import java.awt.event.KeyEvent;

/**
 *
 * @author gaston
 */
public class vP extends javax.swing.JFrame {
    
    Bjj crono;
    
    int p1 = 0, p2 = 0, a1 = 0, a2 = 0, v1 = 0, v2 = 0;
    
    


    /**
     * Creates new form vP
     */
    public vP() {
        initComponents();
        
        crono = new Bjj();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        cronoSmoll = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 1));

        jPanel10.setBackground(new java.awt.Color(254, 254, 254));
        jPanel10.setForeground(new java.awt.Color(1, 1, 1));
        jPanel10.setLayout(new java.awt.GridLayout(2, 3));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setForeground(new java.awt.Color(1, 1, 1));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jTextField1.setBackground(new java.awt.Color(254, 254, 254));
        jTextField1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(221, 49, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Nombre 1");
        jTextField1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextField1PropertyChange(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField1, java.awt.BorderLayout.SOUTH);

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setForeground(new java.awt.Color(1, 1, 1));
        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setText("PAUSE");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2);

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setText("RESTART");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel6.add(jButton3);

        jPanel1.add(jPanel6);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setText("PLAY");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);

        jButton16.setBackground(java.awt.Color.white);
        jButton16.setText("SET");
        jButton16.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jPanel8.add(jButton16);

        jPanel1.add(jPanel8);

        jPanel7.setForeground(new java.awt.Color(1, 1, 1));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("T=5:00");
        jPanel7.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel9.setForeground(new java.awt.Color(1, 1, 1));
        jPanel9.setLayout(new java.awt.GridLayout(1, 0));

        jTextField3.setFont(new java.awt.Font("Droid Sans", 0, 48)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("5");
        jPanel9.add(jTextField3);

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Droid Sans", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(":");
        jLabel2.setMaximumSize(new java.awt.Dimension(10, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(10, 20));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(10, 20));
        jPanel9.add(jLabel2);

        jTextField5.setFont(new java.awt.Font("Droid Sans", 0, 48)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("00");
        jPanel9.add(jTextField5);

        jPanel7.add(jPanel9, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanel7);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel2);

        jPanel3.setForeground(new java.awt.Color(1, 1, 1));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel11.setForeground(new java.awt.Color(1, 1, 1));
        jPanel11.setLayout(new java.awt.BorderLayout());

        cronoSmoll.setBackground(new java.awt.Color(254, 254, 254));
        cronoSmoll.setFont(new java.awt.Font("DejaVu Serif", 1, 70)); // NOI18N
        cronoSmoll.setForeground(new java.awt.Color(1, 1, 1));
        cronoSmoll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronoSmoll.setText("05:00");
        jPanel11.add(cronoSmoll, java.awt.BorderLayout.CENTER);

        jPanel12.setLayout(new java.awt.GridLayout(3, 1));

        jButton17.setBackground(java.awt.Color.white);
        jButton17.setText("+");
        jButton17.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        jPanel12.add(jButton17);

        jButton18.setBackground(java.awt.Color.white);
        jButton18.setText("-");
        jButton18.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        jPanel12.add(jButton18);

        jButton19.setBackground(java.awt.Color.white);
        jButton19.setForeground(new java.awt.Color(1, 1, 1));
        jButton19.setText("Bocina    ");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton19);

        jPanel11.add(jPanel12, java.awt.BorderLayout.LINE_END);

        jPanel3.add(jPanel11, java.awt.BorderLayout.CENTER);

        jTextField2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(45, 48, 202));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Nombre 2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, java.awt.BorderLayout.SOUTH);

        jPanel10.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(3, 3));

        jButton4.setBackground(new java.awt.Color(254, 254, 254));
        jButton4.setForeground(new java.awt.Color(253, 43, 43));
        jButton4.setText("P+");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel4.add(jButton4);

        jLabel3.setBackground(new java.awt.Color(254, 254, 254));
        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("0");
        jPanel4.add(jLabel3);

        jButton5.setBackground(new java.awt.Color(254, 254, 254));
        jButton5.setForeground(new java.awt.Color(253, 43, 43));
        jButton5.setText("P-");
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel4.add(jButton5);

        jButton6.setBackground(new java.awt.Color(254, 254, 254));
        jButton6.setForeground(new java.awt.Color(253, 43, 43));
        jButton6.setText("A+");
        jButton6.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel4.add(jButton6);

        jLabel4.setBackground(new java.awt.Color(254, 254, 254));
        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0");
        jPanel4.add(jLabel4);

        jButton7.setBackground(new java.awt.Color(254, 254, 254));
        jButton7.setForeground(new java.awt.Color(253, 43, 43));
        jButton7.setText("A-");
        jButton7.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jPanel4.add(jButton7);

        jButton8.setBackground(new java.awt.Color(254, 254, 254));
        jButton8.setForeground(new java.awt.Color(253, 43, 43));
        jButton8.setText("V+");
        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8);

        jLabel5.setBackground(new java.awt.Color(254, 254, 254));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("0");
        jPanel4.add(jLabel5);

        jButton9.setBackground(new java.awt.Color(254, 254, 254));
        jButton9.setForeground(new java.awt.Color(253, 43, 43));
        jButton9.setText("V-");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jPanel4.add(jButton9);

        jPanel10.add(jPanel4);

        jPanel5.setForeground(new java.awt.Color(20, 48, 247));
        jPanel5.setLayout(new java.awt.GridLayout(3, 2));

        jButton10.setBackground(java.awt.Color.white);
        jButton10.setForeground(new java.awt.Color(26, 20, 247));
        jButton10.setText("P+");
        jButton10.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        jPanel5.add(jButton10);

        jLabel6.setBackground(new java.awt.Color(254, 254, 254));
        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("0");
        jPanel5.add(jLabel6);

        jButton11.setBackground(java.awt.Color.white);
        jButton11.setForeground(new java.awt.Color(26, 20, 247));
        jButton11.setText("P-");
        jButton11.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jPanel5.add(jButton11);

        jButton12.setBackground(java.awt.Color.white);
        jButton12.setForeground(new java.awt.Color(26, 20, 247));
        jButton12.setText("A+");
        jButton12.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jPanel5.add(jButton12);

        jLabel7.setBackground(new java.awt.Color(254, 254, 254));
        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("0");
        jPanel5.add(jLabel7);

        jButton13.setBackground(java.awt.Color.white);
        jButton13.setForeground(new java.awt.Color(26, 20, 247));
        jButton13.setText("A-");
        jButton13.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jPanel5.add(jButton13);

        jButton14.setBackground(java.awt.Color.white);
        jButton14.setForeground(new java.awt.Color(26, 20, 247));
        jButton14.setText("V+");
        jButton14.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton14);

        jLabel8.setBackground(new java.awt.Color(254, 254, 254));
        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 35)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("0");
        jPanel5.add(jLabel8);

        jButton15.setBackground(java.awt.Color.white);
        jButton15.setForeground(new java.awt.Color(26, 20, 247));
        jButton15.setText("V-");
        jButton15.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jPanel5.add(jButton15);

        jPanel10.add(jPanel5);

        getContentPane().add(jPanel10);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
        crono.iniciarCronometro();
        //crono.setCronometro(jTextField1.getText(), jTextField2.getText(), 
          //      Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField5.getText()));
        jLabel1.setText("T=" + Integer.parseInt(jTextField3.getText()) + ":" + Integer.parseInt(jTextField5.getText()));
  
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        crono.pararCronometro();
        //crono.setCronometro(jTextField1.getText(), jTextField2.getText(), 
          //      Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField5.getText()));
        jLabel1.setText("T=" + Integer.parseInt(jTextField3.getText()) + ":" + Integer.parseInt(jTextField5.getText()));
        //BJJ.pause();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        //BJJ.reset();
        crono.reiniciarCronometro();

        jLabel3.setText("0");
        jLabel4.setText("0");
        jLabel5.setText("0");
        jLabel6.setText("0");
        jLabel7.setText("0");
        jLabel8.setText("0");
        
        p1 = 0; 
        p2 = 0; 
        a1 = 0; 
        a2 = 0; 
        v1 = 0; 
        v2 = 0;
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        crono.cambiar(0,0,0);
        p1 ++;
        jLabel3.setText(p1 + "");
        
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        crono.cambiar(0,0,1);
        p2 ++;
        jLabel6.setText(p2 + "");
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        
        crono.cambiar(1,0,0);
        if(p1>0)p1 --;
        jLabel3.setText(p1 + "");
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        
        crono.cambiar(1,0,1);
        if(p2>0)p2 --;
        jLabel6.setText(p2 + "");
        
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        
        crono.cambiar(0,1,0);
        a1 ++;
        jLabel4.setText(a1 + "");
        
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        crono.cambiar(1,1,0);
        if(a1>0)a1 --;
        jLabel4.setText(a1 + "");
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        crono.cambiar(0,2,0);
        v1 ++;
        jLabel5.setText(v1 + "");
        
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        
        crono.cambiar(1,2,0);
        if(v1>0)v1 --;
        jLabel5.setText(v1 + "");
        
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        
        crono.cambiar(0,1,1);
        a2 ++;
        jLabel7.setText(a2 + "");
        
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        crono.cambiar(1,1,1);
        if(a2>0)a2 --;
        jLabel7.setText(a2 + "");
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        crono.cambiar(0,2,1);
        v2 ++;
        jLabel8.setText(v2 + "");
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        crono.cambiar(1,2,1);
        if(v2>0)v2 --;
        jLabel8.setText(v2 + "");
    }//GEN-LAST:event_jButton15MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            crono.nombres(jTextField1.getText(), jTextField2.getText());
        }
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextField1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        
        crono.setCronometro(jTextField1.getText(), jTextField2.getText(), 
                Integer.parseInt(jTextField3.getText()), Integer.parseInt(jTextField5.getText()));
        jLabel1.setText("T=" + Integer.parseInt(jTextField3.getText()) + ":" + Integer.parseInt(jTextField5.getText()));
        
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
        crono.fuente(0);
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        crono.fuente(1);
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        if(crono.changeBocina()){
            jButton19.setText("Bocina" + "\n" + " x1");
        }else{
            jButton19.setText("Bocina" + "\n" + " x2");
        }
        
        
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

   
    public void actualizar(String a){
        cronoSmoll.setText(a);
    }
    
    
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
            java.util.logging.Logger.getLogger(vP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vP().setVisible(true);
            } 
        });
    }
                
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cronoSmoll;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    
}
