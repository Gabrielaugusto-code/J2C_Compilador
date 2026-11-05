/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class apo {
    protected int a = 8;
    protected Random b = new Random();
    protected afs c;

    public void a(aol aol2, afs afs2, int n2, int n3, ahz[] ahzArray) {
        int n4 = this.a;
        this.c = afs2;
        this.b.setSeed(afs2.H());
        long l2 = this.b.nextLong();
        long l3 = this.b.nextLong();
        for (int i2 = n2 - n4; i2 <= n2 + n4; ++i2) {
            for (int i3 = n3 - n4; i3 <= n3 + n4; ++i3) {
                long l4 = (long)i2 * l2;
                long l5 = (long)i3 * l3;
                this.b.setSeed(l4 ^ l5 ^ afs2.H());
                this.a(afs2, i2, i3, n2, n3, ahzArray);
            }
        }
    }

    protected void a(afs afs2, int n2, int n3, int n4, int n5, ahz[] ahzArray) {
    }
}

