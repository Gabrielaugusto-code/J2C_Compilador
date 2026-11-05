/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bkc
implements Callable {
    final /* synthetic */ bka a;

    bkc(bka bka2) {
        this.a = bka2;
    }

    public String a() {
        return bka.b(this.a).size() + " total; " + bka.b(this.a).toString();
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

