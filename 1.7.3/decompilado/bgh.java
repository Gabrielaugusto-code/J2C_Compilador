/*
 * Decompiled with CFR 0.152.
 */
public class bgh
extends bcl {
    private final bwa a;
    private final bcl f;
    private String g;
    private String h;

    public bgh(bwa bwa2, bcl bcl2) {
        this.a = bwa2;
        this.f = bcl2;
        this.a(bwa2);
    }

    private void a(bwa bwa2) {
        if (bwa2.c != -1) {
            this.g = "Realms (" + bwa2.c + "):";
            this.h = bwa2.d;
        } else {
            this.g = "An error occurred (" + bwa2.a + "):";
            this.h = bwa2.b;
        }
    }

    @Override
    public void r_() {
        this.n.clear();
        this.n.add(new bau(10, this.l / 2 - 100, this.m - 52, 200, 20, "Ok"));
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 10) {
            this.k.a(this.f);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.g, this.l / 2, 80, 0xFFFFFF);
        this.a(this.q, this.h, this.l / 2, 100, 0xFF0000);
        super.a(n2, n3, f2);
    }
}

