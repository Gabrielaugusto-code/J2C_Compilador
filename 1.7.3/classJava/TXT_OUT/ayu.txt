/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

final class ayu
implements Comparator {
    ayu() {
    }

    public int a(ayt ayt2, ayt ayt3) {
        if (ayt2.c() > ayt3.c()) {
            return 1;
        }
        if (ayt2.c() < ayt3.c()) {
            return -1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ayt)object, (ayt)object2);
    }
}

