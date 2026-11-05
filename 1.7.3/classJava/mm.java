/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mm
extends afs {
    private static final Logger a = LogManager.getLogger();
    private final MinecraftServer J;
    private final mg K;
    private final mj L;
    private Set M;
    private TreeSet N;
    public ml b;
    public boolean c;
    private boolean O;
    private int P;
    private final agg Q;
    private final agf R = new agf();
    private mo[] S = new mo[]{new mo(null), new mo(null)};
    private int T;
    private static final po[] U = new po[]{new po(abv.y, 0, 1, 3, 10), new po(abs.a(aie.f), 0, 1, 3, 10), new po(abs.a(aie.r), 0, 1, 3, 10), new po(abv.t, 0, 1, 1, 3), new po(abv.p, 0, 1, 1, 5), new po(abv.s, 0, 1, 1, 3), new po(abv.o, 0, 1, 1, 5), new po(abv.e, 0, 2, 3, 5), new po(abv.P, 0, 2, 3, 3), new po(abs.a(aie.s), 0, 1, 3, 10)};
    private List V = new ArrayList();
    private oq W;

    public mm(MinecraftServer minecraftServer, axt axt2, String string, int n2, aga aga2, oz oz2) {
        super(axt2, string, aga2, apf.a(n2), oz2);
        this.J = minecraftServer;
        this.K = new mg(this);
        this.L = new mj(this);
        if (this.W == null) {
            this.W = new oq();
        }
        if (this.M == null) {
            this.M = new HashSet();
        }
        if (this.N == null) {
            this.N = new TreeSet();
        }
        this.Q = new agg(this);
        this.D = new li(minecraftServer);
        ayx ayx2 = (ayx)this.z.a(ayx.class, "scoreboard");
        if (ayx2 == null) {
            ayx2 = new ayx();
            this.z.a("scoreboard", ayx2);
        }
        ayx2.a(this.D);
        ((li)this.D).a(ayx2);
    }

    @Override
    public void b() {
        super.b();
        if (this.N().t() && this.r != pu.d) {
            this.r = pu.d;
        }
        this.t.e.b();
        if (this.e()) {
            if (this.O().b("doDaylightCycle")) {
                long l2 = this.x.g() + 24000L;
                this.x.c(l2 - l2 % 24000L);
            }
            this.d();
        }
        this.C.a("mobSpawner");
        if (this.O().b("doMobSpawning")) {
            this.R.a(this, this.G, this.H, this.x.f() % 400L == 0L);
        }
        this.C.c("chunkSource");
        this.v.c();
        int n2 = this.a(1.0f);
        if (n2 != this.j) {
            this.j = n2;
        }
        this.x.b(this.x.f() + 1L);
        if (this.O().b("doDaylightCycle")) {
            this.x.c(this.x.g() + 1L);
        }
        this.C.c("tickPending");
        this.a(false);
        this.C.c("tickBlocks");
        this.g();
        this.C.c("chunkMap");
        this.L.b();
        this.C.c("village");
        this.A.a();
        this.B.a();
        this.C.c("portalForcer");
        this.Q.a(this.I());
        this.C.b();
        this.aa();
    }

    public ago a(ro ro2, int n2, int n3, int n4) {
        List list = this.L().a(ro2, n2, n3, n4);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (ago)pm.a(this.s, list);
    }

    @Override
    public void c() {
        this.O = !this.h.isEmpty();
        for (xq xq2 : this.h) {
            if (xq2.bl()) continue;
            this.O = false;
            break;
        }
    }

    protected void d() {
        this.O = false;
        for (xq xq2 : this.h) {
            if (!xq2.bl()) continue;
            xq2.a(false, false, true);
        }
        this.Z();
    }

    private void Z() {
        this.x.g(0);
        this.x.b(false);
        this.x.f(0);
        this.x.a(false);
    }

    public boolean e() {
        if (this.O && !this.E) {
            for (xq xq2 : this.h) {
                if (xq2.bK()) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void f() {
        if (this.x.d() <= 0) {
            this.x.b(64);
        }
        int n2 = this.x.c();
        int n3 = this.x.e();
        int n4 = 0;
        while (this.b(n2, n3).o() == avk.a) {
            n2 += this.s.nextInt(8) - this.s.nextInt(8);
            n3 += this.s.nextInt(8) - this.s.nextInt(8);
            if (++n4 != 10000) continue;
        }
        this.x.a(n2);
        this.x.c(n3);
    }

    @Override
    protected void g() {
        super.g();
        int n2 = 0;
        int n3 = 0;
        for (afl afl2 : this.F) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = afl2.a * 16;
            int n9 = afl2.b * 16;
            this.C.a("getChunk");
            aoo aoo2 = this.e(afl2.a, afl2.b);
            this.a(n8, n9, aoo2);
            this.C.c("tickChunk");
            aoo2.b(false);
            this.C.c("thunder");
            if (this.s.nextInt(100000) == 0 && this.Q() && this.P()) {
                this.k = this.k * 3 + 1013904223;
                n7 = this.k >> 2;
                n6 = n8 + (n7 & 0xF);
                n5 = n9 + (n7 >> 8 & 0xF);
                n4 = this.h(n6, n5);
                if (this.y(n6, n4, n5)) {
                    this.c(new vy(this, n6, n4, n5));
                }
            }
            this.C.c("iceandsnow");
            if (this.s.nextInt(16) == 0) {
                agl agl2;
                this.k = this.k * 3 + 1013904223;
                n7 = this.k >> 2;
                n6 = n7 & 0xF;
                n5 = n7 >> 8 & 0xF;
                n4 = this.h(n6 + n8, n5 + n9);
                if (this.s(n6 + n8, n4 - 1, n5 + n9)) {
                    this.b(n6 + n8, n4 - 1, n5 + n9, aie.aD);
                }
                if (this.Q() && this.e(n6 + n8, n4, n5 + n9, true)) {
                    this.b(n6 + n8, n4, n5 + n9, aie.aC);
                }
                if (this.Q() && (agl2 = this.a(n6 + n8, n5 + n9)).e()) {
                    this.a(n6 + n8, n4 - 1, n5 + n9).l(this, n6 + n8, n4 - 1, n5 + n9);
                }
            }
            this.C.c("tickBlocks");
            for (aoq aoq2 : aoo2.i()) {
                if (aoq2 == null || !aoq2.b()) continue;
                for (int i2 = 0; i2 < 3; ++i2) {
                    this.k = this.k * 3 + 1013904223;
                    int n10 = this.k >> 2;
                    int n11 = n10 & 0xF;
                    int n12 = n10 >> 8 & 0xF;
                    int n13 = n10 >> 16 & 0xF;
                    ++n3;
                    ahz ahz2 = aoq2.a(n11, n13, n12);
                    if (!ahz2.t()) continue;
                    ++n2;
                    ahz2.a((afs)this, n11 + n8, n13 + aoq2.d(), n12 + n9, this.s);
                }
            }
            this.C.b();
        }
    }

    @Override
    public boolean a(int n2, int n3, int n4, ahz ahz2) {
        agj agj2 = new agj(n2, n3, n4, ahz2);
        return this.V.contains(agj2);
    }

    @Override
    public void a(int n2, int n3, int n4, ahz ahz2, int n5) {
        this.a(n2, n3, n4, ahz2, n5, 0);
    }

    @Override
    public void a(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        agj agj2 = new agj(n2, n3, n4, ahz2);
        int n7 = 0;
        if (this.d && ahz2.o() != avk.a) {
            if (ahz2.L()) {
                ahz ahz3;
                n7 = 8;
                if (this.b(agj2.a - n7, agj2.b - n7, agj2.c - n7, agj2.a + n7, agj2.b + n7, agj2.c + n7) && (ahz3 = this.a(agj2.a, agj2.b, agj2.c)).o() != avk.a && ahz3 == agj2.a()) {
                    ahz3.a((afs)this, agj2.a, agj2.b, agj2.c, this.s);
                }
                return;
            }
            n5 = 1;
        }
        if (this.b(n2 - n7, n3 - n7, n4 - n7, n2 + n7, n3 + n7, n4 + n7)) {
            if (ahz2.o() != avk.a) {
                agj2.a((long)n5 + this.x.f());
                agj2.a(n6);
            }
            if (!this.M.contains(agj2)) {
                this.M.add(agj2);
                this.N.add(agj2);
            }
        }
    }

    @Override
    public void b(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        agj agj2 = new agj(n2, n3, n4, ahz2);
        agj2.a(n6);
        if (ahz2.o() != avk.a) {
            agj2.a((long)n5 + this.x.f());
        }
        if (!this.M.contains(agj2)) {
            this.M.add(agj2);
            this.N.add(agj2);
        }
    }

    @Override
    public void h() {
        if (this.h.isEmpty()) {
            if (this.P++ >= 1200) {
                return;
            }
        } else {
            this.i();
        }
        super.h();
    }

    public void i() {
        this.P = 0;
    }

    @Override
    public boolean a(boolean bl2) {
        agj agj2;
        int n2 = this.N.size();
        if (n2 != this.M.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n2 > 1000) {
            n2 = 1000;
        }
        this.C.a("cleaning");
        for (int i2 = 0; i2 < n2; ++i2) {
            agj2 = (agj)this.N.first();
            if (!bl2 && agj2.d > this.x.f()) break;
            this.N.remove(agj2);
            this.M.remove(agj2);
            this.V.add(agj2);
        }
        this.C.b();
        this.C.a("ticking");
        Iterator iterator = this.V.iterator();
        while (iterator.hasNext()) {
            agj2 = (agj)iterator.next();
            iterator.remove();
            int n3 = 0;
            if (this.b(agj2.a - n3, agj2.b - n3, agj2.c - n3, agj2.a + n3, agj2.b + n3, agj2.c + n3)) {
                ahz ahz2 = this.a(agj2.a, agj2.b, agj2.c);
                if (ahz2.o() == avk.a || !ahz.a(ahz2, agj2.a())) continue;
                try {
                    ahz2.a((afs)this, agj2.a, agj2.b, agj2.c, this.s);
                    continue;
                }
                catch (Throwable throwable) {
                    int n4;
                    b b2 = b.a(throwable, "Exception while ticking a block");
                    k k2 = b2.a("Block being ticked");
                    try {
                        n4 = this.e(agj2.a, agj2.b, agj2.c);
                    }
                    catch (Throwable throwable2) {
                        n4 = -1;
                    }
                    k.a(k2, agj2.a, agj2.b, agj2.c, ahz2, n4);
                    throw new s(b2);
                }
            }
            this.a(agj2.a, agj2.b, agj2.c, agj2.a(), 0);
        }
        this.C.b();
        this.V.clear();
        return !this.N.isEmpty();
    }

    @Override
    public List a(aoo aoo2, boolean bl2) {
        ArrayList<agj> arrayList = null;
        afl afl2 = aoo2.l();
        int n2 = (afl2.a << 4) - 2;
        int n3 = n2 + 16 + 2;
        int n4 = (afl2.b << 4) - 2;
        int n5 = n4 + 16 + 2;
        for (int i2 = 0; i2 < 2; ++i2) {
            Iterator iterator;
            if (i2 == 0) {
                iterator = this.N.iterator();
            } else {
                iterator = this.V.iterator();
                if (!this.V.isEmpty()) {
                    a.debug("toBeTicked = " + this.V.size());
                }
            }
            while (iterator.hasNext()) {
                agj agj2 = (agj)iterator.next();
                if (agj2.a < n2 || agj2.a >= n3 || agj2.c < n4 || agj2.c >= n5) continue;
                if (bl2) {
                    this.M.remove(agj2);
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<agj>();
                }
                arrayList.add(agj2);
            }
        }
        return arrayList;
    }

    @Override
    public void a(qr qr2, boolean bl2) {
        if (!this.J.X() && (qr2 instanceof uw || qr2 instanceof vl)) {
            qr2.A();
        }
        if (!this.J.Y() && qr2 instanceof xl) {
            qr2.A();
        }
        super.a(qr2, bl2);
    }

    @Override
    protected aol j() {
        aot aot2 = this.w.a(this.t);
        this.b = new ml(this, aot2, this.t.c());
        return this.b;
    }

    public List a(int n2, int n3, int n4, int n5, int n6, int n7) {
        ArrayList<ani> arrayList = new ArrayList<ani>();
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            ani ani2 = (ani)this.g.get(i2);
            if (ani2.c < n2 || ani2.d < n3 || ani2.e < n4 || ani2.c >= n5 || ani2.d >= n6 || ani2.e >= n7) continue;
            arrayList.add(ani2);
        }
        return arrayList;
    }

    @Override
    public boolean a(xq xq2, int n2, int n3, int n4) {
        return !this.J.a(this, n2, n3, n4, xq2);
    }

    @Override
    protected void a(aga aga2) {
        if (this.W == null) {
            this.W = new oq();
        }
        if (this.M == null) {
            this.M = new HashSet();
        }
        if (this.N == null) {
            this.N = new TreeSet();
        }
        this.b(aga2);
        super.a(aga2);
    }

    protected void b(aga aga2) {
        if (!this.t.e()) {
            this.x.a(0, this.t.i(), 0);
            return;
        }
        this.y = true;
        ags ags2 = this.t.e;
        List list = ags2.a();
        Random random = new Random(this.H());
        afk afk2 = ags2.a(0, 0, 256, list, random);
        int n2 = 0;
        int n3 = this.t.i();
        int n4 = 0;
        if (afk2 != null) {
            n2 = afk2.a;
            n4 = afk2.c;
        } else {
            a.warn("Unable to find spawn biome");
        }
        int n5 = 0;
        while (!this.t.a(n2, n4)) {
            n2 += random.nextInt(64) - random.nextInt(64);
            n4 += random.nextInt(64) - random.nextInt(64);
            if (++n5 != 1000) continue;
        }
        this.x.a(n2, n3, n4);
        this.y = false;
        if (aga2.c()) {
            this.k();
        }
    }

    protected void k() {
        int n2;
        int n3;
        int n4;
        apx apx2 = new apx(U, 10);
        for (int i2 = 0; i2 < 10 && !apx2.a((afs)this, this.s, n4 = this.x.c() + this.s.nextInt(6) - this.s.nextInt(6), n3 = this.i(n4, n2 = this.x.e() + this.s.nextInt(6) - this.s.nextInt(6)) + 1, n2); ++i2) {
        }
    }

    public r l() {
        return this.t.h();
    }

    public void a(boolean bl2, pb pb2) {
        if (!this.v.d()) {
            return;
        }
        if (pb2 != null) {
            pb2.a("Saving level");
        }
        this.a();
        if (pb2 != null) {
            pb2.c("Saving chunks");
        }
        this.v.a(bl2, pb2);
    }

    public void m() {
        if (!this.v.d()) {
            return;
        }
        this.v.b();
    }

    protected void a() {
        this.G();
        this.w.a(this.x, this.J.af().q());
        this.z.a();
    }

    @Override
    protected void a(qr qr2) {
        super.a(qr2);
        this.W.a(qr2.x(), qr2);
        qr[] qrArray = qr2.as();
        if (qrArray != null) {
            for (int i2 = 0; i2 < qrArray.length; ++i2) {
                this.W.a(qrArray[i2].x(), qrArray[i2]);
            }
        }
    }

    @Override
    protected void b(qr qr2) {
        super.b(qr2);
        this.W.d(qr2.x());
        qr[] qrArray = qr2.as();
        if (qrArray != null) {
            for (int i2 = 0; i2 < qrArray.length; ++i2) {
                this.W.d(qrArray[i2].x());
            }
        }
    }

    @Override
    public qr a(int n2) {
        return (qr)this.W.a(n2);
    }

    @Override
    public boolean c(qr qr2) {
        if (super.c(qr2)) {
            this.J.af().a(qr2.s, qr2.t, qr2.u, 512.0, this.t.i, new fp(qr2));
            return true;
        }
        return false;
    }

    @Override
    public void a(qr qr2, byte by2) {
        this.r().b(qr2, new gk(qr2, by2));
    }

    @Override
    public afn a(qr qr2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        afn afn2 = new afn(this, qr2, d2, d3, d4, f2);
        afn2.a = bl2;
        afn2.b = bl3;
        afn2.a();
        afn2.a(false);
        if (!bl3) {
            afn2.h.clear();
        }
        for (xq xq2 : this.h) {
            if (!(xq2.e(d2, d3, d4) < 4096.0)) continue;
            ((mp)xq2).a.a(new gl(d2, d3, d4, f2, afn2.h, (ayp)afn2.b().get(xq2)));
        }
        return afn2;
    }

    @Override
    public void c(int n2, int n3, int n4, ahz ahz2, int n5, int n6) {
        afj afj2 = new afj(n2, n3, n4, ahz2, n5, n6);
        for (afj afj3 : this.S[this.T]) {
            if (!afj3.equals(afj2)) continue;
            return;
        }
        this.S[this.T].add(afj2);
    }

    private void aa() {
        while (!this.S[this.T].isEmpty()) {
            int n2 = this.T;
            this.T ^= 1;
            for (afj afj2 : this.S[n2]) {
                if (!this.a(afj2)) continue;
                this.J.af().a(afj2.a(), afj2.b(), afj2.c(), 64.0, this.t.i, new fx(afj2.a(), afj2.b(), afj2.c(), afj2.f(), afj2.d(), afj2.e()));
            }
            this.S[n2].clear();
        }
    }

    private boolean a(afj afj2) {
        ahz ahz2 = this.a(afj2.a(), afj2.b(), afj2.c());
        if (ahz2 == afj2.f()) {
            return ahz2.a((afs)this, afj2.a(), afj2.b(), afj2.c(), afj2.d(), afj2.e());
        }
        return false;
    }

    public void n() {
        this.w.a();
    }

    @Override
    protected void o() {
        boolean bl2 = this.Q();
        super.o();
        if (this.m != this.n) {
            this.J.af().a(new gm(7, this.n), this.t.i);
        }
        if (this.o != this.p) {
            this.J.af().a(new gm(8, this.p), this.t.i);
        }
        if (bl2 != this.Q()) {
            if (bl2) {
                this.J.af().a(new gm(2, 0.0f));
            } else {
                this.J.af().a(new gm(1, 0.0f));
            }
            this.J.af().a(new gm(7, this.n));
            this.J.af().a(new gm(8, this.p));
        }
    }

    @Override
    protected int p() {
        return this.J.af().o();
    }

    public MinecraftServer q() {
        return this.J;
    }

    public mg r() {
        return this.K;
    }

    public mj t() {
        return this.L;
    }

    public agg u() {
        return this.Q;
    }

    public void a(String string, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8) {
        gs gs2 = new gs(string, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, n2);
        for (int i2 = 0; i2 < this.h.size(); ++i2) {
            mp mp2 = (mp)this.h.get(i2);
            r r2 = mp2.f_();
            double d9 = d2 - (double)r2.a;
            double d10 = d3 - (double)r2.b;
            double d11 = d4 - (double)r2.c;
            double d12 = d9 * d9 + d10 * d10 + d11 * d11;
            if (!(d12 <= 256.0)) continue;
            mp2.a.a(gs2);
        }
    }
}

