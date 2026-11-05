/*
 * Decompiled with CFR 0.152.
 */
public class avk {
    public static final avk a = new avi(avm.b);
    public static final avk b = new avk(avm.c);
    public static final avk c = new avk(avm.l);
    public static final avk d = new avk(avm.o).g();
    public static final avk e = new avk(avm.m).f();
    public static final avk f = new avk(avm.h).f();
    public static final avk g = new avk(avm.h).f().o();
    public static final avk h = new avj(avm.n).n();
    public static final avk i = new avj(avm.f).n();
    public static final avk j = new avk(avm.i).g().s().n();
    public static final avk k = new avh(avm.i).n();
    public static final avk l = new avh(avm.i).g().n().i();
    public static final avk m = new avk(avm.e);
    public static final avk n = new avk(avm.e).g();
    public static final avk o = new avi(avm.b).n();
    public static final avk p = new avk(avm.d);
    public static final avk q = new avh(avm.b).n();
    public static final avk r = new avh(avm.e).g();
    public static final avk s = new avk(avm.b).s().p();
    public static final avk t = new avk(avm.b).p();
    public static final avk u = new avk(avm.f).g().s();
    public static final avk v = new avk(avm.i).n();
    public static final avk w = new avk(avm.g).s().p();
    public static final avk x = new avk(avm.g).p();
    public static final avk y = new avh(avm.j).i().s().f().n();
    public static final avk z = new avk(avm.j).f();
    public static final avk A = new avk(avm.i).s().n();
    public static final avk B = new avk(avm.k);
    public static final avk C = new avk(avm.i).n();
    public static final avk D = new avk(avm.i).n();
    public static final avk E = new avn(avm.b).o();
    public static final avk F = new avk(avm.b).n();
    public static final avk G = new avl(avm.e).f().n();
    public static final avk H = new avk(avm.m).o();
    private boolean I;
    private boolean J;
    private boolean K;
    private final avm L;
    private boolean M = true;
    private int N;
    private boolean O;

    public avk(avm avm2) {
        this.L = avm2;
    }

    public boolean d() {
        return false;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    private avk s() {
        this.K = true;
        return this;
    }

    protected avk f() {
        this.M = false;
        return this;
    }

    protected avk g() {
        this.I = true;
        return this;
    }

    public boolean h() {
        return this.I;
    }

    public avk i() {
        this.J = true;
        return this;
    }

    public boolean j() {
        return this.J;
    }

    public boolean k() {
        if (this.K) {
            return false;
        }
        return this.c();
    }

    public boolean l() {
        return this.M;
    }

    public int m() {
        return this.N;
    }

    protected avk n() {
        this.N = 1;
        return this;
    }

    protected avk o() {
        this.N = 2;
        return this;
    }

    protected avk p() {
        this.O = true;
        return this;
    }

    public boolean q() {
        return this.O;
    }

    public avm r() {
        return this.L;
    }
}

