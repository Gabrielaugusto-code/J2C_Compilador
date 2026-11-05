/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bbu
extends bcl {
    private String a;
    private fa f;
    private List g;
    private final bcl h;

    public bbu(bcl bcl2, String string, fa fa2) {
        this.h = bcl2;
        this.a = bsc.a(string, new Object[0]);
        this.f = fa2;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void r_() {
        this.n.clear();
        this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 120 + 12, bsc.a("gui.toMenu", new Object[0])));
        this.g = this.q.c(this.f.d(), this.l - 50);
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 0) {
            this.k.a(this.h);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.a, this.l / 2, this.m / 2 - 50, 0xAAAAAA);
        int n4 = this.m / 2 - 30;
        if (this.g != null) {
            for (String string : this.g) {
                this.a(this.q, string, this.l / 2, n4, 0xFFFFFF);
                n4 += this.q.a;
            }
        }
        super.a(n2, n3, f2);
    }
}

