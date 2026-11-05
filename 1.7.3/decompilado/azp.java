/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class azp
implements Callable {
    final /* synthetic */ azi a;

    azp(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        if (this.a.u.J == 1) {
            return "Off (1)";
        }
        return "On (" + this.a.u.J + ")";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

