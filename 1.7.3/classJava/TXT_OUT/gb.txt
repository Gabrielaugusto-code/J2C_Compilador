/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class gb
extends fk {
    private static final Logger a = LogManager.getLogger();
    private afl b;
    private byte[] c;
    private int d;

    public gb() {
    }

    public gb(int n2, short[] sArray, aoo aoo2) {
        this.b = new afl(aoo2.g, aoo2.h);
        this.d = n2;
        int n3 = 4 * n2;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n3);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i2 = 0; i2 < n2; ++i2) {
                int n4 = sArray[i2] >> 12 & 0xF;
                int n5 = sArray[i2] >> 8 & 0xF;
                int n6 = sArray[i2] & 0xFF;
                dataOutputStream.writeShort(sArray[i2]);
                dataOutputStream.writeShort((short)((ahz.b(aoo2.a(n4, n6, n5)) & 0xFFF) << 4 | aoo2.c(n4, n6, n5) & 0xF));
            }
            this.c = byteArrayOutputStream.toByteArray();
            if (this.c.length != n3) {
                throw new RuntimeException("Expected length " + n3 + " doesn't match received length " + this.c.length);
            }
        }
        catch (IOException iOException) {
            a.error("Couldn't create bulk block update packet", (Throwable)iOException);
            this.c = null;
        }
    }

    @Override
    public void a(ep ep2) {
        this.b = new afl(ep2.readInt(), ep2.readInt());
        this.d = ep2.readShort() & 0xFFFF;
        int n2 = ep2.readInt();
        if (n2 > 0) {
            this.c = new byte[n2];
            ep2.readBytes(this.c);
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.b.a);
        ep2.writeInt(this.b.b);
        ep2.writeShort((short)this.d);
        if (this.c != null) {
            ep2.writeInt(this.c.length);
            ep2.writeBytes(this.c);
        } else {
            ep2.writeInt(0);
        }
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("xc=%d, zc=%d, count=%d", this.b.a, this.b.b, this.d);
    }

    public afl c() {
        return this.b;
    }

    public byte[] d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }
}

