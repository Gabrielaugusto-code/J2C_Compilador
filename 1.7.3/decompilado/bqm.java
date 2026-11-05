/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bqm
extends bqi {
    private static final Logger c = LogManager.getLogger();
    public final List b;

    public bqm(String ... stringArray) {
        this.b = Lists.newArrayList((Object[])stringArray);
    }

    @Override
    public void a(brr brr2) {
        this.c();
        BufferedImage bufferedImage = null;
        try {
            for (String string : this.b) {
                if (string == null) continue;
                InputStream inputStream = brr2.a(new brq(string)).b();
                BufferedImage bufferedImage2 = ImageIO.read(inputStream);
                if (bufferedImage == null) {
                    bufferedImage = new BufferedImage(bufferedImage2.getWidth(), bufferedImage2.getHeight(), 2);
                }
                bufferedImage.getGraphics().drawImage(bufferedImage2, 0, 0, null);
            }
        }
        catch (IOException iOException) {
            c.error("Couldn't load layered image", (Throwable)iOException);
            return;
        }
        brb.a(this.b(), bufferedImage);
    }
}

