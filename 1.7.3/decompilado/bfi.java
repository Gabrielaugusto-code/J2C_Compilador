/*
 * Decompiled with CFR 0.152.
 */
public abstract class bfi
implements Runnable {
    protected bfh b;

    public void a(bfh bfh2) {
        this.b = bfh2;
    }

    public void a(String string) {
        this.b.a(string);
    }

    public void b(String string) {
        this.b.b(string);
    }

    public azi b() {
        return this.b.h();
    }

    public boolean c() {
        return this.b.i();
    }

    public void a() {
    }

    public void a(bau bau2) {
    }

    public void d() {
    }
}

