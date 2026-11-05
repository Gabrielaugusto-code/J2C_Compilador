/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axp
implements Callable {
    final /* synthetic */ axj a;

    axp(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        return String.valueOf(axj.i(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

