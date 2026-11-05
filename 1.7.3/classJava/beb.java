/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class beb
extends bee {
    private static final brq u = new brq("textures/gui/container/creative_inventory/tabs.png");
    private static py v = new py("tmp", true, 45);
    private static int w = aak.b.a();
    private float x;
    private boolean y;
    private boolean z;
    private baw A;
    private List B;
    private zp C;
    private boolean D;
    private bea E;

    public beb(xq xq2) {
        super(new bec(xq2));
        xq2.bo = this.h;
        this.p = true;
        this.g = 136;
        this.f = 195;
    }

    @Override
    public void c() {
        if (!this.k.c.h()) {
            this.k.a(new bek(this.k.h));
        }
    }

    @Override
    protected void a(zp zp2, int n2, int n3, int n4) {
        this.D = true;
        boolean bl2 = n4 == 1;
        int n5 = n4 = n2 == -999 && n4 == 0 ? 4 : n4;
        if (zp2 != null || w == aak.m.a() || n4 == 5) {
            if (zp2 == this.C && bl2) {
                for (int i2 = 0; i2 < this.k.h.bn.a().size(); ++i2) {
                    this.k.c.a(null, i2);
                }
            } else if (w == aak.m.a()) {
                if (zp2 == this.C) {
                    this.k.h.bm.b((abu)null);
                } else if (n4 == 4 && zp2 != null && zp2.e()) {
                    abu abu2 = zp2.a(n3 == 0 ? 1 : zp2.d().e());
                    this.k.h.a(abu2, true);
                    this.k.c.a(abu2);
                } else if (n4 == 4 && this.k.h.bm.o() != null) {
                    this.k.h.a(this.k.h.bm.o(), true);
                    this.k.c.a(this.k.h.bm.o());
                    this.k.h.bm.b((abu)null);
                } else {
                    this.k.h.bn.a(zp2 == null ? n2 : bed.a((bed)((bed)zp2)).g, n3, n4, (xq)this.k.h);
                    this.k.h.bn.b();
                }
            } else if (n4 != 5 && zp2.f == v) {
                xo xo2 = this.k.h.bm;
                abu abu3 = xo2.o();
                abu abu4 = zp2.d();
                if (n4 == 2) {
                    if (abu4 != null && n3 >= 0 && n3 < 9) {
                        abu abu5 = abu4.m();
                        abu5.b = abu5.e();
                        this.k.h.bm.a(n3, abu5);
                        this.k.h.bn.b();
                    }
                    return;
                }
                if (n4 == 3) {
                    if (xo2.o() == null && zp2.e()) {
                        abu abu6 = zp2.d().m();
                        abu6.b = abu6.e();
                        xo2.b(abu6);
                    }
                    return;
                }
                if (n4 == 4) {
                    if (abu4 != null) {
                        abu abu7 = abu4.m();
                        abu7.b = n3 == 0 ? 1 : abu7.e();
                        this.k.h.a(abu7, true);
                        this.k.c.a(abu7);
                    }
                    return;
                }
                if (abu3 != null && abu4 != null && abu3.a(abu4)) {
                    if (n3 == 0) {
                        if (bl2) {
                            abu3.b = abu3.e();
                        } else if (abu3.b < abu3.e()) {
                            ++abu3.b;
                        }
                    } else if (abu3.b <= 1) {
                        xo2.b((abu)null);
                    } else {
                        --abu3.b;
                    }
                } else if (abu4 == null || abu3 != null) {
                    xo2.b((abu)null);
                } else {
                    xo2.b(abu.b(abu4));
                    abu3 = xo2.o();
                    if (bl2) {
                        abu3.b = abu3.e();
                    }
                }
            } else {
                this.h.a(zp2 == null ? n2 : zp2.g, n3, n4, (xq)this.k.h);
                if (yj.c(n3) == 2) {
                    for (int i3 = 0; i3 < 9; ++i3) {
                        this.k.c.a(this.h.a(45 + i3).d(), 36 + i3);
                    }
                } else if (zp2 != null) {
                    abu abu8 = this.h.a(zp2.g).d();
                    this.k.c.a(abu8, zp2.g - this.h.c.size() + 9 + 36);
                }
            }
        } else {
            xo xo3 = this.k.h.bm;
            if (xo3.o() != null) {
                if (n3 == 0) {
                    this.k.h.a(xo3.o(), true);
                    this.k.c.a(xo3.o());
                    xo3.b((abu)null);
                }
                if (n3 == 1) {
                    abu abu9 = xo3.o().a(1);
                    this.k.h.a(abu9, true);
                    this.k.c.a(abu9);
                    if (xo3.o().b == 0) {
                        xo3.b((abu)null);
                    }
                }
            }
        }
    }

    @Override
    public void r_() {
        if (this.k.c.h()) {
            super.r_();
            this.n.clear();
            Keyboard.enableRepeatEvents((boolean)true);
            this.A = new baw(this.q, this.i + 82, this.r + 6, 89, this.q.a);
            this.A.f(15);
            this.A.a(false);
            this.A.e(false);
            this.A.g(0xFFFFFF);
            int n2 = w;
            w = -1;
            this.b(aak.a[n2]);
            this.E = new bea(this.k);
            this.k.h.bn.a(this.E);
        } else {
            this.k.a(new bek(this.k.h));
        }
    }

    @Override
    public void b() {
        super.b();
        if (this.k.h != null && this.k.h.bm != null) {
            this.k.h.bn.b(this.E);
        }
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    protected void a(char c2, int n2) {
        if (w != aak.g.a()) {
            if (bac.a(this.k.u.ah)) {
                this.b(aak.g);
            } else {
                super.a(c2, n2);
            }
            return;
        }
        if (this.D) {
            this.D = false;
            this.A.a("");
        }
        if (this.a(n2)) {
            return;
        }
        if (this.A.a(c2, n2)) {
            this.i();
        } else {
            super.a(c2, n2);
        }
    }

    private void i() {
        bec bec2 = (bec)this.h;
        bec2.a.clear();
        for (abs abs2 : abs.e) {
            if (abs2 == null || abs2.n_() == null) continue;
            abs2.a(abs2, null, bec2.a);
        }
        for (aek aek2 : aek.b) {
            if (aek2 == null || aek2.C == null) continue;
            abv.bR.a(aek2, bec2.a);
        }
        Iterator iterator = bec2.a.iterator();
        String string = this.A.b().toLowerCase();
        while (iterator.hasNext()) {
            abu abu2 = (abu)iterator.next();
            boolean bl2 = false;
            for (String string2 : abu2.a((xq)this.k.h, this.k.u.w)) {
                if (!string2.toLowerCase().contains(string)) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            iterator.remove();
        }
        this.x = 0.0f;
        bec2.a(0.0f);
    }

    @Override
    protected void b(int n2, int n3) {
        aak aak2 = aak.a[w];
        if (aak2.h()) {
            GL11.glDisable((int)3042);
            this.q.b(bsc.a(aak2.c(), new Object[0]), 8, 6, 0x404040);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.i;
            int n6 = n3 - this.r;
            for (aak aak2 : aak.a) {
                if (!this.a(aak2, n5, n6)) continue;
                return;
            }
        }
        super.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        if (n4 == 0) {
            int n5 = n2 - this.i;
            int n6 = n3 - this.r;
            for (aak aak2 : aak.a) {
                if (!this.a(aak2, n5, n6)) continue;
                this.b(aak2);
                return;
            }
        }
        super.b(n2, n3, n4);
    }

    private boolean p() {
        return w != aak.m.a() && aak.a[w].j() && ((bec)this.h).e();
    }

    private void b(aak aak2) {
        int n2 = w;
        w = aak2.a();
        bec bec2 = (bec)this.h;
        this.s.clear();
        bec2.a.clear();
        aak2.a(bec2.a);
        if (aak2 == aak.m) {
            yj yj2 = this.k.h.bn;
            if (this.B == null) {
                this.B = bec2.c;
            }
            bec2.c = new ArrayList();
            for (int i2 = 0; i2 < yj2.c.size(); ++i2) {
                int n3;
                int n4;
                int n5;
                bed bed2 = new bed(this, (zp)yj2.c.get(i2), i2);
                bec2.c.add(bed2);
                if (i2 >= 5 && i2 < 9) {
                    n5 = i2 - 5;
                    n4 = n5 / 2;
                    n3 = n5 % 2;
                    bed2.h = 9 + n4 * 54;
                    bed2.i = 6 + n3 * 27;
                    continue;
                }
                if (i2 >= 0 && i2 < 5) {
                    bed2.i = -2000;
                    bed2.h = -2000;
                    continue;
                }
                if (i2 >= yj2.c.size()) continue;
                n5 = i2 - 9;
                n4 = n5 % 9;
                n3 = n5 / 9;
                bed2.h = 9 + n4 * 18;
                bed2.i = i2 >= 36 ? 112 : 54 + n3 * 18;
            }
            this.C = new zp(v, 0, 173, 112);
            bec2.c.add(this.C);
        } else if (n2 == aak.m.a()) {
            bec2.c = this.B;
            this.B = null;
        }
        if (this.A != null) {
            if (aak2 == aak.g) {
                this.A.e(true);
                this.A.d(false);
                this.A.b(true);
                this.A.a("");
                this.i();
            } else {
                this.A.e(false);
                this.A.d(true);
                this.A.b(false);
            }
        }
        this.x = 0.0f;
        bec2.a(0.0f);
    }

    @Override
    public void d() {
        super.d();
        int n2 = Mouse.getEventDWheel();
        if (n2 != 0 && this.p()) {
            int n3 = ((bec)this.h).a.size() / 9 - 5 + 1;
            if (n2 > 0) {
                n2 = 1;
            }
            if (n2 < 0) {
                n2 = -1;
            }
            this.x = (float)((double)this.x - (double)n2 / (double)n3);
            if (this.x < 0.0f) {
                this.x = 0.0f;
            }
            if (this.x > 1.0f) {
                this.x = 1.0f;
            }
            ((bec)this.h).a(this.x);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        boolean bl2 = Mouse.isButtonDown((int)0);
        int n4 = this.i;
        int n5 = this.r;
        int n6 = n4 + 175;
        int n7 = n5 + 18;
        int n8 = n6 + 14;
        int n9 = n7 + 112;
        if (!this.z && bl2 && n2 >= n6 && n3 >= n7 && n2 < n8 && n3 < n9) {
            this.y = this.p();
        }
        if (!bl2) {
            this.y = false;
        }
        this.z = bl2;
        if (this.y) {
            this.x = ((float)(n3 - n7) - 7.5f) / ((float)(n9 - n7) - 15.0f);
            if (this.x < 0.0f) {
                this.x = 0.0f;
            }
            if (this.x > 1.0f) {
                this.x = 1.0f;
            }
            ((bec)this.h).a(this.x);
        }
        super.a(n2, n3, f2);
        for (aak aak2 : aak.a) {
            if (this.b(aak2, n2, n3)) break;
        }
        if (this.C != null && w == aak.m.a() && this.c(this.C.h, this.C.i, 16, 16, n2, n3)) {
            this.a(bsc.a("inventory.binSlot", new Object[0]), n2, n3);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glDisable((int)2896);
    }

    @Override
    protected void a(abu abu2, int n2, int n3) {
        if (w == aak.g.a()) {
            Map map;
            List list = abu2.a((xq)this.k.h, this.k.u.w);
            aak aak2 = abu2.b().n_();
            if (aak2 == null && abu2.b() == abv.bR && (map = aem.a(abu2)).size() == 1) {
                aek aek2 = aek.b[(Integer)map.keySet().iterator().next()];
                for (aak aak3 : aak.a) {
                    if (!aak3.a(aek2.C)) continue;
                    aak2 = aak3;
                    break;
                }
            }
            if (aak2 != null) {
                list.add(1, "" + (Object)((Object)a.r) + (Object)((Object)a.j) + bsc.a(aak2.c(), new Object[0]));
            }
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (i2 == 0) {
                    list.set(i2, (Object)((Object)abu2.w().e) + (String)list.get(i2));
                    continue;
                }
                list.set(i2, (Object)((Object)a.h) + (String)list.get(i2));
            }
            this.a(list, n2, n3);
        } else {
            super.a(abu2, n2, n3);
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        azg.c();
        aak aak2 = aak.a[w];
        for (aak aak3 : aak.a) {
            this.k.P().a(u);
            if (aak3.a() == w) continue;
            this.a(aak3);
        }
        this.k.P().a(new brq("textures/gui/container/creative_inventory/tab_" + aak2.g()));
        this.b(this.i, this.r, 0, 0, this.f, this.g);
        this.A.f();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        int n4 = this.i + 175;
        int n5 = this.r + 18;
        int n6 = n5 + 112;
        this.k.P().a(u);
        if (aak2.j()) {
            this.b(n4, n5 + (int)((float)(n6 - n5 - 17) * this.x), 232 + (this.p() ? 0 : 12), 0, 12, 15);
        }
        this.a(aak2);
        if (aak2 == aak.m) {
            bek.a(this.i + 43, this.r + 45, 20, this.i + 43 - n2, this.r + 45 - 30 - n3, this.k.h);
        }
    }

    protected boolean a(aak aak2, int n2, int n3) {
        int n4 = aak2.l();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.f - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = aak2.m() ? (n6 -= 32) : (n6 += this.g);
        return n2 >= n5 && n2 <= n5 + 28 && n3 >= n6 && n3 <= n6 + 32;
    }

    protected boolean b(aak aak2, int n2, int n3) {
        int n4 = aak2.l();
        int n5 = 28 * n4;
        int n6 = 0;
        if (n4 == 5) {
            n5 = this.f - 28 + 2;
        } else if (n4 > 0) {
            n5 += n4;
        }
        n6 = aak2.m() ? (n6 -= 32) : (n6 += this.g);
        if (this.c(n5 + 3, n6 + 3, 23, 27, n2, n3)) {
            this.a(bsc.a(aak2.c(), new Object[0]), n2, n3);
            return true;
        }
        return false;
    }

    protected void a(aak aak2) {
        boolean bl2 = aak2.a() == w;
        boolean bl3 = aak2.m();
        int n2 = aak2.l();
        int n3 = n2 * 28;
        int n4 = 0;
        int n5 = this.i + 28 * n2;
        int n6 = this.r;
        int n7 = 32;
        if (bl2) {
            n4 += 32;
        }
        if (n2 == 5) {
            n5 = this.i + this.f - 28;
        } else if (n2 > 0) {
            n5 += n2;
        }
        if (bl3) {
            n6 -= 28;
        } else {
            n4 += 64;
            n6 += this.g - 4;
        }
        GL11.glDisable((int)2896);
        this.b(n5, n6, n3, n4, 28, n7);
        this.e = 100.0f;
        beb.j.f = 100.0f;
        int n8 = bl3 ? 1 : -1;
        GL11.glEnable((int)2896);
        GL11.glEnable((int)32826);
        abu abu2 = aak2.d();
        j.b(this.q, this.k.P(), abu2, n5 += 6, n6 += 8 + n8);
        j.c(this.q, this.k.P(), abu2, n5, n6);
        GL11.glDisable((int)2896);
        beb.j.f = 0.0f;
        this.e = 0.0f;
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 0) {
            this.k.a(new bcy(this, this.k.h.m()));
        }
        if (bau2.k == 1) {
            this.k.a(new bcz(this, this.k.h.m()));
        }
    }

    public int g() {
        return w;
    }

    static /* synthetic */ py h() {
        return v;
    }
}

