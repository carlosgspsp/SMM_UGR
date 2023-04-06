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
public class AutoTintadoOp extends BufferedImageOpAdapter {

    @Override
    public BufferedImage filter(BufferedImage src, BufferedImage dest) {
        if (dest == null) {
            dest = createCompatibleDestImage(src, null);
        }
        WritableRaster srcRaster = src.getRaster();
        WritableRaster destRaster = dest.getRaster();
        int sample;
        for (int x = 0; x < srcRaster.getWidth(); x++) {
            for (int y = 0; y < srcRaster.getHeight(); y++) {
                for (int band = 0; band < srcRaster.getNumBands(); band++) {
                    sample = srcRaster.getSample(x, y, band);
                    Color color2 = new Color(src.getRGB(x, y));
                    int I = ((color2.getRed()+color2.getBlue()+color2.getGreen())/3);
                    alpha = I/255.0f;
                    sample = (int) (alpha * color[band] + (1.0f - alpha) * sample);
                    destRaster.setSample(x, y, band, sample);
                }
            }
        }
        return dest;
    }

    public AutoTintadoOp(Color color) {
        this.alpha = alpha;
        this.color = color.getColorComponents(null);
        for (int b = 0; b < this.color.length; b++) {
            this.color[b] *= 255;
        }
    }
    float alpha, color[];
}
