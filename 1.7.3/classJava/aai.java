/*
 * Decompiled with CFR 0.152.
 */
public class aai
extends zy {
    private final ahz b;
    private String[] c;

    public aai(ahz ahz2, boolean bl2) {
        super(ahz2);
        this.b = ahz2;
        if (bl2) {
            this.f(0);
            this.a(true);
        }
    }

    @Override
    public int a(abu abu2, int n2) {
        return this.b.i(abu2.k());
    }

    @Override
    public pw b_(int n2) {
        return this.b.a(0, n2);
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    public aai a(String[] stringArray) {
        this.c = stringArray;
        return this;
    }

    @Override
    public String a(abu abu2) {
        if (this.c == null) {
            return super.a(abu2);
        }
        int n2 = abu2.k();
        if (n2 >= 0 && n2 < this.c.length) {
            return super.a(abu2) + "." + this.c[n2];
        }
        return super.a(abu2);
    }
}

