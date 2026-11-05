/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;

public class axd
extends axh {
    public axd(File file, String string, boolean bl2) {
        super(file, string, bl2);
    }

    @Override
    public aot a(apf apf2) {
        File file = this.b();
        if (apf2 instanceof apg) {
            File file2 = new File(file, "DIM-1");
            file2.mkdirs();
            return new apb(file2);
        }
        if (apf2 instanceof api) {
            File file3 = new File(file, "DIM1");
            file3.mkdirs();
            return new apb(file3);
        }
        return new apb(file);
    }

    @Override
    public void a(axj axj2, dg dg2) {
        axj2.e(19133);
        super.a(axj2, dg2);
    }

    @Override
    public void a() {
        try {
            ayi.a.a();
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        apa.a();
    }
}

