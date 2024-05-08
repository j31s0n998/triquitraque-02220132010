/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class MenuTriqui extends javax.swing.JFrame {
 Color colorX; // Color por defecto para las "X"
 Color colorO; // Color por defecto para las "O"
private Clip clip; // Variable para mantener el Clip de música

    public MenuTriqui() {
        initComponents();
          this.setLocationRelativeTo(null);

    }


  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmdSalir = new javax.swing.JButton();
        comboTamaño = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtNombreX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreO = new javax.swing.JTextField();
        cmdColorX = new javax.swing.JButton();
        cmdColorO = new javax.swing.JButton();
        cmdSiguiente = new javax.swing.JButton();
        cmdMusica = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("bienvenid@ a TicTacToe Z");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        cmdSalir.setText("Salir");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 60, -1));

        comboTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige", "3x3", "4x4", "5x5" }));
        comboTamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTamañoActionPerformed(evt);
            }
        });
        jPanel1.add(comboTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel2.setText("tamaño");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtNombreX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreXActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 121, -1));

        jLabel3.setText("player X Digite nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setText("player O Digite nombre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        txtNombreO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreOActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 121, -1));

        cmdColorX.setText("Color X");
        cmdColorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdColorXActionPerformed(evt);
            }
        });
        jPanel1.add(cmdColorX, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmdColorO.setText("Color O");
        cmdColorO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdColorOActionPerformed(evt);
            }
        });
        jPanel1.add(cmdColorO, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        cmdSiguiente.setText("Siguiente");
        cmdSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        cmdMusica.setText("musica");
        cmdMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMusicaActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\images.jpg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
      System.exit(0); 
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdColorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdColorXActionPerformed
     Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar Color para X", colorX);

    if (nuevoColor != null) { // Verificar si se seleccionó un color
        colorX = nuevoColor; // Actualizar la variable
    } else {
        System.out.println("No se seleccionó ningún color para X");
    }
    }//GEN-LAST:event_cmdColorXActionPerformed

    private void cmdColorOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdColorOActionPerformed
        Color nuevoColor = JColorChooser.showDialog(null, "Seleccionar Color para O", colorO);

    if (nuevoColor != null) { // Verificar si se seleccionó un color
        colorO = nuevoColor; // Actualizar la variable
    } else {
        System.out.println("No se seleccionó ningún color para O");
    }
    }//GEN-LAST:event_cmdColorOActionPerformed

    private void txtNombreXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreXActionPerformed
  
    String nombreX = txtNombreX.getText(); // Almacenar el nombre del campo de texto
   
    }//GEN-LAST:event_txtNombreXActionPerformed

    private void txtNombreOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreOActionPerformed

    String nombreO = txtNombreO.getText(); // Almacenar el nombre del campo de texto

    }//GEN-LAST:event_txtNombreOActionPerformed

    private void comboTamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTamañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTamañoActionPerformed

    private void cmdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSiguienteActionPerformed
     
// Verificar si se han ingresado nombres para ambos jugadores
    if (txtNombreX.getText().isEmpty() || txtNombreO.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese los nombres para ambos jugadores.");
        return;
    }

    // Verificar si se han seleccionado colores para "X" y "O"
    if (colorX == null || colorO == null) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un color para ambos jugadores.");
        return;
    }

    // Verificar si se ha seleccionado un tamaño para el tablero
    String seleccionTamaño = (String) comboTamaño.getSelectedItem();
    if (seleccionTamaño.equals("Elige")) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un tamaño para el tablero.");
        return;
    }

    // Obtener los nombres de los JTextField
    String nombreX = txtNombreX.getText();
    String nombreO = txtNombreO.getText();

    // Abrir el frame correspondiente según el tamaño del tablero
    switch (seleccionTamaño) {
        case "3x3":
            Tablero3x3 frame3x3 = new Tablero3x3(); // Crear el frame para 3x3
            frame3x3.setLabelXText(nombreX); // Pasar el nombre
            frame3x3.setLabelOText(nombreO); // Pasar el nombre
            frame3x3.setColorX(colorX); // Pasar el color para "X"
            frame3x3.setColorO(colorO); // Pasar el color para "O"
            frame3x3.setVisible(true); // Hacer visible el frame
            break;
        case "4x4":
            Tablero4x4 frame4x4 = new Tablero4x4(); // Crear el frame para 4x4
            frame4x4.setLabelXText(nombreX); // Pasar el nombre
            frame4x4.setLabelOText(nombreO); // Pasar el nombre
            frame4x4.setColorX(colorX); // Pasar el color para "X"
            frame4x4.setColorO(colorO); // Pasar el color para "O"
            frame4x4.setVisible(true);
            break;
        case "5x5":
            Tablero5x5 frame5x5 = new Tablero5x5(); // Crear el frame para 5x5
            frame5x5.setLabelXText(nombreX); // Pasar el nombre
            frame5x5.setLabelOText(nombreO); // Pasar el nombre
            frame5x5.setColorX(colorX); // Pasar el color para "X"
            frame5x5.setColorO(colorO); // Pasar el color para "O"
            frame5x5.setVisible(true);
            break;
        default:
            JOptionPane.showMessageDialog(this, "Tamaño desconocido.");
            break;
    }

    // Ocultar el frame actual si todo está correcto
    this.dispose(); // Cerrar el frame actual



    }//GEN-LAST:event_cmdSiguienteActionPerformed

    private void cmdMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMusicaActionPerformed
 if (clip == null) { // Si no hay clip activo, iniciarlo
        reproducirMusica("src/TicTacToe/Cancion.wav"); // Ruta relativa
    } else { // Si el clip ya existe, alternar entre pausa y reproducción
        if (clip.isRunning()) { // Si está reproduciendo, detener
            clip.stop(); // Detener la música
        } else {
            clip.start(); // Reanudar la música
        }
    }    
    }//GEN-LAST:event_cmdMusicaActionPerformed
private void reproducirMusica(String rutaArchivo) {
    try {
        if (clip == null) { // Solo inicializar el clip si es la primera vez
            File archivo = new File(rutaArchivo); // Cargar el archivo de música
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(archivo);

            clip = AudioSystem.getClip(); // Crear el Clip para reproducir el audio
            clip.open(audioStream); // Abrir el flujo de audio
        }
        
        clip.start(); // Comenzar a reproducir la música
    } catch (Exception e) {
        e.printStackTrace(); // Manejo de errores
    }
}
    public Color getColorX() {
    return colorX;
}

public Color getColorO() {
    return colorO;
}
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuTriqui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdColorO;
    private javax.swing.JButton cmdColorX;
    private javax.swing.JButton cmdMusica;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JButton cmdSiguiente;
    private javax.swing.JComboBox<String> comboTamaño;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreO;
    private javax.swing.JTextField txtNombreX;
    // End of variables declaration//GEN-END:variables



}

