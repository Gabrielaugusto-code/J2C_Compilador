/*
 * Decompiled with CFR 0.152.
 */
public class qd {
    private final qf a;
    private final int b;
    private final float c;
    private final float d;
    private final String e;
    private final float f;

    public qd(qf qf2, int n2, float f2, float f3, String string, float f4) {
        this.a = qf2;
        this.b = n2;
        this.c = f3;
        this.d = f2;
        this.e = string;
        this.f = f4;
    }

    public qf a() {
        return this.a;
    }

    public float c() {
        return this.c;
    }

    public boolean f() {
        return this.a.j() instanceof rm;
    }

    public String g() {
        return this.e;
    }

    public fa h() {
        return this.a().j() == null ? null : this.a().j().c_();
    }

    public float i() {
        if (this.a == qf.i) {
            return Float.MAX_VALUE;
        }
        return this.f;
    }
}

