/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PiedraPapelTijera;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco A. Reyes
 */
public class VentanaInicio extends javax.swing.JDialog {
    private int posListaPartidas = 0;
    private boolean JugarPressed = false;
    private int duracionPartida;
    /**
     * Variable con el nombre del jugador
     */
    public static String nombreJugador;
    

    /**
     * Variable estática para obtener nº total de victorias a conseguir
     */
    public static int nTotalVictoria;

    /**
     * Variable estática que contiene int para asignar color
     */
    public static int colorSelec;
    
    
    
    /**
     * Creates new form VentanaInicio
     * @param parent
     * @param modal
     */
    public VentanaInicio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
           
    }
    
    VentanaInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void setNombreJ1 () {
        nombreJugador = introduceNombre.getText();
    }
    
    /**
     * Método para obtener el nombre del jugador escrito en la Ventana de Inicio
     * @return String con nombre
     */
    public static String getNombreJ1 () {
        return nombreJugador;
    }
    
    private void comprobarNombre(){
        if (!introduceNombre.getText().isEmpty()) {
            this.goToGame();
        } else {
            JOptionPane.showMessageDialog(this, "Introduce tu nombre/nick", "Falta algo", JOptionPane.WARNING_MESSAGE);
            
        }
    }
    
    private void goToGame() {
            switch (colores.getSelectedIndex()) {
            case 0:
                colorSelec = 0;
                break;
            case 1:
                colorSelec = 1;
                break;
            case 2:
                colorSelec = 2;
                break;
            case 3:
                colorSelec = 3;
                break;
                
        }
        
        posListaPartidas = listaPartidas.getSelectedIndex();
        switch (posListaPartidas) {
            case 0:
                this.nTotalVictoria = 2;
                break;
            case 1:
                this.nTotalVictoria = 3;
                break;
            case 2:
                this.nTotalVictoria = 4;
                break;
            case 3:
                this.nTotalVictoria = 5;
                break; 
        }
        this.setNombreJ1();
        Juego ventana = new Juego();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(this);
        ventana.setAlwaysOnTop(true);
        this.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaPartidas = new javax.swing.JComboBox();
        jugarbtn = new javax.swing.JButton();
        cerrarbtn = new javax.swing.JButton();
        introduceNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        colores = new javax.swing.JComboBox();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listaPartidas.setFont(new java.awt.Font("Haettenschweiler", 0, 18)); // NOI18N
        listaPartidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mejor de 3", "Mejor de 5", "Mejor de 7", "Mejor de 9" }));
        listaPartidas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));
        getContentPane().add(listaPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jugarbtn.setBackground(new java.awt.Color(255, 102, 0));
        jugarbtn.setForeground(new java.awt.Color(255, 102, 0));
        jugarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/btnJugar.png"))); // NOI18N
        jugarbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jugarbtn.setBorderPainted(false);
        jugarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(jugarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 170, 40));

        cerrarbtn.setBackground(new java.awt.Color(255, 0, 51));
        cerrarbtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 11)); // NOI18N
        cerrarbtn.setText("Salir");
        cerrarbtn.setFocusPainted(false);
        cerrarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarbtnActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));
        getContentPane().add(introduceNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/Título.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 350, 90));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tunga", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Elige color");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tu nick");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Tipo de Partida");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 30));

        colores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rojo", "Azul", "Verde", "Rosa" }));
        getContentPane().add(colores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PiedraPapelTijera/Imagenes/974742_319b6f5e08.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jugarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarbtnActionPerformed
  
        this.comprobarNombre();
        
    }//GEN-LAST:event_jugarbtnActionPerformed

    private void cerrarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaInicio dialog = new VentanaInicio(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton cerrarbtn;
    private javax.swing.JComboBox colores;
    private javax.swing.JTextField introduceNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jugarbtn;
    private javax.swing.JComboBox listaPartidas;
    // End of variables declaration//GEN-END:variables
}
