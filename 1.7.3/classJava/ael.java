/*
 * Decompiled with CFR 0.152.
 */
public enum ael {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k;


    public boolean a(abs abs2) {
        if (this == a) {
            return true;
        }
        if (this == j && abs2.p()) {
            return true;
        }
        if (abs2 instanceof zs) {
            if (this == b) {
                return true;
            }
            zs zs2 = (zs)abs2;
            if (zs2.b == 0) {
                return this == f;
            }
            if (zs2.b == 2) {
                return this == d;
            }
            if (zs2.b == 1) {
                return this == e;
            }
            if (zs2.b == 3) {
                return this == c;
            }
            return false;
        }
        if (abs2 instanceof acy) {
            return this == g;
        }
        if (abs2 instanceof aax) {
            return this == h;
        }
        if (abs2 instanceof aad) {
            return this == k;
        }
        if (abs2 instanceof abm) {
            return this == i;
        }
        return false;
    }
}

