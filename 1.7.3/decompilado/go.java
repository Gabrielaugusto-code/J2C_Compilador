/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class go
extends fk {
    private int a;
    private int b;
    private int c;
    private int d;
    private byte[] e;
    private byte[] f;
    private boolean g;
    private int h;
    private static byte[] i = new byte[196864];

    public go() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public go(aoo aoo2, boolean bl2, int n2) {
        this.a = aoo2.g;
        this.b = aoo2.h;
        this.g = bl2;
        gp gp2 = go.a(aoo2, bl2, n2);
        Deflater deflater = new Deflater(-1);
        this.d = gp2.c;
        this.c = gp2.b;
        try {
            this.f = gp2.a;
            deflater.setInput(gp2.a, 0, gp2.a.length);
            deflater.finish();
            this.e = new byte[gp2.a.length];
            this.h = deflater.deflate(this.e);
        }
        finally {
            deflater.end();
        }
    }

    public static int c() {
        return 196864;
    }

    @Override
    public void a(ep ep2) {
        int n2;
        this.a = ep2.readInt();
        this.b = ep2.readInt();
        this.g = ep2.readBoolean();
        this.c = ep2.readShort();
        this.d = ep2.readShort();
        this.h = ep2.readInt();
        if (i.length < this.h) {
            i = new byte[this.h];
        }
        ep2.readBytes(i, 0, this.h);
        int n3 = 0;
        for (n2 = 0; n2 < 16; ++n2) {
            n3 += this.c >> n2 & 1;
        }
        n2 = 12288 * n3;
        if (this.g) {
            n2 += 256;
        }
        this.f = new byte[n2];
        Inflater inflater = new Inflater();
        inflater.setInput(i, 0, this.h);
        try {
            inflater.inflate(this.f);
        }
        catch (DataFormatException dataFormatException) {
            throw new IOException("Bad compressed data format");
        }
        finally {
            inflater.end();
        }
    }

    @Override
    public void b(ep ep2) {
        ep2.writeInt(this.a);
        ep2.writeInt(this.b);
        ep2.writeBoolean(this.g);
        ep2.writeShort((short)(this.c & 0xFFFF));
        ep2.writeShort((short)(this.d & 0xFFFF));
        ep2.writeInt(this.h);
        ep2.writeBytes(this.e, 0, this.h);
    }

    public void a(fm fm2) {
        fm2.a(this);
    }

    @Override
    public String b() {
        return String.format("x=%d, z=%d, full=%b, sects=%d, add=%d, size=%d", this.a, this.b, this.g, this.c, this.d, this.h);
    }

    public byte[] d() {
        return this.f;
    }

    public static gp a(aoo aoo2, boolean bl2, int n2) {
        Object object;
        int n3;
        int n4 = 0;
        aoq[] aoqArray = aoo2.i();
        int n5 = 0;
        gp gp2 = new gp();
        byte[] byArray = i;
        if (bl2) {
            aoo2.q = true;
        }
        for (n3 = 0; n3 < aoqArray.length; ++n3) {
            if (aoqArray[n3] == null || bl2 && aoqArray[n3].a() || (n2 & 1 << n3) == 0) continue;
            gp2.b |= 1 << n3;
            if (aoqArray[n3].i() == null) continue;
            gp2.c |= 1 << n3;
            ++n5;
        }
        for (n3 = 0; n3 < aoqArray.length; ++n3) {
            if (aoqArray[n3] == null || bl2 && aoqArray[n3].a() || (n2 & 1 << n3) == 0) continue;
            object = aoqArray[n3].g();
            System.arraycopy(object, 0, byArray, n4, ((byte[])object).length);
            n4 += ((byte[])object).length;
        }
        for (n3 = 0; n3 < aoqArray.length; ++n3) {
            if (aoqArray[n3] == null || bl2 && aoqArray[n3].a() || (n2 & 1 << n3) == 0) continue;
            object = aoqArray[n3].j();
            System.arraycopy(object.a, 0, byArray, n4, object.a.length);
            n4 += object.a.length;
        }
        for (n3 = 0; n3 < aoqArray.length; ++n3) {
            if (aoqArray[n3] == null || bl2 && aoqArray[n3].a() || (n2 & 1 << n3) == 0) continue;
            object = aoqArray[n3].k();
            System.arraycopy(object.a, 0, byArray, n4, object.a.length);
            n4 += object.a.length;
        }
        if (!aoo2.e.t.g) {
            for (n3 = 0; n3 < aoqArray.length; ++n3) {
                if (aoqArray[n3] == null || bl2 && aoqArray[n3].a() || (n2 & 1 << n3) == 0) continue;
                object = aoqArray[n3].l();
                System.arraycopy(object.a, 0, byArray, n4, object.a.length);
                n4 += object.a.length;
            }
        }
        if (n5 > 0) {
            for (n3 = 0; n3 < aoqArray.length; ++n3) {
                if (aoqArray[n3] == null || bl2 && aoqArray[n3].a() || aoqArray[n3].i() == null || (n2 & 1 << n3) == 0) continue;
                object = aoqArray[n3].i();
                System.arraycopy(object.a, 0, byArray, n4, object.a.length);
                n4 += object.a.length;
            }
        }
        if (bl2) {
            byte[] byArray2 = aoo2.m();
            System.arraycopy(byArray2, 0, byArray, n4, byArray2.length);
            n4 += byArray2.length;
        }
        gp2.a = new byte[n4];
        System.arraycopy(byArray, 0, gp2.a, 0, n4);
        return gp2;
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public boolean i() {
        return this.g;
    }
}

