/*
 * Decompiled with CFR 0.152.
 */
class bvd
extends Thread {
    final /* synthetic */ bvc a;

    bvd(bvc bvc2, String string) {
        this.a = bvc2;
        super(string);
    }

    @Override
    public void run() {
        this.a.b.i();
    }
}

