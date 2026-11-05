/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class anj
implements Callable {
    final /* synthetic */ ani a;

    anj(ani ani2) {
        this.a = ani2;
    }

    public String a() {
        return (String)ani.v().get(this.a.getClass()) + " // " + this.a.getClass().getCanonicalName();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

