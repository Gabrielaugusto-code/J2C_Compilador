/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class adw
implements Comparator {
    final /* synthetic */ adv a;

    adw(adv adv2) {
        this.a = adv2;
    }

    public int a(adx adx2, adx adx3) {
        if (adx2 instanceof adz && adx3 instanceof ady) {
            return 1;
        }
        if (adx3 instanceof adz && adx2 instanceof ady) {
            return -1;
        }
        if (adx3.a() < adx2.a()) {
            return -1;
        }
        if (adx3.a() > adx2.a()) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((adx)object, (adx)object2);
    }
}

