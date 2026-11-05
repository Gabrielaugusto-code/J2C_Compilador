/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class mi
implements afy {
    private MinecraftServer a;
    private mm b;

    public mi(MinecraftServer minecraftServer, mm mm2) {
        this.a = minecraftServer;
        this.b = mm2;
    }

    @Override
    public void a(String string, double d2, double d3, double d4, double d5, double d6, double d7) {
    }

    @Override
    public void a(qr qr2) {
        this.b.r().a(qr2);
    }

    @Override
    public void b(qr qr2) {
        this.b.r().b(qr2);
    }

    @Override
    public void a(String string, double d2, double d3, double d4, float f2, float f3) {
        this.a.af().a(d2, d3, d4, f2 > 1.0f ? (double)(16.0f * f2) : 16.0, this.b.t.i, new gt(string, d2, d3, d4, f2, f3));
    }

    @Override
    public void a(xq xq2, String string, double d2, double d3, double d4, float f2, float f3) {
        this.a.af().a(xq2, d2, d3, d4, f2 > 1.0f ? (double)(16.0f * f2) : 16.0, this.b.t.i, new gt(string, d2, d3, d4, f2, f3));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(int n2, int n3, int n4) {
        this.b.t().a(n2, n3, n4);
    }

    @Override
    public void b(int n2, int n3, int n4) {
    }

    @Override
    public void a(String string, int n2, int n3, int n4) {
    }

    @Override
    public void a(xq xq2, int n2, int n3, int n4, int n5, int n6) {
        this.a.af().a(xq2, n3, n4, n5, 64.0, this.b.t.i, new gr(n2, n3, n4, n5, n6, false));
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        this.a.af().a(new gr(n2, n3, n4, n5, n6, true));
    }

    @Override
    public void b(int n2, int n3, int n4, int n5, int n6) {
        for (mp mp2 : this.a.af().a) {
            double d2;
            double d3;
            double d4;
            if (mp2 == null || mp2.o != this.b || mp2.x() == n2 || !((d4 = (double)n3 - mp2.s) * d4 + (d3 = (double)n4 - mp2.t) * d3 + (d2 = (double)n5 - mp2.u) * d2 < 1024.0)) continue;
            mp2.a.a(new fv(n2, n3, n4, n5, n6));
        }
    }

    @Override
    public void b() {
    }
}

