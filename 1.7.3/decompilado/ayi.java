/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ayi
implements Runnable {
    public static final ayi a = new ayi();
    private List b = Collections.synchronizedList(new ArrayList());
    private volatile long c;
    private volatile long d;
    private volatile boolean e;

    private ayi() {
        Thread thread = new Thread((Runnable)this, "File IO Thread");
        thread.setPriority(1);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            this.b();
        }
    }

    private void b() {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            ayj ayj2 = (ayj)this.b.get(i2);
            boolean bl2 = ayj2.c();
            if (!bl2) {
                this.b.remove(i2--);
                ++this.d;
            }
            try {
                Thread.sleep(this.e ? 0L : 10L);
                continue;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (this.b.isEmpty()) {
            try {
                Thread.sleep(25L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    public void a(ayj ayj2) {
        if (this.b.contains(ayj2)) {
            return;
        }
        ++this.c;
        this.b.add(ayj2);
    }

    public void a() {
        this.e = true;
        while (this.c != this.d) {
            Thread.sleep(10L);
        }
        this.e = false;
    }
}

