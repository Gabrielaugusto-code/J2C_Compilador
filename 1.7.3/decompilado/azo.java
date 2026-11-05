/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

class azo
implements Callable {
    final /* synthetic */ azi a;

    azo(azi azi2) {
        this.a = azi2;
    }

    public String a() {
        int n2 = this.a.f.V().c();
        int n3 = 56 * n2;
        int n4 = n3 / 1024 / 1024;
        int n5 = this.a.f.V().d();
        int n6 = 56 * n5;
        int n7 = n6 / 1024 / 1024;
        return n2 + " (" + n3 + " bytes; " + n4 + " MB) allocated, " + n5 + " (" + n6 + " bytes; " + n7 + " MB) used";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

