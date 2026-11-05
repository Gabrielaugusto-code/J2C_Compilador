/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class bka
extends afs {
    private bjw a;
    private bjy b;
    private oq c = new oq();
    private Set J = new HashSet();
    private Set K = new HashSet();
    private final azi L = azi.B();
    private final Set M = new HashSet();

    public bka(bjw bjw2, aga aga2, int n2, pu pu2, oz oz2) {
        super((axt)new ayf(), "MpServer", apf.a(n2), aga2, oz2);
        this.a = bjw2;
        this.r = pu2;
        this.x(8, 64, 8);
        this.z = bjw2.a;
    }

    @Override
    public void b() {
        super.b();
        this.a(this.I() + 1L);
        if (this.O().b("doDaylightCycle")) {
            this.b(this.J() + 1L);
        }
        this.C.a("reEntryProcessing");
        for (int i2 = 0; i2 < 10 && !this.K.isEmpty(); ++i2) {
            qr qr2 = (qr)this.K.iterator().next();
            this.K.remove(qr2);
            if (this.e.contains(qr2)) continue;
            this.d(qr2);
        }
        this.C.c("connection");
        this.a.a();
        this.C.c("chunkCache");
        this.b.c();
        this.C.c("blocks");
        this.g();
        this.C.b();
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    protected aol j() {
        this.b = new bjy(this);
        return this.b;
    }

    @Override
    protected void g() {
        super.g();
        this.M.retainAll(this.F);
        if (this.M.size() == this.F.size()) {
            this.M.clear();
        }
        int n2 = 0;
        for (afl afl2 : this.F) {
            if (this.M.contains(afl2)) continue;
            int n3 = afl2.a * 16;
            int n4 = afl2.b * 16;
            this.C.a("getChunk");
            aoo aoo2 = this.e(afl2.a, afl2.b);
            this.a(n3, n4, aoo2);
            this.C.b();
            this.M.add(afl2);
            if (++n2 < 10) continue;
            return;
        }
    }

    public void a(int n2, int n3, boolean bl2) {
        if (bl2) {
            this.b.c(n2, n3);
        } else {
            this.b.b(n2, n3);
        }
        if (!bl2) {
            this.c(n2 * 16, 0, n3 * 16, n2 * 16 + 15, 256, n3 * 16 + 15);
        }
    }

    @Override
    public boolean d(qr qr2) {
        boolean bl2 = super.d(qr2);
        this.J.add(qr2);
        if (!bl2) {
            this.K.add(qr2);
        } else if (qr2 instanceof wc) {
            this.L.X().a(new bsz((wc)qr2));
        }
        return bl2;
    }

    @Override
    public void e(qr qr2) {
        super.e(qr2);
        this.J.remove(qr2);
    }

    @Override
    protected void a(qr qr2) {
        super.a(qr2);
        if (this.K.contains(qr2)) {
            this.K.remove(qr2);
        }
    }

    @Override
    protected void b(qr qr2) {
        super.b(qr2);
        boolean bl2 = false;
        if (this.J.contains(qr2)) {
            if (qr2.Y()) {
                this.K.add(qr2);
                bl2 = true;
            } else {
                this.J.remove(qr2);
            }
        }
        if (bog.a.a(qr2).a() && !bl2) {
            this.L.g.b();
        }
    }

    public void a(int n2, qr qr2) {
        qr qr3 = this.a(n2);
        if (qr3 != null) {
            this.e(qr3);
        }
        this.J.add(qr2);
        qr2.d(n2);
        if (!this.d(qr2)) {
            this.K.add(qr2);
        }
        this.c.a(n2, qr2);
        if (bog.a.a(qr2).a()) {
            this.L.g.b();
        }
    }

    @Override
    public qr a(int n2) {
        if (n2 == this.L.h.x()) {
            return this.L.h;
        }
        return (qr)this.c.a(n2);
    }

    public qr b(int n2) {
        qr qr2 = (qr)this.c.d(n2);
        if (qr2 != null) {
            this.J.remove(qr2);
            this.e(qr2);
        }
        return qr2;
    }

    public boolean c(int n2, int n3, int n4, ahz ahz2, int n5) {
        this.a(n2, n3, n4, n2, n3, n4);
        return super.d(n2, n3, n4, ahz2, n5, 3);
    }

    @Override
    public void F() {
        this.a.b().a(new fh("Quitting"));
    }

    @Override
    protected void o() {
        if (this.t.g) {
            return;
        }
    }

    @Override
    protected int p() {
        return this.L.u.c;
    }

    public void C(int n2, int n3, int n4) {
        int n5 = 16;
        Random random = new Random();
        for (int i2 = 0; i2 < 1000; ++i2) {
            int n6;
            int n7;
            int n8 = n2 + this.s.nextInt(n5) - this.s.nextInt(n5);
            ahz ahz2 = this.a(n8, n7 = n3 + this.s.nextInt(n5) - this.s.nextInt(n5), n6 = n4 + this.s.nextInt(n5) - this.s.nextInt(n5));
            if (ahz2.o() == avk.a) {
                if (this.s.nextInt(8) <= n7 || !this.t.j()) continue;
                this.a("depthsuspend", (double)((float)n8 + this.s.nextFloat()), (double)((float)n7 + this.s.nextFloat()), (double)((float)n6 + this.s.nextFloat()), 0.0, 0.0, 0.0);
                continue;
            }
            ahz2.b((afs)this, n8, n7, n6, random);
        }
    }

    public void a() {
        int n2;
        int n3;
        qr qr2;
        int n4;
        this.e.removeAll(this.f);
        for (n4 = 0; n4 < this.f.size(); ++n4) {
            qr2 = (qr)this.f.get(n4);
            n3 = qr2.ah;
            n2 = qr2.aj;
            if (!qr2.ag || !this.c(n3, n2)) continue;
            this.e(n3, n2).b(qr2);
        }
        for (n4 = 0; n4 < this.f.size(); ++n4) {
            this.b((qr)this.f.get(n4));
        }
        this.f.clear();
        for (n4 = 0; n4 < this.e.size(); ++n4) {
            qr2 = (qr)this.e.get(n4);
            if (qr2.m != null) {
                if (!qr2.m.K && qr2.m.l == qr2) continue;
                qr2.m.l = null;
                qr2.m = null;
            }
            if (!qr2.K) continue;
            n3 = qr2.ah;
            n2 = qr2.aj;
            if (qr2.ag && this.c(n3, n2)) {
                this.e(n3, n2).b(qr2);
            }
            this.e.remove(n4--);
            this.b(qr2);
        }
    }

    @Override
    public k a(b b2) {
        k k2 = super.a(b2);
        k2.a("Forced entities", new bkb(this));
        k2.a("Retry entities", new bkc(this));
        k2.a("Server brand", new bkd(this));
        k2.a("Server type", new bke(this));
        return k2;
    }

    @Override
    public void a(double d2, double d3, double d4, String string, float f2, float f3, boolean bl2) {
        double d5 = this.L.i.e(d2, d3, d4);
        btb btb2 = new btb(new brq(string), f2, f3, (float)d2, (float)d3, (float)d4);
        if (bl2 && d5 > 100.0) {
            double d6 = Math.sqrt(d5) / 40.0;
            this.L.X().a(btb2, (int)(d6 * 20.0));
        } else {
            this.L.X().a(btb2);
        }
    }

    @Override
    public void a(double d2, double d3, double d4, double d5, double d6, double d7, dg dg2) {
        this.L.k.a(new bky(this, d2, d3, d4, d5, d6, d7, this.L.k, dg2));
    }

    public void a(ayw ayw2) {
        this.D = ayw2;
    }

    @Override
    public void b(long l2) {
        if (l2 < 0L) {
            l2 = -l2;
            this.O().b("doDaylightCycle", "false");
        } else {
            this.O().b("doDaylightCycle", "true");
        }
        super.b(l2);
    }

    static /* synthetic */ Set a(bka bka2) {
        return bka2.J;
    }

    static /* synthetic */ Set b(bka bka2) {
        return bka2.K;
    }

    static /* synthetic */ azi c(bka bka2) {
        return bka2.L;
    }
}

