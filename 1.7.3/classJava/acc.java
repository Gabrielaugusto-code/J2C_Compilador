/*
 * Decompiled with CFR 0.152.
 */
public class acc
extends zy {
    protected final ahz b;
    protected final String[] c;

    public acc(ahz ahz2, ahz ahz3, String[] stringArray) {
        super(ahz2);
        this.b = ahz3;
        this.c = stringArray;
        this.f(0);
        this.a(true);
    }

    @Override
    public pw b_(int n2) {
        return this.b.a(2, n2);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String a(abu abu2) {
        int n2 = abu2.k();
        if (n2 < 0 || n2 >= this.c.length) {
            n2 = 0;
        }
        return super.a() + "." + this.c[n2];
    }
}

