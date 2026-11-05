/*
 * Decompiled with CFR 0.152.
 */
public class atz
extends axc {
    private dg a = new dg();

    public atz(String string) {
        super(string);
    }

    @Override
    public void a(dg dg2) {
        this.a = dg2.m("Features");
    }

    @Override
    public void b(dg dg2) {
        dg2.a("Features", this.a);
    }

    public void a(dg dg2, int n2, int n3) {
        this.a.a(atz.b(n2, n3), dg2);
    }

    public static String b(int n2, int n3) {
        return "[" + n2 + "," + n3 + "]";
    }

    public dg a() {
        return this.a;
    }
}

