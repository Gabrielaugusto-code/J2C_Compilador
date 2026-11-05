/*
 * Decompiled with CFR 0.152.
 */
public class afk {
    public final int a;
    public final int b;
    public final int c;

    public afk(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public afk(ayp ayp2) {
        this(oy.c(ayp2.c), oy.c(ayp2.d), oy.c(ayp2.e));
    }

    public boolean equals(Object object) {
        if (object instanceof afk) {
            afk afk2 = (afk)object;
            return afk2.a == this.a && afk2.b == this.b && afk2.c == this.c;
        }
        return false;
    }

    public int hashCode() {
        return this.a * 8976890 + this.b * 981131 + this.c;
    }
}

