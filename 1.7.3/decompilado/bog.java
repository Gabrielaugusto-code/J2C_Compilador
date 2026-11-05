/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.GL11;

public class bog {
    private Map q = new HashMap();
    public static bog a = new bog();
    private ban r;
    public static double b;
    public static double c;
    public static double d;
    public bqy e;
    public bmr f;
    public afs g;
    public rm h;
    public qr i;
    public float j;
    public float k;
    public bac l;
    public double m;
    public double n;
    public double o;
    public static boolean p;

    private bog() {
        this.q.put(wp.class, new bny());
        this.q.put(xe.class, new bpo());
        this.q.put(vf.class, new bph(new bip(), new bip(0.5f), 0.7f));
        this.q.put(vg.class, new bpj(new bit(), new bis(), 0.7f));
        this.q.put(uy.class, new boa(new bid(), 0.7f));
        this.q.put(vd.class, new bpe(new bid(), 0.7f));
        this.q.put(vm.class, new bpx(new bjj(), new bjj(), 0.5f));
        this.q.put(ux.class, new bnz(new bic(), 0.3f));
        this.q.put(ve.class, new bpf(new bio(), 0.4f));
        this.q.put(xb.class, new bpk());
        this.q.put(wq.class, new bob());
        this.q.put(wr.class, new bof());
        this.q.put(vi.class, new bpn());
        this.q.put(xc.class, new bpl());
        this.q.put(xg.class, new bpu());
        this.q.put(wo.class, new bnw());
        this.q.put(xh.class, new bpy());
        this.q.put(xd.class, new bpm(new biz(16), new biz(0), 0.25f));
        this.q.put(ww.class, new box());
        this.q.put(xq.class, new bpi());
        this.q.put(wv.class, new bon(new bjk(), 0.5f, 6.0f));
        this.q.put(wu.class, new bom());
        this.q.put(vj.class, new bpp(new bjc(), 0.7f));
        this.q.put(xm.class, new bpt());
        this.q.put(vk.class, new bps());
        this.q.put(uv.class, new bnv());
        this.q.put(vr.class, new boe());
        this.q.put(vq.class, new bod());
        this.q.put(vt.class, new bpv());
        this.q.put(qr.class, new boc());
        this.q.put(rs.class, new bpg());
        this.q.put(rk.class, new boq());
        this.q.put(rl.class, new boy());
        this.q.put(xt.class, new bnu());
        this.q.put(ya.class, new bow(abv.ay));
        this.q.put(yd.class, new bow(abv.bi));
        this.q.put(xu.class, new bow(abv.bv));
        this.q.put(yc.class, new bow(abv.aK));
        this.q.put(yf.class, new bow(abv.bn, 16384));
        this.q.put(ye.class, new bow(abv.by));
        this.q.put(xw.class, new bow(abv.bP));
        this.q.put(xx.class, new bok(2.0f));
        this.q.put(xz.class, new bok(0.5f));
        this.q.put(yg.class, new bpw());
        this.q.put(wb.class, new bor());
        this.q.put(rh.class, new boi());
        this.q.put(wn.class, new bpr());
        this.q.put(wa.class, new boj());
        this.q.put(wm.class, new bpq());
        this.q.put(wk.class, new bpc());
        this.q.put(wc.class, new bpb());
        this.q.put(vz.class, new bnx());
        this.q.put(vv.class, new bol());
        this.q.put(uz.class, new boo(new bin(), 0.75f));
        this.q.put(vy.class, new boz());
        for (boh boh2 : this.q.values()) {
            boh2.a(this);
        }
    }

    public boh a(Class clazz) {
        boh boh2 = (boh)this.q.get(clazz);
        if (boh2 == null && clazz != qr.class) {
            boh2 = this.a(clazz.getSuperclass());
            this.q.put(clazz, boh2);
        }
        return boh2;
    }

    public boh a(qr qr2) {
        return this.a(qr2.getClass());
    }

