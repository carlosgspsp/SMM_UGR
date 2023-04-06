/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.cgs.imagen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import sm.image.BufferedImageOpAdapter;

/**
 *
 * @author carlo
 */
public class RedOp extends BufferedImageOpAdapter {

    private int umbral;

    public RedOp(int umbral) {
        this.umbral = umbral;
    }

    
    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (src == null) {
            throw new NullPointerException("src image is null");
        }
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int[] pixelComp = new int[srcRaster.getNumBands()];
        int[] pixelCompDest = new int[srcRaster.getNumBands()];

        for (int x = 0; x < src.getWidth(); x++) {
            for (int y = 0; y < src.getHeight(); y++) {
                srcRaster.getPixel(x, y, pixelComp);

                Color color = new Color(src.getRGB(x, y));
                int rgb[]={color.getRed(),color.getGreen(),color.getBlue()};
                if (color.getRed() - color.getGreen() - color.getBlue() < umbral) {
                    int media = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                    for (int i = 0; i < pixelCompDest.length; i++) {
                        pixelCompDest[i] = media;
                    }

                    
                } else {
                    for (int i = 0; i < pixelCompDest.length; i++) {
                        pixelCompDest[i] = rgb[i];
                       

                    }
                }
                
                destRaster.setPixel(x, y, pixelCompDest);

            }

        }
        return dest;
    }
   
    
}
