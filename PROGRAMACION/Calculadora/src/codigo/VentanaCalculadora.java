package codigo;

/**
 *
 * @author Alex
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    double operando1 = 0;        //Guarda el primer numero que metamos.
    String operacion = "";      //Guarda la operacion pulsada
    
    
    
    public VentanaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pantalla = new javax.swing.JLabel();
        Boton9 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        BotonMultiplicacion = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        BotonRaiz = new javax.swing.JButton();
        BotonElevar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pantalla.setBackground(new java.awt.Color(0, 0, 0));
        Pantalla.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        Pantalla.setForeground(new java.awt.Color(0, 204, 51));
        Pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Pantalla.setText("0");
        Pantalla.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Pantalla.setOpaque(true);
        getContentPane().add(Pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 380, -1));

        Boton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 76, 64, 64));

        Boton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 64, 64));

        Boton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 76, 64, 64));

        Boton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 146, 64, 64));

        Boton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 146, 64, 64));

        Boton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 146, 64, 64));

        Boton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 216, 64, 64));

        Boton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 216, 64, 64));

        Boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 64, 64));

        Boton0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });
        getContentPane().add(Boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 290, 64, 64));

        BotonSuma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 76, 64, 64));

        BotonIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(BotonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 210, 64));

        BotonResta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 76, 64, 64));

        BotonDivision.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonDivision.setText("/");
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 146, 64, 64));

        BotonMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonMultiplicacion.setText("*");
        BotonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 146, 64, 64));

        BotonBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonBorrar.setText("C");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 64, 64));

        BotonRaiz.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonRaiz.setText("√");
        BotonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRaizActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 216, 64, 64));

        BotonElevar.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        BotonElevar.setText("x²");
        BotonElevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonElevarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonElevar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 216, 64, 64));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
       String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("9");
       }
       else{
           Pantalla.setText(auxiliar + "9");
       }
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
       String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("7");
       }
       else{
           Pantalla.setText(auxiliar + "7");
       }
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
         String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("8");
       }
       else{
           Pantalla.setText(auxiliar + "8");
       }
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
       String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("6");
       }
       else{
           Pantalla.setText(auxiliar + "6");
       }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
         String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("5");
       }
       else{
           Pantalla.setText(auxiliar + "5");
       }
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
       String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("7");
       }
       else{
           Pantalla.setText(auxiliar + "7");
       }
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
       String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("3");
       }
       else{
           Pantalla.setText(auxiliar + "3");
       }
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
       String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("2");
       }
       else{
           Pantalla.setText(auxiliar + "2");
       }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("1");
       }
       else{
           Pantalla.setText(auxiliar + "1");
       }
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
         String auxiliar = Pantalla.getText();
       
       if(auxiliar.equals("0")){  
        Pantalla.setText("0");
       }
       else{
           Pantalla.setText(auxiliar + "0");
       }
    }//GEN-LAST:event_Boton0ActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        operacion = "+";
        //Double-valueof convierte un string en su equivalente numérico.
        operando1 = Double.valueOf(Pantalla.getText());
        //reseteo la pantalla
        Pantalla.setText("0");
        
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
       double operando2 = Double.valueOf(Pantalla.getText());
       //Creamos el codigo para cada una de las operaciones aritmeticas.
       
       //Codigo para la suma.
       if(operacion.equals("+")){
           operando1 = operando1 + operando2; 
       }
       Pantalla.setText("" + operando1);
       
       //Codigo para la resta.
       if(operacion.equals("-")){
           operando1 = operando1 - operando2;
       }
       Pantalla.setText("" + operando1);
       
       
       //Codigo para la división.
        if(operacion.equals("/")){
           
                operando1 = operando1 / operando2;
                
            }
       Pantalla.setText("" + operando1);
       
       
        //Codigo para la multiplicación.
        if(operacion.equals("*")){
           operando1 = operando1 * operando2;
       }
       Pantalla.setText("" + operando1);
       
       //Codigo para la raíz cuadrada.
       if(operacion.equals("raiz")){
           operando1 = Math.sqrt(operando1);
       }
       Pantalla.setText("" + operando1);
       
       //Codigo para elevar al cuadrado.
       if(operacion.equals("elevar")){
           operando1 = operando1 * operando1;
       }
       Pantalla.setText("" + operando1);
      
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        operacion = "-";
        //Double-valueof convierte un string en su equivalente numerico
        operando1 = Double.valueOf(Pantalla.getText());
        //reseteo la pantalla
        Pantalla.setText("0");
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        operacion = "/";
        //Double-valueof convierte un string en su equivalente numerico
        operando1 = Double.valueOf(Pantalla.getText());
        //reseteo la pantalla
        Pantalla.setText("0");
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void BotonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicacionActionPerformed
        operacion = "*";
        //Double-valueof convierte un string en su equivalente numerico
        operando1 = Double.valueOf(Pantalla.getText());
        //reseteo la pantalla
        Pantalla.setText("0");
    }//GEN-LAST:event_BotonMultiplicacionActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        operando1 = 0;
        
        Pantalla.setText("0");
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void BotonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRaizActionPerformed
       operacion = "raiz";
        //Double-valueof convierte un string en su equivalente numerico
        operando1 = Double.valueOf(Pantalla.getText());
        //reseteo la pantalla
        Pantalla.setText("0");
    }//GEN-LAST:event_BotonRaizActionPerformed

    private void BotonElevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonElevarActionPerformed
        operacion = "elevar";
        //Double-valueof convierte un string en su equivalente numerico
        operando1 = Double.valueOf(Pantalla.getText());
        //reseteo la pantalla
        Pantalla.setText("0");
    }//GEN-LAST:event_BotonElevarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonElevar;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMultiplicacion;
    private javax.swing.JButton BotonRaiz;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JLabel Pantalla;
    // End of variables declaration//GEN-END:variables
}
