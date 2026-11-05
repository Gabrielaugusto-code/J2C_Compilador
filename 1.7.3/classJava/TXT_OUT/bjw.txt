/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.client.ClientBrandRetriever;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bjw
implements fm {
    private static final Logger d = LogManager.getLogger();
    private final ef e;
    private azi f;
    private bka g;
    private boolean h;
    public ayh a = new ayh(null);
    private Map i = new HashMap();
    public List b = new ArrayList();
    public int c = 20;
    private bcl j;
    private boolean k = false;
    private Random l = new Random();

    public bjw(azi azi2, bcl bcl2, ef ef2) {
        this.f = azi2;
        this.j = bcl2;
        this.e = ef2;
    }

    public void c() {
        this.g = null;
    }

    @Override
    public void a() {
    }

    @Override
    public void a(gu gu2) {
        this.f.c = new bjz(this.f, this);
        this.g = new bka(this, new aga(0L, gu2.e(), false, gu2.d(), gu2.i()), gu2.f(), gu2.g(), this.f.z);
        this.g.E = true;
        this.f.a(this.g);
        this.f.h.ap = gu2.f();
        this.f.a(new bcj(this));
        this.f.h.d(gu2.c());
        this.c = gu2.h();
        this.f.c.a(gu2.e());
        this.f.u.c();
        this.e.a(new iq("MC|Brand", ClientBrandRetriever.getClientModName().getBytes(Charsets.UTF_8)), new GenericFutureListener[0]);
    }

    @Override
    public void a(fn fn2) {
        qr[] qrArray;
        double d2 = (double)fn2.d() / 32.0;
        double d3 = (double)fn2.e() / 32.0;
        double d4 = (double)fn2.f() / 32.0;
        qr qr2 = null;
        if (fn2.l() == 10) {
            qr2 = wc.a(this.g, d2, d3, d4, fn2.m());
        } else if (fn2.l() == 90) {
            qrArray = this.g.a(fn2.m());
            if (qrArray instanceof xq) {
                qr2 = new vv(this.g, d2, d3, d4, (xq)qrArray);
            }
            fn2.g(0);
        } else if (fn2.l() == 60) {
            qr2 = new xt(this.g, d2, d3, d4);
        } else if (fn2.l() == 61) {
            qr2 = new ya(this.g, d2, d3, d4);
        } else if (fn2.l() == 71) {
            qr2 = new rk(this.g, (int)d2, (int)d3, (int)d4, fn2.m());
            fn2.g(0);
        } else if (fn2.l() == 77) {
            qr2 = new rl(this.g, (int)d2, (int)d3, (int)d4);
            fn2.g(0);
        } else if (fn2.l() == 65) {
            qr2 = new yd(this.g, d2, d3, d4);
        } else if (fn2.l() == 72) {
            qr2 = new xu(this.g, d2, d3, d4);
        } else if (fn2.l() == 76) {
            qr2 = new xw(this.g, d2, d3, d4, null);
        } else if (fn2.l() == 63) {
            qr2 = new xx(this.g, d2, d3, d4, (double)fn2.g() / 8000.0, (double)fn2.h() / 8000.0, (double)fn2.i() / 8000.0);
            fn2.g(0);
        } else if (fn2.l() == 64) {
            qr2 = new xz(this.g, d2, d3, d4, (double)fn2.g() / 8000.0, (double)fn2.h() / 8000.0, (double)fn2.i() / 8000.0);
            fn2.g(0);
        } else if (fn2.l() == 66) {
            qr2 = new yg(this.g, d2, d3, d4, (double)fn2.g() / 8000.0, (double)fn2.h() / 8000.0, (double)fn2.i() / 8000.0);
            fn2.g(0);
        } else if (fn2.l() == 62) {
            qr2 = new yc(this.g, d2, d3, d4);
        } else if (fn2.l() == 73) {
            qr2 = new yf((afs)this.g, d2, d3, d4, fn2.m());
            fn2.g(0);
        } else if (fn2.l() == 75) {
            qr2 = new ye(this.g, d2, d3, d4);
            fn2.g(0);
        } else if (fn2.l() == 1) {
            qr2 = new vz(this.g, d2, d3, d4);
        } else if (fn2.l() == 50) {
            qr2 = new wn(this.g, d2, d3, d4, null);
        } else if (fn2.l() == 51) {
            qr2 = new vq(this.g, d2, d3, d4);
        } else if (fn2.l() == 2) {
            qr2 = new wb(this.g, d2, d3, d4);
        } else if (fn2.l() == 70) {
            qr2 = new wa(this.g, d2, d3, d4, ahz.e(fn2.m() & 0xFFFF), fn2.m() >> 16);
            fn2.g(0);
        }
        if (qr2 != null) {
            qr2.bZ = fn2.d();
            qr2.ca = fn2.e();
            qr2.cb = fn2.f();
            qr2.z = (float)(fn2.j() * 360) / 256.0f;
            qr2.y = (float)(fn2.k() * 360) / 256.0f;
            qrArray = qr2.as();
            if (qrArray != null) {
                int n2 = fn2.c() - qr2.x();
                for (int i2 = 0; i2 < qrArray.length; ++i2) {
                    qrArray[i2].d(qrArray[i2].x() + n2);
                }
            }
            qr2.d(fn2.c());
            this.g.a(fn2.c(), qr2);
            if (fn2.m() > 0) {
                qr qr3;
                if (fn2.l() == 60 && (qr3 = this.g.a(fn2.m())) instanceof rm) {
                    xt xt2 = (xt)qr2;
                    xt2.c = qr3;
                }
                qr2.i((double)fn2.g() / 8000.0, (double)fn2.h() / 8000.0, (double)fn2.i() / 8000.0);
            }
        }
    }

    @Override
    public void a(fo fo2) {
        rh rh2 = new rh(this.g, fo2.d(), fo2.e(), fo2.f(), fo2.g());
        rh2.bZ = fo2.d();
        rh2.ca = fo2.e();
        rh2.cb = fo2.f();
        rh2.y = 0.0f;
        rh2.z = 0.0f;
        rh2.d(fo2.c());
        this.g.a(fo2.c(), (qr)rh2);
    }

    @Override
    public void a(fp fp2) {
        double d2 = (double)fp2.d() / 32.0;
        double d3 = (double)fp2.e() / 32.0;
        double d4 = (double)fp2.f() / 32.0;
        vy vy2 = null;
        if (fp2.g() == 1) {
            vy2 = new vy(this.g, d2, d3, d4);
        }
        if (vy2 != null) {
            vy2.bZ = fp2.d();
            vy2.ca = fp2.e();
            vy2.cb = fp2.f();
            vy2.y = 0.0f;
            vy2.z = 0.0f;
            vy2.d(fp2.c());
            this.g.c(vy2);
        }
    }

    @Override
    public void a(fr fr2) {
        rs rs2 = new rs(this.g, fr2.d(), fr2.e(), fr2.f(), fr2.g(), fr2.h());
        this.g.a(fr2.c(), (qr)rs2);
    }

    @Override
    public void a(hp hp2) {
        qr qr2 = this.g.a(hp2.c());
        if (qr2 == null) {
            return;
        }
        qr2.i((double)hp2.d() / 8000.0, (double)hp2.e() / 8000.0, (double)hp2.f() / 8000.0);
    }

    @Override
    public void a(hn hn2) {
        qr qr2 = this.g.a(hn2.d());
        if (qr2 != null && hn2.c() != null) {
            qr2.y().a(hn2.c());
        }
    }

    @Override
    public void a(fs fs2) {
        double d2 = (double)fs2.f() / 32.0;
        double d3 = (double)fs2.g() / 32.0;
        double d4 = (double)fs2.h() / 32.0;
        float f2 = (float)(fs2.i() * 360) / 256.0f;
        float f3 = (float)(fs2.j() * 360) / 256.0f;
        bme bme2 = new bme(this.f.f, fs2.e());
        bme2.bZ = fs2.f();
        bme2.p = bme2.S = (double)bme2.bZ;
        bme2.ca = fs2.g();
        bme2.q = bme2.T = (double)bme2.ca;
        bme2.cb = fs2.h();
        bme2.r = bme2.U = (double)bme2.cb;
        int n2 = fs2.k();
        bme2.bm.a[bme2.bm.c] = n2 == 0 ? null : new abu(abs.d(n2), 1, 0);
        bme2.a(d2, d3, d4, f2, f3);
        this.g.a(fs2.d(), (qr)bme2);
        List list = fs2.c();
        if (list != null) {
            bme2.y().a(list);
        }
    }

    @Override
    public void a(ia ia2) {
        qr qr2 = this.g.a(ia2.c());
        if (qr2 == null) {
            return;
        }
        qr2.bZ = ia2.d();
        qr2.ca = ia2.e();
        qr2.cb = ia2.f();
        double d2 = (double)qr2.bZ / 32.0;
        double d3 = (double)qr2.ca / 32.0 + 0.015625;
        double d4 = (double)qr2.cb / 32.0;
        float f2 = (float)(ia2.g() * 360) / 256.0f;
        float f3 = (float)(ia2.h() * 360) / 256.0f;
        qr2.a(d2, d3, d4, f2, f3, 3);
    }

    @Override
    public void a(hl hl2) {
        if (hl2.c() >= 0 && hl2.c() < xo.i()) {
            this.f.h.bm.c = hl2.c();
        }
    }

    @Override
    public void a(gw gw2) {
        qr qr2 = gw2.a(this.g);
        if (qr2 == null) {
            return;
        }
        qr2.bZ += gw2.c();
        qr2.ca += gw2.d();
        qr2.cb += gw2.e();
        double d2 = (double)qr2.bZ / 32.0;
        double d3 = (double)qr2.ca / 32.0;
        double d4 = (double)qr2.cb / 32.0;
        float f2 = gw2.h() ? (float)(gw2.f() * 360) / 256.0f : qr2.y;
        float f3 = gw2.h() ? (float)(gw2.g() * 360) / 256.0f : qr2.z;
        qr2.a(d2, d3, d4, f2, f3, 3);
    }

    @Override
    public void a(hk hk2) {
        qr qr2 = hk2.a(this.g);
        if (qr2 == null) {
            return;
        }
        float f2 = (float)(hk2.c() * 360) / 256.0f;
        qr2.e(f2);
    }

    @Override
    public void a(hh hh2) {
        for (int i2 = 0; i2 < hh2.c().length; ++i2) {
            this.g.b(hh2.c()[i2]);
        }
    }

    @Override
    public void a(fl fl2) {
        bkf bkf2 = this.f.h;
        double d2 = fl2.c();
        double d3 = fl2.d();
        double d4 = fl2.e();
        float f2 = fl2.f();
        float f3 = fl2.g();
        bkf2.V = 0.0f;
        bkf2.x = 0.0;
        bkf2.w = 0.0;
        bkf2.v = 0.0;
        bkf2.a(d2, d3, d4, f2, f3);
        this.e.a(new iw(bkf2.s, bkf2.C.b, bkf2.t, bkf2.u, fl2.f(), fl2.g(), fl2.h()), new GenericFutureListener[0]);
        if (!this.h) {
            this.f.h.p = this.f.h.s;
            this.f.h.q = this.f.h.t;
            this.f.h.r = this.f.h.u;
            this.h = true;
            this.f.a((bcl)null);
        }
    }

    @Override
    public void a(gb gb2) {
        int n2 = gb2.c().a * 16;
        int n3 = gb2.c().b * 16;
        if (gb2.d() == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(gb2.d()));
        try {
            for (int i2 = 0; i2 < gb2.e(); ++i2) {
                short s2 = dataInputStream.readShort();
                short s3 = dataInputStream.readShort();
                int n4 = s3 >> 4 & 0xFFF;
                int n5 = s3 & 0xF;
                int n6 = s2 >> 12 & 0xF;
                int n7 = s2 >> 8 & 0xF;
                int n8 = s2 & 0xFF;
                this.g.c(n6 + n2, n8, n7 + n3, ahz.e(n4), n5);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    @Override
    public void a(go go2) {
        if (go2.i()) {
            if (go2.g() != 0) {
                this.g.a(go2.e(), go2.f(), true);
            } else {
                this.g.a(go2.e(), go2.f(), false);
                return;
            }
        }
        this.g.a(go2.e() << 4, 0, go2.f() << 4, (go2.e() << 4) + 15, 256, (go2.f() << 4) + 15);
        aoo aoo2 = this.g.e(go2.e(), go2.f());
        aoo2.a(go2.d(), go2.g(), go2.h(), go2.i());
        this.g.c(go2.e() << 4, 0, go2.f() << 4, (go2.e() << 4) + 15, 256, (go2.f() << 4) + 15);
        if (!go2.i() || !(this.g.t instanceof aph)) {
            aoo2.n();
        }
    }

    @Override
    public void a(fy fy2) {
        this.g.c(fy2.d(), fy2.e(), fy2.f(), fy2.c(), fy2.g());
    }

    @Override
    public void a(gj gj2) {
        this.e.a(gj2.c());
    }

    @Override
    public void a(fa fa2) {
        this.f.a((bka)null);
        if (this.j != null) {
            this.f.a(new bfa(this.j, "disconnect.lost", fa2));
        } else {
            this.f.a(new bbu(new bgt(new bct()), "disconnect.lost", fa2));
        }
    }

    public void a(fk fk2) {
        this.e.a(fk2, new GenericFutureListener[0]);
    }

    @Override
    public void a(hz hz2) {
        qr qr2 = this.g.a(hz2.c());
        rm rm2 = (rm)this.g.a(hz2.d());
        if (rm2 == null) {
            rm2 = this.f.h;
        }
        if (qr2 != null) {
            if (qr2 instanceof rh) {
                this.g.a(qr2, "random.orb", 0.2f, ((this.l.nextFloat() - this.l.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            } else {
                this.g.a(qr2, "random.pop", 0.2f, ((this.l.nextFloat() - this.l.nextFloat()) * 0.7f + 1.0f) * 2.0f);
            }
            this.f.k.a(new blv((afs)this.f.f, qr2, rm2, -0.5f));
            this.g.b(hz2.c());
        }
    }

    @Override
    public void a(ga ga2) {
        this.f.r.b().a(ga2.c());
    }

    @Override
    public void a(ft ft2) {
        qr qr2 = this.g.a(ft2.c());
        if (qr2 == null) {
            return;
        }
        if (ft2.d() == 0) {
            rm rm2 = (rm)qr2;
            rm2.aZ();
        } else if (ft2.d() == 1) {
            qr2.ai();
        } else if (ft2.d() == 2) {
            xq xq2 = (xq)qr2;
            xq2.a(false, false, false);
        } else if (ft2.d() == 4) {
            this.f.k.a(new bkq(this.f.f, qr2));
        } else if (ft2.d() == 5) {
            bkq bkq2 = new bkq(this.f.f, qr2, "magicCrit");
            this.f.k.a(bkq2);
        }
    }

    @Override
    public void a(hg hg2) {
        hg2.a(this.g).a(hg2.c(), hg2.d(), hg2.e());
    }

    @Override
    public void a(fq fq2) {
        double d2 = (double)fq2.f() / 32.0;
        double d3 = (double)fq2.g() / 32.0;
        double d4 = (double)fq2.h() / 32.0;
        float f2 = (float)(fq2.l() * 360) / 256.0f;
        float f3 = (float)(fq2.m() * 360) / 256.0f;
        rm rm2 = (rm)qx.a(fq2.e(), (afs)this.f.f);
        rm2.bZ = fq2.f();
        rm2.ca = fq2.g();
        rm2.cb = fq2.h();
        rm2.aO = (float)(fq2.n() * 360) / 256.0f;
        qr[] qrArray = rm2.as();
        if (qrArray != null) {
            int n2 = fq2.d() - rm2.x();
            for (int i2 = 0; i2 < qrArray.length; ++i2) {
                qrArray[i2].d(qrArray[i2].x() + n2);
            }
        }
        rm2.d(fq2.d());
        rm2.a(d2, d3, d4, f2, f3);
        rm2.v = (float)fq2.i() / 8000.0f;
        rm2.w = (float)fq2.j() / 8000.0f;
        rm2.x = (float)fq2.k() / 8000.0f;
        this.g.a(fq2.d(), (qr)rm2);
        List list = fq2.c();
        if (list != null) {
            rm2.y().a(list);
        }
    }

    @Override
    public void a(hx hx2) {
        this.f.f.a(hx2.c());
        this.f.f.b(hx2.d());
    }

    @Override
    public void a(hw hw2) {
        this.f.h.a(new r(hw2.c(), hw2.d(), hw2.e()), true);
        this.f.f.N().a(hw2.c(), hw2.d(), hw2.e());
    }

    @Override
    public void a(ho ho2) {
        qr qr2 = this.g.a(ho2.d());
        qr qr3 = this.g.a(ho2.e());
        if (ho2.c() == 0) {
            boolean bl2 = false;
            if (ho2.d() == this.f.h.x()) {
                qr2 = this.f.h;
                if (qr3 instanceof vz) {
                    ((vz)qr3).a(false);
                }
                bl2 = qr2.m == null && qr3 != null;
            } else if (qr3 instanceof vz) {
                ((vz)qr3).a(true);
            }
            if (qr2 == null) {
                return;
            }
            qr2.a(qr3);
            if (bl2) {
                bac bac2 = this.f.u;
                this.f.r.a(bsc.a("mount.onboard", bac.c(bac2.aa.i())), false);
            }
        } else if (ho2.c() == 1 && qr2 != null && qr2 instanceof rn) {
            if (qr3 != null) {
                ((rn)qr2).b(qr3, false);
            } else {
                ((rn)qr2).a(false, false);
            }
        }
    }

    @Override
    public void a(gk gk2) {
        qr qr2 = gk2.a(this.g);
        if (qr2 != null) {
            qr2.a(gk2.c());
        }
    }

    @Override
    public void a(hs hs2) {
        this.f.h.n(hs2.c());
        this.f.h.bP().a(hs2.d());
        this.f.h.bP().b(hs2.e());
    }

    @Override
    public void a(hr hr2) {
        this.f.h.a(hr2.c(), hr2.d(), hr2.e());
    }

    @Override
    public void a(hj hj2) {
        if (hj2.c() != this.f.h.ap) {
            this.h = false;
            ayw ayw2 = this.g.X();
            this.g = new bka(this, new aga(0L, hj2.e(), false, this.f.f.N().t(), hj2.f()), hj2.c(), hj2.d(), this.f.z);
            this.g.a(ayw2);
            this.g.E = true;
            this.f.a(this.g);
            this.f.h.ap = hj2.c();
            this.f.a(new bcj(this));
        }
        this.f.a(hj2.c());
        this.f.c.a(hj2.e());
    }

    @Override
    public void a(gl gl2) {
        afn afn2 = new afn(this.f.f, null, gl2.f(), gl2.g(), gl2.h(), gl2.i());
        afn2.h = gl2.j();
        afn2.a(true);
        this.f.h.v += (double)gl2.c();
        this.f.h.w += (double)gl2.d();
        this.f.h.x += (double)gl2.e();
    }

    @Override
    public void a(ge ge2) {
        bkf bkf2 = this.f.h;
        switch (ge2.d()) {
            case 0: {
                bkf2.a(new py(ge2.e(), ge2.g(), ge2.f()));
                bkf2.bo.d = ge2.c();
                break;
            }
            case 9: {
                anz anz2 = new anz();
                if (ge2.g()) {
                    anz2.a(ge2.e());
                }
                bkf2.a(anz2);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 2: {
                anx anx2 = new anx();
                if (ge2.g()) {
                    anx2.a(ge2.e());
                }
                bkf2.a(anx2);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 5: {
                anm anm2 = new anm();
                if (ge2.g()) {
                    anm2.a(ge2.e());
                }
                bkf2.a(anm2);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 10: {
                ant ant2 = new ant();
                if (ge2.g()) {
                    ant2.a(ge2.e());
                }
                bkf2.a(ant2);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 3: {
                ans ans2 = new ans();
                if (ge2.g()) {
                    ans2.a(ge2.e());
                }
                bkf2.a(ans2);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 1: {
                bkf2.b(oy.c(bkf2.s), oy.c(bkf2.t), oy.c(bkf2.u));
                bkf2.bo.d = ge2.c();
                break;
            }
            case 4: {
                bkf2.a(oy.c(bkf2.s), oy.c(bkf2.t), oy.c(bkf2.u), ge2.g() ? ge2.e() : null);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 6: {
                bkf2.a(new xk(bkf2), ge2.g() ? ge2.e() : null);
                bkf2.bo.d = ge2.c();
                break;
            }
            case 7: {
                anh anh2 = new anh();
                bkf2.a(anh2);
                if (ge2.g()) {
                    anh2.a(ge2.e());
                }
                bkf2.bo.d = ge2.c();
                break;
            }
            case 8: {
                bkf2.c(oy.c(bkf2.s), oy.c(bkf2.t), oy.c(bkf2.u));
                bkf2.bo.d = ge2.c();
                break;
            }
            case 11: {
                qr qr2 = this.g.a(ge2.h());
                if (qr2 == null || !(qr2 instanceof uz)) break;
                bkf2.a((uz)qr2, new yk(ge2.e(), ge2.g(), ge2.f()));
                bkf2.bo.d = ge2.c();
            }
        }
    }

    @Override
    public void a(gh gh2) {
        bkf bkf2 = this.f.h;
        if (gh2.c() == -1) {
            bkf2.bm.b(gh2.e());
        } else {
            Object object;
            boolean bl2 = false;
            if (this.f.n instanceof beb) {
                object = (beb)this.f.n;
                boolean bl3 = bl2 = ((beb)object).g() != aak.m.a();
            }
            if (gh2.c() == 0 && gh2.d() >= 36 && gh2.d() < 45) {
                object = bkf2.bn.a(gh2.d()).d();
                if (gh2.e() != null && (object == null || ((abu)object).b < gh2.e().b)) {
                    gh2.e().c = 5;
                }
                bkf2.bn.a(gh2.d(), gh2.e());
            } else if (!(gh2.c() != bkf2.bo.d || gh2.c() == 0 && bl2)) {
                bkf2.bo.a(gh2.d(), gh2.e());
            }
        }
    }

    @Override
    public void a(gc gc2) {
        yj yj2 = null;
        bkf bkf2 = this.f.h;
        if (gc2.c() == 0) {
            yj2 = bkf2.bn;
        } else if (gc2.c() == bkf2.bo.d) {
            yj2 = bkf2.bo;
        }
        if (yj2 != null && !gc2.e()) {
            this.a(new im(gc2.c(), gc2.d(), true));
        }
    }

    @Override
    public void a(gf gf2) {
        bkf bkf2 = this.f.h;
        if (gf2.c() == 0) {
            bkf2.bn.a(gf2.d());
        } else if (gf2.c() == bkf2.bo.d) {
            bkf2.bo.a(gf2.d());
        }
    }

    @Override
    public void a(ha ha2) {
        ani ani2 = this.g.o(ha2.c(), ha2.d(), ha2.e());
        if (ani2 == null) {
            ani2 = new aod();
            ani2.a(this.g);
            ani2.c = ha2.c();
            ani2.d = ha2.d();
            ani2.e = ha2.e();
        }
        this.f.h.a(ani2);
    }

    @Override
    public void a(hy hy2) {
        ani ani2;
        boolean bl2 = false;
        if (this.f.f.d(hy2.c(), hy2.d(), hy2.e()) && (ani2 = this.f.f.o(hy2.c(), hy2.d(), hy2.e())) instanceof aod) {
            aod aod2 = (aod)ani2;
            if (aod2.a()) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    aod2.a[i2] = hy2.f()[i2];
                }
                aod2.e();
            }
            bl2 = true;
        }
        if (!bl2 && this.f.h != null) {
            this.f.h.a(new fh("Unable to locate sign at " + hy2.c() + ", " + hy2.d() + ", " + hy2.e()));
        }
    }

    @Override
    public void a(fw fw2) {
        ani ani2;
        if (this.f.f.d(fw2.c(), fw2.d(), fw2.e()) && (ani2 = this.f.f.o(fw2.c(), fw2.d(), fw2.e())) != null) {
            if (fw2.f() == 1 && ani2 instanceof aoa) {
                ani2.a(fw2.g());
            } else if (fw2.f() == 2 && ani2 instanceof ano) {
                ani2.a(fw2.g());
            } else if (fw2.f() == 3 && ani2 instanceof anh) {
                ani2.a(fw2.g());
            } else if (fw2.f() == 4 && ani2 instanceof aoe) {
                ani2.a(fw2.g());
            } else if (fw2.f() == 5 && ani2 instanceof anw) {
                ani2.a(fw2.g());
            }
        }
    }

    @Override
    public void a(gg gg2) {
        bkf bkf2 = this.f.h;
        if (bkf2.bo != null && bkf2.bo.d == gg2.c()) {
            bkf2.bo.b(gg2.d(), gg2.e());
        }
    }

    @Override
    public void a(hq hq2) {
        qr qr2 = this.g.a(hq2.d());
        if (qr2 != null) {
            qr2.c(hq2.e(), hq2.c());
        }
    }

    @Override
    public void a(gd gd2) {
        this.f.h.b();
    }

    @Override
    public void a(fx fx2) {
        this.f.f.c(fx2.d(), fx2.e(), fx2.f(), fx2.c(), fx2.g(), fx2.h());
    }

    @Override
    public void a(fv fv2) {
        this.f.f.d(fv2.c(), fv2.d(), fv2.e(), fv2.f(), fv2.g());
    }

    @Override
    public void a(gq gq2) {
        for (int i2 = 0; i2 < gq2.d(); ++i2) {
            int n2 = gq2.a(i2);
            int n3 = gq2.b(i2);
            this.g.a(n2, n3, true);
            this.g.a(n2 << 4, 0, n3 << 4, (n2 << 4) + 15, 256, (n3 << 4) + 15);
            aoo aoo2 = this.g.e(n2, n3);
            aoo2.a(gq2.c(i2), gq2.e()[i2], gq2.f()[i2], true);
            this.g.c(n2 << 4, 0, n3 << 4, (n2 << 4) + 15, 256, (n3 << 4) + 15);
            if (this.g.t instanceof aph) continue;
            aoo2.n();
        }
    }

    @Override
    public void a(gm gm2) {
        bkf bkf2 = this.f.h;
        int n2 = gm2.c();
        float f2 = gm2.d();
        int n3 = oy.d(f2 + 0.5f);
        if (n2 >= 0 && n2 < gm.a.length && gm.a[n2] != null) {
            ((xq)bkf2).b(new fi(gm.a[n2], new Object[0]));
        }
        if (n2 == 1) {
            this.g.N().b(true);
            this.g.k(0.0f);
        } else if (n2 == 2) {
            this.g.N().b(false);
            this.g.k(1.0f);
        } else if (n2 == 3) {
            this.f.c.a(agb.a(n3));
        } else if (n2 == 4) {
            this.f.a(new bcw());
        } else if (n2 == 5) {
            bac bac2 = this.f.u;
            if (f2 == 0.0f) {
                this.f.a(new bbs());
            } else if (f2 == 101.0f) {
                this.f.r.b().a(new fi("demo.help.movement", bac.c(bac2.V.i()), bac.c(bac2.W.i()), bac.c(bac2.X.i()), bac.c(bac2.Y.i())));
            } else if (f2 == 102.0f) {
                this.f.r.b().a(new fi("demo.help.jump", bac.c(bac2.Z.i())));
            } else if (f2 == 103.0f) {
                this.f.r.b().a(new fi("demo.help.inventory", bac.c(bac2.ab.i())));
            }
        } else if (n2 == 6) {
            this.g.a(bkf2.s, bkf2.t + (double)bkf2.g(), bkf2.u, "random.successful_hit", 0.18f, 0.45f, false);
        } else if (n2 == 7) {
            this.g.k(f2);
        } else if (n2 == 8) {
            this.g.i(f2);
        }
    }

    @Override
    public void a(gv gv2) {
        awz awz2 = aby.a(gv2.c(), this.f.f);
        awz2.a(gv2.d());
        this.f.p.i().a(awz2);
    }

    @Override
    public void a(gr gr2) {
        if (gr2.c()) {
            this.f.f.b(gr2.d(), gr2.f(), gr2.g(), gr2.h(), gr2.e());
        } else {
            this.f.f.c(gr2.d(), gr2.f(), gr2.g(), gr2.h(), gr2.e());
        }
    }

    @Override
    public void a(fu fu2) {
        boolean bl2 = false;
        for (Map.Entry entry : fu2.c().entrySet()) {
            ny ny2 = (ny)entry.getKey();
            int n2 = (Integer)entry.getValue();
            if (ny2.d() && n2 > 0) {
                if (this.k && this.f.h.m().a(ny2) == 0) {
                    ns ns2 = (ns)ny2;
                    this.f.q.a(ns2);
                    this.f.Z().a(new buj(ns2), 0L);
                    if (ny2 == nt.f) {
                        this.f.u.H = false;
                        this.f.u.b();
                    }
                }
                bl2 = true;
            }
            this.f.h.m().a(this.f.h, ny2, n2);
        }
        if (!this.k && !bl2 && this.f.u.H) {
            this.f.q.b(nt.f);
        }
        this.k = true;
        if (this.f.n instanceof bdh) {
            ((bdh)((Object)this.f.n)).g();
        }
    }

    @Override
    public void a(id id2) {
        qr qr2 = this.g.a(id2.d());
        if (!(qr2 instanceof rm)) {
            return;
        }
        qn qn2 = new qn(id2.e(), id2.g(), id2.f());
        qn2.b(id2.c());
        ((rm)qr2).c(qn2);
    }

    @Override
    public void a(hi hi2) {
        qr qr2 = this.g.a(hi2.c());
        if (qr2 instanceof rm) {
            ((rm)qr2).l(hi2.d());
        }
    }

    @Override
    public void a(hf hf2) {
        bkg bkg2 = (bkg)this.i.get(hf2.c());
        if (bkg2 == null && hf2.d()) {
            bkg2 = new bkg(hf2.c());
            this.i.put(hf2.c(), bkg2);
            this.b.add(bkg2);
        }
        if (bkg2 != null && !hf2.d()) {
            this.i.remove(hf2.c());
            this.b.remove(bkg2);
        }
        if (bkg2 != null && hf2.d()) {
            bkg2.b = hf2.e();
        }
    }

    @Override
    public void a(gn gn2) {
        this.a(new it(gn2.c()));
    }

    @Override
    public void a(ek ek2, ek ek3) {
        throw new IllegalStateException("Unexpected protocol change!");
    }

    @Override
    public void a(hb hb2) {
        bkf bkf2 = this.f.h;
        bkf2.bE.b = hb2.d();
        bkf2.bE.d = hb2.f();
        bkf2.bE.a = hb2.c();
        bkf2.bE.c = hb2.e();
        bkf2.bE.a(hb2.g());
        bkf2.bE.b(hb2.h());
    }

    @Override
    public void a(fz fz2) {
        String[] stringArray = fz2.c();
        if (this.f.n instanceof bbj) {
            bbj bbj2 = (bbj)this.f.n;
            bbj2.a(stringArray);
        }
    }

    @Override
    public void a(gt gt2) {
        this.f.f.a(gt2.d(), gt2.e(), gt2.f(), gt2.c(), gt2.g(), gt2.h(), false);
    }

    @Override
    public void a(gi gi2) {
        if ("MC|TrList".equals(gi2.c())) {
            ByteBuf byteBuf = Unpooled.wrappedBuffer((byte[])gi2.d());
            try {
                int n2 = byteBuf.readInt();
                bcl bcl2 = this.f.n;
                if (bcl2 != null && bcl2 instanceof bel && n2 == this.f.h.bo.d) {
                    afd afd2 = ((bel)bcl2).g();
                    aff aff2 = aff.b(new ep(byteBuf));
                    afd2.a(aff2);
                }
            }
            catch (IOException iOException) {
                d.error("Couldn't load trade info", (Throwable)iOException);
            }
        } else if ("MC|Brand".equals(gi2.c())) {
            this.f.h.b(new String(gi2.d(), Charsets.UTF_8));
        } else if ("MC|RPack".equals(gi2.c())) {
            String string = new String(gi2.d(), Charsets.UTF_8);
            if (this.f.u.r) {
                if (this.f.E() != null && this.f.E().b()) {
                    this.f.R().a(string);
                } else if (this.f.E() == null || this.f.E().c()) {
                    this.f.a(new bbl(new bjx(this, string), bsc.a("multiplayer.texturePrompt.line1", new Object[0]), bsc.a("multiplayer.texturePrompt.line2", new Object[0]), 0));
                }
            }
        }
    }

    @Override
    public void a(ht ht2) {
        ayw ayw2 = this.g.X();
        if (ht2.e() == 0) {
            ayr ayr2 = ayw2.a(ht2.c(), azb.b);
            ayr2.a(ht2.d());
        } else {
            ayr ayr3 = ayw2.b(ht2.c());
            if (ht2.e() == 1) {
                ayw2.k(ayr3);
            } else if (ht2.e() == 2) {
                ayr3.a(ht2.d());
            }
        }
    }

    @Override
    public void a(hv hv2) {
        ayw ayw2 = this.g.X();
        ayr ayr2 = ayw2.b(hv2.d());
        if (hv2.f() == 0) {
            ayt ayt2 = ayw2.a(hv2.c(), ayr2);
            ayt2.c(hv2.e());
        } else if (hv2.f() == 1) {
            ayw2.c(hv2.c());
        }
    }

    @Override
    public void a(hm hm2) {
        ayw ayw2 = this.g.X();
        if (hm2.d().length() == 0) {
            ayw2.a(hm2.c(), null);
        } else {
            ayr ayr2 = ayw2.b(hm2.d());
            ayw2.a(hm2.c(), ayr2);
        }
    }

    @Override
    public void a(hu hu2) {
        ayw ayw2 = this.g.X();
        ays ays2 = hu2.h() == 0 ? ayw2.f(hu2.c()) : ayw2.e(hu2.c());
        if (hu2.h() == 0 || hu2.h() == 2) {
            ays2.a(hu2.d());
            ays2.b(hu2.e());
            ays2.c(hu2.f());
            ays2.a(hu2.i());
        }
        if (hu2.h() == 0 || hu2.h() == 3) {
            for (String string : hu2.g()) {
                ayw2.a(string, hu2.c());
            }
        }
        if (hu2.h() == 4) {
            for (String string : hu2.g()) {
                ayw2.a(string, ays2);
            }
        }
        if (hu2.h() == 1) {
            ayw2.d(ays2);
        }
    }

    @Override
    public void a(gs gs2) {
        if (gs2.k() == 0) {
            double d2 = gs2.j() * gs2.g();
            double d3 = gs2.j() * gs2.h();
            double d4 = gs2.j() * gs2.i();
            this.g.a(gs2.c(), gs2.d(), gs2.e(), gs2.f(), d2, d3, d4);
        } else {
            for (int i2 = 0; i2 < gs2.k(); ++i2) {
                double d5 = this.l.nextGaussian() * (double)gs2.g();
                double d6 = this.l.nextGaussian() * (double)gs2.h();
                double d7 = this.l.nextGaussian() * (double)gs2.i();
                double d8 = this.l.nextGaussian() * (double)gs2.j();
                double d9 = this.l.nextGaussian() * (double)gs2.j();
                double d10 = this.l.nextGaussian() * (double)gs2.j();
                this.g.a(gs2.c(), gs2.d() + d5, gs2.e() + d6, gs2.f() + d7, d8, d9, d10);
            }
        }
    }

    @Override
    public void a(ib ib2) {
        qr qr2 = this.g.a(ib2.c());
        if (qr2 == null) {
            return;
        }
        if (!(qr2 instanceof rm)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + qr2 + ")");
        }
        sc sc2 = ((rm)qr2).bb();
        for (ic ic2 : ib2.d()) {
            rz rz2 = sc2.a(ic2.a());
            if (rz2 == null) {
                rz2 = sc2.b(new sf(ic2.a(), 0.0, Double.MIN_NORMAL, Double.MAX_VALUE));
            }
            rz2.a(ic2.b());
            rz2.d();
            for (sa sa2 : ic2.c()) {
                rz2.a(sa2);
            }
        }
    }

    public ef b() {
        return this.e;
    }
}

