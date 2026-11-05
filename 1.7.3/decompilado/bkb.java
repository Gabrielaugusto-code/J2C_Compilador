/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bkb
implements Callable {
    final /* synthetic */ bka a;

    bkb(bka bka2) {
        this.a = bka2;
    }

    public String a() {
        return bka.a(this.a).size() + " total; " + bka.a(this.a).toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

