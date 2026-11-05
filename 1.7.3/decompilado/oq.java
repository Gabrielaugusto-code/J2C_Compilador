/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

public class oq {
    private transient or[] a;
    private transient int b;
    private int c = 12;
    private final float d;
    private volatile transient int e;
    private Set f = new HashSet();

    public oq() {
        this.d = 0.75f;
        this.a = new or[16];
    }

    private static int g(int n2) {
        n2 ^= n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    private static int a(int n2, int n3) {
        return n2 & n3 - 1;
    }

    public Object a(int n2) {
        int n3 = oq.g(n2);
        or or2 = this.a[oq.a(n3, this.a.length)];
        while (or2 != null) {
            if (or2.a == n2) {
                return or2.b;
            }
            or2 = or2.c;
        }
        return null;
    }

    public boolean b(int n2) {
        return this.c(n2) != null;
    }

    final or c(int n2) {
        int n3 = oq.g(n2);
        or or2 = this.a[oq.a(n3, this.a.length)];
        while (or2 != null) {
            if (or2.a == n2) {
                return or2;
            }
            or2 = or2.c;
        }
        return null;
    }

    public void a(int n2, Object object) {
        this.f.add(n2);
        int n3 = oq.g(n2);
        int n4 = oq.a(n3, this.a.length);
        or or2 = this.a[n4];
        while (or2 != null) {
            if (or2.a == n2) {
                or2.b = object;
                return;
            }
            or2 = or2.c;
        }
        ++this.e;
        this.a(n3, n2, object, n4);
    }

    private void h(int n2) {
        or[] orArray = this.a;
        int n3 = orArray.length;
        if (n3 == 0x40000000) {
            this.c = Integer.MAX_VALUE;
            return;
        }
        or[] orArray2 = new or[n2];
        this.a(orArray2);
        this.a = orArray2;
        this.c = (int)((float)n2 * this.d);
    }

    private void a(or[] orArray) {
        or[] orArray2 = this.a;
        int n2 = orArray.length;
        for (int i2 = 0; i2 < orArray2.length; ++i2) {
            or or2;
            or or3 = orArray2[i2];
            if (or3 == null) continue;
            orArray2[i2] = null;
            do {
                or2 = or3.c;
                int n3 = oq.a(or3.d, n2);
                or3.c = orArray[n3];
                orArray[n3] = or3;
            } while ((or3 = or2) != null);
        }
    }

    public Object d(int n2) {
        this.f.remove(n2);
        or or2 = this.e(n2);
        return or2 == null ? null : or2.b;
    }

    final or e(int n2) {
        or or2;
        int n3 = oq.g(n2);
        int n4 = oq.a(n3, this.a.length);
        or or3 = or2 = this.a[n4];
        while (or3 != null) {
            or or4 = or3.c;
            if (or3.a == n2) {
                ++this.e;
                --this.b;
                if (or2 == or3) {
                    this.a[n4] = or4;
                } else {
                    or2.c = or4;
                }
                return or3;
            }
            or2 = or3;
            or3 = or4;
        }
        return or3;
    }

    public void c() {
        ++this.e;
        or[] orArray = this.a;
        for (int i2 = 0; i2 < orArray.length; ++i2) {
            orArray[i2] = null;
        }
        this.b = 0;
    }

    private void a(int n2, int n3, Object object, int n4) {
        or or2 = this.a[n4];
        this.a[n4] = new or(n2, n3, object, or2);
        if (this.b++ >= this.c) {
            this.h(2 * this.a.length);
        }
    }

    static /* synthetic */ int f(int n2) {
        return oq.g(n2);
    }
}

