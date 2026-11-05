/*
 * Decompiled with CFR 0.152.
 */
public class api
extends apf {
    @Override
    public void b() {
        this.e = new agv(agl.x, 0.0f);
        this.i = 1;
        this.g = true;
    }

    @Override
    public aol c() {
        return new apr(this.b, this.b.H());
    }

    @Override
    public float a(long l2, float f2) {
        return 0.0f;
    }

    @Override
    public float[] a(float f2, float f3) {
        return null;
    }

    @Override
    public ayp b(float f2, float f3) {
        int n2 = 0xA080A0;
        float f4 = oy.b(f2 * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float f5 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f6 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f7 = (float)(n2 & 0xFF) / 255.0f;
        return this.b.V().a(f5 *= f4 * 0.0f + 0.15f, f6 *= f4 * 0.0f + 0.15f, f7 *= f4 * 0.0f + 0.15f);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public float f() {
        return 8.0f;
    }

    @Override
    public boolean a(int n2, int n3) {
        return this.b.b(n2, n3).o().c();
    }

    @Override
    public r h() {
        return new r(100, 50, 0);
    }

    @Override
    public int i() {
        return 50;
    }

    @Override
    public boolean b(int n2, int n3) {
        return true;
    }

    @Override
    public String l() {
        return "The End";
    }
}

