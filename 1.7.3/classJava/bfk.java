/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class bfk
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private final bgr f;
    private bvx g;
    private List h = Collections.emptyList();
    private bfm i;
    private int r = -1;
    private bau s;

    public bfk(bgr bgr2, bvx bvx2) {
        this.f = bgr2;
        this.g = bvx2;
    }

    @Override
    public void r_() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.n.clear();
        this.i = new bfm(this);
        bgl.a.submit(new bfl(this));
        this.h();
    }

    private void h() {
        this.n.add(new bau(0, this.l / 2 + 6, this.m - 52, 153, 20, bsc.a("gui.cancel", new Object[0])));
        this.s = new bau(1, this.l / 2 - 154, this.m - 52, 153, 20, bsc.a("mco.template.button.select", new Object[0]));
        this.n.add(this.s);
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
            this.i();
        } else if (bau2.k == 0) {
            this.f.a((Object)null);
            this.k.a(this.f);
        } else {
            this.i.a(bau2);
        }
    }

    private void i() {
        if (this.r >= 0 && this.r < this.h.size()) {
            this.f.a(this.h.get(this.r));
            this.k.a(this.f);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.i.a(n2, n3, f2);
        this.a(this.q, bsc.a("mco.template.title", new Object[0]), this.l / 2, 20, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ azi a(bfk bfk2) {
        return bfk2.k;
    }

    static /* synthetic */ List a(bfk bfk2, List list) {
        bfk2.h = list;
        return bfk2.h;
    }

    static /* synthetic */ Logger g() {
        return a;
    }

    static /* synthetic */ azi b(bfk bfk2) {
        return bfk2.k;
    }

    static /* synthetic */ List c(bfk bfk2) {
        return bfk2.h;
    }

    static /* synthetic */ int a(bfk bfk2, int n2) {
        bfk2.r = n2;
        return bfk2.r;
    }

    static /* synthetic */ bvx a(bfk bfk2, bvx bvx2) {
        bfk2.g = bvx2;
        return bfk2.g;
    }

    static /* synthetic */ bvx d(bfk bfk2) {
        return bfk2.g;
    }

    static /* synthetic */ int e(bfk bfk2) {
        return bfk2.r;
    }

    static /* synthetic */ ban f(bfk bfk2) {
        return bfk2.q;
    }

    static /* synthetic */ ban g(bfk bfk2) {
        return bfk2.q;
    }

    static /* synthetic */ ban h(bfk bfk2) {
        return bfk2.q;
    }

    static /* synthetic */ ban i(bfk bfk2) {
        return bfk2.q;
    }
}

