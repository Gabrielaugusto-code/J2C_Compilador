/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ta {
    private static final Logger a = LogManager.getLogger();
    private List b = new ArrayList();
    private List c = new ArrayList();
    private final oz d;
    private int e;
    private int f = 3;

    public ta(oz oz2) {
        this.d = oz2;
    }

    public void a(int n2, sz sz2) {
        this.b.add(new tb(this, n2, sz2));
    }

    public void a(sz sz2) {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            tb tb2 = (tb)iterator.next();
            sz sz3 = tb2.a;
            if (sz3 != sz2) continue;
            if (this.c.contains(tb2)) {
                sz3.d();
                this.c.remove(tb2);
            }
            iterator.remove();
        }
    }

    public void a() {
        ArrayList<tb> arrayList = new ArrayList<tb>();
        if (this.e++ % this.f == 0) {
            for (tb tb2 : this.b) {
                boolean bl2 = this.c.contains(tb2);
                if (bl2) {
                    if (this.b(tb2) && this.a(tb2)) continue;
                    tb2.a.d();
                    this.c.remove(tb2);
                }
                if (!this.b(tb2) || !tb2.a.a()) continue;
                arrayList.add(tb2);
                this.c.add(tb2);
            }
        } else {
            Iterator iterator = this.c.iterator();
            while (iterator.hasNext()) {
                tb tb2;
                tb2 = (tb)iterator.next();
                if (tb2.a.b()) continue;
                tb2.a.d();
                iterator.remove();
            }
        }
        this.d.a("goalStart");
        for (tb tb2 : arrayList) {
            this.d.a(tb2.a.getClass().getSimpleName());
            tb2.a.c();
            this.d.b();
        }
        this.d.b();
        this.d.a("goalTick");
        for (tb tb2 : this.c) {
            tb2.a.e();
        }
        this.d.b();
    }

    private boolean a(tb tb2) {
        this.d.a("canContinue");
        boolean bl2 = tb2.a.b();
        this.d.b();
        return bl2;
    }

    private boolean b(tb tb2) {
        this.d.a("canUse");
        for (tb tb3 : this.b) {
            if (tb3 == tb2) continue;
            if (tb2.b >= tb3.b) {
                if (!this.c.contains(tb3) || this.a(tb2, tb3)) continue;
                this.d.b();
                return false;
            }
            if (!this.c.contains(tb3) || tb3.a.i()) continue;
            this.d.b();
            return false;
        }
        this.d.b();
        return true;
    }

    private boolean a(tb tb2, tb tb3) {
        return (tb2.a.j() & tb3.a.j()) == 0;
    }
}

