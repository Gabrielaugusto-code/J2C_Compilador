/*
 * Decompiled with CFR 0.152.
 */
public class qi
extends qm {
    protected qi(int n2, boolean bl2, int n3) {
        super(n2, bl2, n3);
    }

    @Override
    public void a(rm rm2, sc sc2, int n2) {
        rm2.m(rm2.br() - (float)(4 * (n2 + 1)));
        super.a(rm2, sc2, n2);
    }

    @Override
    public void b(rm rm2, sc sc2, int n2) {
        rm2.m(rm2.br() + (float)(4 * (n2 + 1)));
        super.b(rm2, sc2, n2);
    }
}

