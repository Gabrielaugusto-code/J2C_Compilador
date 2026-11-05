/*
 * Decompiled with CFR 0.152.
 */
public class awu {
    private awv[] a = new awv[1024];
    private int b;

    public awv a(awv awv2) {
        if (awv2.d >= 0) {
            throw new IllegalStateException("OW KNOWS!");
        }
        if (this.b == this.a.length) {
            awv[] awvArray = new awv[this.b << 1];
            System.arraycopy(this.a, 0, awvArray, 0, this.b);
            this.a = awvArray;
        }
        this.a[this.b] = awv2;
        awv2.d = this.b;
        this.a(this.b++);
        return awv2;
    }

    public void a() {
        this.b = 0;
    }

    public awv c() {
        awv awv2 = this.a[0];
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (this.b > 0) {
            this.b(0);
        }
        awv2.d = -1;
        return awv2;
    }

    public void a(awv awv2, float f2) {
        float f3 = awv2.g;
        awv2.g = f2;
        if (f2 < f3) {
            this.a(awv2.d);
        } else {
            this.b(awv2.d);
        }
    }

    private void a(int n2) {
        awv awv2 = this.a[n2];
        float f2 = awv2.g;
        while (n2 > 0) {
            int n3 = n2 - 1 >> 1;
            awv awv3 = this.a[n3];
            if (!(f2 < awv3.g)) break;
            this.a[n2] = awv3;
            awv3.d = n2;
            n2 = n3;
        }
        this.a[n2] = awv2;
        awv2.d = n2;
    }

    private void b(int n2) {
        awv awv2 = this.a[n2];
        float f2 = awv2.g;
        while (true) {
            float f3;
            awv awv3;
            int n3 = 1 + (n2 << 1);
            int n4 = n3 + 1;
            if (n3 >= this.b) break;
            awv awv4 = this.a[n3];
            float f4 = awv4.g;
            if (n4 >= this.b) {
                awv3 = null;
                f3 = Float.POSITIVE_INFINITY;
            } else {
                awv3 = this.a[n4];
                f3 = awv3.g;
            }
            if (f4 < f3) {
                if (!(f4 < f2)) break;
                this.a[n2] = awv4;
                awv4.d = n2;
                n2 = n3;
                continue;
            }
            if (!(f3 < f2)) break;
            this.a[n2] = awv3;
            awv3.d = n2;
            n2 = n4;
        }
        this.a[n2] = awv2;
        awv2.d = n2;
    }

    public boolean e() {
        return this.b == 0;
    }
}

