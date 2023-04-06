/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author carlo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    private Point punto = new Point (-20,-20);
    boolean verbarraestado = true;
    public VentanaPrincipal() {
        initComponents();
        this.setTitle("Paint");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        GrupoHerramientas = new javax.swing.ButtonGroup();
        GrupoColores = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        BarraEstado = new javax.swing.JLabel();
        BotonRelleno = new javax.swing.JCheckBox();
        PanelColores = new javax.swing.JPanel();
        BotonNegro = new javax.swing.JButton();
        BotonBlanco = new javax.swing.JButton();
        BotonRojo = new javax.swing.JButton();
        BotonAmarillo = new javax.swing.JButton();
        BotonAzul = new javax.swing.JButton();
        BotonVerde = new javax.swing.JButton();
        Herramientas = new javax.swing.JToolBar();
        Punto = new javax.swing.JToggleButton();
        Linea = new javax.swing.JToggleButton();
        Rectangulo = new javax.swing.JToggleButton();
        Elipse = new javax.swing.JToggleButton();
        lienzo1 = new practica4.Lienzo();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        Nuevo = new javax.swing.JMenuItem();
        Abrir = new javax.swing.JMenuItem();
        Guardar = new javax.swing.JMenuItem();
        Edicion = new javax.swing.JMenu();
        VerBarraEstado = new javax.swing.JCheckBoxMenuItem();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.BorderLayout());

        BarraEstado.setText("Barra de Estado");
        BarraEstado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(BarraEstado, java.awt.BorderLayout.SOUTH);

        BotonRelleno.setText("Relleno");
        BotonRelleno.addChangeListener(formListener);
        jPanel3.add(BotonRelleno, java.awt.BorderLayout.EAST);

        PanelColores.setLayout(new java.awt.GridBagLayout());

        BotonNegro.setBackground(java.awt.Color.black);
        GrupoColores.add(BotonNegro);
        BotonNegro.setPreferredSize(new java.awt.Dimension(32, 32));
        BotonNegro.addActionListener(formListener);
        PanelColores.add(BotonNegro, new java.awt.GridBagConstraints());

        BotonBlanco.setBackground(java.awt.Color.white);
        GrupoColores.add(BotonBlanco);
        BotonBlanco.setPreferredSize(new java.awt.Dimension(32, 32));
        BotonBlanco.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        PanelColores.add(BotonBlanco, gridBagConstraints);

        BotonRojo.setBackground(java.awt.Color.red);
        GrupoColores.add(BotonRojo);
        BotonRojo.setPreferredSize(new java.awt.Dimension(32, 32));
        BotonRojo.addActionListener(formListener);
        PanelColores.add(BotonRojo, new java.awt.GridBagConstraints());

        BotonAmarillo.setBackground(java.awt.Color.yellow);
        GrupoColores.add(BotonAmarillo);
        BotonAmarillo.setPreferredSize(new java.awt.Dimension(32, 32));
        BotonAmarillo.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        PanelColores.add(BotonAmarillo, gridBagConstraints);

        BotonAzul.setBackground(java.awt.Color.blue);
        GrupoColores.add(BotonAzul);
        BotonAzul.setPreferredSize(new java.awt.Dimension(32, 32));
        BotonAzul.addActionListener(formListener);
        PanelColores.add(BotonAzul, new java.awt.GridBagConstraints());

        BotonVerde.setBackground(java.awt.Color.green);
        GrupoColores.add(BotonVerde);
        BotonVerde.setPreferredSize(new java.awt.Dimension(32, 32));
        BotonVerde.addActionListener(formListener);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        PanelColores.add(BotonVerde, gridBagConstraints);

        jPanel3.add(PanelColores, java.awt.BorderLayout.WEST);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        Herramientas.setRollover(true);

        GrupoHerramientas.add(Punto);
        Punto.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Documents\\NetBeansProjects\\Practica4\\images\\punto.png")); // NOI18N
        Punto.setFocusable(false);
        Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Punto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Punto.addMouseListener(formListener);
        Herramientas.add(Punto);

        GrupoHerramientas.add(Linea);
        Linea.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Documents\\NetBeansProjects\\Practica4\\images\\linea.png")); // NOI18N
        Linea.setFocusable(false);
        Linea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Linea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Linea.addMouseListener(formListener);
        Herramientas.add(Linea);

        GrupoHerramientas.add(Rectangulo);
        Rectangulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Documents\\NetBeansProjects\\Practica4\\images\\rectangulo.png")); // NOI18N
        Rectangulo.setFocusable(false);
        Rectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Rectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Rectangulo.addMouseListener(formListener);
        Herramientas.add(Rectangulo);

        GrupoHerramientas.add(Elipse);
        Elipse.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlo\\Documents\\NetBeansProjects\\Practica4\\images\\elipse.png")); // NOI18N
        Elipse.setFocusable(false);
        Elipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Elipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Elipse.addMouseListener(formListener);
        Herramientas.add(Elipse);

        getContentPane().add(Herramientas, java.awt.BorderLayout.PAGE_START);

        lienzo1.addMouseMotionListener(formListener);
        lienzo1.addMouseListener(formListener);

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1196, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo1, java.awt.BorderLayout.CENTER);

        Archivo.setText("Archivo");
        Archivo.addActionListener(formListener);

        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(formListener);
        Archivo.add(Nuevo);

        Abrir.setText("Abrir");
        Abrir.addActionListener(formListener);
        Archivo.add(Abrir);

        Guardar.setText("Guardar");
        Guardar.addActionListener(formListener);
        Archivo.add(Guardar);

        jMenuBar1.add(Archivo);

        Edicion.setText("Edición");

        VerBarraEstado.setSelected(true);
        VerBarraEstado.setText("Ver barra de estado");
        VerBarraEstado.addChangeListener(formListener);
        Edicion.add(VerBarraEstado);

        jMenuBar1.add(Edicion);

        setJMenuBar(jMenuBar1);

        pack();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.MouseListener, java.awt.event.MouseMotionListener, javax.swing.event.ChangeListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == BotonNegro) {
                VentanaPrincipal.this.BotonNegroActionPerformed(evt);
            }
            else if (evt.getSource() == BotonBlanco) {
                VentanaPrincipal.this.BotonBlancoActionPerformed(evt);
            }
            else if (evt.getSource() == BotonRojo) {
                VentanaPrincipal.this.BotonRojoActionPerformed(evt);
            }
            else if (evt.getSource() == BotonAmarillo) {
                VentanaPrincipal.this.BotonAmarilloActionPerformed(evt);
            }
            else if (evt.getSource() == BotonAzul) {
                VentanaPrincipal.this.BotonAzulActionPerformed(evt);
            }
            else if (evt.getSource() == BotonVerde) {
                VentanaPrincipal.this.BotonVerdeActionPerformed(evt);
            }
            else if (evt.getSource() == Archivo) {
                VentanaPrincipal.this.ArchivoActionPerformed(evt);
            }
            else if (evt.getSource() == Nuevo) {
                VentanaPrincipal.this.NuevoActionPerformed(evt);
            }
            else if (evt.getSource() == Abrir) {
                VentanaPrincipal.this.AbrirActionPerformed(evt);
            }
            else if (evt.getSource() == Guardar) {
                VentanaPrincipal.this.GuardarActionPerformed(evt);
            }
        }

        public void mouseClicked(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == Punto) {
                VentanaPrincipal.this.PuntoMouseClicked(evt);
            }
            else if (evt.getSource() == Linea) {
                VentanaPrincipal.this.LineaMouseClicked(evt);
            }
            else if (evt.getSource() == Rectangulo) {
                VentanaPrincipal.this.RectanguloMouseClicked(evt);
            }
            else if (evt.getSource() == Elipse) {
                VentanaPrincipal.this.ElipseMouseClicked(evt);
            }
            else if (evt.getSource() == lienzo1) {
                VentanaPrincipal.this.lienzo1MouseClicked(evt);
            }
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == lienzo1) {
                VentanaPrincipal.this.lienzo1MousePressed(evt);
            }
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }

        public void mouseDragged(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == lienzo1) {
                VentanaPrincipal.this.lienzo1MouseDragged(evt);
            }
        }

        public void mouseMoved(java.awt.event.MouseEvent evt) {
        }

        public void stateChanged(javax.swing.event.ChangeEvent evt) {
            if (evt.getSource() == BotonRelleno) {
                VentanaPrincipal.this.BotonRellenoStateChanged(evt);
            }
            else if (evt.getSource() == VerBarraEstado) {
                VentanaPrincipal.this.VerBarraEstadoStateChanged(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void PuntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PuntoMouseClicked
// TODO add your handling code here:
        BarraEstado.setText("Punto");   
        lienzo1.setHerramienta(0);
    }//GEN-LAST:event_PuntoMouseClicked

    private void LineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineaMouseClicked
// TODO add your handling code here:
        BarraEstado.setText("Linea");
        lienzo1.setHerramienta(1);
    }//GEN-LAST:event_LineaMouseClicked

    private void RectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RectanguloMouseClicked
        // TODO add your handling code here:
        BarraEstado.setText("Rectangulo");
        lienzo1.setHerramienta(2);
    }//GEN-LAST:event_RectanguloMouseClicked

    private void ElipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElipseMouseClicked
        // TODO add your handling code here:
        BarraEstado.setText("Elipse");
        lienzo1.setHerramienta(3);
    }//GEN-LAST:event_ElipseMouseClicked

    private void lienzo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lienzo1MouseClicked

    private void BotonNegroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNegroActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.black);
    }//GEN-LAST:event_BotonNegroActionPerformed

    private void BotonBlancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBlancoActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.white);
    }//GEN-LAST:event_BotonBlancoActionPerformed

    private void BotonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRojoActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.red);
    }//GEN-LAST:event_BotonRojoActionPerformed

    private void BotonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAmarilloActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.yellow);
    }//GEN-LAST:event_BotonAmarilloActionPerformed

    private void BotonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAzulActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.blue);
    }//GEN-LAST:event_BotonAzulActionPerformed

    private void BotonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerdeActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.green);
    }//GEN-LAST:event_BotonVerdeActionPerformed

    private void BotonRellenoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BotonRellenoStateChanged
        if (lienzo1.isRelleno())
        {
            lienzo1.setRelleno(false);
        }
        else
            lienzo1.setRelleno(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_BotonRellenoStateChanged

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArchivoActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        lienzo1.setColor(Color.black);
        lienzo1.setHerramienta(0);
        lienzo1.setRelleno(false);
        BotonRelleno.setSelected(false);
        VerBarraEstado.setSelected(true);
        Punto.setSelected(true);
        Point p2 = new Point(-20,-20);
        this.repaint();
        lienzo1.setPuntoInicial(p2);
        lienzo1.repaint();
    }//GEN-LAST:event_NuevoActionPerformed

    private void VerBarraEstadoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_VerBarraEstadoStateChanged
        // TODO add your handling code here:
        
        if (verbarraestado)
        {
            verbarraestado = false;
            BarraEstado.setVisible(false);
        }
        else
        {
            verbarraestado = true;
        BarraEstado.setVisible(true);
        }
    }//GEN-LAST:event_VerBarraEstadoStateChanged

    private void lienzo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MousePressed
        // TODO add your handling code here:
        
       // lienzo1.repaint();
       punto = evt.getPoint();
       lienzo1.setPuntoInicial(punto);
       if (Punto.isSelected()) 
           lienzo1.repaint();
       
       
    }//GEN-LAST:event_lienzo1MousePressed

    private void lienzo1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzo1MouseDragged
        // TODO add your handling code here:
        if (!Punto.isSelected())
                {
                 punto = evt.getPoint();
                 lienzo1.setPuntoFinal(punto);
                 lienzo1.repaint();  
                }
        
    }//GEN-LAST:event_lienzo1MouseDragged

    private void AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION)
        {
            File f = dlg.getSelectedFile();
        }
        
    }//GEN-LAST:event_AbrirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
         JFileChooser dlg = new JFileChooser();
        int resp = dlg.showSaveDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION)
        {
            File f = dlg.getSelectedFile();
        }
    }//GEN-LAST:event_GuardarActionPerformed

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
    private javax.swing.JMenu Archivo;
    private javax.swing.JLabel BarraEstado;
    private javax.swing.JButton BotonAmarillo;
    private javax.swing.JButton BotonAzul;
    private javax.swing.JButton BotonBlanco;
    private javax.swing.JButton BotonNegro;
    private javax.swing.JCheckBox BotonRelleno;
    private javax.swing.JButton BotonRojo;
    private javax.swing.JButton BotonVerde;
    private javax.swing.JMenu Edicion;
    private javax.swing.JToggleButton Elipse;
    private javax.swing.ButtonGroup GrupoColores;
    private javax.swing.ButtonGroup GrupoHerramientas;
    private javax.swing.JMenuItem Guardar;
    private javax.swing.JToolBar Herramientas;
    private javax.swing.JToggleButton Linea;
    private javax.swing.JMenuItem Nuevo;
    private javax.swing.JPanel PanelColores;
    private javax.swing.JToggleButton Punto;
    private javax.swing.JToggleButton Rectangulo;
    private javax.swing.JCheckBoxMenuItem VerBarraEstado;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private practica4.Lienzo lienzo1;
    // End of variables declaration//GEN-END:variables
}