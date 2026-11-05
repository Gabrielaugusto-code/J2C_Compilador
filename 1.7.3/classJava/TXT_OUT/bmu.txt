/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bmu
implements Callable {
    final /* synthetic */ double a;
    final /* synthetic */ double b;
    final /* synthetic */ double c;
    final /* synthetic */ bmt d;

    bmu(bmt bmt2, double d2, double d3, double d4) {
        this.d = bmt2;
        this.a = d2;
        this.b = d3;
        this.c = d4;
    }

    public String a() {
        return k.a(this.a, this.b, this.c);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

