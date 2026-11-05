/*
 * Decompiled with CFR 0.152.
 */
public class aaz
extends acc {
    public aaz(ahz ahz2, ajf ajf2, String[] stringArray) {
        super(ahz2, ajf2, stringArray);
    }

    @Override
    public pw b_(int n2) {
        if (ajf.d(n2) == 0) {
            return ((ajf)this.b).b[0];
        }
        return ((ajf)this.b).a(true, n2);
    }

    @Override
    public int a(abu abu2, int n2) {
        int n3 = ajf.d(abu2.k());
        if (n3 == 2 || n3 == 3) {
            return afr.a(0.5, 1.0);
        }
        return super.a(abu2, n2);
    }
}

