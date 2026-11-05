/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

public class bfh
extends bcl {
    private final int f = 666;
    private final int g = 667;
    private final bcl h;
    private final bfi i;
    private volatile String r = "";
    private volatile boolean s;
    private volatile String t;
    private volatile boolean u;
    private int v;
    private bfi w;
    private int x = 212;
    public static final String[] a = new String[]{"\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588", "_ _ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587", "_ _ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586", "_ _ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585", "_ \u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584", "\u2583 \u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _ _", "\u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _ _", "\u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _ _", "\u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _ _", "\u2584 \u2585 \u2586 \u2587 \u2588 \u2587 \u2586 \u2585 \u2584 \u2583 _"};

    public bfh(azi azi2, bcl bcl2, bfi bfi2) {
        this.n = Collections.synchronizedList(new ArrayList());
        this.k = azi2;
        this.h = bcl2;
        this.w = bfi2;
        bfi2.a(this);
        this.i = bfi2;
    }

    public void g() {
        bgl.a.submit(this.i);
    }

    @Override
    public void c() {
        super.c();
        ++this.v;
        this.w.a();
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void r_() {
        this.w.d();
        this.n.add(new bau(666, this.l / 2 - this.x / 2, 170, this.x, 20, bsc.a("gui.cancel", new Object[0])));
    }

    @Override
    protected void a(bau bau2) {
        if (bau2.k == 666 || bau2.k == 667) {
            this.u = true;
            this.k.a(this.h);
        }
        this.w.a(bau2);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.r, this.l / 2, this.m / 2 - 50, 0xFFFFFF);
        this.a(this.q, "", this.l / 2, this.m / 2 - 10, 0xFFFFFF);
        if (!this.s) {
            this.a(this.q, a[this.v % a.length], this.l / 2, this.m / 2 + 15, 0x808080);
        }
        if (this.s) {
            this.a(this.q, this.t, this.l / 2, this.m / 2 + 15, 0xFF0000);
        }
        super.a(n2, n3, f2);
    }

    public void a(String string) {
        this.s = true;
        this.t = string;
        this.n.clear();
        this.n.add(new bau(667, this.l / 2 - this.x / 2, this.m / 4 + 120 + 12, bsc.a("gui.back", new Object[0])));
    }

    public azi h() {
        return this.k;
    }

    public void b(String string) {
        this.r = string;
    }

    public boolean i() {
        return this.u;
    }
}

