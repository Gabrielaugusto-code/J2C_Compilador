/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public abstract class aek {
    public static final aek[] b = new aek[256];
    public static final aek[] c;
    public static final aek d;
    public static final aek e;
    public static final aek f;
    public static final aek g;
    public static final aek h;
    public static final aek i;
    public static final aek j;
    public static final aek k;
    public static final aek l;
    public static final aek m;
    public static final aek n;
    public static final aek o;
    public static final aek p;
    public static final aek q;
    public static final aek r;
    public static final aek s;
    public static final aek t;
    public static final aek u;
    public static final aek v;
    public static final aek w;
    public static final aek x;
    public static final aek y;
    public static final aek z;
    public static final aek A;
    public final int B;
    private final int a;
    public ael C;
    protected String D;

    protected aek(int n2, int n3, ael ael2) {
        this.B = n2;
        this.a = n3;
        this.C = ael2;
        if (b[n2] != null) {
            throw new IllegalArgumentException("Duplicate enchantment id!");
        }
        aek.b[n2] = this;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return 1;
    }

    public int b() {
        return 1;
    }

    public int a(int n2) {
        return 1 + n2 * 10;
    }

    public int b(int n2) {
        return this.a(n2) + 5;
    }

    public int a(int n2, qf qf2) {
        return 0;
    }

    public float a(int n2, rq rq2) {
        return 0.0f;
    }

    public boolean a(aek aek2) {
        return this != aek2;
    }

    public aek b(String string) {
        this.D = string;
        return this;
    }

    public String a() {
        return "enchantment." + this.D;
    }

    public String c(int n2) {
        String string = dc.a(this.a());
        return string + " " + dc.a("enchantment.level." + n2);
    }

    public boolean a(abu abu2) {
        return this.C.a(abu2.b());
    }

    public void a(rm rm2, qr qr2, int n2) {
    }

    public void b(rm rm2, qr qr2, int n2) {
    }

    static {
        d = new aez(0, 10, 0);
        e = new aez(1, 5, 1);
        f = new aez(2, 5, 2);
        g = new aez(3, 2, 3);
        h = new aez(4, 5, 4);
        i = new aey(5, 2);
        j = new afc(6, 2);
        k = new afa(7, 1);
        l = new aeh(16, 10, 0);
        m = new aeh(17, 5, 1);
        n = new aeh(18, 5, 2);
        o = new aew(19, 5);
        p = new aeu(20, 2);
        q = new aex(21, 2, ael.g);
        r = new aej(32, 10);
        s = new afb(33, 1);
        t = new aei(34, 5);
        u = new aex(35, 2, ael.h);
        v = new aed(48, 10);
        w = new aeg(49, 2);
        x = new aee(50, 2);
        y = new aef(51, 1);
        z = new aex(61, 2, ael.i);
        A = new aev(62, 2, ael.i);
        ArrayList<aek> arrayList = new ArrayList<aek>();
        for (aek aek2 : b) {
            if (aek2 == null) continue;
            arrayList.add(aek2);
        }
        c = arrayList.toArray(new aek[0]);
    }
}

