/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class mg {
    private static final Logger a = LogManager.getLogger();
    private final mm b;
    private Set c = new HashSet();
    private oq d = new oq();
    private int e;

    public mg(mm mm2) {
        this.b = mm2;
        this.e = mm2.q().af().a();
    }

    public void a(qr qr2) {
        if (qr2 instanceof mp) {
            this.a(qr2, 512, 2);
            mp mp2 = (mp)qr2;
            for (mr mr2 : this.c) {
                if (mr2.a == mp2) continue;
                mr2.b(mp2);
            }
        } else if (qr2 instanceof vv) {
            this.a(qr2, 64, 5, true);
        } else if (qr2 instanceof xt) {
            this.a(qr2, 64, 20, false);
        } else if (qr2 instanceof xz) {
            this.a(qr2, 64, 10, false);
        } else if (qr2 instanceof xv) {
            this.a(qr2, 64, 10, false);
        } else if (qr2 instanceof ya) {
            this.a(qr2, 64, 10, true);
        } else if (qr2 instanceof yd) {
            this.a(qr2, 64, 10, true);
        } else if (qr2 instanceof xu) {
            this.a(qr2, 64, 4, true);
        } else if (qr2 instanceof yc) {
            this.a(qr2, 64, 10, true);
        } else if (qr2 instanceof yf) {
            this.a(qr2, 64, 10, true);
        } else if (qr2 instanceof ye) {
            this.a(qr2, 64, 10, true);
        } else if (qr2 instanceof xw) {
            this.a(qr2, 64, 10, true);
        } else if (qr2 instanceof wb) {
            this.a(qr2, 64, 20, true);
        } else if (qr2 instanceof wc) {
            this.a(qr2, 80, 3, true);
        } else if (qr2 instanceof vz) {
            this.a(qr2, 80, 3, true);
        } else if (qr2 instanceof vj) {
            this.a(qr2, 64, 3, true);
        } else if (qr2 instanceof vt) {
            this.a(qr2, 80, 3, false);
        } else if (qr2 instanceof uv) {
            this.a(qr2, 80, 3, false);
        } else if (qr2 instanceof qp) {
            this.a(qr2, 80, 3, true);
        } else if (qr2 instanceof vr) {
            this.a(qr2, 160, 3, true);
        } else if (qr2 instanceof wn) {
            this.a(qr2, 160, 10, true);
        } else if (qr2 instanceof wa) {
            this.a(qr2, 160, 20, true);
        } else if (qr2 instanceof rj) {
            this.a(qr2, 160, Integer.MAX_VALUE, false);
        } else if (qr2 instanceof rh) {
            this.a(qr2, 160, 20, true);
        } else if (qr2 instanceof vq) {
            this.a(qr2, 256, Integer.MAX_VALUE, false);
        }
    }

    public void a(qr qr2, int n2, int n3) {
        this.a(qr2, n2, n3, false);
    }

    public void a(qr qr2, int n2, int n3, boolean bl2) {
        if (n2 > this.e) {
            n2 = this.e;
        }
        try {
            if (this.d.b(qr2.x())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            mr mr2 = new mr(qr2, n2, n3, bl2);
            this.c.add(mr2);
            this.d.a(qr2.x(), mr2);
            mr2.b(this.b.h);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Adding entity to track");
            k k2 = b2.a("Entity To Track");
            k2.a("Tracking range", n2 + " blocks");
            k2.a("Update interval", new mh(this, n3));
            qr2.a(k2);
            k k3 = b2.a("Entity That Is Already Tracked");
            ((mr)this.d.a((int)qr2.x())).a.a(k3);
            try {
                throw new s(b2);
            }
            catch (s s2) {
                a.error("\"Silently\" catching entity tracking error.", (Throwable)s2);
            }
        }
    }

    public void b(qr qr2) {
        Object object;
        if (qr2 instanceof mp) {
            object = (mp)qr2;
            for (mr mr2 : this.c) {
                mr2.a((mp)object);
            }
        }
        if ((object = (mr)this.d.d(qr2.x())) != null) {
            this.c.remove(object);
            ((mr)object).a();
        }
    }

    public void a() {
        ArrayList<mp> arrayList = new ArrayList<mp>();
        for (Object object : this.c) {
            ((mr)object).a(this.b.h);
            if (!((mr)object).n || !(((mr)object).a instanceof mp)) continue;
            arrayList.add((mp)((mr)object).a);
        }
        for (int i2 = 0; i2 < arrayList.size(); ++i2) {
            Object object;
            object = (mp)arrayList.get(i2);
            for (mr mr2 : this.c) {
                if (mr2.a == object) continue;
                mr2.b((mp)object);
            }
        }
    }

    public void a(qr qr2, fk fk2) {
        mr mr2 = (mr)this.d.a(qr2.x());
        if (mr2 != null) {
            mr2.a(fk2);
        }
    }

    public void b(qr qr2, fk fk2) {
        mr mr2 = (mr)this.d.a(qr2.x());
        if (mr2 != null) {
            mr2.b(fk2);
        }
    }

    public void a(mp mp2) {
        for (mr mr2 : this.c) {
            mr2.c(mp2);
        }
    }

    public void a(mp mp2, aoo aoo2) {
        for (mr mr2 : this.c) {
            if (mr2.a == mp2 || mr2.a.ah != aoo2.g || mr2.a.aj != aoo2.h) continue;
            mr2.b(mp2);
        }
    }
}

