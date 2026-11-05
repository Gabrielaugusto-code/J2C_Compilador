/*
 * Decompiled with CFR 0.152.
 */
public class bci
extends bcl
implements pb {
    private String a = "";
    private String f = "";
    private int g;
    private boolean h;

    @Override
    public void a(String string) {
        this.b(string);
    }

    @Override
    public void b(String string) {
        this.a = string;
        this.c("Working...");
    }

    @Override
    public void c(String string) {
        this.f = string;
        this.a(0);
    }

    @Override
    public void a(int n2) {
        this.g = n2;
    }

    @Override
    public void a() {
        this.h = true;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.h) {
            this.k.a((bcl)null);
            return;
        }
        this.q_();
        this.a(this.q, this.a, this.l / 2, 70, 0xFFFFFF);
        this.a(this.q, this.f + " " + this.g + "%", this.l / 2, 90, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

