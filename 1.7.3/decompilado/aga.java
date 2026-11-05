/*
 * Decompiled with CFR 0.152.
 */
public final class aga {
    private final long a;
    private final agb b;
    private final boolean c;
    private final boolean d;
    private final agd e;
    private boolean f;
    private boolean g;
    private String h = "";

    public aga(long l2, agb agb2, boolean bl2, boolean bl3, agd agd2) {
        this.a = l2;
        this.b = agb2;
        this.c = bl2;
        this.d = bl3;
        this.e = agd2;
    }

    public aga(axj axj2) {
        this(axj2.b(), axj2.r(), axj2.s(), axj2.t(), axj2.u());
    }

    public aga a() {
        this.g = true;
        return this;
    }

    public aga b() {
        this.f = true;
        return this;
    }

    public aga a(String string) {
        this.h = string;
        return this;
    }

    public boolean c() {
        return this.g;
    }

    public long d() {
        return this.a;
    }

    public agb e() {
        return this.b;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.c;
    }

    public agd h() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public static agb a(int n2) {
        return agb.a(n2);
    }

    public String j() {
        return this.h;
    }
}

