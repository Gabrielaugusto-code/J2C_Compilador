/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bqn
extends bqi {
    private static final Logger c = LogManager.getLogger();
    protected final brq b;

    public bqn(brq brq2) {
        this.b = brq2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(brr brr2) {
        this.c();
        InputStream inputStream = null;
        try {
            brp brp2 = brr2.a(this.b);
            inputStream = brp2.b();
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            boolean bl2 = false;
            boolean bl3 = false;
            if (brp2.c()) {
                try {
                    bsv bsv2 = (bsv)brp2.a("texture");
                    if (bsv2 != null) {
                        bl2 = bsv2.a();
                        bl3 = bsv2.b();
                    }
                }
                catch (RuntimeException runtimeException) {
                    c.warn("Failed reading metadata of: " + this.b, (Throwable)runtimeException);
                }
            }
            brb.a(this.b(), bufferedImage, bl2, bl3);
        }
        finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }
}

