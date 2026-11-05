/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bjy
implements aol {
    private static final Logger a = LogManager.getLogger();
    private aoo b;
    private ou c = new ou();
    private List d = new ArrayList();
    private afs e;

    public bjy(afs afs2) {
        this.b = new aon(afs2, 0, 0);
        this.e = afs2;
    }

    @Override
    public boolean a(int n2, int n3) {
        return true;
    }

    public void b(int n2, int n3) {
        aoo aoo2 = this.d(n2, n3);
        if (!aoo2.g()) {
            aoo2.d();
        }
        this.c.d(afl.a(n2, n3));
        this.d.remove(aoo2);
    }

    @Override
    public aoo c(int n2, int n3) {
        aoo aoo2 = new aoo(this.e, n2, n3);
        this.c.a(afl.a(n2, n3), aoo2);
        this.d.add(aoo2);
        aoo2.d = true;
        return aoo2;
    }

    @Override
    public aoo d(int n2, int n3) {
        aoo aoo2 = (aoo)this.c.a(afl.a(n2, n3));
        if (aoo2 == null) {
            return this.b;
        }
        return aoo2;
    }

    @Override
    public boolean a(boolean bl2, pb pb2) {
        return true;
    }

    @Override
    public void b() {
    }

    @Override
    public boolean c() {
        long l2 = System.currentTimeMillis();
        for (aoo aoo2 : this.d) {
            aoo2.b(System.currentTimeMillis() - l2 > 5L);
        }
        if (System.currentTimeMillis() - l2 > 100L) {
            a.info("Warning: Clientside chunk ticking took {} ms", new Object[]{System.currentTimeMillis() - l2});
        }
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public void a(aol aol2, int n2, int n3) {
    }

    @Override
    public String e() {
        return "MultiplayerChunkCache: " + this.c.a() + ", " + this.d.size();
    }

    @Override
    public List a(ro ro2, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public afk a(afs afs2, String string, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public int f() {
        return this.d.size();
    }

    @Override
    public void e(int n2, int n3) {
    }
}

