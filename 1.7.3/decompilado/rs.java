/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class rs
extends rj {
    public rt e;

    public rs(afs afs2) {
        super(afs2);
    }

    public rs(afs afs2, int n2, int n3, int n4, int n5) {
        super(afs2, n2, n3, n4, n5);
        ArrayList<rt> arrayList = new ArrayList<rt>();
        rt[] rtArray = rt.values();
        int n6 = rtArray.length;
        for (int i2 = 0; i2 < n6; ++i2) {
            rt rt2;
            this.e = rt2 = rtArray[i2];
            this.a(n5);
            if (!this.e()) continue;
            arrayList.add(rt2);
        }
        if (!arrayList.isEmpty()) {
            this.e = (rt)((Object)arrayList.get(this.Z.nextInt(arrayList.size())));
        }
        this.a(n5);
    }

    public rs(afs afs2, int n2, int n3, int n4, int n5, String string) {
        this(afs2, n2, n3, n4, n5);
        for (rt rt2 : rt.values()) {
            if (!rt2.B.equals(string)) continue;
            this.e = rt2;
            break;
        }
        this.a(n5);
    }

    @Override
    public void b(dg dg2) {
        dg2.a("Motive", this.e.B);
        super.b(dg2);
    }

    @Override
    public void a(dg dg2) {
        String string = dg2.j("Motive");
        for (rt rt2 : rt.values()) {
            if (!rt2.B.equals(string)) continue;
            this.e = rt2;
        }
        if (this.e == null) {
            this.e = rt.a;
        }
        super.a(dg2);
    }

    @Override
    public int f() {
        return this.e.C;
    }

    @Override
    public int i() {
        return this.e.D;
    }

    @Override
    public void b(qr qr2) {
        if (qr2 instanceof xq) {
            xq xq2 = (xq)qr2;
            if (xq2.bE.d) {
                return;
            }
        }
        this.a(new abu(abv.an), 0.0f);
    }
}

