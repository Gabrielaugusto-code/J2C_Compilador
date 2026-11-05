/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class atx
implements Callable {
    final /* synthetic */ atu a;

    atx(atu atu2) {
        this.a = atu2;
    }

    public String a() {
        return this.a.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

