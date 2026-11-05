/*
 * Decompiled with CFR 0.152.
 */
public class bvj
extends bvh {
    public bvj(String string, int n2, int n3) {
        super(string, n2, n3);
    }

    public bvj i() {
        try {
            this.a.setDoInput(true);
            this.a.setDoOutput(true);
            this.a.setUseCaches(false);
            this.a.setRequestMethod("GET");
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

