/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axk
implements Callable {
    final /* synthetic */ axj a;

    axk(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        return String.valueOf(this.a.b());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

