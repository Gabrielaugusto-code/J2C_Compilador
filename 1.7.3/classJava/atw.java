/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class atw
implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ atu c;

    atw(atu atu2, int n2, int n3) {
        this.c = atu2;
        this.a = n2;
        this.b = n3;
    }

    public String a() {
        return String.valueOf(afl.a(this.a, this.b));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

