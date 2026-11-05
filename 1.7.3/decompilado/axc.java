/*
 * Decompiled with CFR 0.152.
 */
public abstract class axc {
    public final String h;
    private boolean a;

    public axc(String string) {
        this.h = string;
    }

    public abstract void a(dg var1);

    public abstract void b(dg var1);

    public void c() {
        this.a(true);
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean d() {
        return this.a;
    }
}

