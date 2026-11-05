/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class axl
implements Callable {
    final /* synthetic */ axj a;

    axl(axj axj2) {
        this.a = axj2;
    }

    public String a() {
        return String.format("ID %02d - %s, ver %d. Features enabled: %b", axj.a(this.a).g(), axj.a(this.a).a(), axj.a(this.a).d(), axj.b(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

