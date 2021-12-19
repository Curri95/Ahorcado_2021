package codigo;

import java.awt.Image;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Alejandro Rodriguez Pérez
 * Versión del juego Ahorcado para la clase de Programación de DAM DUAL.
 */

public class VentanaAhorcado extends javax.swing.JFrame {
    
    //Creamos un array de Strings desde el que seleccionar una palabra de forma aleatoria con Random.
    String[] listaPalabrasOcultas = {"CETYS", "KAREL", "JORGE", "PACOS", "APPLE", "LINUX"};
    Random numero = new Random();        
    int numeroAleatorio = numero.nextInt(listaPalabrasOcultas.length); 
    String palabraOculta = listaPalabrasOcultas[numeroAleatorio];
    
    //Creamos los int de número de Fallos y número de Aciertos, para saber si hemos ganado o perdido cuando uno de los dos llegue a cinco.
    int numeroFallos = 0;
    int numeroAciertos = 0;
    
    //Método para comprobar si la letra pulsada existe dentro de la palabra.
    public void ChequeaLetra(String letra){
        //Convertimos la letra pulsada en mayúscula.
        letra = letra.toUpperCase();
        //Convertimos la palabra elegida de forma aleatoria en mayúscula.
        palabraOculta = palabraOculta.toUpperCase();
        String palabraConGuiones = PanelGuiones.getText();
        
        if (palabraOculta.contains(letra)){
            //Si la letra elegida está en la palabra, aumentamos en uno el número de aciertos.
           numeroAciertos++;
           int i = palabraOculta.indexOf(letra);
           palabraConGuiones = palabraConGuiones.substring(0, 2*i) + letra + palabraConGuiones.substring(2*i +1);
           PanelGuiones.setText(palabraConGuiones);
        }
        else{
            //Si la letra introducida no está en la palabra, aumentamos en uno el número de fallos.
           numeroFallos++;
           DibujaImagen(numeroFallos);
        }
    }
     
    //Método para desactivar el botón que hemos pulsado.
    public void ChequeaBoton(JButton miBoton){
        miBoton.setEnabled(false);
        //Una vez pulsado el botón, llamamos al método para comprobar si la letra existe o no.
        ChequeaLetra(miBoton.getText());
        //También llamamos al método para comprobar si hay 5 aciertos y si hemos ganado la partida.
        GanarJuego(numeroAciertos);
    }
    
    //Método para actualizar las imágenes en pantalla según el número de fallos que se tengan.
    private void DibujaImagen(int numeroImagen){
        URL nombreImagen = null;
        switch (numeroImagen){
            case 0 : nombreImagen = getClass().getResource("/imagenes/ahorcado_0.png"); break;
            case 1 : nombreImagen = getClass().getResource("/imagenes/ahorcado_1.jpg"); break;
            case 2 : nombreImagen = getClass().getResource("/imagenes/ahorcado_2.jpg"); break;
            case 3 : nombreImagen = getClass().getResource("/imagenes/ahorcado_3.jpg"); break;
            case 4 : nombreImagen = getClass().getResource("/imagenes/ahorcado_4.jpg"); break;
            case 5 : nombreImagen = getClass().getResource("/imagenes/ahorcado_5.jpg"); break;
            case 6 : nombreImagen = getClass().getResource("/imagenes/ahorcado_fin.jpg"); ApagaBotones(); break;
            case 7 : nombreImagen = getClass().getResource("/imagenes/acertaste.gif"); ApagaBotones(); break;
        }
        //Aqui definimos los límites de la imagen dentro del juego.
        ImageIcon miImagen = new ImageIcon(new ImageIcon (nombreImagen).getImage(). getScaledInstance(PanelAhorcado.getWidth(), PanelAhorcado.getHeight(), Image.SCALE_DEFAULT)); 
        PanelAhorcado.setIcon(miImagen);
        
    }
    
