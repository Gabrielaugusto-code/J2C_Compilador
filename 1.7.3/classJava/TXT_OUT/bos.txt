/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bos
implements Callable {
    final /* synthetic */ abu a;
    final /* synthetic */ bor b;

    bos(bor bor2, abu abu2) {
        this.b = bor2;
        this.a = abu2;
    }

    public String a() {
        return String.valueOf(this.a.b());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

