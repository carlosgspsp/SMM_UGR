/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//redimensionar con drawimage
package sm.cgs.iu;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import sm.cgs.graficos.Linea2D_old;

/**
 *
 * @author carlo
 */
public class Lienzo2D_old extends javax.swing.JPanel {

    /**
     * Creates new form Lienzo2D
     */
    public Lienzo2D_old() {
        initComponents();
    }

    private Color color = Color.BLACK;
    private boolean relleno = false, transparencia = false, alisar = false;
    private boolean recorte = false;
    private int trazo = 1;
    String herramienta = "";
    Linea2D_old linea;
    Shape figura;
    List<Shape> vShape = new ArrayList();
    Point paux, paux2, paux3, posRaton;
    BufferedImage img;
    Shape clipArea = new Ellipse2D.Float(100, 100, 100, 100);
    float patronDiscontinuidad[] = {5.0f, 5.0f};
    
    

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        
        if (recorte) {
            g2d.clip(clipArea);
        }
        
        if (img != null) {
            g2d.setStroke(new BasicStroke(trazo, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER, 1.0f, patronDiscontinuidad, 0.0f));
            g2d.clip(new Rectangle (img.getMinX(), img.getMinY(), img.getWidth()+1, img.getHeight()+1));
            g2d.draw(new Rectangle (img.getMinX(), img.getMinY(), img.getWidth(), img.getHeight()));
            g2d.drawImage(img, 0, 0, this);
        }
        
        g2d.setPaint(color);
        g2d.setStroke(new BasicStroke(trazo));
        if (alisar) {
            g2d.setRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));
        }
        if (transparencia) {
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f));
        }

       /* if (img != null) {
            g2d.clip(new Rectangle (img.getMinX(), img.getMinY(), img.getWidth(), img.getHeight()));
            g2d.draw(new Rectangle (img.getMinX(), img.getMinY(), img.getWidth(), img.getHeight()));
            g2d.drawImage(img, 0, 0, this);
        }*/
        for (Shape s : vShape) {
            if (relleno) {
                g2d.fill(s);
            }
            g2d.draw(s);
        }
    }

    public void createShape() {

        switch (herramienta) {
            case "punto":
            case "linea":
                Point p = new Point();
                p.setLocation(paux.getX()+1,paux.getY()+1);
                    figura = new Linea2D_old(paux, p);
                //figura = new Linea2D_viejo(paux, paux);
                vShape.add(figura);
                break;
            case "rectangulo":
                figura = new Rectangle(paux);
                vShape.add(figura);
                break;
            case "elipse":
                figura = new Ellipse2D.Double(paux.getX(), paux.getY(), 0, 0);
                vShape.add(figura);
                break;
            case "seleccionar":
                figura = this.getSelectedShape(paux);
                if (figura!=null)
                {
                paux3 = new Point();
                paux3.setLocation(paux.getX()-figura.getBounds().getX(), paux.getY()-figura.getBounds().getY());
                }
                break;
        }

    }

    public void updateShape(Shape s) {
        if (s instanceof Linea2D_old) {
            
            if (herramienta == "seleccionar")
            {
             
             Point p = new Point();
             p.setLocation(paux2.getX()-paux3.getX(), paux2.getY()-paux3.getY());
             ((Linea2D_old)s).setLocation(p);
             
             
            }
            else if (herramienta == "punto") {
                Point p = new Point();
                p.setLocation(paux2.getX()+1,paux2.getY()+1);
                linea = new Linea2D_old(paux2, p);
                //linea = new Linea2D_viejo(paux2, paux2);
                vShape.add(linea);
            } else {

                ((Linea2D_old) s).setLine(paux, paux2);

            }

        } else if (s instanceof RectangularShape) {
            if (herramienta == "seleccionar")
            {
              this.setCursor(new Cursor(Cursor.MOVE_CURSOR));
             double w = ((RectangularShape) s).getWidth();
             double h = ((RectangularShape) s).getHeight();
             ((RectangularShape) s).setFrame(paux2.getX()-paux3.getX(), paux2.getY()-paux3.getY(), w, h);
             
             
                
            }else
                
            ((RectangularShape) s).setFrameFromDiagonal(paux, paux2);
            
            
        }

    }

    public Shape getSelectedShape(Point2D p) {
        for (Shape s : vShape) {
            if (s.contains(p)) {
                return s;
            }
        }
        return null;
    }
    
  

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public boolean isTransparencia() {
        return transparencia;
    }

    public void setTransparencia(boolean transparencia) {
        this.transparencia = transparencia;
    }

    public boolean isAlisar() {
        return alisar;
    }

    public void setAlisar(boolean alisar) {
        this.alisar = alisar;
    }

    public int getTrazo() {
        return trazo;
    }

    public void setTrazo(int trazo) {
        this.trazo = trazo;
    }

    public Point getPosRaton() {
        return posRaton;
    }

    public BufferedImage getImage(boolean drawVector) {
        if (drawVector) {
            BufferedImage imgout = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
            this.paint(imgout.createGraphics());
            return (imgout);
        } else {
            return img;
        }
    }

    public void setImage(BufferedImage img) {
        this.img = img;
        if(img!=null)
        {
            setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
        }
    }

    public boolean isRecorte() {
        return recorte;
    }

    public void setRecorte(boolean recorte) {
        this.recorte = recorte;
    }

    public void volcar()
    {
        BufferedImage imgout = new BufferedImage(img.getWidth(), img.getHeight(), img.getType());
        this.paint(imgout.createGraphics());
        vShape.clear();
        img = imgout;
       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormListener formListener = new FormListener();

        setBackground(java.awt.Color.white);
        addMouseMotionListener(formListener);
        addMouseListener(formListener);

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
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener {
        FormListener() {}
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        }

        public void mouseEntered(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == Lienzo2D_old.this) {
                Lienzo2D_old.this.formMouseEntered(evt);
            }
        }

        public void mouseExited(java.awt.event.MouseEvent evt) {
        }

        public void mousePressed(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == Lienzo2D_old.this) {
                Lienzo2D_old.this.formMousePressed(evt);
            }
        }

        public void mouseReleased(java.awt.event.MouseEvent evt) {
        }

        public void mouseDragged(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == Lienzo2D_old.this) {
                Lienzo2D_old.this.formMouseDragged(evt);
            }
        }

        public void mouseMoved(java.awt.event.MouseEvent evt) {
            if (evt.getSource() == Lienzo2D_old.this) {
                Lienzo2D_old.this.formMouseMoved(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        paux = evt.getPoint();
        this.createShape();
        this.repaint();
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        paux2 = evt.getPoint();
        this.updateShape(figura);
        this.repaint();
        
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        if (recorte) {
            Point corner = evt.getPoint();
            corner.translate((int) clipArea.getBounds().getWidth() / 2,
                    (int) clipArea.getBounds().getHeight() / 2);
            ((Ellipse2D) clipArea).setFrameFromCenter(evt.getPoint(), corner);
            this.repaint();
        }
        
        if (herramienta != "seleccionar")
       {
           this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
       } else 
       {
           this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
       }
        
    }//GEN-LAST:event_formMouseMoved

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
      
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
