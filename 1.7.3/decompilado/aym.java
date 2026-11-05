/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class aym {
    private final int a;
    private final int b;
    private final List c = new ArrayList();
    private int d;
    private int e;
    private int f;

    public aym(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public ayk a(double d2, double d3, double d4, double d5, double d6, double d7) {
        ayk ayk2;
        if (this.d >= this.c.size()) {
            ayk2 = new ayk(d2, d3, d4, d5, d6, d7);
            this.c.add(ayk2);
        } else {
            ayk2 = (ayk)this.c.get(this.d);
            ayk2.b(d2, d3, d4, d5, d6, d7);
        }
        ++this.d;
        return ayk2;
    }

    public void a() {
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
        this.d = 0;
        this.c.clear();
    }

    public int c() {
        return this.c.size();
    }

    public int d() {
        return this.d;
    }
}

