/*
 * Decompiled with CFR 0.152.
 */
public class ack
extends abs {
    public ack() {
        this.h = 1;
        this.a(aak.e);
    }

    @Override
    public boolean a(abu abu2, xq xq2, rm rm2) {
        if (rm2 instanceof vf) {
            vf vf2 = (vf)rm2;
            if (!vf2.bZ() && !vf2.f()) {
                vf2.i(true);
                vf2.o.a(vf2, "mob.horse.leather", 0.5f, 1.0f);
                --abu2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(abu abu2, rm rm2, rm rm3) {
        this.a(abu2, null, rm2);
        return true;
    }
}

