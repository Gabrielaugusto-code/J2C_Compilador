/*
 * Decompiled with CFR 0.152.
 */
public class bcr
extends bcl {
    private final bcl f;
    private final bac g;
    protected String a = "Options";
    private String h;

    public bcr(bcl bcl2, bac bac2) {
        this.f = bcl2;
        this.g = bac2;
    }

    @Override
    public void r_() {
        int n2 = 0;
        this.a = bsc.a("options.sounds.title", new Object[0]);
        this.h = bsc.a("options.off", new Object[0]);
        this.n.add(new bcs(this, w.a.b(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 - 12 + 24 * (n2 >> 1), w.a, true));
        n2 += 2;
        for (w w2 : w.values()) {
            if (w2 == w.a) continue;
            this.n.add(new bcs(this, w2.b(), this.l / 2 - 155 + n2 % 2 * 160, this.m / 6 - 12 + 24 * (n2 >> 1), w2, false));
            ++n2;
        }
        this.n.add(new bau(200, this.l / 2 - 100, this.m / 6 + 168, bsc.a("gui.done", new Object[0])));
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 200) {
            this.k.u.b();
            this.k.a(this.f);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.a, this.l / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    protected String a(w w2) {
        float f2 = this.g.a(w2);
        if (f2 == 0.0f) {
            return this.h;
        }
        return (int)(f2 * 100.0f) + "%";
    }

    static /* synthetic */ bac a(bcr bcr2) {
        return bcr2.g;
    }
}

