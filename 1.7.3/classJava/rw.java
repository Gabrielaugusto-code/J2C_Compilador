/*
 * Decompiled with CFR 0.152.
 */
public class rw {
    private final int a;
    private final int b;
    private Object c;
    private boolean d;

    public rw(int n2, int n3, Object object) {
        this.b = n3;
        this.c = object;
        this.a = n2;
        this.d = true;
    }

    public int a() {
        return this.b;
    }

    public void a(Object object) {
        this.c = object;
    }

    public Object b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    static /* synthetic */ boolean a(rw rw2, boolean bl2) {
        rw2.d = bl2;
        return rw2.d;
    }
}

