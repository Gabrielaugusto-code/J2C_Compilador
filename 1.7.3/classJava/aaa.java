/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class aaa
extends abs {
    public aaa() {
        this.h = 1;
        this.a(aak.e);
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        Object object;
        int n2;
        float f2;
        float f3;
        float f4;
        double d2;
        float f5;
        float f6 = 1.0f;
        float f7 = xq2.B + (xq2.z - xq2.B) * f6;
        float f8 = xq2.A + (xq2.y - xq2.A) * f6;
        double d3 = xq2.p + (xq2.s - xq2.p) * (double)f6;
        double d4 = xq2.q + (xq2.t - xq2.q) * (double)f6 + 1.62 - (double)xq2.L;
        double d5 = xq2.r + (xq2.u - xq2.r) * (double)f6;
        ayp ayp2 = afs2.V().a(d3, d4, d5);
        float f9 = oy.b(-f8 * ((float)Math.PI / 180) - (float)Math.PI);
        float f10 = oy.a(-f8 * ((float)Math.PI / 180) - (float)Math.PI);
        float f11 = f10 * (f5 = -oy.b(-f7 * ((float)Math.PI / 180)));
        ayp ayp3 = ayp2.c((double)f11 * (d2 = 5.0), (double)(f4 = (f3 = oy.a(-f7 * ((float)Math.PI / 180)))) * d2, (double)(f2 = f9 * f5) * d2);
        ayn ayn2 = afs2.a(ayp2, ayp3, true);
        if (ayn2 == null) {
            return abu2;
        }
        ayp ayp4 = xq2.j(f6);
        boolean bl2 = false;
        float f12 = 1.0f;
        List list = afs2.b((qr)xq2, xq2.C.a(ayp4.c * d2, ayp4.d * d2, ayp4.e * d2).b(f12, f12, f12));
        for (n2 = 0; n2 < list.size(); ++n2) {
            float f13;
            qr qr2 = (qr)list.get(n2);
            if (!qr2.Q() || !((ayk)(object = qr2.C.b(f13 = qr2.ae(), f13, f13))).a(ayp2)) continue;
            bl2 = true;
        }
        if (bl2) {
            return abu2;
        }
        if (ayn2.a == ayo.b) {
            n2 = ayn2.b;
            int n3 = ayn2.c;
            int n4 = ayn2.d;
            if (afs2.a(n2, n3, n4) == aie.aC) {
                --n3;
            }
            object = new vz(afs2, (float)n2 + 0.5f, (float)n3 + 1.0f, (float)n4 + 0.5f);
            ((vz)object).y = ((oy.c((double)(xq2.y * 4.0f / 360.0f) + 0.5) & 3) - 1) * 90;
            if (!afs2.a((qr)object, ((vz)object).C.b(-0.1, -0.1, -0.1)).isEmpty()) {
                return abu2;
            }
            if (!afs2.E) {
                afs2.d((qr)object);
            }
            if (!xq2.bE.d) {
                --abu2.b;
            }
        }
        return abu2;
    }
}

