/*
 * Decompiled with CFR 0.152.
 */
public class apg
extends apf {
    @Override
    public void b() {
        this.e = new agv(agl.w, 0.0f);
        this.f = true;
        this.g = true;
        this.i = -1;
    }

    @Override
    public ayp b(float f2, float f3) {
        return this.b.V().a(0.2f, 0.03f, 0.03f);
    }

    @Override
    protected void a() {
        float f2 = 0.1f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.h[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * (1.0f - f2) + f2;
        }
    }

    @Override
    public aol c() {
        return new apm(this.b, this.b.H());
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean a(int n2, int n3) {
        return false;
    }

    @Override
    public float a(long l2, float f2) {
        return 0.5f;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean b(int n2, int n3) {
        return true;
    }

    @Override
    public String l() {
        return "Nether";
    }
}

