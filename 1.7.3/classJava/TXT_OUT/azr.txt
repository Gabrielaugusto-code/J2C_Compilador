/*
 * Decompiled with CFR 0.152.
 */
class azr
implements nu {
    final /* synthetic */ azi a;

    azr(azi azi2) {
        this.a = azi2;
    }

    @Override
    public String a(String string) {
        try {
            return String.format(string, bac.c(this.a.u.ab.i()));
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}

