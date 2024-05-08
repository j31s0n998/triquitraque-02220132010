/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tablero4x4 extends javax.swing.JFrame {
  Color colorX; // Color por defecto para X
  Color colorO;// Color por defecto para O
  String turn = "x";
  JLabel[] labels = new JLabel[16];
    // Combinaciones ganadoras para un tablero 4x4
    int victory[][] = {
        // Horizontales
        {0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15},
        // Verticales
        {0, 4, 8, 12}, {1, 5, 9, 13}, {2, 6, 10, 14}, {3, 7, 11, 15},
        // Diagonales
        {0, 5, 10, 15}, {3, 6, 9, 12}
    };
    
    public Tablero4x4() {
        initComponents();
         // Inicializar los 16 labels
    // Asignar cada `JLabel` a la posición correcta
        labels[0] = jLabel1;
        labels[1] = jLabel2;
        labels[2] = jLabel3;
        labels[3] = jLabel4;
        labels[4] = jLabel5;
        labels[5] = jLabel6;
        labels[6] = jLabel7;
        labels[7] = jLabel8;
        labels[8] = jLabel9;
        labels[9] = jLabel10;
        labels[10] = jLabel11;
        labels[11] = jLabel12;
        labels[12] = jLabel13;
        labels[13] = jLabel14;
        labels[14] = jLabel15;
        labels[15] = jLabel16;

    this.setLocationRelativeTo(null); // Centrarse en la pantalla
    }
        
    
public void setLabelXText(String text) {
        labelX.setText(text);
    }

    public void setLabelOText(String text) {
        labelO.setText(text);
    }

    public void setColorX(Color color) {
        this.colorX = color; // Establecer el color para "X"
    }

    public void setColorO(Color color) {
        this.colorO = color; // Establecer el color para "O"
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelO = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        labelVictoryO = new javax.swing.JLabel();
        labelVictoryX = new javax.swing.JLabel();
        cmdReiniciar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        cmdRegresarMenu4x4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 64, 66));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 64, 66));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 64, 66));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 64, 66));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 64, 66));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 64, 66));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 64, 66));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 64, 66));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setOpaque(true);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 64, 66));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 64, 66));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setOpaque(true);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 64, 66));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setOpaque(true);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 64, 66));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 64, 66));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setOpaque(true);
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 64, 66));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setOpaque(true);
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 64, 66));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 64, 66));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 300, 330));

        labelO.setText("Nombre O");
        jPanel1.add(labelO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        labelX.setText("nombre X");
        jPanel1.add(labelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        labelVictoryO.setText("0");
        jPanel1.add(labelVictoryO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, -1));

        labelVictoryX.setText("0");
        jPanel1.add(labelVictoryX, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, -1));

        cmdReiniciar.setBackground(new java.awt.Color(235, 235, 19));
        cmdReiniciar.setText("Reiniciar");
        cmdReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReiniciarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        cmdSalir.setBackground(new java.awt.Color(235, 235, 19));
        cmdSalir.setText("salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        cmdRegresarMenu4x4.setBackground(new java.awt.Color(235, 235, 19));
        cmdRegresarMenu4x4.setText("regresar al menu");
        cmdRegresarMenu4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarMenu4x4ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresarMenu4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
      press(1); 
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
       press(2); 
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        press(3);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
press(4);
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        press(5);
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        press(6);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
       press(7); 
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
       press(8); 
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        press(9);
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
      press(10);  
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        press(11);
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        press(12);
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        press(13);
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        press(14);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
    press(15);
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
    press(16);
    }//GEN-LAST:event_jLabel16MousePressed

    private void cmdReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReiniciarActionPerformed
      resetGame();
    }//GEN-LAST:event_cmdReiniciarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
         System.exit(0);        // TODO add your handling code here:

    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdRegresarMenu4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarMenu4x4ActionPerformed
      // Crear una nueva instancia del menú principal
    MenuTriqui menu = new MenuTriqui();
    
    // Hacer visible el menú
    menu.setVisible(true);
    
    // Cerrar el frame actual para liberar recursos
    this.dispose(); 
       
    }//GEN-LAST:event_cmdRegresarMenu4x4ActionPerformed
      public void press(int lugar) {
    if (labels[lugar - 1].getText().isEmpty()) { // Verificar si la casilla está vacía
        labels[lugar - 1].setText(turn); // Asignar el turno

        // Aplicar el color del texto según el turno
        if (turn.equals("x")) {
            labels[lugar - 1].setForeground(colorX); // Color para "X"
        } else {
            labels[lugar - 1].setForeground(colorO); // Color para "O"
        }

        giveUpTheTurn(); // Cambiar el turno
        verifyWinner(); // Verificar si hay ganador

        // Verificar si todas las casillas están llenas
        if (isBoardFull() && !isWinner()) {
            resetGame(); // Reiniciar el juego si está lleno y no hay ganador
            JOptionPane.showMessageDialog(this, "Empate, el juego se reiniciará");
        }
    }
}
// Método para verificar si el tablero está lleno
private boolean isBoardFull() {
    for (JLabel label : labels) {
        if (label.getText().isEmpty()) {
            return false; // Al menos una casilla está vacía
        }
    }
    return true; // Todas las casillas están llenas
}

