/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class bmj
implements Comparator {
    private double a;
    private double b;
    private double c;

    public bmj(qr qr2) {
        this.a = -qr2.s;
        this.b = -qr2.t;
        this.c = -qr2.u;
    }

    public int a(bmh bmh2, bmh bmh3) {
        double d2 = (double)bmh2.n + this.a;
        double d3 = (double)bmh2.o + this.b;
        double d4 = (double)bmh2.p + this.c;
        double d5 = (double)bmh3.n + this.a;
        double d6 = (double)bmh3.o + this.b;
        double d7 = (double)bmh3.p + this.c;
        return (int)((d2 * d2 + d3 * d3 + d4 * d4 - (d5 * d5 + d6 * d6 + d7 * d7)) * 1024.0);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bmh)object, (bmh)object2);
    }
}

