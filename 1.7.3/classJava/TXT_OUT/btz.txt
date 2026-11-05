/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class btz
extends URLConnection {
    final /* synthetic */ bty a;

    btz(bty bty2, URL uRL) {
        this.a = bty2;
        super(uRL);
    }

    @Override
    public void connect() {
    }

    @Override
    public InputStream getInputStream() {
        return azi.B().Q().a(this.a.a).b();
    }
}

