/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author marcf
 */
public class VentanaAhorcado extends javax.swing.JFrame {
    
    String palabraOculta = "CETYS";
    int numeroFallos = 0;
    
  
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        //Dibuja imagwn del ahrocado sin fallos
        dibujaImagen(0);
    }
    private void dibujaImagen(int numeroFallos){
        ImageIcon miImagen = null; 
        URL nombreImagen = null;
        int ancho = panelAhorcado.getWidth();
        int alto = panelAhorcado.getHeight();
        
          switch (numeroFallos){
              case 0: nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_0.png")); break;
              case 1: nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_1.png")); break;
              case 2: nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_2.png")); break;
              case 3: nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_3.png")); break;
              case 4: nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_4.png")); break;
              case 5: nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_5.png")); break;
              default : nombreImagen = (getClass().getResource("/JavaImagenes/ahorcado_fin.png")); break;
              
              
            }
        
        
        
            miImagen = new ImageIcon (new ImageIcon (nombreImagen).getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
      
        panelAhorcado.setIcon(miImagen);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPalabras = new javax.swing.JLabel();
        BotonA = new javax.swing.JButton();
        botonB = new javax.swing.JButton();
        botonC = new javax.swing.JButton();
        botonD = new javax.swing.JButton();
        botonE = new javax.swing.JButton();
        botonF = new javax.swing.JButton();
        botonG = new javax.swing.JButton();
        botonH = new javax.swing.JButton();
        botonI = new javax.swing.JButton();
        botonJ = new javax.swing.JButton();
        botonK = new javax.swing.JButton();
        botonL = new javax.swing.JButton();
        botonM = new javax.swing.JButton();
        botonN = new javax.swing.JButton();
        botonÑ = new javax.swing.JButton();
        botonO = new javax.swing.JButton();
        botonP = new javax.swing.JButton();
        botonQ = new javax.swing.JButton();
        botonR = new javax.swing.JButton();
        botonS = new javax.swing.JButton();
        botonT = new javax.swing.JButton();
        botonU = new javax.swing.JButton();
        botonV = new javax.swing.JButton();
        botonW = new javax.swing.JButton();
        botonX = new javax.swing.JButton();
        botonY = new javax.swing.JButton();
        botonZ = new javax.swing.JButton();
        botonEspacio = new javax.swing.JButton();
        panelAhorcado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPalabras.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        panelPalabras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelPalabras.setText("_ _ _ _ _");
        panelPalabras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        BotonA.setText("A");
        BotonA.setPreferredSize(new java.awt.Dimension(42, 42));
        BotonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonAMousePressed(evt);
            }
        });
        BotonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAActionPerformed(evt);
            }
        });

        botonB.setText("B");
        botonB.setPreferredSize(new java.awt.Dimension(42, 42));
        botonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonBMousePressed(evt);
            }
        });

        botonC.setText("C");
        botonC.setPreferredSize(new java.awt.Dimension(42, 42));
        botonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCMousePressed(evt);
            }
        });
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });

        botonD.setText("D");
        botonD.setPreferredSize(new java.awt.Dimension(42, 42));
        botonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonDMousePressed(evt);
            }
        });

        botonE.setText("E");
        botonE.setPreferredSize(new java.awt.Dimension(42, 42));
        botonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEMousePressed(evt);
            }
        });

        botonF.setText("F");
        botonF.setPreferredSize(new java.awt.Dimension(42, 42));
        botonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonFMousePressed(evt);
            }
        });

        botonG.setText("G");
        botonG.setPreferredSize(new java.awt.Dimension(42, 42));
        botonG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGMousePressed(evt);
            }
        });

        botonH.setText("H");
        botonH.setPreferredSize(new java.awt.Dimension(42, 42));
        botonH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonHMousePressed(evt);
            }
        });

        botonI.setText("I");
        botonI.setPreferredSize(new java.awt.Dimension(42, 42));
        botonI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonIMousePressed(evt);
            }
        });

        botonJ.setText("J");
        botonJ.setPreferredSize(new java.awt.Dimension(42, 42));
        botonJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonJMousePressed(evt);
            }
        });

        botonK.setText("K");
        botonK.setPreferredSize(new java.awt.Dimension(42, 42));
        botonK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonKMousePressed(evt);
            }
        });

        botonL.setText("L");
        botonL.setPreferredSize(new java.awt.Dimension(42, 42));
        botonL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLMousePressed(evt);
            }
        });

        botonM.setText("M");
        botonM.setPreferredSize(new java.awt.Dimension(42, 42));
        botonM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMMousePressed(evt);
            }
        });
        botonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMActionPerformed(evt);
            }
        });

        botonN.setText("N");
        botonN.setPreferredSize(new java.awt.Dimension(42, 42));
        botonN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonNMousePressed(evt);
            }
        });

        botonÑ.setText("Ñ");
        botonÑ.setPreferredSize(new java.awt.Dimension(42, 42));
        botonÑ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonÑMousePressed(evt);
            }
        });

        botonO.setText("O");
        botonO.setPreferredSize(new java.awt.Dimension(42, 42));
        botonO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonOMousePressed(evt);
            }
        });

        botonP.setText("P");
        botonP.setPreferredSize(new java.awt.Dimension(42, 42));
        botonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonPMousePressed(evt);
            }
        });

        botonQ.setText("Q");
        botonQ.setPreferredSize(new java.awt.Dimension(42, 42));
        botonQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonQMousePressed(evt);
            }
        });
        botonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQActionPerformed(evt);
            }
        });

        botonR.setText("R");
        botonR.setPreferredSize(new java.awt.Dimension(42, 42));
        botonR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonRMousePressed(evt);
            }
        });

        botonS.setText("S");
        botonS.setPreferredSize(new java.awt.Dimension(42, 42));
        botonS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSMousePressed(evt);
            }
        });

        botonT.setText("T");
        botonT.setPreferredSize(new java.awt.Dimension(42, 42));
        botonT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTMousePressed(evt);
            }
        });

        botonU.setText("U");
        botonU.setPreferredSize(new java.awt.Dimension(42, 42));
        botonU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonUMousePressed(evt);
            }
        });

        botonV.setText("V");
        botonV.setPreferredSize(new java.awt.Dimension(42, 42));
        botonV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonVMousePressed(evt);
            }
        });

        botonW.setText("W");
        botonW.setPreferredSize(new java.awt.Dimension(42, 42));
        botonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonWMousePressed(evt);
            }
        });

        botonX.setText("X");
        botonX.setPreferredSize(new java.awt.Dimension(42, 42));
        botonX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonXMousePressed(evt);
            }
        });

        botonY.setText("Y");
        botonY.setPreferredSize(new java.awt.Dimension(42, 42));
        botonY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonYMousePressed(evt);
            }
        });
        botonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYActionPerformed(evt);
            }
        });

        botonZ.setText("Z");
        botonZ.setPreferredSize(new java.awt.Dimension(42, 42));
        botonZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonZMousePressed(evt);
            }
        });

        botonEspacio.setText(" ");
        botonEspacio.setPreferredSize(new java.awt.Dimension(42, 42));
        botonEspacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonEspacioMousePressed(evt);
            }
        });
        botonEspacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEspacioActionPerformed(evt);
            }
        });

        panelAhorcado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonÑ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(botonH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botonG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonÑ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEspacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAActionPerformed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_BotonAActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonCActionPerformed

    private void botonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMActionPerformed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonMActionPerformed

    private void botonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQActionPerformed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonQActionPerformed

    private void botonEspacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEspacioActionPerformed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonEspacioActionPerformed

    //
    // SEPARACION!!!!!!!!!!!!!!!!!!
    //
    private void chequeaLetra(String letra){
      
        letra = letra.toUpperCase();   // lo convierte en mayusc. pero no hace falta en este codigo porque las letras de los botones ya esta en mayuscula
        // String palabaConGuiones = panelPalabras.getText();
        StringBuilder palabaConGuiones = new StringBuilder (panelPalabras.getText());
        
        if (palabraOculta.contains(letra)){
            for (int i = 0; i < palabraOculta.length(); i++){
                if (palabraOculta.charAt(i) == letra.charAt(0)){
                   // palabaConGuiones = palabaConGuiones.substring(0, 2*i) + letra +  palabaConGuiones.substring(2*i + 1);
                   palabaConGuiones.setCharAt(2*i, letra.charAt(0));
                }
            }
            panelPalabras.setText(palabaConGuiones.toString());
        } else {
            numeroFallos++;
        dibujaImagen(numeroFallos);
        }
        
        
        
    }
    
    private void chequeaBoton (JButton miBoton){
       
        miBoton.setEnabled(false);
        chequeaLetra(miBoton.getText());
    }
    
    private void BotonAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAMousePressed
     
        chequeaBoton( (JButton) evt.getSource());    // (JButton) porque querremos que se refiera a los objetos de tipo JButton
        
        
    }//GEN-LAST:event_BotonAMousePressed

    private void botonBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonBMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonBMousePressed

    private void botonCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonCMousePressed

    private void botonDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonDMousePressed

    private void botonEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonEMousePressed

    private void botonFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonFMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonFMousePressed

    private void botonGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonGMousePressed

    private void botonHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonHMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonHMousePressed

    private void botonIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonIMousePressed

    private void botonJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonJMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonJMousePressed

    private void botonKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonKMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonKMousePressed

    private void botonLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonLMousePressed

    private void botonMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonMMousePressed

    private void botonNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonNMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonNMousePressed

    private void botonÑMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonÑMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonÑMousePressed

    private void botonOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonOMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonOMousePressed

    private void botonPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonPMousePressed

    private void botonQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonQMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonQMousePressed

    private void botonRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonRMousePressed

    private void botonSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonSMousePressed

    private void botonTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonTMousePressed

    private void botonUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonUMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonUMousePressed

    private void botonVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonVMousePressed

    private void botonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonWMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonWMousePressed

    private void botonEspacioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEspacioMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonEspacioMousePressed

    private void botonXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonXMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonXMousePressed

    private void botonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYActionPerformed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonYActionPerformed

    private void botonYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonYMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonYMousePressed

    private void botonZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonZMousePressed
        chequeaBoton( (JButton) evt.getSource());
    }//GEN-LAST:event_botonZMousePressed

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
    private javax.swing.JButton botonB;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonD;
    private javax.swing.JButton botonE;
    private javax.swing.JButton botonEspacio;
    private javax.swing.JButton botonF;
    private javax.swing.JButton botonG;
    private javax.swing.JButton botonH;
    private javax.swing.JButton botonI;
    private javax.swing.JButton botonJ;
    private javax.swing.JButton botonK;
    private javax.swing.JButton botonL;
    private javax.swing.JButton botonM;
    private javax.swing.JButton botonN;
    private javax.swing.JButton botonO;
    private javax.swing.JButton botonP;
    private javax.swing.JButton botonQ;
    private javax.swing.JButton botonR;
    private javax.swing.JButton botonS;
    private javax.swing.JButton botonT;
    private javax.swing.JButton botonU;
    private javax.swing.JButton botonV;
    private javax.swing.JButton botonW;
    private javax.swing.JButton botonX;
    private javax.swing.JButton botonY;
    private javax.swing.JButton botonZ;
    private javax.swing.JButton botonÑ;
    private javax.swing.JLabel panelAhorcado;
    private javax.swing.JLabel panelPalabras;
    // End of variables declaration//GEN-END:variables
}