    //Método que detecta si hemos ganado.
    public void GanarJuego(int n){
        if(n >= palabraOculta.length()){
            //Si detecta que el número de aciertos es el mismo que la longitud de la palabra Oculta, cambia la imagen por la de victoria y apaga los botones.
            DibujaImagen(7);
            ApagaBotones();
        }
    }
    
    //Método que apaga todos los botones para que no se pueda seguir jugando cuando se pierda y/o se gane.
    public void ApagaBotones(){
        BotonA.setEnabled(false);
        BotonB.setEnabled(false);
        BotonC.setEnabled(false);
        BotonD.setEnabled(false);
        BotonE.setEnabled(false);
        BotonF.setEnabled(false);
        BotonG.setEnabled(false);
        BotonH.setEnabled(false);
        BotonI.setEnabled(false);
        BotonJ.setEnabled(false);
        BotonK.setEnabled(false);
        BotonL.setEnabled(false);
        BotonM.setEnabled(false);
        BotonN.setEnabled(false);
        BotonENIE.setEnabled(false);
        BotonO.setEnabled(false);
        BotonP.setEnabled(false);
        BotonQ.setEnabled(false);
        BotonR.setEnabled(false);
        BotonS.setEnabled(false);
        BotonT.setEnabled(false);
        BotonU.setEnabled(false);
        BotonV.setEnabled(false);
        BotonW.setEnabled(false);
        BotonX.setEnabled(false);
        BotonY.setEnabled(false);
        BotonZ.setEnabled(false);
    }
    
    //Método para dibujar la "Interfaz" del juego"
    public VentanaAhorcado() {
        initComponents();
        //Llamamos a la imagen con 0 fallos.
        DibujaImagen(0);
    }
    
