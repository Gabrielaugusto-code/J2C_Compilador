/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.Set;

public class ace
extends aax {
    private static final Set c = Sets.newHashSet((Object[])new ahz[]{aie.e, aie.T, aie.U, aie.b, aie.A, aie.Y, aie.p, aie.S, aie.q, aie.R, aie.o, aie.ag, aie.ah, aie.aD, aie.aL, aie.x, aie.y, aie.ax, aie.ay, aie.aq, aie.E, aie.D, aie.cc});

    protected ace(abt abt2) {
        super(2.0f, abt2, c);
    }

    @Override
    public boolean b(ahz ahz2) {
        if (ahz2 == aie.Z) {
            return this.b.d() == 3;
        }
        if (ahz2 == aie.ah || ahz2 == aie.ag) {
            return this.b.d() >= 2;
        }
        if (ahz2 == aie.bA || ahz2 == aie.bE) {
            return this.b.d() >= 2;
        }
        if (ahz2 == aie.R || ahz2 == aie.o) {
            return this.b.d() >= 2;
        }
        if (ahz2 == aie.S || ahz2 == aie.p) {
            return this.b.d() >= 1;
        }
        if (ahz2 == aie.y || ahz2 == aie.x) {
            return this.b.d() >= 1;
        }
        if (ahz2 == aie.ax || ahz2 == aie.ay) {
            return this.b.d() >= 2;
        }
        if (ahz2.o() == avk.e) {
            return true;
        }
        if (ahz2.o() == avk.f) {
            return true;
        }
        return ahz2.o() == avk.g;
    }

    @Override
    public float a(abu abu2, ahz ahz2) {
        if (ahz2.o() == avk.f || ahz2.o() == avk.g || ahz2.o() == avk.e) {
            return this.a;
        }
        return super.a(abu2, ahz2);
    }
}

