/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class di
implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ dg b;

    di(dg dg2, int n2) {
        this.b = dg2;
        this.a = n2;
    }

    public String a() {
        return du.a[this.a];
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

