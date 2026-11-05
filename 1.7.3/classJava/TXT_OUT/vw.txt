/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class vw
extends pn {
    private final abu b;
    private float c;
    private boolean d;

    public vw(abu abu2, int n2) {
        super(n2);
        this.b = abu2;
    }

    public abu a(Random random) {
        abu abu2 = this.b.m();
        if (this.c > 0.0f) {
            int n2 = (int)(this.c * (float)this.b.l());
            int n3 = abu2.l() - random.nextInt(random.nextInt(n2) + 1);
            if (n3 > n2) {
                n3 = n2;
            }
            if (n3 < 1) {
                n3 = 1;
            }
            abu2.b(n3);
        }
        if (this.d) {
            aem.a(random, abu2, 30);
        }
        return abu2;
    }

    public vw a(float f2) {
        this.c = f2;
        return this;
    }

    public vw a() {
        this.d = true;
        return this;
    }
}

