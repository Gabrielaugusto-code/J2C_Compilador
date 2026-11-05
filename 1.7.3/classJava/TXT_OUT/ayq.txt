/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class ayq {
    private final int a;
    private final int b;
    private final List c = new ArrayList();
    private int d;
    private int e;
    private int f;

    public ayq(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public ayp a(double d2, double d3, double d4) {
        ayp ayp2;
        if (this.e()) {
            return new ayp(this, d2, d3, d4);
        }
        if (this.d >= this.c.size()) {
            ayp2 = new ayp(this, d2, d3, d4);
            this.c.add(ayp2);
        } else {
            ayp2 = (ayp)this.c.get(this.d);
            ayp2.b(d2, d3, d4);
        }
        ++this.d;
        return ayp2;
    }

    public void a() {
        if (this.e()) {
            return;
        }
        if (this.d > this.e) {
            this.e = this.d;
        }
        if (this.f++ == this.a) {
            int n2 = Math.max(this.e, this.c.size() - this.b);
            while (this.c.size() > n2) {
                this.c.remove(n2);
            }
            this.e = 0;
            this.f = 0;
        }
        this.d = 0;
    }

    public void b() {
        if (this.e()) {
            return;
        }
        this.d = 0;
        this.c.clear();
    }

    public int c() {
        return this.c.size();
    }

    public int d() {
        return this.d;
    }

    private boolean e() {
        return this.b < 0 || this.a < 0;
    }
}

