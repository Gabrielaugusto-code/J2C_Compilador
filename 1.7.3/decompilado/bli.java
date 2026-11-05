/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bli
implements Callable {
    final /* synthetic */ blg a;
    final /* synthetic */ blh b;

    bli(blh blh2, blg blg2) {
        this.b = blh2;
        this.a = blg2;
    }

    public String a() {
        return this.a.toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

