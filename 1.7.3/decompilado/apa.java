/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class apa {
    private static final Map a = new HashMap();

    public static synchronized aoy a(File file, int n2, int n3) {
        File file2 = new File(file, "region");
        File file3 = new File(file2, "r." + (n2 >> 5) + "." + (n3 >> 5) + ".mca");
        aoy aoy2 = (aoy)a.get(file3);
        if (aoy2 != null) {
            return aoy2;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        if (a.size() >= 256) {
            apa.a();
        }
        aoy aoy3 = new aoy(file3);
        a.put(file3, aoy3);
        return aoy3;
    }

    public static synchronized void a() {
        for (aoy aoy2 : a.values()) {
            try {
                if (aoy2 == null) continue;
                aoy2.c();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        a.clear();
    }

    public static DataInputStream c(File file, int n2, int n3) {
        aoy aoy2 = apa.a(file, n2, n3);
        return aoy2.a(n2 & 0x1F, n3 & 0x1F);
    }

    public static DataOutputStream d(File file, int n2, int n3) {
        aoy aoy2 = apa.a(file, n2, n3);
        return aoy2.b(n2 & 0x1F, n3 & 0x1F);
    }
}

