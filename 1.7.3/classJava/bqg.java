/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bqg {
    private static final Logger a = LogManager.getLogger();
    private static bqg b;

    public static void a() {
        b = new bqg();
    }

    public static bqg b() {
        return b;
    }

    private bqg() {
    }

    public void a(bqb bqb2) {
        bqb2.f().b(bqb2);
        bqb2.e().b(bqb2);
        bwg.e(bqb2.h());
    }

    public int c() {
        int n2 = bwg.d();
        if (n2 <= 0) {
            throw new ku("Could not create shader program (returned program ID " + n2 + ")");
        }
        return n2;
    }

    public void b(bqb bqb2) {
        bqb2.f().a(bqb2);
        bqb2.e().a(bqb2);
        bwg.f(bqb2.h());
        int n2 = bwg.a(bqb2.h(), bwg.o);
        if (n2 == 0) {
            a.warn("Error encountered when linking program containing VS " + bqb2.e().a() + " and FS " + bqb2.f().a() + ". Log output:");
            a.warn(bwg.e(bqb2.h(), 32768));
        }
    }
}

