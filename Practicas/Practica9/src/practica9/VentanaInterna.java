/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.awt.Point;
import sm.cgs.iu.Lienzo2D;

/**
 *
 * @author carlo
 */
public class VentanaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanaInterna
     */
    
    Point p;
    
    
    public VentanaInterna() {
        initComponents();
    }

    public Lienzo2D getLienzo2D() {
        return lienzo2D;
    }

    public void setLienzo2D(Lienzo2D lienzo2D) {
        this.lienzo2D = lienzo2D;
    }

    public Point getP() {
        return p;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        lienzo2D = new sm.cgs.iu.Lienzo2D();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        javax.swing.GroupLayout lienzo2DLayout = new javax.swing.GroupLayout(lienzo2D);
        lienzo2D.setLayout(lienzo2DLayout);
        lienzo2DLayout.setHorizontalGroup(
            lienzo2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        lienzo2DLayout.setVerticalGroup(
            lienzo2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(lienzo2D);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private sm.cgs.iu.Lienzo2D lienzo2D;
    // End of variables declaration//GEN-END:variables
}
