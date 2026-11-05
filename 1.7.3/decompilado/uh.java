/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class uh
implements Comparator {
    private final qr a;

    public uh(qr qr2) {
        this.a = qr2;
    }

    public int a(qr qr2, qr qr3) {
        double d2;
        double d3 = this.a.f(qr2);
        if (d3 < (d2 = this.a.f(qr3))) {
            return -1;
        }
        if (d3 > d2) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((qr)object, (qr)object2);
    }
}

