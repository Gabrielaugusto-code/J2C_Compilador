/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bqu
implements Callable {
    final /* synthetic */ bqw a;
    final /* synthetic */ bqs b;

    bqu(bqs bqs2, bqw bqw2) {
        this.b = bqs2;
        this.a = bqw2;
    }

    public String a() {
        return this.a.a() + " x " + this.a.b();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

