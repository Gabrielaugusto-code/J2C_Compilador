/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ml
implements aol {
    private static final Logger b = LogManager.getLogger();
    private Set c = new HashSet();
    private aoo d;
    private aol e;
    private aot f;
    public boolean a = true;
    private ou g = new ou();
    private List h = new ArrayList();
    private mm i;

    public ml(mm mm2, aot aot2, aol aol2) {
        this.d = new aon(mm2, 0, 0);
        this.i = mm2;
        this.f = aot2;
        this.e = aol2;
    }

    @Override
    public boolean a(int n2, int n3) {
        return this.g.b(afl.a(n2, n3));
    }

    public void b(int n2, int n3) {
        if (this.i.t.e()) {
            r r2 = this.i.K();
            int n4 = n2 * 16 + 8 - r2.a;
            int n5 = n3 * 16 + 8 - r2.c;
            int n6 = 128;
            if (n4 < -n6 || n4 > n6 || n5 < -n6 || n5 > n6) {
                this.c.add(afl.a(n2, n3));
            }
        } else {
            this.c.add(afl.a(n2, n3));
        }
    }

    public void a() {
        for (aoo aoo2 : this.h) {
            this.b(aoo2.g, aoo2.h);
        }
    }

    @Override
    public aoo c(int n2, int n3) {
        long l2 = afl.a(n2, n3);
        this.c.remove(l2);
        aoo aoo2 = (aoo)this.g.a(l2);
        if (aoo2 == null) {
            aoo2 = this.f(n2, n3);
            if (aoo2 == null) {
                if (this.e == null) {
                    aoo2 = this.d;
                } else {
                    try {
                        aoo2 = this.e.d(n2, n3);
                    }
                    catch (Throwable throwable) {
                        b b2 = b.a(throwable, "Exception generating new chunk");
                        k k2 = b2.a("Chunk to be generated");
                        k2.a("Location", String.format("%d,%d", n2, n3));
                        k2.a("Position hash", l2);
                        k2.a("Generator", this.e.e());
                        throw new s(b2);
                    }
                }
            }
            this.g.a(l2, aoo2);
            this.h.add(aoo2);
            aoo2.c();
            aoo2.a(this, this, n2, n3);
        }
        return aoo2;
    }

    @Override
    public aoo d(int n2, int n3) {
        aoo aoo2 = (aoo)this.g.a(afl.a(n2, n3));
        if (aoo2 == null) {
            if (this.i.y || this.a) {
                return this.c(n2, n3);
            }
            return this.d;
        }
        return aoo2;
    }

    private aoo f(int n2, int n3) {
        if (this.f == null) {
            return null;
        }
        try {
            aoo aoo2 = this.f.a(this.i, n2, n3);
            if (aoo2 != null) {
                aoo2.p = this.i.I();
                if (this.e != null) {
                    this.e.e(n2, n3);
                }
            }
            return aoo2;
        }
        catch (Exception exception) {
            b.error("Couldn't load chunk", (Throwable)exception);
            return null;
        }
    }

    private void a(aoo aoo2) {
        if (this.f == null) {
            return;
        }
        try {
            this.f.b(this.i, aoo2);
        }
        catch (Exception exception) {
            b.error("Couldn't save entities", (Throwable)exception);
        }
    }

    private void b(aoo aoo2) {
        if (this.f == null) {
            return;
        }
        try {
            aoo2.p = this.i.I();
            this.f.a(this.i, aoo2);
        }
        catch (IOException iOException) {
            b.error("Couldn't save chunk", (Throwable)iOException);
        }
        catch (afx afx2) {
            b.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)afx2);
        }
    }

    @Override
    public void a(aol aol2, int n2, int n3) {
        aoo aoo2 = this.d(n2, n3);
        if (!aoo2.k) {
            aoo2.p();
            if (this.e != null) {
                this.e.a(aol2, n2, n3);
                aoo2.e();
            }
        }
    }

    @Override
    public boolean a(boolean bl2, pb pb2) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            aoo aoo2 = (aoo)this.h.get(i2);
            if (bl2) {
                this.a(aoo2);
            }
            if (!aoo2.a(bl2)) continue;
            this.b(aoo2);
            aoo2.n = false;
            if (++n2 != 24 || bl2) continue;
            return false;
        }
        return true;
    }

    @Override
    public void b() {
        if (this.f != null) {
            this.f.b();
        }
    }

    @Override
    public boolean c() {
        if (!this.i.c) {
            for (int i2 = 0; i2 < 100; ++i2) {
                if (this.c.isEmpty()) continue;
                Long l2 = (Long)this.c.iterator().next();
                aoo aoo2 = (aoo)this.g.a(l2);
                aoo2.d();
                this.b(aoo2);
                this.a(aoo2);
                this.c.remove(l2);
                this.g.d(l2);
                this.h.remove(aoo2);
            }
            if (this.f != null) {
                this.f.a();
            }
        }
        return this.e.c();
    }

    @Override
    public boolean d() {
        return !this.i.c;
    }

    @Override
    public String e() {
        return "ServerChunkCache: " + this.g.a() + " Drop: " + this.c.size();
    }

    @Override
    public List a(ro ro2, int n2, int n3, int n4) {
        return this.e.a(ro2, n2, n3, n4);
    }

    @Override
    public afk a(afs afs2, String string, int n2, int n3, int n4) {
        return this.e.a(afs2, string, n2, n3, n4);
    }

    @Override
    public int f() {
        return this.g.a();
    }

    @Override
    public void e(int n2, int n3) {
    }
}

