/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axo
implements Callable {
    final /* synthetic */ axj a;

    axo(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        return String.format("%d game time, %d day time", axj.g(this.a), axj.h(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

