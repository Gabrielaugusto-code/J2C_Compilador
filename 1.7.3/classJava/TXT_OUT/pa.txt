/*
 * Decompiled with CFR 0.152.
 */
public final class pa
implements Comparable {
    public double a;
    public double b;
    public String c;

    public pa(String string, double d2, double d3) {
        this.c = string;
        this.a = d2;
        this.b = d3;
    }

    public int a(pa pa2) {
        if (pa2.a < this.a) {
            return -1;
        }
        if (pa2.a > this.a) {
            return 1;
        }
        return pa2.c.compareTo(this.c);
    }

    public int a() {
        return (this.c.hashCode() & 0xAAAAAA) + 0x444444;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((pa)object);
    }
}

