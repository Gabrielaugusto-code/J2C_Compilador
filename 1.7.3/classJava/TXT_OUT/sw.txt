/*
 * Decompiled with CFR 0.152.
 */
public class sw
extends sz {
    private rn a;

    public sw(rn rn2) {
        this.a = rn2;
        this.a(4);
        rn2.m().e(true);
    }

    @Override
    public boolean a() {
        return this.a.L() || this.a.O();
    }

    @Override
    public void e() {
        if (this.a.aH().nextFloat() < 0.8f) {
            this.a.l().a();
        }
    }
}

