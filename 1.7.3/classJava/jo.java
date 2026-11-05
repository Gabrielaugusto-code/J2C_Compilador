/*
 * Decompiled with CFR 0.152.
 */
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class jo
extends fk {
    private byte[] a = new byte[0];
    private byte[] b = new byte[0];

    public jo() {
    }

    public jo(SecretKey secretKey, PublicKey publicKey, byte[] byArray) {
        this.a = ok.a(publicKey, secretKey.getEncoded());
        this.b = ok.a(publicKey, byArray);
    }

    @Override
    public void a(ep ep2) {
        this.a = jo.a(ep2);
        this.b = jo.a(ep2);
    }

    @Override
    public void b(ep ep2) {
        jo.a(ep2, this.a);
        jo.a(ep2, this.b);
    }

    public void a(jm jm2) {
        jm2.a(this);
    }

    public SecretKey a(PrivateKey privateKey) {
        return ok.a(privateKey, this.a);
    }

    public byte[] b(PrivateKey privateKey) {
        if (privateKey == null) {
            return this.b;
        }
        return ok.b(privateKey, this.b);
    }
}

