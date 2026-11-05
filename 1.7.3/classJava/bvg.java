/*
 * Decompiled with CFR 0.152.
 */
import java.net.Proxy;

public class bvg {
    private static Proxy a;

    public static Proxy a() {
        return a;
    }

    public static void a(Proxy proxy) {
        if (a == null) {
            a = proxy;
        }
    }
}

