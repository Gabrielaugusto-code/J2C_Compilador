/*
 * Decompiled with CFR 0.152.
 */
class btx
implements Runnable {
    final /* synthetic */ btw a;

    btx(btw btw2) {
        this.a = btw2;
    }

    @Override
    public void run() {
        btw.a(this.a, new bua(this.a, null));
        btw.a(this.a, true);
        btw.b(this.a).setMasterVolume(btw.a(this.a).a(w.a));
        btw.h().info(btw.g(), "Sound engine started");
    }
}

