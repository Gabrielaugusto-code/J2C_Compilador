/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class anl
implements Callable {
    final /* synthetic */ ani a;

    anl(ani ani2) {
        this.a = ani2;
    }

    public String a() {
        int n2 = this.a.b.e(this.a.c, this.a.d, this.a.e);
        if (n2 < 0) {
            return "Unknown? (Got " + n2 + ")";
        }
        String string = String.format("%4s", Integer.toBinaryString(n2)).replace(" ", "0");
        return String.format("%1$d / 0x%1$X / 0b%2$s", n2, string);
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

