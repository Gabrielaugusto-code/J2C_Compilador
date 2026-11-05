/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;

class aoz
extends ByteArrayOutputStream {
    private int b;
    private int c;
    final /* synthetic */ aoy a;

    public aoz(aoy aoy2, int n2, int n3) {
        this.a = aoy2;
        super(8096);
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void close() {
        this.a.a(this.b, this.c, this.buf, this.count);
    }
}

