/*
 * Decompiled with CFR 0.152.
 */
public class ck
implements cj {
    private final afs a;
    private final int b;
    private final int c;
    private final int d;

    public ck(afs afs2, int n2, int n3, int n4) {
        this.a = afs2;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    @Override
    public afs k() {
        return this.a;
    }

    @Override
    public double a() {
        return (double)this.b + 0.5;
    }

    @Override
    public double b() {
        return (double)this.c + 0.5;
    }

    @Override
    public double c() {
        return (double)this.d + 0.5;
    }

    @Override
    public int d() {
        return this.b;
    }

    @Override
    public int e() {
        return this.c;
    }

    @Override
    public int f() {
        return this.d;
    }

    @Override
    public int h() {
        return this.a.e(this.b, this.c, this.d);
    }

    @Override
    public ani j() {
        return this.a.o(this.b, this.c, this.d);
    }
}

