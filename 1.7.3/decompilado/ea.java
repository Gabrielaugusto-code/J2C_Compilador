/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class ea
extends dy {
    protected ArrayList b = new ArrayList();

    public ea(String string) {
        this.a = string;
    }

    @Override
    public du a() {
        dp dp2 = new dp();
        for (dy dy2 : this.b) {
            dp2.a(dy2.a());
        }
        return dp2;
    }
}

