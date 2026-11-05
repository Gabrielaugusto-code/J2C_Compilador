/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class mh
implements Callable {
    final /* synthetic */ int a;
    final /* synthetic */ mg b;

    mh(mg mg2, int n2) {
        this.b = mg2;
        this.a = n2;
    }

    public String a() {
        String string = "Once per " + this.a + " ticks";
        if (this.a == Integer.MAX_VALUE) {
            string = "Maximum (" + string + ")";
        }
        return string;
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

