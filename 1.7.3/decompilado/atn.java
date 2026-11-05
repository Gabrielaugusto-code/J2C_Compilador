/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

class atn
extends aub {
    private atn() {
    }

    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        if (bl2) {
            this.a = aie.aV;
            float f2 = random.nextFloat();
            if (f2 < 0.2f) {
                this.b = 2;
            } else if (f2 < 0.5f) {
                this.b = 1;
            } else if (f2 < 0.55f) {
                this.a = aie.aU;
                this.b = 2;
            } else {
                this.b = 0;
            }
        } else {
            this.a = aie.a;
            this.b = 0;
        }
    }

    /* synthetic */ atn(ata ata2) {
        this();
    }
}

