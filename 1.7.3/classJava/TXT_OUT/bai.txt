/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class bai {
    private static final Logger a = LogManager.getLogger();
    private static final DateFormat b = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
    private static IntBuffer c;
    private static int[] d;

    public static fa a(File file, int n2, int n3, bmz bmz2) {
        return bai.a(file, null, n2, n3, bmz2);
    }

    public static fa a(File file, String string, int n2, int n3, bmz bmz2) {
        try {
            File file2 = new File(file, "screenshots");
            file2.mkdir();
            if (bwg.g()) {
                n2 = bmz2.a;
                n3 = bmz2.b;
            }
            int n4 = n2 * n3;
            if (c == null || c.capacity() < n4) {
                c = BufferUtils.createIntBuffer((int)n4);
                d = new int[n4];
            }
            GL11.glPixelStorei((int)3333, (int)1);
            GL11.glPixelStorei((int)3317, (int)1);
            c.clear();
            if (bwg.g()) {
                GL11.glBindTexture((int)3553, (int)bmz2.g);
                GL11.glGetTexImage((int)3553, (int)0, (int)32993, (int)33639, (IntBuffer)c);
            } else {
                GL11.glReadPixels((int)0, (int)0, (int)n2, (int)n3, (int)32993, (int)33639, (IntBuffer)c);
            }
            c.get(d);
            brb.a(d, n2, n3);
            BufferedImage bufferedImage = null;
            if (bwg.g()) {
                int n5;
                bufferedImage = new BufferedImage(bmz2.c, bmz2.d, 1);
                for (int i2 = n5 = bmz2.b - bmz2.d; i2 < bmz2.b; ++i2) {
                    for (int i3 = 0; i3 < bmz2.c; ++i3) {
                        bufferedImage.setRGB(i3, i2 - n5, d[i2 * bmz2.a + i3]);
                    }
                }
            } else {
                bufferedImage = new BufferedImage(n2, n3, 1);
                bufferedImage.setRGB(0, 0, n2, n3, d, 0, n2);
            }
            File file3 = string == null ? bai.a(file2) : new File(file2, string);
            ImageIO.write((RenderedImage)bufferedImage, "png", file3);
            fh fh2 = new fh(file3.getName());
            fh2.b().a(new ey(ez.b, file3.getAbsolutePath()));
            fh2.b().d(true);
            return new fi("screenshot.success", fh2);
        }
        catch (Exception exception) {
            a.warn("Couldn't save screenshot", (Throwable)exception);
            return new fi("screenshot.failure", exception.getMessage());
        }
    }

    private static File a(File file) {
        String string = b.format(new Date()).toString();
        int n2 = 1;
        File file2;
        while ((file2 = new File(file, string + (n2 == 1 ? "" : "_" + n2) + ".png")).exists()) {
            ++n2;
        }
        return file2;
    }
}

