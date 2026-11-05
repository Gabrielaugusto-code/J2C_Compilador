/*
 * Decompiled with CFR 0.152.
 */
public class bbw
extends bcl {
    private String a;
    private String f;

    public bbw(String string, String string2) {
        this.a = string;
        this.f = string2;
    }

    @Override
    public void r_() {
        super.r_();
        this.n.add(new bau(0, this.l / 2 - 100, 140, bsc.a("gui.cancel", new Object[0])));
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.a(0, 0, this.l, this.m, -12574688, -11530224);
        this.a(this.q, this.a, this.l / 2, 90, 0xFFFFFF);
        this.a(this.q, this.f, this.l / 2, 110, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(bau bau2) {
        this.k.a((bcl)null);
    }
}

