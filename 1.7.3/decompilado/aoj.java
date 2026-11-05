/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class aoj
extends ani {
    private ahz a;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private float m;
    private float n;
    private List o = new ArrayList();

    public aoj() {
    }

    public aoj(ahz ahz2, int n2, int n3, boolean bl2, boolean bl3) {
        this.a = ahz2;
        this.i = n2;
        this.j = n3;
        this.k = bl2;
        this.l = bl3;
    }

    public ahz a() {
        return this.a;
    }

    @Override
    public int p() {
        return this.i;
    }

    public boolean b() {
        return this.k;
    }

    public int c() {
        return this.j;
    }

    public boolean d() {
        return this.l;
    }

    public float a(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return this.n + (this.m - this.n) * f2;
    }

    public float b(float f2) {
        if (this.k) {
            return (this.a(f2) - 1.0f) * (float)q.b[this.j];
        }
        return (1.0f - this.a(f2)) * (float)q.b[this.j];
    }

    public float c(float f2) {
        if (this.k) {
            return (this.a(f2) - 1.0f) * (float)q.c[this.j];
        }
        return (1.0f - this.a(f2)) * (float)q.c[this.j];
    }

    public float d(float f2) {
        if (this.k) {
            return (this.a(f2) - 1.0f) * (float)q.d[this.j];
        }
        return (1.0f - this.a(f2)) * (float)q.d[this.j];
    }

    private void a(float f2, float f3) {
        List list;
        f2 = this.k ? 1.0f - f2 : (f2 -= 1.0f);
        ayk ayk2 = aie.M.a(this.b, this.c, this.d, this.e, this.a, f2, this.j);
        if (ayk2 != null && !(list = this.b.b(null, ayk2)).isEmpty()) {
            this.o.addAll(list);
            for (qr qr2 : this.o) {
                qr2.d(f3 * (float)q.b[this.j], f3 * (float)q.c[this.j], f3 * (float)q.d[this.j]);
            }
            this.o.clear();
        }
    }

    public void f() {
        if (this.n < 1.0f && this.b != null) {
            this.m = 1.0f;
            this.n = 1.0f;
            this.b.p(this.c, this.d, this.e);
            this.s();
            if (this.b.a(this.c, this.d, this.e) == aie.M) {
                this.b.d(this.c, this.d, this.e, this.a, this.i, 3);
                this.b.e(this.c, this.d, this.e, this.a);
            }
        }
    }

    @Override
    public void h() {
        this.n = this.m;
        if (this.n >= 1.0f) {
            this.a(1.0f, 0.25f);
            this.b.p(this.c, this.d, this.e);
            this.s();
            if (this.b.a(this.c, this.d, this.e) == aie.M) {
                this.b.d(this.c, this.d, this.e, this.a, this.i, 3);
                this.b.e(this.c, this.d, this.e, this.a);
            }
            return;
        }
        this.m += 0.5f;
        if (this.m >= 1.0f) {
            this.m = 1.0f;
        }
        if (this.k) {
            this.a(this.m, this.m - this.n + 0.0625f);
        }
    }

    @Override
    public void a(dg dg2) {
        super.a(dg2);
        this.a = ahz.e(dg2.f("blockId"));
        this.i = dg2.f("blockData");
        this.j = dg2.f("facing");
        this.n = this.m = dg2.h("progress");
        this.k = dg2.n("extending");
    }

    @Override
    public void b(dg dg2) {
        super.b(dg2);
        dg2.a("blockId", ahz.b(this.a));
        dg2.a("blockData", this.i);
        dg2.a("facing", this.j);
        dg2.a("progress", this.n);
        dg2.a("extending", this.k);
    }
}

