/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axr
implements Callable {
    final /* synthetic */ axj a;

    axr(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", axj.k(this.a), axj.l(this.a), axj.m(this.a), axj.n(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

