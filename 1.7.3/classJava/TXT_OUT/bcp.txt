/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bcp
extends bcl {
    private final bcl a;
    private final bac f;
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private String i;
    private String[] r;
    private bcq s;
    private bau t;

    public bcp(bcl bcl2, bac bac2) {
        this.a = bcl2;
        this.f = bac2;
    }

    @Override
    public void r_() {
        this.i = bsc.a("options.snooper.title", new Object[0]);
        String string = bsc.a("options.snooper.desc", new Object[0]);
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Iterator iterator : this.q.c(string, this.l - 30)) {
            arrayList.add((String)((Object)iterator));
        }
        this.r = arrayList.toArray(new String[0]);
        this.g.clear();
        this.h.clear();
        this.t = new bau(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(baf.x));
        this.n.add(this.t);
        this.n.add(new bau(2, this.l / 2 + 2, this.m - 30, 150, 20, bsc.a("gui.done", new Object[0])));
        boolean bl2 = this.k.H() != null && this.k.H().al() != null;
        for (Map.Entry entry : new TreeMap(this.k.J().c()).entrySet()) {
            this.g.add((bl2 ? "C " : "") + (String)entry.getKey());
            this.h.add(this.q.a((String)entry.getValue(), this.l - 220));
        }
        if (bl2) {
            for (Map.Entry entry : new TreeMap(this.k.H().al().c()).entrySet()) {
                this.g.add("S " + (String)entry.getKey());
                this.h.add(this.q.a((String)entry.getValue(), this.l - 220));
            }
        }
        this.s = new bcq(this);
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 2) {
            this.f.b();
            this.f.b();
            this.k.a(this.a);
        }
        if (bau2.k == 1) {
            this.f.a(baf.x, 1);
            this.t.j = this.f.c(baf.x);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.s.a(n2, n3, f2);
        this.a(this.q, this.i, this.l / 2, 8, 0xFFFFFF);
        int n4 = 22;
        for (String string : this.r) {
            this.a(this.q, string, this.l / 2, n4, 0x808080);
            n4 += this.q.a;
        }
        super.a(n2, n3, f2);
    }

    static /* synthetic */ List a(bcp bcp2) {
        return bcp2.g;
    }

    static /* synthetic */ List b(bcp bcp2) {
        return bcp2.h;
    }
}

