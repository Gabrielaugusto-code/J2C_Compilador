/*
 * Decompiled with CFR 0.152.
 */
public abstract class apf {
    public static final float[] a = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    public afs b;
    public agd c;
    public String d;
    public ags e;
    public boolean f;
    public boolean g;
    public float[] h = new float[16];
    public int i;
    private float[] j = new float[4];

    public final void a(afs afs2) {
        this.b = afs2;
        this.c = afs2.N().u();
        this.d = afs2.N().y();
        this.b();
        this.a();
    }

    protected void a() {
        float f2 = 0.0f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.h[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * (1.0f - f2) + f2;
        }
    }

    protected void b() {
        if (this.b.N().u() == agd.c) {
            arj arj2 = arj.a(this.b.N().y());
            this.e = new agv(agl.d(arj2.a()), 0.5f);
        } else {
            this.e = new ags(this.b);
        }
    }

    public aol c() {
        if (this.c == agd.c) {
            return new apl(this.b, this.b.H(), this.b.N().s(), this.d);
        }
        return new apq(this.b, this.b.H(), this.b.N().s());
    }

    public boolean a(int n2, int n3) {
        return this.b.b(n2, n3) == aie.c;
    }

    public float a(long l2, float f2) {
        int n2 = (int)(l2 % 24000L);
        float f3 = ((float)n2 + f2) / 24000.0f - 0.25f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        float f4 = f3;
        f3 = 1.0f - (float)((Math.cos((double)f3 * Math.PI) + 1.0) / 2.0);
        f3 = f4 + (f3 - f4) / 3.0f;
        return f3;
    }

    public int a(long l2) {
        return (int)(l2 / 24000L % 8L + 8L) % 8;
    }

    public boolean d() {
        return true;
    }

    public float[] a(float f2, float f3) {
        float f4;
        float f5 = 0.4f;
        float f6 = oy.b(f2 * (float)Math.PI * 2.0f) - 0.0f;
        if (f6 >= (f4 = -0.0f) - f5 && f6 <= f4 + f5) {
            float f7 = (f6 - f4) / f5 * 0.5f + 0.5f;
            float f8 = 1.0f - (1.0f - oy.a(f7 * (float)Math.PI)) * 0.99f;
            f8 *= f8;
            this.j[0] = f7 * 0.3f + 0.7f;
            this.j[1] = f7 * f7 * 0.7f + 0.2f;
            this.j[2] = f7 * f7 * 0.0f + 0.2f;
            this.j[3] = f8;
            return this.j;
        }
        return null;
    }

    public ayp b(float f2, float f3) {
        float f4 = oy.b(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float f5 = 0.7529412f;
        float f6 = 0.84705883f;
        float f7 = 1.0f;
        return this.b.V().a(f5 *= f4 * 0.94f + 0.06f, f6 *= f4 * 0.94f + 0.06f, f7 *= f4 * 0.91f + 0.09f);
    }

    public boolean e() {
        return true;
    }

    public static apf a(int n2) {
        if (n2 == -1) {
            return new apg();
        }
        if (n2 == 0) {
            return new aph();
        }
        if (n2 == 1) {
            return new api();
        }
        return null;
    }

    public float f() {
        return 128.0f;
    }

    public boolean g() {
        return true;
    }

    public r h() {
        return null;
    }

    public int i() {
        if (this.c == agd.c) {
            return 4;
        }
        return 64;
    }

    public boolean j() {
        return this.c != agd.c && !this.g;
    }

    public double k() {
        if (this.c == agd.c) {
            return 1.0;
        }
        return 0.03125;
    }

    public boolean b(int n2, int n3) {
        return false;
    }

    public abstract String l();
}

