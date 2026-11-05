/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class bgy
extends bba {
    private final bgt k;
    private final List l = Lists.newArrayList();
    private final List m = Lists.newArrayList();
    private final bbb n = new bgu();
    private int o = -1;

    public bgy(bgt bgt2, azi azi2, int n2, int n3, int n4, int n5, int n6) {
        super(azi2, n2, n3, n4, n5, n6);
        this.k = bgt2;
    }

    @Override
    public bbb b(int n2) {
        if (n2 < this.l.size()) {
            return (bbb)this.l.get(n2);
        }
        if ((n2 -= this.l.size()) == 0) {
            return this.n;
        }
        return (bbb)this.m.get(--n2);
    }

    @Override
    protected int b() {
        return this.l.size() + 1 + this.m.size();
    }

    public void c(int n2) {
        this.o = n2;
    }

    @Override
    protected boolean a(int n2) {
        return n2 == this.o;
    }

    public int k() {
        return this.o;
    }

    public void a(bkj bkj2) {
        this.l.clear();
        for (int i2 = 0; i2 < bkj2.c(); ++i2) {
            this.l.add(new bgw(this.k, bkj2.a(i2)));
        }
    }

    public void a(List list) {
        this.m.clear();
        for (bto bto2 : list) {
            this.m.add(new bgv(this.k, bto2));
        }
    }

    @Override
    protected int d() {
        return super.d() + 30;
    }

    @Override
    public int c() {
        return super.c() + 85;
    }
}

