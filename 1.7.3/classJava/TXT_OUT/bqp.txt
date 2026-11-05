/*
 * Decompiled with CFR 0.152.
 */
public class bqp
implements Comparable {
    private final bqw a;
    private final int b;
    private final int c;
    private final int d;
    private boolean e;
    private float f = 1.0f;

    public bqp(bqw bqw2, int n2) {
        this.a = bqw2;
        this.b = bqw2.a();
        this.c = bqw2.b();
        this.d = n2;
        this.e = bqo.a(this.c, n2) > bqo.a(this.b, n2);
    }

    public bqw a() {
        return this.a;
    }

    public int b() {
        return this.e ? bqo.a((int)((float)this.c * this.f), this.d) : bqo.a((int)((float)this.b * this.f), this.d);
    }

    public int c() {
        return this.e ? bqo.a((int)((float)this.b * this.f), this.d) : bqo.a((int)((float)this.c * this.f), this.d);
    }

    public void d() {
        this.e = !this.e;
    }

    public boolean e() {
        return this.e;
    }

    public void a(int n2) {
        if (this.b <= n2 || this.c <= n2) {
            return;
        }
        this.f = (float)n2 / (float)Math.min(this.b, this.c);
    }

    public String toString() {
        return "Holder{width=" + this.b + ", height=" + this.c + '}';
    }

    public int a(bqp bqp2) {
        int n2;
        if (this.c() == bqp2.c()) {
            if (this.b() == bqp2.b()) {
                if (this.a.g() == null) {
                    return bqp2.a.g() == null ? 0 : -1;
                }
                return this.a.g().compareTo(bqp2.a.g());
            }
            n2 = this.b() < bqp2.b() ? 1 : -1;
        } else {
            n2 = this.c() < bqp2.c() ? 1 : -1;
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((bqp)object);
    }
}

