/*
 * Decompiled with CFR 0.152.
 */
class bgo
extends ThreadGroup {
    final /* synthetic */ bgn a;

    bgo(bgn bgn2, String string) {
        this.a = bgn2;
        super(string);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        bgn.a().error("Uncaught in thread {}: {}", new Object[]{thread.getName(), throwable});
    }
}

