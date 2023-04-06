/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author carlo
 */
public class Linea extends java.awt.geom.Line2D.Float {

    float x1, x2, y1, y2;
    
            
    
    public Linea (Point2D p1, Point2D p2){
        setLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        
    }
    
    public boolean isNear(Point2D p)
    {
        return this.ptLineDist(p) <= 2.0;
    }
    
    @Override
    public boolean contains(Point2D p)
    {
        return isNear(p);
    }
    
    public void setLocation(Point2D pos){
        double dx = pos.getX() - this.getX1();
        double dy = pos.getY() - this.getY1();
        Point2D newp2 = new Point2D.Double(this.getX2() + dx, this.getY2() + dy);
        this.setLine(pos, newp2);
    }
    
    
    
/*
    @Override
    public double getX1() {
        return x1;
    }

    @Override
    public double getY1() {
        return y1;
    }

    @Override
    public Point2D getP1() {
        return new Point2D.Float(x1,y1);
    }

    @Override
    public double getX2() {
        return x2;
    }

    @Override
    public double getY2() {
        return y2;
    }

    @Override
    public Point2D getP2() {
        return new Point2D.Float(x2,y2);
    }

    @Override
    public void setLine(double x1, double y1, double x2, double y2) {
        this.x1 = (float) x1;
        this.x2 = (float) x2;
        this.y1 = (float) y1;
        this.y2 = (float) y2;
    }

    @Override
    public Rectangle2D getBounds2D() {
         Rectangle rectangulo = new Rectangle();
         rectangulo.setFrameFromDiagonal(getP1(), getP2());
         return rectangulo;
        
        
    }
*/
    
    
}
