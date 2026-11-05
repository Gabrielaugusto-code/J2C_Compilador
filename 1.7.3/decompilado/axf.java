/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

class axf
implements FilenameFilter {
    final /* synthetic */ axe a;

    axf(axe axe2) {
        this.a = axe2;
    }

    @Override
    public boolean accept(File file, String string) {
        return string.endsWith(".mcr");
    }
}