    public void a(afs afs2, bqy bqy2, ban ban2, rm rm2, qr qr2, bac bac2, float f2) {
        this.g = afs2;
        this.e = bqy2;
        this.l = bac2;
        this.h = rm2;
        this.i = qr2;
        this.r = ban2;
        if (rm2.bl()) {
            ahz ahz2 = afs2.a(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
            if (ahz2 == aie.C) {
                int n2 = afs2.e(oy.c(rm2.s), oy.c(rm2.t), oy.c(rm2.u));
                int n3 = n2 & 3;
                this.j = n3 * 90 + 180;
                this.k = 0.0f;
            }
        } else {
            this.j = rm2.A + (rm2.y - rm2.A) * f2;
            this.k = rm2.B + (rm2.z - rm2.B) * f2;
        }
        if (bac2.ax == 2) {
            this.j += 180.0f;
        }
        this.m = rm2.S + (rm2.s - rm2.S) * (double)f2;
        this.n = rm2.T + (rm2.t - rm2.T) * (double)f2;
        this.o = rm2.U + (rm2.u - rm2.U) * (double)f2;
    }

    public boolean a(qr qr2, float f2) {
        return this.a(qr2, f2, false);
    }

    public boolean a(qr qr2, float f2, boolean bl2) {
        if (qr2.aa == 0) {
            qr2.S = qr2.s;
            qr2.T = qr2.t;
            qr2.U = qr2.u;
        }
        double d2 = qr2.S + (qr2.s - qr2.S) * (double)f2;
        double d3 = qr2.T + (qr2.t - qr2.T) * (double)f2;
        double d4 = qr2.U + (qr2.u - qr2.U) * (double)f2;
        float f3 = qr2.A + (qr2.y - qr2.A) * f2;
        int n2 = qr2.c(f2);
        if (qr2.ak()) {
            n2 = 0xF000F0;
        }
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        bwg.a(bwg.c, (float)n3 / 1.0f, (float)n4 / 1.0f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return this.a(qr2, d2 - b, d3 - c, d4 - d, f3, f2, bl2);
    }

    public boolean a(qr qr2, double d2, double d3, double d4, float f2, float f3) {
        return this.a(qr2, d2, d3, d4, f2, f3, false);
    }

    public boolean a(qr qr2, double d2, double d3, double d4, float f2, float f3, boolean bl2) {
        block10: {
            boh boh2 = null;
            try {
                boh2 = this.a(qr2);
                if (boh2 != null && this.e != null) {
                    if (boh2.a() && !bl2) break block10;
                    try {
                        boh2.a(qr2, d2, d3, d4, f2, f3);
                    }
                    catch (Throwable throwable) {
                        throw new s(b.a(throwable, "Rendering entity in world"));
                    }
                    try {
                        boh2.b(qr2, d2, d3, d4, f2, f3);
                    }
                    catch (Throwable throwable) {
                        throw new s(b.a(throwable, "Post-rendering entity in world"));
                    }
                    if (!p || qr2.ao() || bl2) break block10;
                    try {
                        this.b(qr2, d2, d3, d4, f2, f3);
                        break block10;
                    }
                    catch (Throwable throwable) {
                        throw new s(b.a(throwable, "Rendering entity hitbox in world"));
                    }
                }
                if (this.e != null) {
                    return false;
                }
            }
            catch (Throwable throwable) {
                b b2 = b.a(throwable, "Rendering entity in world");
                k k2 = b2.a("Entity being rendered");
                qr2.a(k2);
                k k3 = b2.a("Renderer details");
                k3.a("Assigned renderer", boh2);
                k3.a("Location", k.a(d2, d3, d4));
                k3.a("Rotation", Float.valueOf(f2));
                k3.a("Delta", Float.valueOf(f3));
                throw new s(b2);
            }
        }
        return true;
    }

    private void b(qr qr2, double d2, double d3, double d4, float f2, float f3) {
        GL11.glDepthMask((boolean)false);
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glDisable((int)2884);
        GL11.glDisable((int)3042);
        float f4 = qr2.M / 2.0f;
        ayk ayk2 = ayk.a().a(d2 - (double)f4, d3, d4 - (double)f4, d2 + (double)f4, d3 + (double)qr2.N, d4 + (double)f4);
        bmt.a(ayk2, 0xFFFFFF);
        GL11.glEnable((int)3553);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)2884);
        GL11.glDisable((int)3042);
        GL11.glDepthMask((boolean)true);
    }

    public void a(afs afs2) {
        this.g = afs2;
    }

    public double a(double d2, double d3, double d4) {
        double d5 = d2 - this.m;
        double d6 = d3 - this.n;
        double d7 = d4 - this.o;
        return d5 * d5 + d6 * d6 + d7 * d7;
    }

    public ban a() {
        return this.r;
    }

    public void a(px px2) {
        for (boh boh2 : this.q.values()) {
            boh2.a(px2);
        }
    }
}

