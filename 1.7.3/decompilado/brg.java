/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class brg
implements brt {
    private static final Logger b = LogManager.getLogger();
    protected final File a;

    public brg(File file) {
        this.a = file;
    }

    private static String c(brq brq2) {
        return String.format("%s/%s/%s", "assets", brq2.b(), brq2.a());
    }

    protected static String a(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public InputStream a(brq brq2) {
        return this.a(brg.c(brq2));
    }

    @Override
    public boolean b(brq brq2) {
        return this.b(brg.c(brq2));
    }

    protected abstract InputStream a(String var1);

    protected abstract boolean b(String var1);

    protected void c(String string) {
        b.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[]{string, this.a});
    }

    @Override
    public bsh a(bsj bsj2, String string) {
        return brg.a(bsj2, this.a("pack.mcmeta"), string);
    }

    static bsh a(bsj bsj2, InputStream inputStream, String string) {
        JsonObject jsonObject = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
            jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
        }
        catch (RuntimeException runtimeException) {
            try {
                throw new JsonParseException((Throwable)runtimeException);
            }
            catch (Throwable throwable) {
                IOUtils.closeQuietly(bufferedReader);
                throw throwable;
            }
        }
        IOUtils.closeQuietly((Reader)bufferedReader);
        return bsj2.a(string, jsonObject);
    }

    @Override
    public BufferedImage a() {
        return ImageIO.read(this.a("pack.png"));
    }

    @Override
    public String b() {
        return this.a.getName();
    }
}

