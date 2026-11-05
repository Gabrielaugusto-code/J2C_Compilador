/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class lf
implements Comparator {
    private final r a;

    public lf(r r2) {
        this.a = r2;
    }

    public int a(mp mp2, mp mp3) {
        double d2;
        double d3 = mp2.e(this.a.a, this.a.b, this.a.c);
        if (d3 < (d2 = mp3.e(this.a.a, this.a.b, this.a.c))) {
            return -1;
        }
        if (d3 > d2) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((mp)object, (mp)object2);
    }
}

