/*
 * Decompiled with CFR 0.152.
 */
public class xn {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    private float f = 0.05f;
    private float g = 0.1f;

    public void a(dg dg2) {
        dg dg3 = new dg();
        dg3.a("invulnerable", this.a);
        dg3.a("flying", this.b);
        dg3.a("mayfly", this.c);
        dg3.a("instabuild", this.d);
        dg3.a("mayBuild", this.e);
        dg3.a("flySpeed", this.f);
        dg3.a("walkSpeed", this.g);
        dg2.a("abilities", dg3);
    }

    public void b(dg dg2) {
        if (dg2.b("abilities", 10)) {
            dg dg3 = dg2.m("abilities");
            this.a = dg3.n("invulnerable");
            this.b = dg3.n("flying");
            this.c = dg3.n("mayfly");
            this.d = dg3.n("instabuild");
            if (dg3.b("flySpeed", 99)) {
                this.f = dg3.h("flySpeed");
                this.g = dg3.h("walkSpeed");
            }
            if (dg3.b("mayBuild", 1)) {
                this.e = dg3.n("mayBuild");
            }
        }
    }

    public float a() {
        return this.f;
    }

    public void a(float f2) {
        this.f = f2;
    }

    public float b() {
        return this.g;
    }

    public void b(float f2) {
        this.g = f2;
    }
}

