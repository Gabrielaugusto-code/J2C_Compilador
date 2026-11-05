/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class bgn
implements ThreadFactory {
    private static final Logger a = LogManager.getLogger();
    private final ThreadGroup b;
    private final String c;

    private bgn(String string) {
        this.c = string;
        this.b = new bgo(this, string + "-threadgroup");
    }

    @Override
    public Thread newThread(Runnable runnable) {
        return new Thread(this.b, runnable, this.c);
    }

    /* synthetic */ bgn(String string, bgm bgm2) {
        this(string);
    }

    static /* synthetic */ Logger a() {
        return a;
    }
}

