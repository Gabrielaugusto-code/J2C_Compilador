/*
 * Decompiled with CFR 0.152.
 */
public class bcj
extends bcl {
    private bjw a;
    private int f;

    public bcj(bjw bjw2) {
        this.a = bjw2;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void r_() {
        this.n.clear();
    }

    @Override
    public void c() {
        ++this.f;
        if (this.f % 20 == 0) {
            this.a.a(new it());
        }
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.c(0);
        this.a(this.q, bsc.a("multiplayer.downloadingTerrain", new Object[0]), this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    public boolean f() {
        return false;
    }
}

