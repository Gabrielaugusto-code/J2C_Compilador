/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Lists
 *  io.netty.buffer.Unpooled
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class na
implements ie {
    private static final Logger c = LogManager.getLogger();
    public final ef a;
    private final MinecraftServer d;
    public mp b;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private long i;
    private static Random j = new Random();
    private long k;
    private int l;
    private int m;
    private oq n = new oq();
    private double o;
    private double p;
    private double q;
    private boolean r = true;

    public na(MinecraftServer minecraftServer, ef ef2, mp mp2) {
        this.d = minecraftServer;
        this.a = ef2;
        ef2.a(this);
        this.b = mp2;
        mp2.a = this;
    }

    @Override
    public void a() {
        this.g = false;
        ++this.e;
        this.d.a.a("keepAlive");
        if ((long)this.e - this.k > 40L) {
            this.k = this.e;
            this.i = this.d();
            this.h = (int)this.i;
            this.a(new gn(this.h));
        }
        if (this.l > 0) {
            --this.l;
        }
        if (this.m > 0) {
            --this.m;
        }
        this.d.a.c("playerTick");
        this.d.a.b();
    }

    public ef b() {
        return this.a;
    }

    public void c(String string) {
        fh fh2 = new fh(string);
        this.a.a(new gj(fh2), new nb(this, fh2));
        this.a.g();
    }

    @Override
    public void a(jb jb2) {
        this.b.a(jb2.c(), jb2.d(), jb2.e(), jb2.f());
    }

    @Override
    public void a(iu iu2) {
        double d2;
        mm mm2 = this.d.a(this.b.ap);
        this.g = true;
        if (this.b.i) {
            return;
        }
        if (!this.r) {
            d2 = iu2.d() - this.p;
            if (iu2.c() == this.o && d2 * d2 < 0.01 && iu2.e() == this.q) {
                this.r = true;
            }
        }
        if (this.r) {
            double d3;
            double d4;
            double d5;
            if (this.b.m != null) {
                float f2 = this.b.y;
                float f3 = this.b.z;
                this.b.m.ab();
                double d6 = this.b.s;
                double d7 = this.b.t;
                double d8 = this.b.u;
                if (iu2.k()) {
                    f2 = iu2.g();
                    f3 = iu2.h();
                }
                this.b.D = iu2.i();
                this.b.i();
                this.b.V = 0.0f;
                this.b.a(d6, d7, d8, f2, f3);
                if (this.b.m != null) {
                    this.b.m.ab();
                }
                this.d.af().d(this.b);
                if (this.r) {
                    this.o = this.b.s;
                    this.p = this.b.t;
                    this.q = this.b.u;
                }
                mm2.g(this.b);
                return;
            }
            if (this.b.bl()) {
                this.b.i();
                this.b.a(this.o, this.p, this.q, this.b.y, this.b.z);
                mm2.g(this.b);
                return;
            }
            d2 = this.b.t;
            this.o = this.b.s;
            this.p = this.b.t;
            this.q = this.b.u;
            double d9 = this.b.s;
            double d10 = this.b.t;
            double d11 = this.b.u;
            float f4 = this.b.y;
            float f5 = this.b.z;
            if (iu2.j() && iu2.d() == -999.0 && iu2.f() == -999.0) {
                iu2.a(false);
            }
            if (iu2.j()) {
                d9 = iu2.c();
                d10 = iu2.d();
                d11 = iu2.e();
                d5 = iu2.f() - iu2.d();
                if (!this.b.bl() && (d5 > 1.65 || d5 < 0.1)) {
                    this.c("Illegal stance");
                    c.warn(this.b.b_() + " had an illegal stance: " + d5);
                    return;
                }
                if (Math.abs(iu2.c()) > 3.2E7 || Math.abs(iu2.e()) > 3.2E7) {
                    this.c("Illegal position");
                    return;
                }
            }
            if (iu2.k()) {
                f4 = iu2.g();
                f5 = iu2.h();
            }
            this.b.i();
            this.b.V = 0.0f;
            this.b.a(this.o, this.p, this.q, f4, f5);
            if (!this.r) {
                return;
            }
            d5 = d9 - this.b.s;
            double d12 = d10 - this.b.t;
            double d13 = d11 - this.b.u;
            double d14 = Math.min(Math.abs(d5), Math.abs(this.b.v));
            double d15 = d14 * d14 + (d4 = Math.min(Math.abs(d12), Math.abs(this.b.w))) * d4 + (d3 = Math.min(Math.abs(d13), Math.abs(this.b.x))) * d3;
            if (!(!(d15 > 100.0) || this.d.L() && this.d.K().equals(this.b.b_()))) {
                c.warn(this.b.b_() + " moved too quickly! " + d5 + "," + d12 + "," + d13 + " (" + d14 + ", " + d4 + ", " + d3 + ")");
                this.a(this.o, this.p, this.q, this.b.y, this.b.z);
                return;
            }
            float f6 = 0.0625f;
            boolean bl2 = mm2.a((qr)this.b, this.b.C.c().e(f6, f6, f6)).isEmpty();
            if (this.b.D && !iu2.i() && d12 > 0.0) {
                this.b.bi();
            }
            this.b.d(d5, d12, d13);
            this.b.D = iu2.i();
            this.b.k(d5, d12, d13);
            double d16 = d12;
            d5 = d9 - this.b.s;
            d12 = d10 - this.b.t;
            if (d12 > -0.5 || d12 < 0.5) {
                d12 = 0.0;
            }
            d13 = d11 - this.b.u;
            d15 = d5 * d5 + d12 * d12 + d13 * d13;
            boolean bl3 = false;
            if (d15 > 0.0625 && !this.b.bl() && !this.b.c.d()) {
                bl3 = true;
                c.warn(this.b.b_() + " moved wrongly!");
            }
            this.b.a(d9, d10, d11, f4, f5);
            boolean bl4 = mm2.a((qr)this.b, this.b.C.c().e(f6, f6, f6)).isEmpty();
            if (bl2 && (bl3 || !bl4) && !this.b.bl()) {
                this.a(this.o, this.p, this.q, f4, f5);
                return;
            }
            ayk ayk2 = this.b.C.c().b(f6, f6, f6).a(0.0, -0.55, 0.0);
            if (!(this.d.aa() || this.b.c.d() || mm2.c(ayk2))) {
                if (d16 >= -0.03125) {
                    ++this.f;
                    if (this.f > 80) {
                        c.warn(this.b.b_() + " was kicked for floating too long!");
                        this.c("Flying is not enabled on this server");
                        return;
                    }
                }
            } else {
                this.f = 0;
            }
            this.b.D = iu2.i();
            this.d.af().d(this.b);
            this.b.b(this.b.t - d2, iu2.i());
        } else if (this.e % 20 == 0) {
            this.a(this.o, this.p, this.q, this.b.y, this.b.z);
        }
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.r = false;
        this.o = d2;
        this.p = d3;
        this.q = d4;
        this.b.a(d2, d3, d4, f2, f3);
        this.b.a.a(new fl(d2, d3 + (double)1.62f, d4, f2, f3, false));
    }

    @Override
    public void a(iz iz2) {
        mm mm2 = this.d.a(this.b.ap);
        this.b.v();
        if (iz2.g() == 4) {
            this.b.a(false);
            return;
        }
        if (iz2.g() == 3) {
            this.b.a(true);
            return;
        }
        if (iz2.g() == 5) {
            this.b.bz();
            return;
        }
        boolean bl2 = false;
        if (iz2.g() == 0) {
            bl2 = true;
        }
        if (iz2.g() == 1) {
            bl2 = true;
        }
        if (iz2.g() == 2) {
            bl2 = true;
        }
        int n2 = iz2.c();
        int n3 = iz2.d();
        int n4 = iz2.e();
        if (bl2) {
            double d2 = this.b.s - ((double)n2 + 0.5);
            double d3 = this.b.t - ((double)n3 + 0.5) + 1.5;
            double d4 = this.b.u - ((double)n4 + 0.5);
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if (d5 > 36.0) {
                return;
            }
            if (n3 >= this.d.ad()) {
                return;
            }
        }
        if (iz2.g() == 0) {
            if (!this.d.a(mm2, n2, n3, n4, this.b)) {
                this.b.c.a(n2, n3, n4, iz2.f());
            } else {
                this.b.a.a(new fy(n2, n3, n4, mm2));
            }
        } else if (iz2.g() == 2) {
            this.b.c.a(n2, n3, n4);
            if (mm2.a(n2, n3, n4).o() != avk.a) {
                this.b.a.a(new fy(n2, n3, n4, mm2));
            }
        } else if (iz2.g() == 1) {
            this.b.c.c(n2, n3, n4);
            if (mm2.a(n2, n3, n4).o() != avk.a) {
                this.b.a.a(new fy(n2, n3, n4, mm2));
            }
        }
    }

    @Override
    public void a(jf jf2) {
        Object object;
        mm mm2 = this.d.a(this.b.ap);
        abu abu2 = this.b.bm.h();
        boolean bl2 = false;
        int n2 = jf2.c();
        int n3 = jf2.d();
        int n4 = jf2.e();
        int n5 = jf2.f();
        this.b.v();
        if (jf2.f() == 255) {
            if (abu2 == null) {
                return;
            }
            this.b.c.a(this.b, mm2, abu2);
        } else if (jf2.d() < this.d.ad() - 1 || jf2.f() != 1 && jf2.d() < this.d.ad()) {
            if (this.r && this.b.e((double)n2 + 0.5, (double)n3 + 0.5, (double)n4 + 0.5) < 64.0 && !this.d.a(mm2, n2, n3, n4, this.b)) {
                this.b.c.a(this.b, mm2, abu2, n2, n3, n4, n5, jf2.h(), jf2.i(), jf2.j());
            }
            bl2 = true;
        } else {
            object = new fi("build.tooHigh", this.d.ad());
            ((ev)object).b().a(a.m);
            this.b.a.a(new ga((fa)object));
            bl2 = true;
        }
        if (bl2) {
            this.b.a.a(new fy(n2, n3, n4, mm2));
            if (n5 == 0) {
                --n3;
            }
            if (n5 == 1) {
                ++n3;
            }
            if (n5 == 2) {
                --n4;
            }
            if (n5 == 3) {
                ++n4;
            }
            if (n5 == 4) {
                --n2;
            }
            if (n5 == 5) {
                ++n2;
            }
            this.b.a.a(new fy(n2, n3, n4, mm2));
        }
        if ((abu2 = this.b.bm.h()) != null && abu2.b == 0) {
            this.b.bm.a[this.b.bm.c] = null;
            abu2 = null;
        }
        if (abu2 == null || abu2.n() == 0) {
            this.b.g = true;
            this.b.bm.a[this.b.bm.c] = abu.b(this.b.bm.a[this.b.bm.c]);
            object = this.b.bo.a(this.b.bm, this.b.bm.c);
            this.b.bo.b();
            this.b.g = false;
            if (!abu.b(this.b.bm.h(), jf2.g())) {
                this.a(new gh(this.b.bo.d, ((zp)object).g, this.b.bm.h()));
            }
        }
    }

    @Override
    public void a(fa fa2) {
        c.info(this.b.b_() + " lost connection: " + fa2);
        this.d.au();
        fi fi2 = new fi("multiplayer.player.left", this.b.c_());
        fi2.b().a(a.o);
        this.d.af().a(fi2);
        this.b.n();
        this.d.af().e(this.b);
        if (this.d.L() && this.b.b_().equals(this.d.K())) {
            c.info("Stopping singleplayer server as player logged out");
            this.d.q();
        }
    }

    public void a(fk fk2) {
        Object object;
        if (fk2 instanceof ga) {
            ga ga2 = (ga)fk2;
            object = this.b.u();
            if (object == xs.c) {
                return;
            }
            if (object == xs.b && !ga2.d()) {
                return;
            }
        }
        try {
            this.a.a(fk2, new GenericFutureListener[0]);
        }
        catch (Throwable throwable) {
            object = b.a(throwable, "Sending packet");
            k k2 = ((b)object).a("Packet being sent");
            k2.a("Packet class", new nc(this, fk2));
            throw new s((b)object);
        }
    }

    @Override
    public void a(jc jc2) {
        if (jc2.c() < 0 || jc2.c() >= xo.i()) {
            c.warn(this.b.b_() + " tried to set an invalid carried item");
            return;
        }
        this.b.bm.c = jc2.c();
        this.b.v();
    }

    @Override
    public void a(ii ii2) {
        if (this.b.u() == xs.c) {
            fi fi2 = new fi("chat.cannotSend", new Object[0]);
            fi2.b().a(a.m);
            this.a(new ga(fi2));
            return;
        }
        this.b.v();
        String string = ii2.c();
        string = StringUtils.normalizeSpace((String)string);
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (t.a(string.charAt(i2))) continue;
            this.c("Illegal characters in chat");
            return;
        }
        if (string.startsWith("/")) {
            this.d(string);
        } else {
            fi fi3 = new fi("chat.type.text", this.b.c_(), string);
            this.d.af().a(fi3, false);
        }
        this.l += 20;
        if (this.l > 200 && !this.d.af().d(this.b.b_())) {
            this.c("disconnect.spam");
        }
    }

    private void d(String string) {
        this.d.H().a(this.b, string);
    }

    @Override
    public void a(ig ig2) {
        this.b.v();
        if (ig2.d() == 1) {
            this.b.aZ();
        }
    }

    @Override
    public void a(ja ja2) {
        this.b.v();
        if (ja2.d() == 1) {
            this.b.b(true);
        } else if (ja2.d() == 2) {
            this.b.b(false);
        } else if (ja2.d() == 4) {
            this.b.c(true);
        } else if (ja2.d() == 5) {
            this.b.c(false);
        } else if (ja2.d() == 3) {
            this.b.a(false, true, true);
            this.r = false;
        } else if (ja2.d() == 6) {
            if (this.b.m != null && this.b.m instanceof uz) {
                ((uz)this.b.m).w(ja2.e());
            }
        } else if (ja2.d() == 7 && this.b.m != null && this.b.m instanceof uz) {
            ((uz)this.b.m).g(this.b);
        }
    }

    @Override
    public void a(ir ir2) {
        mm mm2 = this.d.a(this.b.ap);
        qr qr2 = ir2.a(mm2);
        this.b.v();
        if (qr2 != null) {
            boolean bl2 = this.b.p(qr2);
            double d2 = 36.0;
            if (!bl2) {
                d2 = 9.0;
            }
            if (this.b.f(qr2) < d2) {
                if (ir2.c() == is.a) {
                    this.b.q(qr2);
                } else if (ir2.c() == is.b) {
                    if (qr2 instanceof wb || qr2 instanceof rh || qr2 instanceof xt || qr2 == this.b) {
                        this.c("Attempting to attack an invalid entity");
                        this.d.f("Player " + this.b.b_() + " tried to attack an invalid entity");
                        return;
                    }
                    this.b.r(qr2);
                }
            }
        }
    }

    @Override
    public void a(ij ij2) {
        this.b.v();
        ik ik2 = ij2.c();
        switch (ik2) {
            case a: {
                if (this.b.i) {
                    this.b = this.d.af().a(this.b, 0, true);
                    break;
                }
                if (this.b.r().N().t()) {
                    if (this.d.L() && this.b.b_().equals(this.d.K())) {
                        this.b.a.c("You have died. Game over, man, it's game over!");
                        this.d.S();
                        break;
                    }
                    kc kc2 = new kc(this.b.b_());
                    kc2.b("Death in Hardcore");
                    this.d.af().e().a(kc2);
                    this.b.a.c("You have died. Game over, man, it's game over!");
                    break;
                }
                if (this.b.aR() > 0.0f) {
                    return;
                }
                this.b = this.d.af().a(this.b, 0, false);
                break;
            }
            case b: {
                this.b.w().a(this.b);
                break;
            }
            case c: {
                this.b.a(nt.f);
            }
        }
    }

    @Override
    public void a(ip ip2) {
        this.b.m();
    }

    @Override
    public void a(io io2) {
        this.b.v();
        if (this.b.bo.d == io2.c() && this.b.bo.c(this.b)) {
            abu abu2 = this.b.bo.a(io2.d(), io2.e(), io2.h(), (xq)this.b);
            if (abu.b(io2.g(), abu2)) {
                this.b.a.a(new gc(io2.c(), io2.f(), true));
                this.b.g = true;
                this.b.bo.b();
                this.b.l();
                this.b.g = false;
            } else {
                this.n.a(this.b.bo.d, io2.f());
                this.b.a.a(new gc(io2.c(), io2.f(), false));
                this.b.bo.a((xq)this.b, false);
                ArrayList<abu> arrayList = new ArrayList<abu>();
                for (int i2 = 0; i2 < this.b.bo.c.size(); ++i2) {
                    arrayList.add(((zp)this.b.bo.c.get(i2)).d());
                }
                this.b.a(this.b.bo, arrayList);
            }
        }
    }

    @Override
    public void a(in in2) {
        this.b.v();
        if (this.b.bo.d == in2.c() && this.b.bo.c(this.b)) {
            this.b.bo.a((xq)this.b, in2.d());
            this.b.bo.b();
        }
    }

    @Override
    public void a(jd jd2) {
        if (this.b.c.d()) {
            boolean bl2;
            boolean bl3 = jd2.c() < 0;
            abu abu2 = jd2.d();
            boolean bl4 = jd2.c() >= 1 && jd2.c() < 36 + xo.i();
            boolean bl5 = abu2 == null || abu2.b() != null;
            boolean bl6 = bl2 = abu2 == null || abu2.k() >= 0 && abu2.b <= 64 && abu2.b > 0;
            if (bl4 && bl5 && bl2) {
                if (abu2 == null) {
                    this.b.bn.a(jd2.c(), null);
                } else {
                    this.b.bn.a(jd2.c(), abu2);
                }
                this.b.bn.a((xq)this.b, true);
            } else if (bl3 && bl5 && bl2 && this.m < 200) {
                this.m += 20;
                wb wb2 = this.b.a(abu2, true);
                if (wb2 != null) {
                    wb2.e();
                }
            }
        }
    }

    @Override
    public void a(im im2) {
        Short s2 = (Short)this.n.a(this.b.bo.d);
        if (s2 != null && im2.d() == s2.shortValue() && this.b.bo.d == im2.c() && !this.b.bo.c(this.b)) {
            this.b.bo.a((xq)this.b, true);
        }
    }

    @Override
    public void a(je je2) {
        this.b.v();
        mm mm2 = this.d.a(this.b.ap);
        if (mm2.d(je2.c(), je2.d(), je2.e())) {
            int n2;
            int n3;
            int n4;
            aod aod2;
            ani ani2 = mm2.o(je2.c(), je2.d(), je2.e());
            if (ani2 instanceof aod && (!(aod2 = (aod)ani2).a() || aod2.b() != this.b)) {
                this.d.f("Player " + this.b.b_() + " just tried to change non-editable sign");
                return;
            }
            for (n4 = 0; n4 < 4; ++n4) {
                n3 = 1;
                if (je2.f()[n4].length() > 15) {
                    n3 = 0;
                } else {
                    for (n2 = 0; n2 < je2.f()[n4].length(); ++n2) {
                        if (t.a(je2.f()[n4].charAt(n2))) continue;
                        n3 = 0;
                    }
                }
                if (n3 != 0) continue;
                je2.f()[n4] = "!?";
            }
            if (ani2 instanceof aod) {
                n4 = je2.c();
                n3 = je2.d();
                n2 = je2.e();
                aod aod3 = (aod)ani2;
                System.arraycopy(je2.f(), 0, aod3.a, 0, 4);
                aod3.e();
                mm2.g(n4, n3, n2);
            }
        }
    }

    @Override
    public void a(it it2) {
        if (it2.c() == this.h) {
            int n2 = (int)(this.d() - this.i);
            this.b.h = (this.b.h * 3 + n2) / 4;
        }
    }

    private long d() {
        return System.nanoTime() / 1000000L;
    }

    @Override
    public void a(iy iy2) {
        this.b.bE.b = iy2.d() && this.b.bE.c;
    }

    @Override
    public void a(ih ih2) {
        ArrayList arrayList = Lists.newArrayList();
        for (String string : this.d.a(this.b, ih2.c())) {
            arrayList.add(string);
        }
        this.b.a.a(new fz(arrayList.toArray(new String[arrayList.size()])));
    }

    @Override
    public void a(il il2) {
        this.b.a(il2);
    }

    @Override
    public void a(iq iq2) {
        if ("MC|BEdit".equals(iq2.c())) {
            try {
                abu abu2 = new ep(Unpooled.wrappedBuffer((byte[])iq2.e())).c();
                if (!adc.a(abu2.q())) {
                    throw new IOException("Invalid book tag!");
                }
                abu abu3 = this.b.bm.h();
                if (abu2.b() == abv.bA && abu2.b() == abu3.b()) {
                    abu3.a("pages", abu2.q().c("pages", 8));
                }
            }
            catch (Exception exception) {
                c.error("Couldn't handle book info", (Throwable)exception);
            }
        } else if ("MC|BSign".equals(iq2.c())) {
            try {
                abu abu4 = new ep(Unpooled.wrappedBuffer((byte[])iq2.e())).c();
                if (!add.a(abu4.q())) {
                    throw new IOException("Invalid book tag!");
                }
                abu abu5 = this.b.bm.h();
                if (abu4.b() == abv.bB && abu5.b() == abv.bA) {
                    abu5.a("author", new dt(this.b.b_()));
                    abu5.a("title", new dt(abu4.q().j("title")));
                    abu5.a("pages", abu4.q().c("pages", 8));
                    abu5.a(abv.bB);
                }
            }
            catch (Exception exception) {
                c.error("Couldn't sign book", (Throwable)exception);
            }
        } else if ("MC|TrSel".equals(iq2.c())) {
            try {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(iq2.e()));
                int n2 = dataInputStream.readInt();
                yj yj2 = this.b.bo;
                if (yj2 instanceof zk) {
                    ((zk)yj2).e(n2);
                }
            }
            catch (Exception exception) {
                c.error("Couldn't select trade", (Throwable)exception);
            }
        } else if ("MC|AdvCdm".equals(iq2.c())) {
            if (!this.d.ab()) {
                this.b.a(new fi("advMode.notEnabled", new Object[0]));
            } else if (this.b.a(2, "") && this.b.bE.d) {
                try {
                    Object object;
                    ep ep2 = new ep(Unpooled.wrappedBuffer((byte[])iq2.e()));
                    byte by2 = ep2.readByte();
                    afg afg2 = null;
                    if (by2 == 0) {
                        object = this.b.o.o(ep2.readInt(), ep2.readInt(), ep2.readInt());
                        if (object instanceof ano) {
                            afg2 = ((ano)object).a();
                        }
                    } else if (by2 == 1 && (object = this.b.o.a(ep2.readInt())) instanceof we) {
                        afg2 = ((we)object).e();
                    }
                    object = ep2.c(ep2.readableBytes());
                    if (afg2 != null) {
                        afg2.a((String)object);
                        afg2.e();
                        this.b.a(new fi("advMode.setCommand.success", object));
                    }
                }
                catch (Exception exception) {
                    c.error("Couldn't set command block", (Throwable)exception);
                }
            } else {
                this.b.a(new fi("advMode.notAllowed", new Object[0]));
            }
        } else if ("MC|Beacon".equals(iq2.c())) {
            if (this.b.bo instanceof yo) {
                try {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(iq2.e()));
                    int n3 = dataInputStream.readInt();
                    int n4 = dataInputStream.readInt();
                    yo yo2 = (yo)this.b.bo;
                    zp zp2 = yo2.a(0);
                    if (zp2.e()) {
                        zp2.a(1);
                        anh anh2 = yo2.e();
                        anh2.d(n3);
                        anh2.e(n4);
                        anh2.e();
                    }
                }
                catch (Exception exception) {
                    c.error("Couldn't set beacon", (Throwable)exception);
                }
            }
        } else if ("MC|ItemName".equals(iq2.c()) && this.b.bo instanceof yl) {
            yl yl2 = (yl)this.b.bo;
            if (iq2.e() == null || iq2.e().length < 1) {
                yl2.a("");
            } else {
                String string = t.a(new String(iq2.e(), Charsets.UTF_8));
                if (string.length() <= 30) {
                    yl2.a(string);
                }
            }
        }
    }

    @Override
    public void a(ek ek2, ek ek3) {
        if (ek3 != ek.b) {
            throw new IllegalStateException("Unexpected change in protocol!");
        }
    }
}

