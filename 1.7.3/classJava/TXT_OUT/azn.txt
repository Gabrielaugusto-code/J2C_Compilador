/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class azn
implements Callable {
    final /* synthetic */ azi a;

    azn(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        return this.a.z.a ? this.a.z.c() : "N/A (disabled)";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

