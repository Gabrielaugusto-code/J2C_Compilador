/*
 * Decompiled with CFR 0.152.
 */
public class bvi
extends bvh {
    public bvi(String string, int n2, int n3) {
        super(string, n2, n3);
    }

    public bvi i() {
        try {
            this.a.setDoOutput(true);
            this.a.setRequestMethod("DELETE");
            this.a.connect();
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

