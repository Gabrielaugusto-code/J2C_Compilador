/*
 * Decompiled with CFR 0.152.
 */
class azj
extends Thread {
    final /* synthetic */ azi a;

    azj(azi azi2, String string) {
        this.a = azi2;
        super(string);
    }

    @Override
    public void run() {
        while (this.a.A) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

