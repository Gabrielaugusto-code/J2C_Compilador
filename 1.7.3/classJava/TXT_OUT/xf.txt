/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class xf
implements rp {
    public int a;

    public void a(Random random) {
        int n2 = random.nextInt(5);
        if (n2 <= 1) {
            this.a = qm.c.H;
        } else if (n2 <= 2) {
            this.a = qm.g.H;
        } else if (n2 <= 3) {
            this.a = qm.l.H;
        } else if (n2 <= 4) {
            this.a = qm.p.H;
        }
    }
}

