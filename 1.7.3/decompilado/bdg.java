/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.lwjgl.input.Mouse;

abstract class bdg
extends bbf {
    protected int l;
    protected List m;
    protected Comparator n;
    protected int o;
    protected int p;
    final /* synthetic */ bcz q;

    protected bdg(bcz bcz2) {
        this.q = bcz2;
        super(bcz.f(bcz2), bcz2.l, bcz2.m, 32, bcz2.m - 64, 20);
        this.l = -1;
        this.o = -1;
        this.a(false);
        this.a(true, 20);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void a() {
        this.q.q_();
    }

    @Override
    protected void a(int n2, int n3, bna bna2) {
        if (!Mouse.isButtonDown((int)0)) {
            this.l = -1;
        }
        if (this.l == 0) {
            bcz.a(this.q, n2 + 115 - 18, n3 + 1, 0, 0);
        } else {
            bcz.a(this.q, n2 + 115 - 18, n3 + 1, 0, 18);
        }
        if (this.l == 1) {
            bcz.a(this.q, n2 + 165 - 18, n3 + 1, 0, 0);
        } else {
            bcz.a(this.q, n2 + 165 - 18, n3 + 1, 0, 18);
        }
        if (this.l == 2) {
            bcz.a(this.q, n2 + 215 - 18, n3 + 1, 0, 0);
        } else {
            bcz.a(this.q, n2 + 215 - 18, n3 + 1, 0, 18);
        }
        if (this.o != -1) {
            int n4 = 79;
            int n5 = 18;
            if (this.o == 1) {
                n4 = 129;
            } else if (this.o == 2) {
                n4 = 179;
            }
            if (this.p == 1) {
                n5 = 36;
            }
            bcz.a(this.q, n2 + n4, n3 + 1, n5, 0);
        }
    }

    @Override
    protected void a(int n2, int n3) {
        this.l = -1;
        if (n2 >= 79 && n2 < 115) {
            this.l = 0;
        } else if (n2 >= 129 && n2 < 165) {
            this.l = 1;
        } else if (n2 >= 179 && n2 < 215) {
            this.l = 2;
        }
        if (this.l >= 0) {
            this.h(this.l);
            bcz.g(this.q).X().a(btb.a(new brq("gui.button.press"), 1.0f));
        }
    }

    @Override
    protected final int b() {
        return this.m.size();
    }

    protected final nw c(int n2) {
        return (nw)this.m.get(n2);
    }

    protected abstract String b(int var1);

    protected void a(ny ny2, int n2, int n3, boolean bl2) {
        if (ny2 != null) {
            String string = ny2.a(bcz.c(this.q).a(ny2));
            this.q.b(bcz.h(this.q), string, n2 - bcz.i(this.q).a(string), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        } else {
            String string = "-";
            this.q.b(bcz.j(this.q), string, n2 - bcz.k(this.q).a(string), n3 + 5, bl2 ? 0xFFFFFF : 0x909090);
        }
    }

    @Override
    protected void b(int n2, int n3) {
        if (n3 < this.b || n3 > this.c) {
            return;
        }
        int n4 = this.c(n2, n3);
        int n5 = this.a / 2 - 92 - 16;
        if (n4 >= 0) {
            if (n2 < n5 + 40 || n2 > n5 + 40 + 20) {
                return;
            }
            nw nw2 = this.c(n4);
            this.a(nw2, n2, n3);
        } else {
            String string = "";
            if (n2 >= n5 + 115 - 18 && n2 <= n5 + 115) {
                string = this.b(0);
            } else if (n2 >= n5 + 165 - 18 && n2 <= n5 + 165) {
                string = this.b(1);
            } else if (n2 >= n5 + 215 - 18 && n2 <= n5 + 215) {
                string = this.b(2);
            } else {
                return;
            }
            string = ("" + bsc.a(string, new Object[0])).trim();
            if (string.length() > 0) {
                int n6 = n2 + 12;
                int n7 = n3 - 12;
                int n8 = bcz.l(this.q).a(string);
                bcz.a(this.q, n6 - 3, n7 - 3, n6 + n8 + 3, n7 + 8 + 3, -1073741824, -1073741824);
                bcz.m(this.q).a(string, n6, n7, -1);
            }
        }
    }

    protected void a(nw nw2, int n2, int n3) {
        if (nw2 == null) {
            return;
        }
        abs abs2 = nw2.a();
        String string = ("" + bsc.a(abs2.a() + ".name", new Object[0])).trim();
        if (string.length() > 0) {
            int n4 = n2 + 12;
            int n5 = n3 - 12;
            int n6 = bcz.n(this.q).a(string);
            bcz.b(this.q, n4 - 3, n5 - 3, n4 + n6 + 3, n5 + 8 + 3, -1073741824, -1073741824);
            bcz.o(this.q).a(string, n4, n5, -1);
        }
    }

    protected void h(int n2) {
        if (n2 != this.o) {
            this.o = n2;
            this.p = -1;
        } else if (this.p == -1) {
            this.p = 1;
        } else {
            this.o = -1;
            this.p = 0;
        }
        Collections.sort(this.m, this.n);
    }
}

