/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bkj {
    private static final Logger a = LogManager.getLogger();
    private final azi b;
    private final List c = new ArrayList();

    public bkj(azi azi2) {
        this.b = azi2;
        this.a();
    }

    public void a() {
        try {
            this.c.clear();
            dg dg2 = dr.a(new File(this.b.w, "servers.dat"));
            if (dg2 == null) {
                return;
            }
            dp dp2 = dg2.c("servers", 10);
            for (int i2 = 0; i2 < dp2.c(); ++i2) {
                this.c.add(bki.a(dp2.b(i2)));
            }
        }
        catch (Exception exception) {
            a.error("Couldn't load server list", (Throwable)exception);
        }
    }

    public void b() {
        try {
            dp dp2 = new dp();
            for (bki bki2 : this.c) {
                dp2.a(bki2.a());
            }
            dg dg2 = new dg();
            dg2.a("servers", dp2);
            dr.a(dg2, new File(this.b.w, "servers.dat"));
        }
        catch (Exception exception) {
            a.error("Couldn't save server list", (Throwable)exception);
        }
    }

    public bki a(int n2) {
        return (bki)this.c.get(n2);
    }

    public void b(int n2) {
        this.c.remove(n2);
    }

    public void a(bki bki2) {
        this.c.add(bki2);
    }

    public int c() {
        return this.c.size();
    }

    public void a(int n2, int n3) {
        bki bki2 = this.a(n2);
        this.c.set(n2, this.a(n3));
        this.c.set(n3, bki2);
        this.b();
    }

    public void a(int n2, bki bki2) {
        this.c.set(n2, bki2);
    }

    public static void b(bki bki2) {
        bkj bkj2 = new bkj(azi.B());
        bkj2.a();
        for (int i2 = 0; i2 < bkj2.c(); ++i2) {
            bki bki3 = bkj2.a(i2);
            if (!bki3.a.equals(bki2.a) || !bki3.b.equals(bki2.b)) continue;
            bkj2.a(i2, bki2);
            break;
        }
        bkj2.b();
    }
}

