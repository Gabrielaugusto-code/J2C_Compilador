/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axs
implements Callable {
    final /* synthetic */ axj a;

    axs(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        return String.format("Game mode: %s (ID %d). Hardcore: %b. Cheats: %b", axj.o(this.a).b(), axj.o(this.a).a(), axj.p(this.a), axj.q(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

