/*
 * Decompiled with CFR 0.152.
 */
public class ark {
    private ahz a;
    private int b = 1;
    private int c;
    private int d;

    public ark(int n2, ahz ahz2) {
        this.b = n2;
        this.a = ahz2;
    }

    public ark(int n2, ahz ahz2, int n3) {
        this(n2, ahz2);
        this.c = n3;
    }

    public int a() {
        return this.b;
    }

    public ahz b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public void c(int n2) {
        this.d = n2;
    }

    public String toString() {
        String string = Integer.toString(ahz.b(this.a));
        if (this.b > 1) {
            string = this.b + "x" + string;
        }
        if (this.c > 0) {
            string = string + ":" + this.c;
        }
        return string;
    }
}

