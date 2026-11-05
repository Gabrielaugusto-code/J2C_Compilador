/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class bbr
extends bcl {
    private int a;
    private boolean f = false;

    @Override
    public void r_() {
        this.n.clear();
        if (this.k.f.N().t()) {
            if (this.k.F()) {
                this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 96, bsc.a("deathScreen.deleteWorld", new Object[0])));
            } else {
                this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 96, bsc.a("deathScreen.leaveServer", new Object[0])));
            }
        } else {
            this.n.add(new bau(0, this.l / 2 - 100, this.m / 4 + 72, bsc.a("deathScreen.respawn", new Object[0])));
            this.n.add(new bau(1, this.l / 2 - 100, this.m / 4 + 96, bsc.a("deathScreen.titleScreen", new Object[0])));
            if (this.k.M() == null) {
                ((bau)this.n.get((int)1)).l = false;
            }
        }
        for (bau bau2 : this.n) {
            bau2.l = false;
        }
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(bau bau2) {
        switch (bau2.k) {
            case 0: {
                this.k.h.bG();
                this.k.a((bcl)null);
                break;
            }
            case 1: {
                bbl bbl2 = new bbl(this, bsc.a("deathScreen.quit.confirm", new Object[0]), "", bsc.a("deathScreen.titleScreen", new Object[0]), bsc.a("deathScreen.respawn", new Object[0]), 0);
                this.k.a(bbl2);
                bbl2.a(20);
            }
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (bl2) {
            this.k.f.F();
            this.k.a((bka)null);
            this.k.a(new bct());
        } else {
            this.k.h.bG();
            this.k.a((bcl)null);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.a(0, 0, this.l, this.m, 0x60500000, -1602211792);
        GL11.glPushMatrix();
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
        boolean bl2 = this.k.f.N().t();
        String string = bl2 ? bsc.a("deathScreen.title.hardcore", new Object[0]) : bsc.a("deathScreen.title", new Object[0]);
        this.a(this.q, string, this.l / 2 / 2, 30, 0xFFFFFF);
        GL11.glPopMatrix();
        if (bl2) {
            this.a(this.q, bsc.a("deathScreen.hardcoreInfo", new Object[0]), this.l / 2, 144, 0xFFFFFF);
        }
        this.a(this.q, bsc.a("deathScreen.score", new Object[0]) + ": " + (Object)((Object)a.o) + this.k.h.bC(), this.l / 2, 100, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public void c() {
        super.c();
        ++this.a;
        if (this.a == 20) {
            for (bau bau2 : this.n) {
                bau2.l = true;
            }
        }
    }
}

