/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class baw
extends bap {
    private final ban a;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private String j = "";
    private int k = 32;
    private int l;
    private boolean m = true;
    private boolean n = true;
    private boolean o;
    private boolean p = true;
    private int q;
    private int r;
    private int s;
    private int t = 0xE0E0E0;
    private int u = 0x707070;
    private boolean v = true;

    public baw(ban ban2, int n2, int n3, int n4, int n5) {
        this.a = ban2;
        this.f = n2;
        this.g = n3;
        this.h = n4;
        this.i = n5;
    }

    public void a() {
        ++this.l;
    }

    public void a(String string) {
        this.j = string.length() > this.k ? string.substring(0, this.k) : string;
        this.e();
    }

    public String b() {
        return this.j;
    }

    public String c() {
        int n2 = this.r < this.s ? this.r : this.s;
        int n3 = this.r < this.s ? this.s : this.r;
        return this.j.substring(n2, n3);
    }

    public void b(String string) {
        String string2 = "";
        String string3 = t.a(string);
        int n2 = this.r < this.s ? this.r : this.s;
        int n3 = this.r < this.s ? this.s : this.r;
        int n4 = this.k - this.j.length() - (n2 - this.s);
        int n5 = 0;
        if (this.j.length() > 0) {
            string2 = string2 + this.j.substring(0, n2);
        }
        if (n4 < string3.length()) {
            string2 = string2 + string3.substring(0, n4);
            n5 = n4;
        } else {
            string2 = string2 + string3;
            n5 = string3.length();
        }
        if (this.j.length() > 0 && n3 < this.j.length()) {
            string2 = string2 + this.j.substring(n3);
        }
        this.j = string2;
        this.d(n2 - this.s + n5);
    }

    public void a(int n2) {
        if (this.j.length() == 0) {
            return;
        }
        if (this.s != this.r) {
            this.b("");
            return;
        }
        this.b(this.c(n2) - this.r);
    }

    public void b(int n2) {
        if (this.j.length() == 0) {
            return;
        }
        if (this.s != this.r) {
            this.b("");
            return;
        }
        boolean bl2 = n2 < 0;
        int n3 = bl2 ? this.r + n2 : this.r;
        int n4 = bl2 ? this.r : this.r + n2;
        String string = "";
        if (n3 >= 0) {
            string = this.j.substring(0, n3);
        }
        if (n4 < this.j.length()) {
            string = string + this.j.substring(n4);
        }
        this.j = string;
        if (bl2) {
            this.d(n2);
        }
    }

    public int c(int n2) {
        return this.a(n2, this.h());
    }

    public int a(int n2, int n3) {
        return this.a(n2, this.h(), true);
    }

    public int a(int n2, int n3, boolean bl2) {
        int n4 = n3;
        boolean bl3 = n2 < 0;
        int n5 = Math.abs(n2);
        for (int i2 = 0; i2 < n5; ++i2) {
            if (bl3) {
                while (bl2 && n4 > 0 && this.j.charAt(n4 - 1) == ' ') {
                    --n4;
                }
                while (n4 > 0 && this.j.charAt(n4 - 1) != ' ') {
                    --n4;
                }
                continue;
            }
            int n6 = this.j.length();
            if ((n4 = this.j.indexOf(32, n4)) == -1) {
                n4 = n6;
                continue;
            }
            while (bl2 && n4 < n6 && this.j.charAt(n4) == ' ') {
                ++n4;
            }
        }
        return n4;
    }

    public void d(int n2) {
        this.e(this.s + n2);
    }

    public void e(int n2) {
        this.r = n2;
        int n3 = this.j.length();
        if (this.r < 0) {
            this.r = 0;
        }
        if (this.r > n3) {
            this.r = n3;
        }
        this.i(this.r);
    }

    public void d() {
        this.e(0);
    }

    public void e() {
        this.e(this.j.length());
    }

    public boolean a(char c2, int n2) {
        if (!this.o) {
            return false;
        }
        switch (c2) {
            case '\u0001': {
                this.e();
                this.i(0);
                return true;
            }
            case '\u0003': {
                bcl.d(this.c());
                return true;
            }
            case '\u0016': {
                if (this.p) {
                    this.b(bcl.j());
                }
                return true;
            }
            case '\u0018': {
                bcl.d(this.c());
                if (this.p) {
                    this.b("");
                }
                return true;
            }
        }
        switch (n2) {
            case 203: {
                if (bcl.n()) {
                    if (bcl.m()) {
                        this.i(this.a(-1, this.n()));
                    } else {
                        this.i(this.n() - 1);
                    }
                } else if (bcl.m()) {
                    this.e(this.c(-1));
                } else {
                    this.d(-1);
                }
                return true;
            }
            case 205: {
                if (bcl.n()) {
                    if (bcl.m()) {
                        this.i(this.a(1, this.n()));
                    } else {
                        this.i(this.n() + 1);
                    }
                } else if (bcl.m()) {
                    this.e(this.c(1));
                } else {
                    this.d(1);
                }
                return true;
            }
            case 14: {
                if (bcl.m()) {
                    if (this.p) {
                        this.a(-1);
                    }
                } else if (this.p) {
                    this.b(-1);
                }
                return true;
            }
            case 211: {
                if (bcl.m()) {
                    if (this.p) {
                        this.a(1);
                    }
                } else if (this.p) {
                    this.b(1);
                }
                return true;
            }
            case 199: {
                if (bcl.n()) {
                    this.i(0);
                } else {
                    this.d();
                }
                return true;
            }
            case 207: {
                if (bcl.n()) {
                    this.i(this.j.length());
                } else {
                    this.e();
                }
                return true;
            }
        }
        if (t.a(c2)) {
            if (this.p) {
                this.b(Character.toString(c2));
            }
            return true;
        }
        return false;
    }

    public void a(int n2, int n3, int n4) {
        boolean bl2;
        boolean bl3 = bl2 = n2 >= this.f && n2 < this.f + this.h && n3 >= this.g && n3 < this.g + this.i;
        if (this.n) {
            this.b(bl2);
        }
        if (this.o && n4 == 0) {
            int n5 = n2 - this.f;
            if (this.m) {
                n5 -= 4;
            }
            String string = this.a.a(this.j.substring(this.q), this.o());
            this.e(this.a.a(string, n5).length() + this.q);
        }
    }

    public void f() {
        if (!this.q()) {
            return;
        }
        if (this.i()) {
            baw.a(this.f - 1, this.g - 1, this.f + this.h + 1, this.g + this.i + 1, -6250336);
            baw.a(this.f, this.g, this.f + this.h, this.g + this.i, -16777216);
        }
        int n2 = this.p ? this.t : this.u;
        int n3 = this.r - this.q;
        int n4 = this.s - this.q;
        String string = this.a.a(this.j.substring(this.q), this.o());
        boolean bl2 = n3 >= 0 && n3 <= string.length();
        boolean bl3 = this.o && this.l / 6 % 2 == 0 && bl2;
        int n5 = this.m ? this.f + 4 : this.f;
        int n6 = this.m ? this.g + (this.i - 8) / 2 : this.g;
        int n7 = n5;
        if (n4 > string.length()) {
            n4 = string.length();
        }
        if (string.length() > 0) {
            String string2 = bl2 ? string.substring(0, n3) : string;
            n7 = this.a.a(string2, n7, n6, n2);
        }
        boolean bl4 = this.r < this.j.length() || this.j.length() >= this.g();
        int n8 = n7;
        if (!bl2) {
            n8 = n3 > 0 ? n5 + this.h : n5;
        } else if (bl4) {
            --n8;
            --n7;
        }
        if (string.length() > 0 && bl2 && n3 < string.length()) {
            n7 = this.a.a(string.substring(n3), n7, n6, n2);
        }
        if (bl3) {
            if (bl4) {
                bap.a(n8, n6 - 1, n8 + 1, n6 + 1 + this.a.a, -3092272);
            } else {
                this.a.a("_", n8, n6, n2);
            }
        }
        if (n4 != n3) {
            int n9 = n5 + this.a.a(string.substring(0, n4));
            this.c(n8, n6 - 1, n9 - 1, n6 + 1 + this.a.a);
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        int n6;
        if (n2 < n4) {
            n6 = n2;
            n2 = n4;
            n4 = n6;
        }
        if (n3 < n5) {
            n6 = n3;
            n3 = n5;
            n5 = n6;
        }
        if (n4 > this.f + this.h) {
            n4 = this.f + this.h;
        }
        if (n2 > this.f + this.h) {
            n2 = this.f + this.h;
        }
        bna bna2 = bna.a;
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3058);
        GL11.glLogicOp((int)5387);
        bna2.b();
        bna2.a((double)n2, (double)n5, 0.0);
        bna2.a((double)n4, (double)n5, 0.0);
        bna2.a((double)n4, (double)n3, 0.0);
        bna2.a((double)n2, (double)n3, 0.0);
        bna2.a();
        GL11.glDisable((int)3058);
        GL11.glEnable((int)3553);
    }

    public void f(int n2) {
        this.k = n2;
        if (this.j.length() > n2) {
            this.j = this.j.substring(0, n2);
        }
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return this.r;
    }

    public boolean i() {
        return this.m;
    }

    public void a(boolean bl2) {
        this.m = bl2;
    }

    public void g(int n2) {
        this.t = n2;
    }

    public void h(int n2) {
        this.u = n2;
    }

    public void b(boolean bl2) {
        if (bl2 && !this.o) {
            this.l = 0;
        }
        this.o = bl2;
    }

    public boolean l() {
        return this.o;
    }

    public void c(boolean bl2) {
        this.p = bl2;
    }

    public int n() {
        return this.s;
    }

    public int o() {
        return this.i() ? this.h - 8 : this.h;
    }

    public void i(int n2) {
        int n3 = this.j.length();
        if (n2 > n3) {
            n2 = n3;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        this.s = n2;
        if (this.a != null) {
            if (this.q > n3) {
                this.q = n3;
            }
            int n4 = this.o();
            String string = this.a.a(this.j.substring(this.q), n4);
            int n5 = string.length() + this.q;
            if (n2 == this.q) {
                this.q -= this.a.a(this.j, n4, true).length();
            }
            if (n2 > n5) {
                this.q += n2 - n5;
            } else if (n2 <= this.q) {
                this.q -= this.q - n2;
            }
            if (this.q < 0) {
                this.q = 0;
            }
            if (this.q > n3) {
                this.q = n3;
            }
        }
    }

    public void d(boolean bl2) {
        this.n = bl2;
    }

    public boolean q() {
        return this.v;
    }

    public void e(boolean bl2) {
        this.v = bl2;
    }
}

