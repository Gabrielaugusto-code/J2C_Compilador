/*
 * Decompiled with CFR 0.152.
 */
public class ady
implements adx {
    private int a;
    private int b;
    private abu[] c;
    private abu d;
    private boolean e;

    public ady(int n2, int n3, abu[] abuArray, abu abu2) {
        this.a = n2;
        this.b = n3;
        this.c = abuArray;
        this.d = abu2;
    }

    @Override
    public abu b() {
        return this.d;
    }

    @Override
    public boolean a(yv yv2, afs afs2) {
        for (int i2 = 0; i2 <= 3 - this.a; ++i2) {
            for (int i3 = 0; i3 <= 3 - this.b; ++i3) {
                if (this.a(yv2, i2, i3, true)) {
                    return true;
                }
                if (!this.a(yv2, i2, i3, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(yv yv2, int n2, int n3, boolean bl2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                abu abu2;
                int n4 = i2 - n2;
                int n5 = i3 - n3;
                abu abu3 = null;
                if (n4 >= 0 && n5 >= 0 && n4 < this.a && n5 < this.b) {
                    abu3 = bl2 ? this.c[this.a - n4 - 1 + n5 * this.a] : this.c[n4 + n5 * this.a];
                }
                if ((abu2 = yv2.b(i2, i3)) == null && abu3 == null) continue;
                if (abu2 == null && abu3 != null || abu2 != null && abu3 == null) {
                    return false;
                }
                if (abu3.b() != abu2.b()) {
                    return false;
                }
                if (abu3.k() == Short.MAX_VALUE || abu3.k() == abu2.k()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public abu a(yv yv2) {
        abu abu2 = this.b().m();
        if (this.e) {
            for (int i2 = 0; i2 < yv2.a(); ++i2) {
                abu abu3 = yv2.a(i2);
                if (abu3 == null || !abu3.p()) continue;
                abu2.d((dg)abu3.d.b());
            }
        }
        return abu2;
    }

    @Override
    public int a() {
        return this.a * this.b;
    }

    public ady c() {
        this.e = true;
        return this;
    }
}

