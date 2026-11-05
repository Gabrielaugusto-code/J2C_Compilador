/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import javax.imageio.ImageIO;

public class bri
implements brt {
    public static final Set a = ImmutableSet.of((Object)"minecraft");
    private final Map b;

    public bri(Map map) {
        this.b = map;
    }

    @Override
    public InputStream a(brq brq2) {
        InputStream inputStream = this.d(brq2);
        if (inputStream != null) {
            return inputStream;
        }
        InputStream inputStream2 = this.c(brq2);
        if (inputStream2 != null) {
            return inputStream2;
        }
        throw new FileNotFoundException(brq2.a());
    }

    public InputStream c(brq brq2) {
        File file = (File)this.b.get(brq2.toString());
        return file == null || !file.isFile() ? null : new FileInputStream(file);
    }

    private InputStream d(brq brq2) {
        return bri.class.getResourceAsStream("/assets/minecraft/" + brq2.a());
    }

    @Override
    public boolean b(brq brq2) {
        return this.d(brq2) != null || this.b.containsKey(brq2.toString());
    }

    @Override
    public Set c() {
        return a;
    }

    @Override
    public bsh a(bsj bsj2, String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream((File)this.b.get("minecraft:pack.mcmeta"));
            return brg.a(bsj2, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public BufferedImage a() {
        return ImageIO.read(bri.class.getResourceAsStream("/" + new brq("pack.png").a()));
    }

    @Override
    public String b() {
        return "Default";
    }
}

