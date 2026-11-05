/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class nc
implements Callable {
    final /* synthetic */ fk a;
    final /* synthetic */ na b;

    nc(na na2, fk fk2) {
        this.b = na2;
        this.a = fk2;
    }

    public String a() {
        return this.a.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

