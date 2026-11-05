/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class bmh {
    private bnb y;
    public afs a;
    private int z = -1;
    private static bna A = bna.a;
    public static int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean[] m = new boolean[2];
    public int n;
    public int o;
    public int p;
    public boolean q;
    public ayk r;
    public int s;
    public boolean t = true;
    public boolean u;
    public int v;
    public boolean w;
    private boolean B;
    public List x = new ArrayList();
    private List C;
    private int D;

    public bmh(afs afs2, List list, int n2, int n3, int n4, int n5) {
        this.a = afs2;
        this.y = null;
        this.C = list;
        this.z = n5;
        this.c = -999;
        this.a(n2, n3, n4);
        this.q = false;
    }

    public void a(int n2, int n3, int n4) {
        if (n2 == this.c && n3 == this.d && n4 == this.e) {
            return;
        }
        this.a();
        this.c = n2;
        this.d = n3;
        this.e = n4;
        this.n = n2 + 8;
        this.o = n3 + 8;
        this.p = n4 + 8;
        this.i = n2 & 0x3FF;
        this.j = n3;
        this.k = n4 & 0x3FF;
        this.f = n2 - this.i;
        this.g = n3 - this.j;
        this.h = n4 - this.k;
        float f2 = 6.0f;
        this.r = ayk.a((float)n2 - f2, (float)n3 - f2, (float)n4 - f2, (float)(n2 + 16) + f2, (float)(n3 + 16) + f2, (float)(n4 + 16) + f2);
        GL11.glNewList((int)(this.z + 2), (int)4864);
        bor.a(ayk.a().a((float)this.i - f2, (float)this.j - f2, (float)this.k - f2, (float)(this.i + 16) + f2, (float)(this.j + 16) + f2, (float)(this.k + 16) + f2));
        GL11.glEndList();
        this.e();
    }

    private void f() {
        GL11.glTranslatef((float)this.i, (float)this.j, (float)this.k);
    }

    public void a(rm rm2) {
        Object object;
        if (!this.q) {
            return;
        }
        this.q = false;
        int n2 = this.c;
        int n3 = this.d;
        int n4 = this.e;
        int n5 = this.c + 16;
        int n6 = this.d + 16;
        int n7 = this.e + 16;
        for (int i2 = 0; i2 < 2; ++i2) {
            this.m[i2] = true;
        }
        aoo.a = false;
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.x);
        this.x.clear();
        azi azi2 = azi.B();
        rm rm3 = azi2.i;
        int n8 = oy.c(rm3.s);
        int n9 = oy.c(rm3.t);
        int n10 = oy.c(rm3.u);
        int n11 = 1;
        agi agi2 = new agi(this.a, n2 - n11, n3 - n11, n4 - n11, n5 + n11, n6 + n11, n7 + n11, n11);
        if (!agi2.T()) {
            ++b;
            object = new bmf(agi2);
            this.D = 0;
            this.y = null;
            for (int i3 = 0; i3 < 2; ++i3) {
                boolean bl2 = false;
                boolean bl3 = false;
                boolean bl4 = false;
                for (int i4 = n3; i4 < n6; ++i4) {
                    for (int i5 = n4; i5 < n7; ++i5) {
                        for (int i6 = n2; i6 < n5; ++i6) {
                            int n12;
                            ani ani2;
                            ahz ahz2 = agi2.a(i6, i4, i5);
                            if (ahz2.o() == avk.a) continue;
                            if (!bl4) {
                                bl4 = true;
                                this.b(i3);
                            }
                            if (i3 == 0 && ahz2.u() && bnd.a.a(ani2 = agi2.o(i6, i4, i5))) {
                                this.x.add(ani2);
                            }
                            if ((n12 = ahz2.w()) > i3) {
                                bl2 = true;
                                continue;
                            }
                            if (n12 != i3) continue;
                            bl3 |= ((bmf)object).b(ahz2, i6, i4, i5);
                            if (ahz2.b() != 0 || i6 != n8 || i4 != n9 || i5 != n10) continue;
                            ((bmf)object).a(true);
                            ((bmf)object).b(true);
                            ((bmf)object).b(ahz2, i6, i4, i5);
                            ((bmf)object).a(false);
                            ((bmf)object).b(false);
                        }
                    }
                }
                if (bl3) {
                    this.m[i3] = false;
                }
                if (bl4) {
                    this.a(i3, rm2);
                } else {
                    bl3 = false;
                }
                if (!bl2) break;
            }
        }
        object = new HashSet();
        object.addAll(this.x);
        object.removeAll(hashSet);
        this.C.addAll(object);
        hashSet.removeAll(this.x);
        this.C.removeAll(hashSet);
        this.w = aoo.a;
        this.B = true;
    }

    private void b(int n2) {
        GL11.glNewList((int)(this.z + n2), (int)4864);
        GL11.glPushMatrix();
        this.f();
        float f2 = 1.000001f;
        GL11.glTranslatef((float)-8.0f, (float)-8.0f, (float)-8.0f);
        GL11.glScalef((float)f2, (float)f2, (float)f2);
        GL11.glTranslatef((float)8.0f, (float)8.0f, (float)8.0f);
        A.b();
        A.b((double)(-this.c), (double)(-this.d), (double)(-this.e));
    }

    private void a(int n2, rm rm2) {
        if (n2 == 1 && !this.m[n2]) {
            this.y = A.a((float)rm2.s, (float)rm2.t, (float)rm2.u);
        }
        this.D += A.a();
        GL11.glPopMatrix();
        GL11.glEndList();
        A.b(0.0, 0.0, 0.0);
    }

    public void b(rm rm2) {
        if (this.y == null || this.m[1]) {
            return;
        }
        this.b(1);
        A.a(this.y);
        this.a(1, rm2);
    }

    public float a(qr qr2) {
        float f2 = (float)(qr2.s - (double)this.n);
        float f3 = (float)(qr2.t - (double)this.o);
        float f4 = (float)(qr2.u - (double)this.p);
        return f2 * f2 + f3 * f3 + f4 * f4;
    }

    public void a() {
        for (int i2 = 0; i2 < 2; ++i2) {
            this.m[i2] = true;
        }
        this.l = false;
        this.B = false;
        this.y = null;
    }

    public void b() {
        this.a();
        this.a = null;
    }

    public int a(int n2) {
        if (!this.l) {
            return -1;
        }
        if (!this.m[n2]) {
            return this.z + n2;
        }
        return -1;
    }

    public void a(bno bno2) {
        this.l = bno2.a(this.r);
    }

    public void c() {
        GL11.glCallList((int)(this.z + 2));
    }

    public boolean d() {
        if (!this.B) {
            return false;
        }
        return this.m[0] && this.m[1];
    }

    public void e() {
        this.q = true;
    }
}

