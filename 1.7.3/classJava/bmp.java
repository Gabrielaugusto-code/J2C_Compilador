/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class bmp
implements Callable {
    final /* synthetic */ bat a;
    final /* synthetic */ bmm b;

    bmp(bmm bmm2, bat bat2) {
        this.b = bmm2;
        this.a = bat2;
    }

    public String a() {
        return String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", this.a.a(), this.a.b(), bmm.a((bmm)this.b).d, bmm.a((bmm)this.b).e, this.a.e());
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