// Método para verificar si hay un ganador
private boolean isWinner() {
    for (int[] combo : victory) {
        if (
            labels[combo[0]].getText().equals("x") &&
            labels[combo[1]].getText().equals("x") &&
            labels[combo[2]].getText().equals("x") &&
            labels[combo[3]].getText().equals("x")
        ) {
            return true; // Hay un ganador para "X"
        }
        if (
            labels[combo[0]].getText().equals("o") &&
            labels[combo[1]].getText().equals("o") &&
            labels[combo[2]].getText().equals("o") &&
            labels[combo[3]].getText().equals("o")
        ) {
            return true; // Hay un ganador para "O"
        }
    }
    return false; // No hay ganador
}
      
 public void giveUpTheTurn (){
       if(turn.equals("x")){  
          turn = "o";
 
        }   else{
                turn ="x";
            }
 
 }    
    
            private int puntuacionX = 0; // Victorias de jugador X
            private int puntuacionO = 0; // Victorias de jugador O     
    public void verifyWinner() {
    for (int[] combo : victory) {
        if (labels[combo[0]].getText().equals("x") &&
            labels[combo[1]].getText().equals("x") &&
            labels[combo[2]].getText().equals("x") &&
            labels[combo[3]].getText().equals("x")) {
            
            puntuacionX++; // Incrementar la puntuación de X
            labelVictoryX.setText("ganadas: " + puntuacionX); // Actualizar el JLabel
            showWinnerMessage("X");
            resetGame(); // Reiniciar el juego
            break;
        }

        if (labels[combo[0]].getText().equals("o") &&
            labels[combo[1]].getText().equals("o") &&
            labels[combo[2]].getText().equals("o") &&
            labels[combo[3]].getText().equals("o")) {
            
            puntuacionO++; // Incrementar la puntuación de O
            labelVictoryO.setText("ganadas: " + puntuacionO); // Actualizar el JLabel
            showWinnerMessage("O");
            resetGame(); // Reiniciar el juego
            break;
        }
    }
}
    
public static void main(String args[]) {
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero4x4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdRegresarMenu4x4;
    private javax.swing.JButton cmdReiniciar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelO;
    private javax.swing.JLabel labelVictoryO;
    private javax.swing.JLabel labelVictoryX;
    private javax.swing.JLabel labelX;
    // End of variables declaration//GEN-END:variables

private void showWinnerMessage(String winner) {
        //anuncia que jugador gano dependiendo de la ronda 
        javax.swing.JOptionPane.showMessageDialog(this, "¡Gano el jugador " + winner + "!");
    }

    private void resetGame() {
        // for each que itera sobre cada puesto de la matriz  poniendo una cadena de texto vacia para asi vaciar el juego xd
    for (JLabel label : labels) {
        label.setText("");
    }

    // Reiniciar el turno
    turn = "x";

    // Mostrar un aviso a los jugadores de que se reinicio el juego
   javax.swing.JOptionPane.showMessageDialog(this, "Juego reiniciado");
    }
}



