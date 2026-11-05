/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.awt.image.BufferedImage;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bqk
extends bqn {
    private static final Logger c = LogManager.getLogger();
    private static final AtomicInteger d = new AtomicInteger(0);
    private final String e;
    private final bmq f;
    private BufferedImage g;
    private Thread h;
    private boolean i;

    public bqk(String string, brq brq2, bmq bmq2) {
        super(brq2);
        this.e = string;
        this.f = bmq2;
    }

    private void e() {
        if (this.i) {
            return;
        }
        if (this.g != null) {
            if (this.b != null) {
                this.c();
            }
            brb.a(super.b(), this.g);
            this.i = true;
        }
    }

    @Override
    public int b() {
        this.e();
        return super.b();
    }

    public void a(BufferedImage bufferedImage) {
        this.g = bufferedImage;
    }

    @Override
    public void a(brr brr2) {
        if (this.g == null && this.b != null) {
            super.a(brr2);
        }
        if (this.h == null) {
            this.h = new bql(this, "Texture Downloader #" + d.incrementAndGet());
            this.h.setDaemon(true);
            this.h.setName("Skin downloader: " + this.e);
            this.h.start();
        }
    }

    public boolean a() {
        this.e();
        return this.i;
    }

    static /* synthetic */ String a(bqk bqk2) {
        return bqk2.e;
    }

    static /* synthetic */ bmq b(bqk bqk2) {
        return bqk2.f;
    }

    static /* synthetic */ Logger d() {
        return c;
    }
}

