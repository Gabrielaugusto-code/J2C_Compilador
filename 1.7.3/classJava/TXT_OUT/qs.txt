/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class qs
implements Callable {
    final /* synthetic */ qr a;

    qs(qr qr2) {
        this.a = qr2;
    }

    public String a() {
        return qx.b(this.a) + " (" + this.a.getClass().getCanonicalName() + ")";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

