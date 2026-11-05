/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahj
extends agl {
    private static final arb aC = new arb(false);

    protected ahj(int n2) {
        super(n2);
        this.at.add(new ago(uz.class, 1, 2, 6));
        this.ar.x = 1;
        this.ar.y = 4;
        this.ar.z = 20;
    }

    @Override
    public apt a(Random random) {
        if (random.nextInt(5) > 0) {
            return aC;
        }
        return this.az;
    }

    @Override
    protected agl k() {
        ahk ahk2 = new ahk(this.ay + 128, this);
        ahk2.ao = (this.ao + 1.0f) * 0.5f;
        ahk2.am = this.am * 0.5f + 0.3f;
        ahk2.an = this.an * 0.5f + 1.2f;
        return ahk2;
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        ae.a(2);
        for (int i2 = 0; i2 < 7; ++i2) {
            int n4 = n2 + random.nextInt(16) + 8;
            int n5 = n3 + random.nextInt(16) + 8;
            int n6 = random.nextInt(afs2.f(n4, n5) + 32);
            ae.a(afs2, random, n4, n6, n5);
        }
        super.a(afs2, random, n2, n3);
    }
}