    /**
     * NO TOCAR NADA DE ESTE CÓDIGO, ES EL GENERADO AUTOMÁTICAMENTE.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonA = new javax.swing.JButton();
        PanelGuiones = new javax.swing.JLabel();
        PanelAhorcado = new javax.swing.JLabel();
        BotonB = new javax.swing.JButton();
        BotonC = new javax.swing.JButton();
        BotonD = new javax.swing.JButton();
        BotonE = new javax.swing.JButton();
        BotonF = new javax.swing.JButton();
        BotonH = new javax.swing.JButton();
        BotonM = new javax.swing.JButton();
        BotonL = new javax.swing.JButton();
        BotonK = new javax.swing.JButton();
        BotonJ = new javax.swing.JButton();
        BotonI = new javax.swing.JButton();
        BotonENIE = new javax.swing.JButton();
        BotonS = new javax.swing.JButton();
        BotonR = new javax.swing.JButton();
        BotonQ = new javax.swing.JButton();
        BotonP = new javax.swing.JButton();
        BotonO = new javax.swing.JButton();
        BotonU = new javax.swing.JButton();
        BotonZ = new javax.swing.JButton();
        BotonY = new javax.swing.JButton();
        BotonX = new javax.swing.JButton();
        BotonW = new javax.swing.JButton();
        BotonV = new javax.swing.JButton();
        BotonG = new javax.swing.JButton();
        BotonT = new javax.swing.JButton();
        BotonN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        BotonA.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonA.setText("A");
        BotonA.setPreferredSize(new java.awt.Dimension(57, 57));
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        PanelGuiones.setFont(new java.awt.Font("Tahoma", 0, 58)); // NOI18N
        PanelGuiones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelGuiones.setText("_ _ _ _ _");

        BotonB.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonB.setText("B");
        BotonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBActionPerformed(evt);
            }
        });

        BotonC.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonC.setText("C");
        BotonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCActionPerformed(evt);
            }
        });

        BotonD.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonD.setText("D");
        BotonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDActionPerformed(evt);
            }
        });

        BotonE.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonE.setText("E");
        BotonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEActionPerformed(evt);
            }
        });

        BotonF.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonF.setText("F");
        BotonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFActionPerformed(evt);
            }
        });

        BotonH.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonH.setText("H");
        BotonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHActionPerformed(evt);
            }
        });

        BotonM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BotonM.setText("M");
        BotonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMActionPerformed(evt);
            }
        });

        BotonL.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonL.setText("L");
        BotonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLActionPerformed(evt);
            }
        });

        BotonK.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonK.setText("K");
        BotonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonKActionPerformed(evt);
            }
        });

        BotonJ.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonJ.setText("J");
        BotonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJActionPerformed(evt);
            }
        });

        BotonI.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonI.setText("I");
        BotonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIActionPerformed(evt);
            }
        });

        BotonENIE.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonENIE.setText("Ñ");
        BotonENIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonENIEActionPerformed(evt);
            }
        });

        BotonS.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonS.setText("S");
        BotonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSActionPerformed(evt);
            }
        });

        BotonR.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonR.setText("R");
        BotonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRActionPerformed(evt);
            }
        });

        BotonQ.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonQ.setText("Q");
        BotonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonQActionPerformed(evt);
            }
        });

        BotonP.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonP.setText("P");
        BotonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPActionPerformed(evt);
            }
        });

        BotonO.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonO.setText("O");
        BotonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOActionPerformed(evt);
            }
        });

        BotonU.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonU.setText("U");
        BotonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUActionPerformed(evt);
            }
        });

        BotonZ.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonZ.setText("Z");
        BotonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonZActionPerformed(evt);
            }
        });

        BotonY.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonY.setText("Y");
        BotonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonYActionPerformed(evt);
            }
        });

        BotonX.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonX.setText("X");
        BotonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonXActionPerformed(evt);
            }
        });

        BotonW.setFont(new java.awt.Font("Tahoma", 0, 31)); // NOI18N
        BotonW.setText("W");
        BotonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonWActionPerformed(evt);
            }
        });

        BotonV.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonV.setText("V");
        BotonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVActionPerformed(evt);
            }
        });

        BotonG.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonG.setText("G");
        BotonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGActionPerformed(evt);
            }
        });

        BotonT.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonT.setText("T");
        BotonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTActionPerformed(evt);
            }
        });

        BotonN.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        BotonN.setText("N");
        BotonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonENIE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonW, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(PanelGuiones, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PanelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotonB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGuiones, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonB)
                            .addComponent(BotonC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonF, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonG, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonH, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonI, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonK, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonM, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonENIE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonO, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonP, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(BotonW, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BotonX, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonY, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonU, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
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

    private void BotonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonHActionPerformed

    private void BotonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonMActionPerformed

    private void BotonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLActionPerformed
       ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonLActionPerformed

    private void BotonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonKActionPerformed
       ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonKActionPerformed

    private void BotonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonJActionPerformed

    private void BotonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonIActionPerformed

    private void BotonENIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonENIEActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonENIEActionPerformed

    private void BotonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonSActionPerformed

    private void BotonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonRActionPerformed

    private void BotonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonQActionPerformed
       ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonQActionPerformed

    private void BotonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPActionPerformed
       ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonPActionPerformed

    private void BotonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonOActionPerformed

    private void BotonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonUActionPerformed

    private void BotonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonZActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonZActionPerformed

    private void BotonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonYActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonYActionPerformed

    private void BotonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonXActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonXActionPerformed

    private void BotonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonWActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonWActionPerformed

    private void BotonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonVActionPerformed

    private void BotonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonGActionPerformed

    private void BotonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonTActionPerformed

    private void BotonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNActionPerformed
        ChequeaBoton((JButton) evt.getSource());
    }//GEN-LAST:event_BotonNActionPerformed

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
    private javax.swing.JButton BotonW;
    private javax.swing.JButton BotonX;
    private javax.swing.JButton BotonY;
    private javax.swing.JButton BotonZ;
    private javax.swing.JLabel PanelAhorcado;
    private javax.swing.JLabel PanelGuiones;
    // End of variables declaration//GEN-END:variables
}
