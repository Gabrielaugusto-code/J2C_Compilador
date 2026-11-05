/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;

public class bvl
extends bvh {
    private byte[] c;

    public bvl(String string, byte[] byArray, int n2, int n3) {
        super(string, n2, n3);
        this.c = byArray;
    }

    public bvl i() {
        try {
            this.a.setDoOutput(true);
            this.a.setDoInput(true);
            this.a.setRequestMethod("PUT");
            OutputStream outputStream = this.a.getOutputStream();
            outputStream.write(this.c);
            outputStream.flush();
            return this;
        }
        catch (Exception exception) {
            throw new bvz("Failed URL: " + this.b, exception);
        }
    }

    @Override
    public /* synthetic */ bvh f() {
        return this.i();
    }
}

