/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class azs
implements Callable {
    final /* synthetic */ azi a;

    azs(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        return this.a.n.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

