/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class oh {
    protected final Map a = new HashMap();

    public boolean a(ns ns2) {
        return this.a((ny)ns2) > 0;
    }

    public boolean b(ns ns2) {
        return ns2.c == null || this.a(ns2.c);
    }

    public int c(ns ns2) {
        if (this.a(ns2)) {
            return 0;
        }
        int n2 = 0;
        ns ns3 = ns2.c;
        while (ns3 != null && !this.a(ns3)) {
            ns3 = ns3.c;
            ++n2;
        }
        return n2;
    }

    public void b(xq xq2, ny ny2, int n2) {
        if (ny2.d() && !this.b((ns)ny2)) {
            return;
        }
        this.a(xq2, ny2, this.a(ny2) + n2);
    }

    public void a(xq xq2, ny ny2, int n2) {
        oe oe2 = (oe)this.a.get(ny2);
        if (oe2 == null) {
            oe2 = new oe();
            this.a.put(ny2, oe2);
        }
        oe2.a(n2);
    }

    public int a(ny ny2) {
        oe oe2 = (oe)this.a.get(ny2);
        return oe2 == null ? 0 : oe2.a();
    }

    public of b(ny ny2) {
        oe oe2 = (oe)this.a.get(ny2);
        if (oe2 != null) {
            return oe2.b();
        }
        return null;
    }

    public of a(ny ny2, of of2) {
        oe oe2 = (oe)this.a.get(ny2);
        if (oe2 == null) {
            oe2 = new oe();
            this.a.put(ny2, oe2);
        }
        oe2.a(of2);
        return of2;
    }
}

