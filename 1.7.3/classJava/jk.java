/*
 * Decompiled with CFR 0.152.
 */
import java.security.PublicKey;

public class jk
extends fk {
    private String a;
    private PublicKey b;
    private byte[] c;

    public jk() {
    }

    public jk(String string, PublicKey publicKey, byte[] byArray) {
        this.a = string;
        this.b = publicKey;
        this.c = byArray;
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(20);
        this.b = ok.a(jk.a(ep2));
        this.c = jk.a(ep2);
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        jk.a(ep2, this.b.getEncoded());
        jk.a(ep2, this.c);
    }

    public void a(ji ji2) {
        ji2.a(this);
    }

    public String c() {
        return this.a;
    }

    public PublicKey d() {
        return this.b;
    }

    public byte[] e() {
        return this.c;
    }
}

