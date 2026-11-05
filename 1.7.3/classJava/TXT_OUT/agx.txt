/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

class agx
extends ahe {
    final /* synthetic */ agw aC;

    agx(agw agw2, int n2, agl agl2) {
        this.aC = agw2;
        super(n2, agl2);
    }

    @Override
    public apt a(Random random) {
        if (random.nextBoolean()) {
            return agw.aC;
        }
        return agw.aD;
    }
}

