/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author carlo
 */
public class Lienzo extends javax.swing.JPanel {

    /**
     * Creates new form Lienzo
     */
    List<Shape> vShape = new ArrayList();
    private String sfuente = "Arial";
    private Ellipse2D clipArea = new Ellipse2D.Float(100,100,500,500);
    private boolean ventanaClipActiva = false;
    private boolean moverActivo = false;
    private boolean rellenoActivo = false;
    private Rectangle rectangulo;
    private Point paux;
    
    
    
    public Lienzo() {
        initComponents();
    }
    
    public void paint (Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (ventanaClipActiva)
        g2d.setClip(clipArea);
        
        pruebaAtributos(g2d);
        for (Shape s : vShape)
        {
            if (rellenoActivo)
            g2d.fill(s);
            else
            g2d.draw(s);
        }
        
        
    }
    
    private void pruebaAtributos(Graphics2D g2d) {
        
        /*
        //Recorte
        Shape clip;
        Shape clipArea;
        clipArea = new Ellipse2D.Float(100, 100, 500, 500);
        g2d.setClip(clipArea);*/
        

        //Trazo
        Stroke trazo;
        float patronDiscontinuidad[] = {15.0f, 15.0f};
        trazo = new BasicStroke(10.0f,
                BasicStroke.CAP_SQUARE,
                BasicStroke.JOIN_MITER, 1.0f,
                patronDiscontinuidad, 0.0f);
        g2d.setStroke(trazo);
        g2d.draw(new Line2D.Float(40, 40, 160, 160));
        


        //Relleno
        Paint relleno;
        relleno = new Color(255, 100, 0);
        g2d.setPaint(relleno);
        g2d.draw(new Rectangle(170, 40, 120, 120));
        g2d.fill(new Rectangle(300, 40, 120, 120));

        Point pc1 = new Point(430, 40), pc2 = new Point(550, 160);
        relleno = new GradientPaint(pc1, Color.RED, pc2, Color.BLUE);
        g2d.setPaint(relleno);
        g2d.fill(new Rectangle(430, 40, 120, 120));


        //Composición
        Composite comp;
        comp = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
        g2d.setComposite(comp);
        g2d.fill(new Rectangle(190, 100, 200, 120));
        
        //Transformación
        Rectangle r = new Rectangle(430, 190, 120, 120);
        g2d.draw(r);
        AffineTransform transformacion;
        transformacion = AffineTransform.getRotateInstance(Math.toRadians(45.0), r.getCenterX(), r.getCenterY());
        g2d.setTransform(transformacion);
        g2d.fill(r);
        
        transformacion.setToIdentity();
        transformacion.translate(r.getCenterX(), r.getCenterY());
        transformacion.scale(0.5, 0.5);
        transformacion.translate(-r.getCenterX(), -r.getCenterY());
        g2d.setTransform(transformacion);
        g2d.draw(r);
        
        //RETO
        transformacion.setToIdentity();
        transformacion = AffineTransform.getRotateInstance(Math.toRadians(45.0), r.getCenterX(), r.getCenterY());
        transformacion.translate(r.getCenterX(), r.getCenterY());
        transformacion.scale(0.25, 0.25);
        transformacion.translate(-r.getCenterX(), -r.getCenterY());
        g2d.setTransform(transformacion);
        g2d.draw(r);
        
        transformacion.setToIdentity();
        g2d.setTransform(transformacion);
        
        //Fuente
        Font fuente;
        fuente = new Font(sfuente, Font.BOLD | Font.ITALIC, 45);
        g2d.setFont(fuente);
        g2d.drawString("Hola", 30, 220);
    
        Map atributosTexto = fuente.getAttributes();
        atributosTexto.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        g2d.setFont(new Font(atributosTexto));
        g2d.drawString("mundo", 30, 260);
        

        
       //Renderización
        RenderingHints render;
        g2d.draw(new Ellipse2D.Float(40, 350, 510, 50)); //Elipse sin antialiasing
        render = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(render);
        g2d.draw(new Ellipse2D.Float(40, 450, 510, 50)); //Elipse con antialiasing
        g2d.drawString("Hola", 30, 170); //Texto con antialiasing

        
        
        
     
    }

    public String getFuente() {
        return sfuente;
    }

    public void setFuente(String sfuente) {
        this.sfuente = sfuente;
    }

    public boolean isVentanaClipActiva() {
        return ventanaClipActiva;
    }

    public void setVentanaClipActiva(boolean ventanaClipActiva) {
        this.ventanaClipActiva = ventanaClipActiva;
    }

    public boolean isMoverActivo() {
        return moverActivo;
    }

    public void setMoverActivo(boolean moverActivo) {
        this.moverActivo = moverActivo;
    }

    public boolean isRellenoActivo() {
        return rellenoActivo;
    }

    public void setRellenoActivo(boolean relleno) {
        this.rellenoActivo = relleno;
    }
    
    
    
    public Shape getSelectedShape (Point2D p)
    {
        for (Shape s : vShape) {
            if (s.contains(p)){
                return s;
            }
        }
        return null;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

        if (ventanaClipActiva) {
            Point corner = evt.getPoint();
            corner.translate((int) clipArea.getWidth() / 2,
                    (int) clipArea.getHeight() / 2);
            clipArea.setFrameFromCenter(evt.getPoint(), corner);
            this.repaint();
        }

    }//GEN-LAST:event_formMouseMoved

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        if (moverActivo) {
            rectangulo = (Rectangle) this.getSelectedShape(evt.getPoint());
        } else {
            paux = evt.getPoint();
            rectangulo = new Rectangle(paux);
            vShape.add(rectangulo);
        }
        
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        if (moverActivo) {
            if (rectangulo != null) {
                rectangulo.setLocation(evt.getPoint());
            }
        } else {
            rectangulo.setFrameFromDiagonal(paux, evt.getPoint());

        }
        this.repaint();
        
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
