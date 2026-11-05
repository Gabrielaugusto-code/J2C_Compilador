/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  io.netty.buffer.ByteBuf
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.BiMap;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class fk {
    private static final Logger a = LogManager.getLogger();

    public static fk a(BiMap biMap, int n2) {
        try {
            Class clazz = (Class)biMap.get((Object)n2);
            if (clazz == null) {
                return null;
            }
            return (fk)clazz.newInstance();
        }
        catch (Exception exception) {
            a.error("Couldn't create packet " + n2, (Throwable)exception);
            return null;
        }
    }

    public static void a(ByteBuf byteBuf, byte[] byArray) {
        byteBuf.writeShort(byArray.length);
        byteBuf.writeBytes(byArray);
    }

    public static byte[] a(ByteBuf byteBuf) {
        short s2 = byteBuf.readShort();
        if (s2 < 0) {
            throw new IOException("Key was smaller than nothing!  Weird key!");
        }
        byte[] byArray = new byte[s2];
        byteBuf.readBytes(byArray);
        return byArray;
    }

    public abstract void a(ep var1);

    public abstract void b(ep var1);

    public abstract void a(es var1);

    public boolean a() {
        return false;
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }

    public String b() {
        return "";
    }
}

