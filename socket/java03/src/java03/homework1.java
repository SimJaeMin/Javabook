/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java03;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author bit-user
 */
public class homework1 extends javax.swing.JFrame {
    int i=1;
    //chat
    private Socket s;
    private PrintWriter pw;
    //mouse
    private int x, y;
    private int rd = 10;
    private Color color;
    private ArrayList<Integer> judArray;

    /**
     * Creates new form homework1
     */
    public homework1() {
        judArray = new ArrayList<>();
        initComponents();

        try {
            // server에 접속!
            s = new Socket("localhost", 9999);

            //동기화해주기
           
            pw = new PrintWriter(s.getOutputStream(), true);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        // 데이터를 받아서 UI에 출력
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                    while (true) {
                                String s=br.readLine();
                                target.append(s + "\n");
                            
                                System.out.println(s+"\n");
                                System.out.println("i = "+ i +"\n");
                                i++;
//                                x = Integer.parseInt(br.readLine());
//                                y = Integer.parseInt(br.readLine());
                             
                            
                        }
                    

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        chatMsg = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        target = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btn_Red = new javax.swing.JButton();
        btn_Blue = new javax.swing.JButton();
        btn_Green = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas(){
            @Override
            public void update(Graphics g) {
                paint(g);
            }
            @Override
            public void paint(Graphics g) {
                g.setColor(color);
                g.fillOval(x, y, rd, rd);

                //g.drawArc(x, y, 100, 100, 0, arcNum);
            }
        };

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 510));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));

        chatMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatMsgActionPerformed(evt);
            }
        });

        target.setColumns(20);
        target.setRows(5);
        jScrollPane2.setViewportView(target);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(chatMsg))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chatMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(407, 400));

        btn_Red.setBackground(new java.awt.Color(255, 0, 51));
        btn_Red.setForeground(new java.awt.Color(255, 255, 255));
        btn_Red.setText("RED");
        btn_Red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RedActionPerformed(evt);
            }
        });

        btn_Blue.setBackground(new java.awt.Color(0, 0, 204));
        btn_Blue.setForeground(new java.awt.Color(255, 255, 255));
        btn_Blue.setText("BLUE");
        btn_Blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BlueActionPerformed(evt);
            }
        });

        btn_Green.setBackground(new java.awt.Color(0, 153, 0));
        btn_Green.setForeground(new java.awt.Color(255, 255, 255));
        btn_Green.setText("GREEN");
        btn_Green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GreenActionPerformed(evt);
            }
        });

        canvas1.setBackground(new java.awt.Color(153, 153, 255));
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Blue, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Red, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Green))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn_Red)
                .addGap(50, 50, 50)
                .addComponent(btn_Blue)
                .addGap(45, 45, 45)
                .addComponent(btn_Green)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
      ;
        canvas1.repaint();

    }//GEN-LAST:event_canvas1MouseDragged

    private void btn_RedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RedActionPerformed
        // TODO add your handling code here:
        color = Color.RED;
    }//GEN-LAST:event_btn_RedActionPerformed

    private void btn_BlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BlueActionPerformed
        // TODO add your handling code here:
        color = Color.BLUE;
    }//GEN-LAST:event_btn_BlueActionPerformed

    private void btn_GreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GreenActionPerformed
        // TODO add your handling code here:
        color = Color.GREEN;
    }//GEN-LAST:event_btn_GreenActionPerformed

    private void chatMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatMsgActionPerformed
        // TODO add your handling code here:
            System.out.println(chatMsg.getText()+"\n");
            System.out.println("i = "+ i +"\n");
                                i++;
        pw.println(chatMsg.getText().trim());
        chatMsg.setText("");
    }//GEN-LAST:event_chatMsgActionPerformed

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
            java.util.logging.Logger.getLogger(homework1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homework1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homework1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homework1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homework1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Blue;
    private javax.swing.JButton btn_Green;
    private javax.swing.JButton btn_Red;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField chatMsg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JTextArea target;
    // End of variables declaration//GEN-END:variables
}
