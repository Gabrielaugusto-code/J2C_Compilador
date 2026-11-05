/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bdw
extends bdn {
    private static final brq u = new brq("textures/gui/container/brewing_stand.png");
    private anm v;

    public bdw(xo xo2, anm anm2) {
        super(new yq(xo2, anm2));
        this.v = anm2;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.v.k_() ? this.v.b() : bsc.a(this.v.b(), new Object[0]);
        this.q.b(string, this.f / 2 - this.q.a(string) / 2, 6, 0x404040);
        this.q.b(bsc.a("container.inventory", new Object[0]), 8, this.g - 96 + 2, 0x404040);
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.k.P().a(u);
        int n4 = (this.l - this.f) / 2;
        int n5 = (this.m - this.g) / 2;
        this.b(n4, n5, 0, 0, this.f, this.g);
        int n6 = this.v.i();
        if (n6 > 0) {
            int n7 = (int)(28.0f * (1.0f - (float)n6 / 400.0f));
            if (n7 > 0) {
                this.b(n4 + 97, n5 + 16, 176, 0, 9, n7);
            }
            int n8 = n6 / 2 % 7;
            switch (n8) {
                case 6: {
                    n7 = 0;
                    break;
                }
                case 5: {
                    n7 = 6;
                    break;
                }
                case 4: {
                    n7 = 11;
                    break;
                }
                case 3: {
                    n7 = 16;
                    break;
                }
                case 2: {
                    n7 = 20;
                    break;
                }
                case 1: {
                    n7 = 24;
                    break;
                }
                case 0: {
                    n7 = 29;
                }
            }
            if (n7 > 0) {
                this.b(n4 + 65, n5 + 14 + 29 - n7, 185, 29 - n7, 12, n7);
            }
        }
    }
}

