/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

public class bmi
implements Comparator {
    private rm a;

    public bmi(rm rm2) {
        this.a = rm2;
    }

    public int a(bmh bmh2, bmh bmh3) {
        double d2;
        if (bmh2.l && !bmh3.l) {
            return 1;
        }
        if (bmh3.l && !bmh2.l) {
            return -1;
        }
        double d3 = bmh2.a((qr)this.a);
        if (d3 < (d2 = (double)bmh3.a((qr)this.a))) {
            return 1;
        }
        if (d3 > d2) {
            return -1;
        }
        return bmh2.s < bmh3.s ? 1 : -1;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bmh)object, (bmh)object2);
    }
}

