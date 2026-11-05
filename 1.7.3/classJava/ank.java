/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class ank
implements Callable {
    final /* synthetic */ ani a;

    ank(ani ani2) {
        this.a = ani2;
    }

    public String a() {
        int n2 = ahz.b(this.a.b.a(this.a.c, this.a.d, this.a.e));
        try {
            return String.format("ID #%d (%s // %s)", n2, ahz.e(n2).a(), ahz.e(n2).getClass().getCanonicalName());
        }
        catch (Throwable throwable) {
            return "ID #" + n2;
        }
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

