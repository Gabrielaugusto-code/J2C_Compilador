/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bqv
implements Callable {
    final /* synthetic */ bqw a;
    final /* synthetic */ bqs b;

    bqv(bqs bqs2, bqw bqw2) {
        this.b = bqs2;
        this.a = bqw2;
    }

    public String a() {
        return this.a.k() + " frames";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

