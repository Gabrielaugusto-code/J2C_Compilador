/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class us {
    private afs a;
    private boolean b;
    private int c = -1;
    private int d;
    private int e;
    private uq f;
    private int g;
    private int h;
    private int i;

    public us(afs afs2) {
        this.a = afs2;
    }

    public void a() {
        boolean bl2 = false;
        if (bl2) {
            if (this.c == 2) {
                this.d = 100;
                return;
            }
        } else {
            if (this.a.w()) {
                this.c = 0;
                return;
            }
            if (this.c == 2) {
                return;
            }
            if (this.c == 0) {
                float f2 = this.a.c(0.0f);
                if ((double)f2 < 0.5 || (double)f2 > 0.501) {
                    return;
                }
                this.c = this.a.s.nextInt(10) == 0 ? 1 : 2;
                this.b = false;
                if (this.c == 2) {
                    return;
                }
            }
        }
        if (!this.b) {
            if (this.b()) {
                this.b = true;
            } else {
                return;
            }
        }
        if (this.e > 0) {
            --this.e;
            return;
        }
        this.e = 2;
        if (this.d > 0) {
            this.c();
            --this.d;
        } else {
            this.c = 2;
        }
    }

    private boolean b() {
        List list = this.a.h;
        for (xq xq2 : list) {
            this.f = this.a.A.a((int)xq2.s, (int)xq2.t, (int)xq2.u, 1);
            if (this.f == null || this.f.c() < 10 || this.f.d() < 20 || this.f.e() < 20) continue;
            r r2 = this.f.a();
            float f2 = this.f.b();
            boolean bl2 = false;
            for (int i2 = 0; i2 < 10; ++i2) {
                this.g = r2.a + (int)((double)(oy.b(this.a.s.nextFloat() * (float)Math.PI * 2.0f) * f2) * 0.9);
                this.h = r2.b;
                this.i = r2.c + (int)((double)(oy.a(this.a.s.nextFloat() * (float)Math.PI * 2.0f) * f2) * 0.9);
                bl2 = false;
                for (uq uq2 : this.a.A.b()) {
                    if (uq2 == this.f || !uq2.a(this.g, this.h, this.i)) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) break;
            }
            if (bl2) {
                return false;
            }
            ayp ayp2 = this.a(this.g, this.h, this.i);
            if (ayp2 == null) continue;
            this.e = 0;
            this.d = 20;
            return true;
        }
        return false;
    }

    private boolean c() {
        xh xh2;
        ayp ayp2 = this.a(this.g, this.h, this.i);
        if (ayp2 == null) {
            return false;
        }
        try {
            xh2 = new xh(this.a);
            xh2.a((rp)null);
            xh2.j(false);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        xh2.b(ayp2.c, ayp2.d, ayp2.e, this.a.s.nextFloat() * 360.0f, 0.0f);
        this.a.d(xh2);
        r r2 = this.f.a();
        xh2.a(r2.a, r2.b, r2.c, this.f.b());
        return true;
    }

    private ayp a(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < 10; ++i2) {
            int n5;
            int n6;
            int n7 = n2 + this.a.s.nextInt(16) - 8;
            if (!this.f.a(n7, n6 = n3 + this.a.s.nextInt(6) - 3, n5 = n4 + this.a.s.nextInt(16) - 8) || !agf.a(ro.a, this.a, n7, n6, n5)) continue;
            this.a.V().a(n7, n6, n5);
        }
        return null;
    }
}

