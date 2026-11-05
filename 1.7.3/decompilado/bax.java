/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;

public class bax
extends bap {
    protected int a;
    protected int f;
    public int g;
    public int h;
    private ArrayList k;
    private boolean l;
    public boolean j;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private ban r;
    private int s;

    public void a(azi azi2, int n2, int n3) {
        if (!this.j) {
            return;
        }
        GL11.glEnable((int)3042);
        bwg.c(770, 771, 1, 0);
        GL11.glBlendFunc((int)770, (int)771);
        this.b(azi2, n2, n3);
        int n4 = this.h + this.f / 2 + this.s / 2;
        int n5 = n4 - this.k.size() * 10 / 2;
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            if (this.l) {
                this.a(this.r, (String)this.k.get(i2), this.g + this.a / 2, n5 + i2 * 10, this.n);
                continue;
            }
            this.b(this.r, (String)this.k.get(i2), this.g, n5 + i2 * 10, this.n);
        }
    }

    protected void b(azi azi2, int n2, int n3) {
        if (this.m) {
            int n4 = this.a + this.s * 2;
            int n5 = this.f + this.s * 2;
            int n6 = this.g - this.s;
            int n7 = this.h - this.s;
            bax.a(n6, n7, n6 + n4, n7 + n5, this.o);
            this.a(n6, n6 + n4, n7, this.p);
            this.a(n6, n6 + n4, n7 + n5, this.q);
            this.b(n6, n7, n7 + n5, this.p);
            this.b(n6 + n4, n7, n7 + n5, this.q);
        }
    }
}

