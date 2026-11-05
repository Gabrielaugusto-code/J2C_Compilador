/*
 * Decompiled with CFR 0.152.
 */
public class aoq {
    private int a;
    private int b;
    private int c;
    private byte[] d;
    private aom e;
    private aom f;
    private aom g;
    private aom h;

    public aoq(int n2, boolean bl2) {
        this.a = n2;
        this.d = new byte[4096];
        this.f = new aom(this.d.length, 4);
        this.g = new aom(this.d.length, 4);
        if (bl2) {
            this.h = new aom(this.d.length, 4);
        }
    }

    public ahz a(int n2, int n3, int n4) {
        int n5 = this.d[n3 << 8 | n4 << 4 | n2] & 0xFF;
        if (this.e != null) {
            n5 = this.e.a(n2, n3, n4) << 8 | n5;
        }
        return ahz.e(n5);
    }

    public void a(int n2, int n3, int n4, ahz ahz2) {
        ahz ahz3;
        int n5 = this.d[n3 << 8 | n4 << 4 | n2] & 0xFF;
        if (this.e != null) {
            n5 = this.e.a(n2, n3, n4) << 8 | n5;
        }
        if ((ahz3 = ahz.e(n5)) != aie.a) {
            --this.b;
            if (ahz3.t()) {
                --this.c;
            }
        }
        if (ahz2 != aie.a) {
            ++this.b;
            if (ahz2.t()) {
                ++this.c;
            }
        }
        int n6 = ahz.b(ahz2);
        this.d[n3 << 8 | n4 << 4 | n2] = (byte)(n6 & 0xFF);
        if (n6 > 255) {
            if (this.e == null) {
                this.e = new aom(this.d.length, 4);
            }
            this.e.a(n2, n3, n4, (n6 & 0xF00) >> 8);
        } else if (this.e != null) {
            this.e.a(n2, n3, n4, 0);
        }
    }

    public int b(int n2, int n3, int n4) {
        return this.f.a(n2, n3, n4);
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.f.a(n2, n3, n4, n5);
    }

    public boolean a() {
        return this.b == 0;
    }

    public boolean b() {
        return this.c > 0;
    }

    public int d() {
        return this.a;
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.h.a(n2, n3, n4, n5);
    }

    public int c(int n2, int n3, int n4) {
        return this.h.a(n2, n3, n4);
    }

    public void c(int n2, int n3, int n4, int n5) {
        this.g.a(n2, n3, n4, n5);
    }

    public int d(int n2, int n3, int n4) {
        return this.g.a(n2, n3, n4);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (int i3 = 0; i3 < 16; ++i3) {
                for (int i4 = 0; i4 < 16; ++i4) {
                    ahz ahz2 = this.a(i2, i3, i4);
                    if (ahz2 == aie.a) continue;
                    ++this.b;
                    if (!ahz2.t()) continue;
                    ++this.c;
                }
            }
        }
    }

    public byte[] g() {
        return this.d;
    }

    public void h() {
        this.e = null;
    }

    public aom i() {
        return this.e;
    }

    public aom j() {
        return this.f;
    }

    public aom k() {
        return this.g;
    }

    public aom l() {
        return this.h;
    }

    public void a(byte[] byArray) {
        this.d = byArray;
    }

    public void a(aom aom2) {
        this.e = aom2;
    }

    public void b(aom aom2) {
        this.f = aom2;
    }

    public void c(aom aom2) {
        this.g = aom2;
    }

    public void d(aom aom2) {
        this.h = aom2;
    }

    public aom m() {
        this.e = new aom(this.d.length, 4);
        return this.e;
    }
}

