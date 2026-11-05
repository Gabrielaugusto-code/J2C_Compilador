/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class aqe {
    private final boolean a;

    public aqe() {
        this.a = false;
    }

    public aqe(boolean bl2) {
        this.a = bl2;
    }

    public abstract boolean a(afs var1, Random var2, int var3, int var4, int var5);

    public void a(double d2, double d3, double d4) {
    }

    protected void a(afs afs2, int n2, int n3, int n4, ahz ahz2) {
        this.a(afs2, n2, n3, n4, ahz2, 0);
    }

    protected void a(afs afs2, int n2, int n3, int n4, ahz ahz2, int n5) {
        if (this.a) {
            afs2.d(n2, n3, n4, ahz2, n5, 3);
        } else {
            afs2.d(n2, n3, n4, ahz2, n5, 2);
        }
    }
}

