/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

class brx
implements oo {
    final /* synthetic */ brv a;

    brx(brv brv2) {
        this.a = brv2;
    }

    @Override
    public void a(File file) {
        if (!brv.a(this.a)) {
            return;
        }
        brv.a(this.a, false);
        brv.a(this.a, new brk(file));
        azi.B().C();
    }
}

