/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

class mk {
    private final List b = new ArrayList();
    private final afl c;
    private short[] d = new short[64];
    private int e;
    private int f;
    private long g;
    final /* synthetic */ mj a;

    public mk(mj mj2, int n2, int n3) {
        this.a = mj2;
        this.c = new afl(n2, n3);
        mj2.a().b.c(n2, n3);
    }

    public void a(mp mp2) {
        if (this.b.contains(mp2)) {
            throw new IllegalStateException("Failed to add player. " + mp2 + " already is in chunk " + this.c.a + ", " + this.c.b);
        }
        if (this.b.isEmpty()) {
            this.g = mj.a(this.a).I();
        }
        this.b.add(mp2);
        mp2.f.add(this.c);
    }

    public void b(mp mp2) {
        if (!this.b.contains(mp2)) {
            return;
        }
        aoo aoo2 = mj.a(this.a).e(this.c.a, this.c.b);
        if (aoo2.k()) {
            mp2.a.a(new go(aoo2, true, 0));
        }
        this.b.remove(mp2);
        mp2.f.remove(this.c);
        if (this.b.isEmpty()) {
            long l2 = (long)this.c.a + Integer.MAX_VALUE | (long)this.c.b + Integer.MAX_VALUE << 32;
            this.a(aoo2);
            mj.b(this.a).d(l2);
            mj.c(this.a).remove(this);
            if (this.e > 0) {
                mj.d(this.a).remove(this);
            }
            this.a.a().b.b(this.c.a, this.c.b);
        }
    }

    public void a() {
        this.a(mj.a(this.a).e(this.c.a, this.c.b));
    }

    private void a(aoo aoo2) {
        aoo2.s += mj.a(this.a).I() - this.g;
        this.g = mj.a(this.a).I();
    }

    public void a(int n2, int n3, int n4) {
        if (this.e == 0) {
            mj.d(this.a).add(this);
        }
        this.f |= 1 << (n3 >> 4);
        if (this.e < 64) {
            short s2 = (short)(n2 << 12 | n4 << 8 | n3);
            for (int i2 = 0; i2 < this.e; ++i2) {
                if (this.d[i2] != s2) continue;
                return;
            }
            this.d[this.e++] = s2;
        }
    }

    public void a(fk fk2) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            mp mp2 = (mp)this.b.get(i2);
            if (mp2.f.contains(this.c)) continue;
            mp2.a.a(fk2);
        }
    }

    public void b() {
        if (this.e == 0) {
            return;
        }
        if (this.e == 1) {
            int n2 = this.c.a * 16 + (this.d[0] >> 12 & 0xF);
            int n3 = this.d[0] & 0xFF;
            int n4 = this.c.b * 16 + (this.d[0] >> 8 & 0xF);
            this.a(new fy(n2, n3, n4, mj.a(this.a)));
            if (mj.a(this.a).a(n2, n3, n4).u()) {
                this.a(mj.a(this.a).o(n2, n3, n4));
            }
        } else if (this.e == 64) {
            int n5 = this.c.a * 16;
            int n6 = this.c.b * 16;
            this.a(new go(mj.a(this.a).e(this.c.a, this.c.b), false, this.f));
            for (int i2 = 0; i2 < 16; ++i2) {
                if ((this.f & 1 << i2) == 0) continue;
                int n7 = i2 << 4;
                List list = mj.a(this.a).a(n5, n7, n6, n5 + 16, n7 + 16, n6 + 16);
                for (int i3 = 0; i3 < list.size(); ++i3) {
                    this.a((ani)list.get(i3));
                }
            }
        } else {
            this.a(new gb(this.e, this.d, mj.a(this.a).e(this.c.a, this.c.b)));
            for (int i4 = 0; i4 < this.e; ++i4) {
                int n8 = this.c.a * 16 + (this.d[i4] >> 12 & 0xF);
                int n9 = this.d[i4] & 0xFF;
                int n10 = this.c.b * 16 + (this.d[i4] >> 8 & 0xF);
                if (!mj.a(this.a).a(n8, n9, n10).u()) continue;
                this.a(mj.a(this.a).o(n8, n9, n10));
            }
        }
        this.e = 0;
        this.f = 0;
    }

    private void a(ani ani2) {
        fk fk2;
        if (ani2 != null && (fk2 = ani2.m()) != null) {
            this.a(fk2);
        }
    }

    static /* synthetic */ afl a(mk mk2) {
        return mk2.c;
    }

    static /* synthetic */ List b(mk mk2) {
        return mk2.b;
    }
}

