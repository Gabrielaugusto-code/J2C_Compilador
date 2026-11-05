/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class dz
extends dy {
    protected ArrayList b = new ArrayList();

    public dz(String string) {
        this.a = string;
    }

    @Override
    public du a() {
        dg dg2 = new dg();
        for (dy dy2 : this.b) {
            dg2.a(dy2.a, dy2.a());
        }
        return dg2;
    }
}

