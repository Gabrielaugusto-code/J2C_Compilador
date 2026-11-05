/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class btq {
    private ArrayList b = new ArrayList();
    boolean a;

    public synchronized boolean a() {
        return this.a;
    }

    public synchronized void b() {
        this.a = false;
    }

    public synchronized List c() {
        return Collections.unmodifiableList(this.b);
    }

    public synchronized void a(String string, InetAddress inetAddress) {
        String string2 = btr.a(string);
        String string3 = btr.b(string);
        if (string3 == null) {
            return;
        }
        string3 = inetAddress.getHostAddress() + ":" + string3;
        boolean bl2 = false;
        for (bto bto2 : this.b) {
            if (!bto2.b().equals(string3)) continue;
            bto2.c();
            bl2 = true;
            break;
        }
        if (!bl2) {
            this.b.add(new bto(string2, string3));
            this.a = true;
        }
    }
}

