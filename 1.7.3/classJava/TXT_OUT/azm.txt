/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class azm
implements Callable {
    final /* synthetic */ azi a;

    azm(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        return azi.b(this.a).c().toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

