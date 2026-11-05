/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class un {
    rn a;
    List b = new ArrayList();
    List c = new ArrayList();

    public un(rn rn2) {
        this.a = rn2;
    }

    public void a() {
        this.b.clear();
        this.c.clear();
    }

    public boolean a(qr qr2) {
        if (this.b.contains(qr2)) {
            return true;
        }
        if (this.c.contains(qr2)) {
            return false;
        }
        this.a.o.C.a("canSee");
        boolean bl2 = this.a.p(qr2);
        this.a.o.C.b();
        if (bl2) {
            this.b.add(qr2);
        } else {
            this.c.add(qr2);
        }
        return bl2;
    }
}

