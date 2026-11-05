/*
 * Decompiled with CFR 0.152.
 */
class ov {
    final long a;
    Object b;
    ov c;
    final int d;

    ov(int n2, long l2, Object object, ov ov2) {
        this.b = object;
        this.c = ov2;
        this.a = l2;
        this.d = n2;
    }

    public final long a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        Long l2;
        if (!(object instanceof ov)) {
            return false;
        }
        ov ov2 = (ov)object;
        Long l3 = this.a();
        return (l3 == (l2 = Long.valueOf(ov2.a())) || l3 != null && ((Object)l3).equals(l2)) && ((object3 = this.b()) == (object2 = ov2.b()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return ou.f(this.a);
    }

    public final String toString() {
        return this.a() + "=" + this.b();
    }
}

