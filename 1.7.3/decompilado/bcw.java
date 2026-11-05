/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.Charsets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bcw
extends bcl {
    private static final Logger a = LogManager.getLogger();
    private static final brq f = new brq("textures/gui/title/minecraft.png");
    private static final brq g = new brq("textures/misc/vignette.png");
    private int h;
    private List i;
    private int r;
    private float s = 0.5f;

    @Override
    public void c() {
        ++this.h;
        float f2 = (float)(this.r + this.m + this.m + 24) / this.s;
        if ((float)this.h > f2) {
            this.g();
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.g();
        }
    }

    private void g() {
        this.k.h.a.a(new ij(ik.a));
        this.k.a((bcl)null);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void r_() {
        if (this.i != null) {
            return;
        }
        this.i = new ArrayList();
        try {
            int n2;
            String string = "";
            String string2 = "" + (Object)((Object)a.p) + (Object)((Object)a.q) + (Object)((Object)a.k) + (Object)((Object)a.l);
            int n3 = 274;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.k.Q().a(new brq("texts/end.txt")).b(), Charsets.UTF_8));
            Random random = new Random(8124371L);
            while ((string = bufferedReader.readLine()) != null) {
                string = string.replaceAll("PLAYERNAME", this.k.M().c());
                while (string.contains(string2)) {
                    n2 = string.indexOf(string2);
                    String string3 = string.substring(0, n2);
                    String string4 = string.substring(n2 + string2.length());
                    string = string3 + (Object)((Object)a.p) + (Object)((Object)a.q) + "XXXXXXXX".substring(0, random.nextInt(4) + 3) + string4;
                }
                this.i.addAll(this.k.l.c(string, n3));
                this.i.add("");
            }
            for (n2 = 0; n2 < 8; ++n2) {
                this.i.add("");
            }
            bufferedReader = new BufferedReader(new InputStreamReader(this.k.Q().a(new brq("texts/credits.txt")).b(), Charsets.UTF_8));
            while ((string = bufferedReader.readLine()) != null) {
                string = string.replaceAll("PLAYERNAME", this.k.M().c());
                string = string.replaceAll("\t", "    ");
                this.i.addAll(this.k.l.c(string, n3));
                this.i.add("");
            }
            this.r = this.i.size() * 12;
        }
        catch (Exception exception) {
            a.error("Couldn't load credits", (Throwable)exception);
        }
    }

    private void b(int n2, int n3, float f2) {
        bna bna2 = bna.a;
        this.k.P().a(bap.b);
        bna2.b();
        bna2.a(1.0f, 1.0f, 1.0f, 1.0f);
        int n4 = this.l;
        float f3 = 0.0f - ((float)this.h + f2) * 0.5f * this.s;
        float f4 = (float)this.m - ((float)this.h + f2) * 0.5f * this.s;
        float f5 = 0.015625f;
        float f6 = ((float)this.h + f2 - 0.0f) * 0.02f;
        float f7 = (float)(this.r + this.m + this.m + 24) / this.s;
        float f8 = (f7 - 20.0f - ((float)this.h + f2)) * 0.005f;
        if (f8 < f6) {
            f6 = f8;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        f6 *= f6;
        f6 = f6 * 96.0f / 255.0f;
        bna2.b(f6, f6, f6);
        bna2.a(0.0, this.m, this.e, 0.0, f3 * f5);
        bna2.a(n4, this.m, this.e, (float)n4 * f5, f3 * f5);
        bna2.a(n4, 0.0, this.e, (float)n4 * f5, f4 * f5);
        bna2.a(0.0, 0.0, this.e, 0.0, f4 * f5);
        bna2.a();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        int n4;
        this.b(n2, n3, f2);
        bna bna2 = bna.a;
        int n5 = 274;
        int n6 = this.l / 2 - n5 / 2;
        int n7 = this.m + 50;
        float f3 = -((float)this.h + f2) * this.s;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)f3, (float)0.0f);
        this.k.P().a(f);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.b(n6, n7, 0, 0, 155, 44);
        this.b(n6 + 155, n7, 0, 45, 155, 44);
        bna2.c(0xFFFFFF);
        int n8 = n7 + 200;
        for (n4 = 0; n4 < this.i.size(); ++n4) {
            float f4;
            if (n4 == this.i.size() - 1 && (f4 = (float)n8 + f3 - (float)(this.m / 2 - 6)) < 0.0f) {
                GL11.glTranslatef((float)0.0f, (float)(-f4), (float)0.0f);
            }
            if ((float)n8 + f3 + 12.0f + 8.0f > 0.0f && (float)n8 + f3 < (float)this.m) {
                String string = (String)this.i.get(n4);
                if (string.startsWith("[C]")) {
                    this.q.a(string.substring(3), n6 + (n5 - this.q.a(string.substring(3))) / 2, n8, 0xFFFFFF);
                } else {
                    this.q.b.setSeed((long)n4 * 4238972211L + (long)(this.h / 4));
                    this.q.a(string, n6, n8, 0xFFFFFF);
                }
            }
            n8 += 12;
        }
        GL11.glPopMatrix();
        this.k.P().a(g);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)0, (int)769);
        bna2.b();
        bna2.a(1.0f, 1.0f, 1.0f, 1.0f);
        n4 = this.l;
        int n9 = this.m;
        bna2.a(0.0, n9, this.e, 0.0, 1.0);
        bna2.a(n4, n9, this.e, 1.0, 1.0);
        bna2.a(n4, 0.0, this.e, 1.0, 0.0);
        bna2.a(0.0, 0.0, this.e, 0.0, 0.0);
        bna2.a();
        GL11.glDisable((int)3042);
        super.a(n2, n3, f2);
    }
}

