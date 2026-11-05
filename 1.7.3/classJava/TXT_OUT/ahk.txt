/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public class ahk
extends ahe {
    public ahk(int n2, agl agl2) {
        super(n2, agl2);
        this.ar.x = 2;
        this.ar.y = 2;
        this.ar.z = 5;
    }

    @Override
    public void a(afs afs2, Random random, ahz[] ahzArray, byte[] byArray, int n2, int n3, double d2) {
        this.ai = aie.c;
        this.aj = 0;
        this.ak = aie.d;
        if (d2 > 1.75) {
            this.ai = aie.b;
            this.ak = aie.b;
        } else if (d2 > -0.5) {
            this.ai = aie.d;
            this.aj = 1;
        }
        this.b(afs2, random, ahzArray, byArray, n2, n3, d2);
    }

    @Override
    public void a(afs afs2, Random random, int n2, int n3) {
        this.ar.a(afs2, random, this, n2, n3);
    }
}

