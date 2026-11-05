/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bbg
extends bau {
    private float p = 1.0f;
    public boolean o;
    private baf q;
    private final float r;
    private final float s;

    public bbg(int n2, int n3, int n4, baf baf2) {
        this(n2, n3, n4, baf2, 0.0f, 1.0f);
    }

    public bbg(int n2, int n3, int n4, baf baf2, float f2, float f3) {
        super(n2, n3, n4, 150, 20, "");
        this.q = baf2;
        this.r = f2;
        this.s = f3;
        azi azi2 = azi.B();
        this.p = baf2.c(azi2.u.a(baf2));
        this.j = azi2.u.c(baf2);
    }

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    @Override
    protected void b(azi azi2, int n2, int n3) {
        if (!this.m) {
            return;
        }
        if (this.o) {
            this.p = (float)(n2 - (this.h + 4)) / (float)(this.f - 8);
            if (this.p < 0.0f) {
                this.p = 0.0f;
            }
            if (this.p > 1.0f) {
                this.p = 1.0f;
            }
            float f2 = this.q.d(this.p);
            azi2.u.a(this.q, f2);
            this.p = this.q.c(f2);
            this.j = azi2.u.c(this.q);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.b(this.h + (int)(this.p * (float)(this.f - 8)), this.i, 0, 66, 4, 20);
        this.b(this.h + (int)(this.p * (float)(this.f - 8)) + 4, this.i, 196, 66, 4, 20);
    }

    @Override
    public boolean c(azi azi2, int n2, int n3) {
        if (super.c(azi2, n2, n3)) {
            this.p = (float)(n2 - (this.h + 4)) / (float)(this.f - 8);
            if (this.p < 0.0f) {
                this.p = 0.0f;
            }
            if (this.p > 1.0f) {
                this.p = 1.0f;
            }
            azi2.u.a(this.q, this.q.d(this.p));
            this.j = azi2.u.c(this.q);
            this.o = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(int n2, int n3) {
        this.o = false;
    }
}

