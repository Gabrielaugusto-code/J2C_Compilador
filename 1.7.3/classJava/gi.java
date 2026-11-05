/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
import io.netty.buffer.ByteBuf;

public class gi
extends fk {
    private String a;
    private byte[] b;

    public gi() {
    }

    public gi(String string, ByteBuf byteBuf) {
        this(string, byteBuf.array());
    }

    public gi(String string, byte[] byArray) {
        this.a = string;
        this.b = byArray;
        if (byArray.length >= Short.MAX_VALUE) {
            throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
        }
    }

    @Override
    public void a(ep ep2) {
        this.a = ep2.c(20);
        this.b = new byte[ep2.readUnsignedShort()];
        ep2.readBytes(this.b);
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a);
        ep2.writeShort(this.b.length);
        ep2.writeBytes(this.b);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    public String c() {
        return this.a;
    }

    public byte[] d() {
        return this.b;
    }
}

