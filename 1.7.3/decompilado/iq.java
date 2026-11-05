/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class iq
extends fk {
    private String a;
    private int b;
    private byte[] c;

    public iq() {
    }

    public iq(String string, ByteBuf byteBuf) {
        this(string, byteBuf.array());
    }

    public iq(String string, byte[] byArray) {
        this.a = string;
        this.c = byArray;
        if (byArray != null) {
            this.b = byArray.length;
            if (this.b >= Short.MAX_VALUE) {
                throw new IllegalArgumentException("Payload may not be larger than 32k");
            }
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(20);
        this.b = ep2.readShort();
        if (this.b > 0 && this.b < Short.MAX_VALUE) {
            this.c = new byte[this.b];
            ep2.readBytes(this.c);
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeShort((short)this.b);
        if (this.c != null) {
            ep2.writeBytes(this.c);
        }
    }

    public void a(ie ie2) {
        ie2.a(this);
    }

    public String c() {
        return this.a;
    }

    public byte[] e() {
        return this.c;
    }
}

