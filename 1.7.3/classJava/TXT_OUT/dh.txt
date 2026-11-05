/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class dh
implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ dg b;

    dh(dg dg2, String string) {
        this.b = dg2;
        this.a = string;
    }

    public String a() {
        return du.a[((du)dg.a(this.b).get(this.a)).a()];
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

