/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author carlo
 */
import java.awt.Color;
import javax.swing.colorchooser.*;
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        Grupo_Herramientas = new javax.swing.ButtonGroup();
        GrupoColores = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        Punto = new javax.swing.JToggleButton();
        Linea = new javax.swing.JToggleButton();
        Elipse = new javax.swing.JToggleButton();
        Rectangulo = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        BotonPulsado = new javax.swing.JLabel();
        Relleno = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        Negro = new javax.swing.JToggleButton();
        Rojo = new javax.swing.JToggleButton();
        Blanco = new javax.swing.JToggleButton();
        Amarillo = new javax.swing.JToggleButton();
        Azul = new javax.swing.JToggleButton();
        Verde = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Edicion = new javax.swing.JMenu();
        VerBarraDeEstado = new javax.swing.JCheckBoxMenuItem();

        Grupo_Herramientas.add(Punto);
        Grupo_Herramientas.add(Linea);
        Grupo_Herramientas.add(Rectangulo);
        Grupo_Herramientas.add(Elipse);

        GrupoColores.add(Negro);
        GrupoColores.add(Blanco);
        GrupoColores.add(Rojo);
        GrupoColores.add(Amarillo);
        GrupoColores.add(Azul);
        GrupoColores.add(Verde);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jToolBar1.setRollover(true);

        Punto.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\OneDrive\\Universidad\\Sistemas Multimedia\\Practicas\\Practica 2\\Practica2\\images\\punto.png")); // NOI18N
        Punto.setFocusable(false);
        Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Punto.setPreferredSize(new java.awt.Dimension(50, 43));
        Punto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });
        jToolBar1.add(Punto);

        Linea.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\OneDrive\\Universidad\\Sistemas Multimedia\\Practicas\\Practica 2\\Practica2\\images\\linea.png")); // NOI18N
        Linea.setFocusable(false);
        Linea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Linea.setPreferredSize(new java.awt.Dimension(50, 43));
        Linea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Linea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineaActionPerformed(evt);
            }
        });
        jToolBar1.add(Linea);

        Elipse.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\OneDrive\\Universidad\\Sistemas Multimedia\\Practicas\\Practica 2\\Practica2\\images\\elipse.png")); // NOI18N
        Elipse.setBorderPainted(false);
        Elipse.setFocusable(false);
        Elipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Elipse.setPreferredSize(new java.awt.Dimension(50, 43));
        Elipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Elipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElipseActionPerformed(evt);
            }
        });
        jToolBar1.add(Elipse);

        Rectangulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\OneDrive\\Universidad\\Sistemas Multimedia\\Practicas\\Practica 2\\Practica2\\images\\rectangulo.png")); // NOI18N
        Rectangulo.setFocusable(false);
        Rectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rectangulo.setPreferredSize(new java.awt.Dimension(50, 43));
        Rectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectanguloActionPerformed(evt);
            }
        });
        jToolBar1.add(Rectangulo);

        jPanel2.add(jToolBar1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        BotonPulsado.setText(" ");
        BotonPulsado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.add(BotonPulsado, java.awt.BorderLayout.PAGE_END);

        Relleno.setText("Relleno");
        Relleno.setBorder(null);
        Relleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenoActionPerformed(evt);
            }
        });
        jPanel4.add(Relleno, java.awt.BorderLayout.LINE_END);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Negro.setBackground(java.awt.Color.black);
        Negro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Negro.setPreferredSize(new java.awt.Dimension(35, 35));
        Negro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NegroActionPerformed(evt);
            }
        });

        Rojo.setBackground(java.awt.Color.red);
        Rojo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Rojo.setPreferredSize(new java.awt.Dimension(35, 35));

        Blanco.setBackground(java.awt.Color.white);
        Blanco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Blanco.setPreferredSize(new java.awt.Dimension(35, 35));

        Amarillo.setBackground(java.awt.Color.yellow);
        Amarillo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Amarillo.setPreferredSize(new java.awt.Dimension(35, 35));

        Azul.setBackground(java.awt.Color.blue);
        Azul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Azul.setPreferredSize(new java.awt.Dimension(35, 35));
        Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AzulActionPerformed(evt);
            }
        });

        Verde.setBackground(java.awt.Color.green);
        Verde.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Verde.setPreferredSize(new java.awt.Dimension(35, 35));
        Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Negro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amarillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(828, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Negro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Azul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Blanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Verde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.add(jPanel1, java.awt.BorderLayout.LINE_START);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.LINE_END);

        Archivo.setText("Archivo");

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        Archivo.add(Nuevo);

        Abrir.setText("Abrir");
        Archivo.add(Abrir);

        Guardar.setText("Guardar");
        Archivo.add(Guardar);

        jMenuBar1.add(Archivo);

        Edicion.setText("Edicion");

        VerBarraDeEstado.setSelected(true);
        VerBarraDeEstado.setText("Ver barra de estado");
        VerBarraDeEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerBarraDeEstadoActionPerformed(evt);
            }
        });
        Edicion.add(VerBarraDeEstado);

        jMenuBar1.add(Edicion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NuevoActionPerformed

    private void VerBarraDeEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerBarraDeEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerBarraDeEstadoActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        // TODO add your handling code here:
        BotonPulsado.setText("Punto");
    }//GEN-LAST:event_PuntoActionPerformed

    private void LineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineaActionPerformed
        // TODO add your handling code here:
        BotonPulsado.setText("Linea");
    }//GEN-LAST:event_LineaActionPerformed

    private void RectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectanguloActionPerformed
        // TODO add your handling code here:
        BotonPulsado.setText("Rectangulo");
    }//GEN-LAST:event_RectanguloActionPerformed

    private void ElipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElipseActionPerformed
        // TODO add your handling code here:
        BotonPulsado.setText("Elipse");
    }//GEN-LAST:event_ElipseActionPerformed

    private void RellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RellenoActionPerformed

    private void VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerdeActionPerformed

    private void NegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NegroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NegroActionPerformed

    private void AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AzulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AzulActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Abrir;
    private javax.swing.JToggleButton Amarillo;
    private javax.swing.JMenu Archivo;
    private javax.swing.JToggleButton Azul;
    private javax.swing.JToggleButton Blanco;
    private javax.swing.JLabel BotonPulsado;
    private javax.swing.JMenu Edicion;
    private javax.swing.JToggleButton Elipse;
    private javax.swing.ButtonGroup GrupoColores;
    private javax.swing.ButtonGroup Grupo_Herramientas;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JToggleButton Linea;
    private javax.swing.JToggleButton Negro;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JToggleButton Punto;
    private javax.swing.JToggleButton Rectangulo;
    private javax.swing.JCheckBox Relleno;
    private javax.swing.JToggleButton Rojo;
    private javax.swing.JCheckBoxMenuItem VerBarraDeEstado;
    private javax.swing.JToggleButton Verde;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}

