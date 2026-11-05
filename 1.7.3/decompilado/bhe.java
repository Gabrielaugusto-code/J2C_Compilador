/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public abstract class bhe
extends bba {
    protected final azi k;
    protected final List l;

    public bhe(azi azi2, int n2, int n3, List list) {
        super(azi2, n2, n3, 32, n3 - 55 + 4, 36);
        this.k = azi2;
        this.l = list;
        this.i = false;
        this.a(true, (int)((float)azi2.l.a * 1.5f));
    }

    @Override
    protected void a(int n2, int n3, bna bna2) {
        String string = (Object)((Object)a.t) + "" + (Object)((Object)a.r) + this.k();
        this.k.l.b(string, n2 + this.a / 2 - this.k.l.a(string) / 2, Math.min(this.b + 3, n3), 0xFFFFFF);
    }

    protected abstract String k();

    public List l() {
        return this.l;
    }

    @Override
    protected int b() {
        return this.l().size();
    }

    public bha c(int n2) {
        return (bha)this.l().get(n2);
    }

    @Override
    public int c() {
        return this.a;
    }

    @Override
    protected int d() {
        return this.d - 6;
    }

    @Override
    public /* synthetic */ bbb b(int n2) {
        return this.c(n2);
    }
}

