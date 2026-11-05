/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class bgc
implements Comparator {
    private final String b;
    final /* synthetic */ bga a;

    private bgc(bga bga2, String string) {
        this.a = bga2;
        this.b = string;
    }

    public int a(bvo bvo2, bvo bvo3) {
        if (bvo2.e.equals(bvo3.e)) {
            if (bvo2.a < bvo3.a) {
                return 1;
            }
            if (bvo2.a > bvo3.a) {
                return -1;
            }
            return 0;
        }
        if (bvo2.e.equals(this.b)) {
            return -1;
        }
        if (bvo3.e.equals(this.b)) {
            return 1;
        }
        if (bvo2.d.equals("CLOSED") || bvo3.d.equals("CLOSED")) {
            if (bvo2.d.equals("CLOSED")) {
                return 1;
            }
            if (bvo3.d.equals("CLOSED")) {
                return 0;
            }
        }
        if (bvo2.a < bvo3.a) {
            return 1;
        }
        if (bvo2.a > bvo3.a) {
            return -1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bvo)object, (bvo)object2);
    }

    /* synthetic */ bgc(bga bga2, String string, bgb bgb2) {
        this(bga2, string);
    }
}

