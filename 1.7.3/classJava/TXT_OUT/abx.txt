/*
 * Decompiled with CFR 0.152.
 */
public class abx
extends zy {
    private final akk b;

    public abx(akk akk2) {
        super(akk2);
        this.b = akk2;
        this.f(0);
        this.a(true);
    }

    @Override
    public int a(int n2) {
        return n2 | 4;
    }

    @Override
    public pw b_(int n2) {
        return this.b.a(0, n2);
    }

    @Override
    public int a(abu abu2, int n2) {
        return this.b.i(abu2.k());
    }

    @Override
    public String a(abu abu2) {
        int n2 = abu2.k();
        if (n2 < 0 || n2 >= this.b.e().length) {
            n2 = 0;
        }
        return super.a() + "." + this.b.e()[n2];
    }
}

