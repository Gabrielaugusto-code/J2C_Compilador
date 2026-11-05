/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

final class bty
extends URLStreamHandler {
    final /* synthetic */ brq a;

    bty(brq brq2) {
        this.a = brq2;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new btz(this, uRL);
    }
}

