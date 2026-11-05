/*
 * Decompiled with CFR 0.152.
 */
public class bpy
extends bop {
    private static final brq o = new brq("textures/entity/zombie_pigman.png");
    private static final brq p = new brq("textures/entity/zombie/zombie.png");
    private static final brq q = new brq("textures/entity/zombie/zombie_villager.png");
    private bih r = this.a;
    private bjg s = new bjg();
    protected bih k;
    protected bih l;
    protected bih m;
    protected bih n;
    private int t = 1;

    public bpy() {
        super(new bjk(), 0.5f, 1.0f);
    }

    @Override
    protected void d() {
        this.g = new bjk(1.0f, true);
        this.h = new bjk(0.5f, true);
        this.k = this.g;
        this.l = this.h;
        this.m = new bjg(1.0f, 0.0f, true);
        this.n = new bjg(0.5f, 0.0f, true);
    }

    protected int a(xh xh2, int n2, float f2) {
        this.b(xh2);
        return super.a(xh2, n2, f2);
    }

    public void a(xh xh2, double d2, double d3, double d4, float f2, float f3) {
        this.b(xh2);
        super.a(xh2, d2, d3, d4, f2, f3);
    }

    protected brq a(xh xh2) {
        if (xh2 instanceof wy) {
            return o;
        }
        if (xh2.cb()) {
            return q;
        }
        return p;
    }

    protected void a(xh xh2, float f2) {
        this.b(xh2);
        super.a((rn)xh2, f2);
    }

    private void b(xh xh2) {
        if (xh2.cb()) {
            if (this.t != this.s.a()) {
                this.s = new bjg();
                this.t = this.s.a();
                this.m = new bjg(1.0f, 0.0f, true);
                this.n = new bjg(0.5f, 0.0f, true);
            }
            this.i = this.s;
            this.g = this.m;
            this.h = this.n;
        } else {
            this.i = this.r;
            this.g = this.k;
            this.h = this.l;
        }
        this.a = (bih)this.i;
    }

    protected void a(xh xh2, float f2, float f3, float f4) {
        if (xh2.cc()) {
            f3 += (float)(Math.cos((double)xh2.aa * 3.25) * Math.PI * 0.25);
        }
        super.a((rm)xh2, f2, f3, f4);
    }

    @Override
    protected /* synthetic */ void c(rm rm2, float f2) {
        this.a((xh)rm2, f2);
    }
}

