/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class afv
implements Callable {
    final /* synthetic */ afs a;

    afv(afs afs2) {
        this.a = afs2;
    }

    public String a() {
        return this.a.h.size() + " total; " + this.a.h.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

