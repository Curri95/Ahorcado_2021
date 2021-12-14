/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alex
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    public void ChequeaBoton(JButton miBoton){
      miBoton.setEnabled(false);
      System.out.println(miBoton.getText());
    }
    
    private void DibujaImagen(int numeroImagen){
        URL nombreImagen = getClass().getResource("/imagenes/ahorcado_0.png");
        ImageIcon miImagen = new ImageIcon(new ImageIcon (nombreImagen).getImage().
                getScaledInstance(PanelAhorcado.getWidth(), PanelAhorcado.getHeight(), Image.SCALE_DEFAULT));
        PanelAhorcado.setIcon(miImagen);
    }
    
    public VentanaAhorcado() {
        initComponents();
        DibujaImagen(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelAhorcado = new javax.swing.JLabel();
        BotonA = new javax.swing.JButton();
        BotonB = new javax.swing.JButton();
        BotonC = new javax.swing.JButton();
        BotonD = new javax.swing.JButton();
        BotonE = new javax.swing.JButton();
        BotonF = new javax.swing.JButton();
        BotonG = new javax.swing.JButton();
        BotonN = new javax.swing.JButton();
        BotonH = new javax.swing.JButton();
        BotonI = new javax.swing.JButton();
        BotonJ = new javax.swing.JButton();
        BotonK = new javax.swing.JButton();
        BotonL = new javax.swing.JButton();
        BotonM = new javax.swing.JButton();
        BotonT = new javax.swing.JButton();
        BotonENIE = new javax.swing.JButton();
        BotonO = new javax.swing.JButton();
        BotonP = new javax.swing.JButton();
        BotonQ = new javax.swing.JButton();
        BotonR = new javax.swing.JButton();
        BotonS = new javax.swing.JButton();
        BotonZ = new javax.swing.JButton();
        BotonU = new javax.swing.JButton();
        BotonV = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        BotonESPACIO = new javax.swing.JButton();
        BotonX = new javax.swing.JButton();
        BotonY = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _");

        BotonA.setText("A");
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        BotonB.setText("B");
        BotonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBActionPerformed(evt);
            }
        });

        BotonC.setText("C");
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });

        BotonD.setText("D");
        BotonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDActionPerformed(evt);
            }
        });

        BotonE.setText("E");
        BotonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEActionPerformed(evt);
            }
        });

        BotonF.setText("F");
        BotonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFActionPerformed(evt);
            }
        });

        BotonG.setText("G");
        BotonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGActionPerformed(evt);
            }
        });

        BotonN.setText("N");
        BotonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNActionPerformed(evt);
            }
        });

        BotonH.setText("H");
        BotonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHActionPerformed(evt);
            }
        });

        BotonI.setText("I");
        BotonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIActionPerformed(evt);
            }
        });

        BotonJ.setText("J");
        BotonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJActionPerformed(evt);
            }
        });

        BotonK.setText("K");
        BotonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonKActionPerformed(evt);
            }
        });

        BotonL.setText("L");
        BotonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLActionPerformed(evt);
            }
        });

        BotonM.setText("M");
        BotonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMActionPerformed(evt);
            }
        });

        BotonT.setText("T");
        BotonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTActionPerformed(evt);
            }
        });

        BotonENIE.setText("Ñ");
        BotonENIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonENIEActionPerformed(evt);
            }
        });

        BotonO.setText("O");
        BotonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOActionPerformed(evt);
            }
        });

        BotonP.setText("P");
        BotonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPActionPerformed(evt);
            }
        });

        BotonQ.setText("Q");
        BotonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonQActionPerformed(evt);
            }
        });

        BotonR.setText("R");
        BotonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRActionPerformed(evt);
            }
        });

        BotonS.setText("S");
        BotonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSActionPerformed(evt);
            }
        });

        BotonZ.setText("Z");
        BotonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonZActionPerformed(evt);
            }
        });

        BotonU.setText("U");
        BotonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUActionPerformed(evt);
            }
        });

        BotonV.setText("V");
        BotonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVActionPerformed(evt);
            }
        });

        jButton22.setText("W");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        BotonESPACIO.setText(" ");
        BotonESPACIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonESPACIOActionPerformed(evt);
            }
        });

        BotonX.setText("X");
        BotonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXActionPerformed(evt);
            }
        });

        BotonY.setText("Y");
        BotonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonYActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22)
                                .addGap(3, 3, 3)
                                .addComponent(BotonESPACIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BotonH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(BotonENIE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BotonT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonG, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonENIE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonESPACIO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonAActionPerformed

    private void BotonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBActionPerformed
       ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonBActionPerformed

    private void BotonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonCActionPerformed

    private void BotonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonDActionPerformed

    private void BotonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonEActionPerformed

    private void BotonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonFActionPerformed

    private void BotonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonGActionPerformed

    private void BotonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonNActionPerformed

    private void BotonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonHActionPerformed

    private void BotonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonIActionPerformed

    private void BotonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonJActionPerformed

    private void BotonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonKActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonKActionPerformed

    private void BotonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonLActionPerformed

    private void BotonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonMActionPerformed

    private void BotonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonTActionPerformed

    private void BotonENIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonENIEActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonENIEActionPerformed

    private void BotonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonOActionPerformed

    private void BotonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonPActionPerformed

    private void BotonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonQActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonQActionPerformed

    private void BotonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonRActionPerformed

    private void BotonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonSActionPerformed

    private void BotonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonZActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonZActionPerformed

    private void BotonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonUActionPerformed

    private void BotonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonVActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_jButton22ActionPerformed

    private void BotonESPACIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonESPACIOActionPerformed
         ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonESPACIOActionPerformed

    private void BotonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonXActionPerformed

    private void BotonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonYActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonYActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonA;
    private javax.swing.JButton BotonB;
    private javax.swing.JButton BotonC;
    private javax.swing.JButton BotonD;
    private javax.swing.JButton BotonE;
    private javax.swing.JButton BotonENIE;
    private javax.swing.JButton BotonESPACIO;
    private javax.swing.JButton BotonF;
    private javax.swing.JButton BotonG;
    private javax.swing.JButton BotonH;
    private javax.swing.JButton BotonI;
    private javax.swing.JButton BotonJ;
    private javax.swing.JButton BotonK;
    private javax.swing.JButton BotonL;
    private javax.swing.JButton BotonM;
    private javax.swing.JButton BotonN;
    private javax.swing.JButton BotonO;
    private javax.swing.JButton BotonP;
    private javax.swing.JButton BotonQ;
    private javax.swing.JButton BotonR;
    private javax.swing.JButton BotonS;
    private javax.swing.JButton BotonT;
    private javax.swing.JButton BotonU;
    private javax.swing.JButton BotonV;
    private javax.swing.JButton BotonX;
    private javax.swing.JButton BotonY;
    private javax.swing.JButton BotonZ;
    private javax.swing.JLabel PanelAhorcado;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
