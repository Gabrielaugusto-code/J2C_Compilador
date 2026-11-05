/*
 * Decompiled with CFR 0.152.
 */
public class bui
implements buh {
    private final btv a;
    private final int b;

    bui(btv btv2, int n2) {
        this.a = btv2;
        this.b = n2;
    }

    @Override
    public int a() {
        return this.b;
    }

    public btv b() {
        return new btv(this.a);
    }

    @Override
    public /* synthetic */ Object g() {
        return this.b();
    }
}

