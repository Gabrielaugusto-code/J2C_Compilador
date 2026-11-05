/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bfv
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bcl f;
    private bfz g;
    private List h = Lists.newArrayList();
    private int i = -1;

    public bfv(bcl bcl2) {
        this.f = bcl2;
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.g = new bfz(this);
        bgl.a.submit(new bfw(this));
        this.h();
    }

    private void h() {
        this.n.add(new bau(1, this.l / 2 - 154, this.m - 52, 153, 20, bsc.a("mco.invites.button.accept", new Object[0])));
        this.n.add(new bau(2, this.l / 2 + 6, this.m - 52, 153, 20, bsc.a("mco.invites.button.reject", new Object[0])));
        this.n.add(new bau(0, this.l / 2 - 75, this.m - 28, 153, 20, bsc.a("gui.back", new Object[0])));
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 1) {
            this.p();
        } else if (bau2.k == 0) {
            this.k.a(new bfq(this.f));
        } else if (bau2.k == 2) {
            this.i();
        } else {
            this.g.a(bau2);
        }
    }

    private void i() {
        if (this.i >= 0 && this.i < this.h.size()) {
            bgl.a.submit(new bfx(this));
        }
    }

    private void p() {
        if (this.i >= 0 && this.i < this.h.size()) {
            bgl.a.submit(new bfy(this));
        }
    }

    private void q() {
        int n2 = this.i;
        if (this.h.size() - 1 == this.i) {
            --this.i;
        }
        this.h.remove(n2);
        if (this.h.size() == 0) {
            this.i = -1;
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.g.a(n2, n3, f2);
        this.a(this.q, bsc.a("mco.invites.title", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ azi a(bfv bfv2) {
        return bfv2.k;
    }

    static /* synthetic */ List a(bfv bfv2, List list) {
        bfv2.h = list;
        return bfv2.h;
    }

    static /* synthetic */ Logger g() {
        return a;
    }

    static /* synthetic */ azi b(bfv bfv2) {
        return bfv2.k;
    }

    static /* synthetic */ int c(bfv bfv2) {
        return bfv2.i;
    }

    static /* synthetic */ List d(bfv bfv2) {
        return bfv2.h;
    }

    static /* synthetic */ void e(bfv bfv2) {
        bfv2.q();
    }

    static /* synthetic */ azi f(bfv bfv2) {
        return bfv2.k;
    }

    static /* synthetic */ azi g(bfv bfv2) {
        return bfv2.k;
    }

    static /* synthetic */ int a(bfv bfv2, int n2) {
        bfv2.i = n2;
        return bfv2.i;
    }

    static /* synthetic */ ban h(bfv bfv2) {
        return bfv2.q;
    }

    static /* synthetic */ ban i(bfv bfv2) {
        return bfv2.q;
    }
}

