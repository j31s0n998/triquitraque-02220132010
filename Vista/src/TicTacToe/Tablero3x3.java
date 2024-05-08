/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tablero3x3 extends javax.swing.JFrame {
  Color colorX; // Color por defecto para X
  Color colorO;// Color por defecto para O
  String turn = "x";
  JLabel[] labels = new JLabel[9];
    int conteoEmpates = 0; // Contador de empates

  //combinaciones de victoria para tablero 
  int victory [][]={
    {1,2,3},
    {4,5,6},
    {7,8,9},
    {1,4,7},
    {2,5,8},
    {3,6,9},
    {1,5,9},
    {3,5,7},
};
 
    public Tablero3x3() {
        initComponents();
labels[0] = jLabel1;
labels[1] = jLabel2;
labels[2] = jLabel3;
labels[3] = jLabel4;
labels[4] = jLabel5;
labels[5] = jLabel6;
labels[6] = jLabel7;
labels[7] = jLabel8;
labels[8] = jLabel9;
  this.setLocationRelativeTo(null);
          

    }

    
    public void setColorX(Color color) {
        this.colorX = color; // Establecer el color para "X"
    }

    public void setColorO(Color color) {
        this.colorO = color; // Establecer el color para "O"
    }
    
    // Método para cambiar el texto del JLabel de X
    public void setLabelXText(String text) {
        labelX.setText(text);
    }

    // Método para cambiar el texto del JLabel de O
    public void setLabelOText(String text) {
        labelO.setText(text);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmdBORRAR = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        labelO = new javax.swing.JLabel();
        labelX = new javax.swing.JLabel();
        labelVictoryO = new javax.swing.JLabel();
        labelVictoryX = new javax.swing.JLabel();
        cmdRegresarMenu3x3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 106, 69));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 106, 69));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 106, 69));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 106, 69));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 106, 69));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 106, 69));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 106, 69));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setOpaque(true);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 106, 69));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 3, 60)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setOpaque(true);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 106, 69));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 69, -1, -1));

        cmdBORRAR.setBackground(new java.awt.Color(235, 235, 19));
        cmdBORRAR.setText("reiniciar");
        cmdBORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBORRARActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(235, 235, 19));
        jButton2.setText("salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        labelO.setText("jLabel10");
        jPanel1.add(labelO, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 19, -1, -1));

        labelX.setText("jLabel11");
        jPanel1.add(labelX, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        labelVictoryO.setText("0");
        jPanel1.add(labelVictoryO, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 19, 110, -1));

        labelVictoryX.setText("0");
        jPanel1.add(labelVictoryX, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 110, -1));

        cmdRegresarMenu3x3.setBackground(new java.awt.Color(235, 235, 19));
        cmdRegresarMenu3x3.setText("regresar al menu");
        cmdRegresarMenu3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegresarMenu3x3ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdRegresarMenu3x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//este es el label 1 xd
    
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        press(1);
    }//GEN-LAST:event_jLabel1MousePressed
//este es el label 2 xd
    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        press(2);
    }//GEN-LAST:event_jLabel2MousePressed
// este es el label 3 xd
    
    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
         press(3);
    }//GEN-LAST:event_jLabel3MousePressed
//este es el label 4 xd
    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
          press(4);
    }//GEN-LAST:event_jLabel4MousePressed
//este es el label 5 xd
    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
          press(5);
    }//GEN-LAST:event_jLabel5MousePressed
//este es el label 6 xd
    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
          press(6);
    }//GEN-LAST:event_jLabel6MousePressed
//este es el label 7 xd
    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
          press(7);
    }//GEN-LAST:event_jLabel7MousePressed
//este es el label 8 xd
    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        press(8);
    }//GEN-LAST:event_jLabel8MousePressed
//este es el label 9 xd
    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
          press(9);
    }//GEN-LAST:event_jLabel9MousePressed

    private void cmdBORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBORRARActionPerformed
        resetGame();
    }//GEN-LAST:event_cmdBORRARActionPerformed

    private void cmdRegresarMenu3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegresarMenu3x3ActionPerformed
 // Crear una nueva instancia del Frame principal (MenuTriqui)
    MenuTriqui menu = new MenuTriqui(); 
    
    // Hacer visible el nuevo Frame (MenuTriqui)
    menu.setVisible(true); 
    
    // Cerrar el Frame actual (Vista3x3)
    this.dispose(); // "this" se refiere al Frame actual, que se debe cerrar
        
        
    }//GEN-LAST:event_cmdRegresarMenu3x3ActionPerformed
public void press(int lugar) {
    if (labels[lugar - 1].getText().isEmpty()) { // Verificar si la celda está vacía
        labels[lugar - 1].setText(turn); // Asignar el turno

        // Aplicar el color del texto según el turno
        if (turn.equals("x")) {
            labels[lugar - 1].setForeground(colorX); // Usar color para "X"
        } else {
            labels[lugar - 1].setForeground(colorO); // Usar color para "O"
        }

        giveUpTheTurn(); // Cambiar el turno
        verifyWinner(); // Verificar si hay un ganador
        verifyDraw(); // Verificar si hay empate
    }
}

public void verifyDraw() {
    // Verificar si todas las celdas están ocupadas
    boolean isDraw = true; // Asumir que es empate hasta probar lo contrario
    for (JLabel label : labels) {
        if (label.getText().isEmpty()) { // Si alguna celda está vacía
            isDraw = false; // No es empate
            break;
        }
    }

    if (isDraw) { // Si no se encontraron celdas vacías
        javax.swing.JOptionPane.showMessageDialog(this, "¡Es un empate! Reiniciando el juego..."); // Mostrar mensaje de empate
        resetGame(); // Reiniciar el juego automáticamente
    }
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
                                                                     
 
 public void verifyWinner(){

  // Combinaciones para ganar
    int[][] combinaciones = {
        {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // Horizontales
        {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // Verticales
        {0, 4, 8}, {2, 4, 6}            // Diagonales
    };

    // Verificar si hay un ganador
    for (int[] combinacion : combinaciones) {
        if (labels[combinacion[0]].getText().equals("x") &&
            labels[combinacion[1]].getText().equals("x") &&
            labels[combinacion[2]].getText().equals("x")) {

            puntuacionX++; // Incrementar la puntuación de X
            labelVictoryX.setText("ganadas: " + puntuacionX); // Actualizar el JLabel
            showWinnerMessage("X");
            resetGame(); // Reiniciar el juego
            break;
        } else if (labels[combinacion[0]].getText().equals("o") &&
                   labels[combinacion[1]].getText().equals("o") &&
                   labels[combinacion[2]].getText().equals("o")) {

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
                new Tablero3x3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBORRAR;
    private javax.swing.JButton cmdRegresarMenu3x3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
