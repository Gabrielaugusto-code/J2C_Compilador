/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class btt
implements lk {
    private final Random a = new Random();
    private final azi b;
    private btg c;
    private int d = 100;

    public btt(azi azi2) {
        this.b = azi2;
    }

    @Override
    public void a() {
        btu btu2 = this.b.Y();
        if (this.c != null) {
            if (!btu2.a().equals(this.c.b())) {
                this.b.X().b(this.c);
                this.d = oy.a(this.a, 0, btu2.b() / 2);
            }
            if (!this.b.X().c(this.c)) {
                this.c = null;
                this.d = Math.min(oy.a(this.a, btu2.b(), btu2.c()), this.d);
            }
        }
        if (this.c == null && this.d-- <= 0) {
            this.c = btb.a(btu2.a());
            this.b.X().a(this.c);
            this.d = Integer.MAX_VALUE;
        }
    }
}

