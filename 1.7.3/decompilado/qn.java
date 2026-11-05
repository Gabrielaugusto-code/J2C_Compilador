/*
 * Decompiled with CFR 0.152.
 */
public class qn {
    private int a;
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public qn(int n2, int n3) {
        this(n2, n3, 0);
    }

    public qn(int n2, int n3, int n4) {
        this(n2, n3, n4, false);
    }

    public qn(int n2, int n3, int n4, boolean bl2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.e = bl2;
    }

    public qn(qn qn2) {
        this.a = qn2.a;
        this.b = qn2.b;
        this.c = qn2.c;
    }

    public void a(qn qn2) {
        if (this.a != qn2.a) {
            System.err.println("This method should only be called for matching effects!");
        }
        if (qn2.c > this.c) {
            this.c = qn2.c;
            this.b = qn2.b;
        } else if (qn2.c == this.c && this.b < qn2.b) {
            this.b = qn2.b;
        } else if (!qn2.e && this.e) {
            this.e = qn2.e;
        }
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public boolean e() {
        return this.e;
    }

    public boolean a(rm rm2) {
        if (this.b > 0) {
            if (qm.a[this.a].a(this.b, this.c)) {
                this.b(rm2);
            }
            this.h();
        }
        return this.b > 0;
    }

    private int h() {
        return --this.b;
    }

    public void b(rm rm2) {
        if (this.b > 0) {
            qm.a[this.a].a(rm2, this.c);
        }
    }

    public String f() {
        return qm.a[this.a].a();
    }

    public int hashCode() {
        return this.a;
    }

    public String toString() {
        String string = "";
        string = this.c() > 0 ? this.f() + " x " + (this.c() + 1) + ", Duration: " + this.b() : this.f() + ", Duration: " + this.b();
        if (this.d) {
            string = string + ", Splash: true";
        }
        if (qm.a[this.a].i()) {
            return "(" + string + ")";
        }
        return string;
    }

    public boolean equals(Object object) {
        if (!(object instanceof qn)) {
            return false;
        }
        qn qn2 = (qn)object;
        return this.a == qn2.a && this.c == qn2.c && this.b == qn2.b && this.d == qn2.d && this.e == qn2.e;
    }

    public dg a(dg dg2) {
        dg2.a("Id", (byte)this.a());
        dg2.a("Amplifier", (byte)this.c());
        dg2.a("Duration", this.b());
        dg2.a("Ambient", this.e());
        return dg2;
    }

    public static qn b(dg dg2) {
        byte by2 = dg2.d("Id");
        if (by2 < 0 || by2 >= qm.a.length || qm.a[by2] == null) {
            return null;
        }
        byte by3 = dg2.d("Amplifier");
        int n2 = dg2.f("Duration");
        boolean bl2 = dg2.n("Ambient");
        return new qn(by2, n2, by3, bl2);
    }

    public void b(boolean bl2) {
        this.f = bl2;
    }

    public boolean g() {
        return this.f;
    }
}

