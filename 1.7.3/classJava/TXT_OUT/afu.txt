/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class afu
implements Callable {
    final /* synthetic */ ahz a;
    final /* synthetic */ afs b;

    afu(afs afs2, ahz ahz2) {
        this.b = afs2;
        this.a = ahz2;
    }

    public String a() {
        try {
            return String.format("ID #%d (%s // %s)", ahz.b(this.a), this.a.a(), this.a.getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + ahz.b(this.a);
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

