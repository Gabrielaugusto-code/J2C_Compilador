/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class ue
extends ul {
    boolean a;
    private int b;

    public ue(ru ru2, boolean bl2) {
        super(ru2, false);
        this.a = bl2;
        this.a(1);
    }

    @Override
    public boolean a() {
        int n2 = this.c.aJ();
        return n2 != this.b && this.a(this.c.aI(), false);
    }

    @Override
    public void c() {
        this.c.d(this.c.aI());
        this.b = this.c.aJ();
        if (this.a) {
            double d2 = this.f();
            List list = this.c.o.a(this.c.getClass(), ayk.a().a(this.c.s, this.c.t, this.c.u, this.c.s + 1.0, this.c.t + 1.0, this.c.u + 1.0).b(d2, 10.0, d2));
            for (ru ru2 : list) {
                if (this.c == ru2 || ru2.o() != null || ru2.c(this.c.aI())) continue;
                ru2.d(this.c.aI());
            }
        }
        super.c();
    }
}

