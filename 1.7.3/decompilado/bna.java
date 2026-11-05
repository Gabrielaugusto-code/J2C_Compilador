/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.PriorityQueue;
import org.lwjgl.opengl.GL11;

public class bna {
    private ByteBuffer b;
    private IntBuffer c;
    private FloatBuffer d;
    private ShortBuffer e;
    private int[] f;
    private int g;
    private double h;
    private double i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;
    private int s;
    private double t;
    private double u;
    private double v;
    private int w;
    public static final bna a = new bna(0x200000);
    private boolean x;
    private int y;

    private bna(int n2) {
        this.y = n2;
        this.b = azh.c(n2 * 4);
        this.c = this.b.asIntBuffer();
        this.d = this.b.asFloatBuffer();
        this.e = this.b.asShortBuffer();
        this.f = new int[n2];
    }

    public int a() {
        if (!this.x) {
            throw new IllegalStateException("Not tesselating!");
        }
        this.x = false;
        if (this.g > 0) {
            this.c.clear();
            this.c.put(this.f, 0, this.p);
            this.b.position(0);
            this.b.limit(this.p * 4);
            if (this.m) {
                this.d.position(3);
                GL11.glTexCoordPointer((int)2, (int)32, (FloatBuffer)this.d);
                GL11.glEnableClientState((int)32888);
            }
            if (this.n) {
                bwg.k(bwg.c);
                this.e.position(14);
                GL11.glTexCoordPointer((int)2, (int)32, (ShortBuffer)this.e);
                GL11.glEnableClientState((int)32888);
                bwg.k(bwg.b);
            }
            if (this.l) {
                this.b.position(20);
                GL11.glColorPointer((int)4, (boolean)true, (int)32, (ByteBuffer)this.b);
                GL11.glEnableClientState((int)32886);
            }
            if (this.o) {
                this.b.position(24);
                GL11.glNormalPointer((int)32, (ByteBuffer)this.b);
                GL11.glEnableClientState((int)32885);
            }
            this.d.position(0);
            GL11.glVertexPointer((int)3, (int)32, (FloatBuffer)this.d);
            GL11.glEnableClientState((int)32884);
            GL11.glDrawArrays((int)this.s, (int)0, (int)this.g);
            GL11.glDisableClientState((int)32884);
            if (this.m) {
                GL11.glDisableClientState((int)32888);
            }
            if (this.n) {
                bwg.k(bwg.c);
                GL11.glDisableClientState((int)32888);
                bwg.k(bwg.b);
            }
            if (this.l) {
                GL11.glDisableClientState((int)32886);
            }
            if (this.o) {
                GL11.glDisableClientState((int)32885);
            }
        }
        int n2 = this.p * 4;
        this.d();
        return n2;
    }

    public bnb a(float f2, float f3, float f4) {
        int n2;
        int[] nArray = new int[this.p];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(this.p, new bmx(this.f, f2 + (float)this.t, f3 + (float)this.u, f4 + (float)this.v));
        int n3 = 32;
        for (n2 = 0; n2 < this.p; n2 += n3) {
            priorityQueue.add(n2);
        }
        n2 = 0;
        while (!priorityQueue.isEmpty()) {
            int n4 = (Integer)priorityQueue.remove();
            for (int i2 = 0; i2 < n3; ++i2) {
                nArray[n2 + i2] = this.f[n4 + i2];
            }
            n2 += n3;
        }
        System.arraycopy(nArray, 0, this.f, 0, nArray.length);
        return new bnb(nArray, this.p, this.g, this.m, this.n, this.o, this.l);
    }

    public void a(bnb bnb2) {
        System.arraycopy(bnb2.a(), 0, this.f, 0, bnb2.a().length);
        this.p = bnb2.b();
        this.g = bnb2.c();
        this.m = bnb2.d();
        this.n = bnb2.e();
        this.l = bnb2.g();
        this.o = bnb2.f();
    }

    private void d() {
        this.g = 0;
        this.b.clear();
        this.p = 0;
        this.q = 0;
    }

    public void b() {
        this.a(7);
    }

    public void a(int n2) {
        if (this.x) {
            throw new IllegalStateException("Already tesselating!");
        }
        this.x = true;
        this.d();
        this.s = n2;
        this.o = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.r = false;
    }

    public void a(double d2, double d3) {
        this.m = true;
        this.h = d2;
        this.i = d3;
    }

    public void b(int n2) {
        this.n = true;
        this.j = n2;
    }

    public void b(float f2, float f3, float f4) {
        this.a((int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f));
    }

    public void a(float f2, float f3, float f4, float f5) {
        this.a((int)(f2 * 255.0f), (int)(f3 * 255.0f), (int)(f4 * 255.0f), (int)(f5 * 255.0f));
    }

    public void a(int n2, int n3, int n4) {
        this.a(n2, n3, n4, 255);
    }

    public void a(int n2, int n3, int n4, int n5) {
        if (this.r) {
            return;
        }
        if (n2 > 255) {
            n2 = 255;
        }
        if (n3 > 255) {
            n3 = 255;
        }
        if (n4 > 255) {
            n4 = 255;
        }
        if (n5 > 255) {
            n5 = 255;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        this.l = true;
        this.k = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN ? n5 << 24 | n4 << 16 | n3 << 8 | n2 : n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    public void a(double d2, double d3, double d4, double d5, double d6) {
        this.a(d5, d6);
        this.a(d2, d3, d4);
    }

    public void a(double d2, double d3, double d4) {
        ++this.q;
        if (this.m) {
            this.f[this.p + 3] = Float.floatToRawIntBits((float)this.h);
            this.f[this.p + 4] = Float.floatToRawIntBits((float)this.i);
        }
        if (this.n) {
            this.f[this.p + 7] = this.j;
        }
        if (this.l) {
            this.f[this.p + 5] = this.k;
        }
        if (this.o) {
            this.f[this.p + 6] = this.w;
        }
        this.f[this.p + 0] = Float.floatToRawIntBits((float)(d2 + this.t));
        this.f[this.p + 1] = Float.floatToRawIntBits((float)(d3 + this.u));
        this.f[this.p + 2] = Float.floatToRawIntBits((float)(d4 + this.v));
        this.p += 8;
        ++this.g;
        if (this.g % 4 == 0 && this.p >= this.y - 32) {
            this.a();
            this.x = true;
        }
    }

    public void c(int n2) {
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        this.a(n3, n4, n5);
    }

    public void a(int n2, int n3) {
        int n4 = n2 >> 16 & 0xFF;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        this.a(n4, n5, n6, n3);
    }

    public void c() {
        this.r = true;
    }

    public void c(float f2, float f3, float f4) {
        this.o = true;
        byte by2 = (byte)(f2 * 127.0f);
        byte by3 = (byte)(f3 * 127.0f);
        byte by4 = (byte)(f4 * 127.0f);
        this.w = by2 & 0xFF | (by3 & 0xFF) << 8 | (by4 & 0xFF) << 16;
    }

    public void b(double d2, double d3, double d4) {
        this.t = d2;
        this.u = d3;
        this.v = d4;
    }

    public void d(float f2, float f3, float f4) {
        this.t += (double)f2;
        this.u += (double)f3;
        this.v += (double)f4;
    }
}

