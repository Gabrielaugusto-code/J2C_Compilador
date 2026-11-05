/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class bav
extends bap {
    private static final Logger a = LogManager.getLogger();
    private final azi f;
    private final List g = new ArrayList();
    private final List h = new ArrayList();
    private final List i = new ArrayList();
    private int j;
    private boolean k;

    public bav(azi azi2) {
        this.f = azi2;
    }

    public void a(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (this.f.u.m == xs.c) {
            return;
        }
        int n7 = this.i();
        boolean bl2 = false;
        int n8 = 0;
        int n9 = this.i.size();
        float f2 = this.f.u.q * 0.9f + 0.1f;
        if (n9 <= 0) {
            return;
        }
        if (this.e()) {
            bl2 = true;
        }
        float f3 = this.h();
        int n10 = oy.f((float)this.f() / f3);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)2.0f, (float)20.0f, (float)0.0f);
        GL11.glScalef((float)f3, (float)f3, (float)1.0f);
        for (n6 = 0; n6 + this.j < this.i.size() && n6 < n7; ++n6) {
            aze aze2 = (aze)this.i.get(n6 + this.j);
            if (aze2 == null || (n5 = n2 - aze2.b()) >= 200 && !bl2) continue;
            double d2 = (double)n5 / 200.0;
            d2 = 1.0 - d2;
            if ((d2 *= 10.0) < 0.0) {
                d2 = 0.0;
            }
            if (d2 > 1.0) {
                d2 = 1.0;
            }
            d2 *= d2;
            n4 = (int)(255.0 * d2);
            if (bl2) {
                n4 = 255;
            }
            n4 = (int)((float)n4 * f2);
            ++n8;
            if (n4 <= 3) continue;
            n3 = 0;
            int n11 = -n6 * 9;
            bav.a(n3, n11 - 9, n3 + n10 + 4, n11, n4 / 2 << 24);
            String string = aze2.a().d();
            this.f.l.a(string, n3, n11 - 8, 0xFFFFFF + (n4 << 24));
            GL11.glDisable((int)3008);
        }
        if (bl2) {
            n6 = this.f.l.a;
            GL11.glTranslatef((float)-3.0f, (float)0.0f, (float)0.0f);
            int n12 = n9 * n6 + n9;
            n5 = n8 * n6 + n8;
            int n13 = this.j * n5 / n9;
            int n14 = n5 * n5 / n12;
            if (n12 != n5) {
                n4 = n13 > 0 ? 170 : 96;
                n3 = this.k ? 0xCC3333 : 0x3333AA;
                bav.a(0, -n13, 2, -n13 - n14, n3 + (n4 << 24));
                bav.a(2, -n13, 1, -n13 - n14, 0xCCCCCC + (n4 << 24));
            }
        }
        GL11.glPopMatrix();
    }

    public void a() {
        this.i.clear();
        this.h.clear();
        this.g.clear();
    }

    public void a(fa fa2) {
        this.a(fa2, 0);
    }

    public void a(fa fa2, int n2) {
        this.a(fa2, n2, this.f.r.c(), false);
        a.info("[CHAT] " + fa2.c());
    }

    private String b(String string) {
        if (azi.B().u.n) {
            return string;
        }
        return a.a(string);
    }

    private void a(fa fa2, int n2, int n3, boolean bl2) {
        int n4;
        if (n2 != 0) {
            this.c(n2);
        }
        int n5 = oy.d((float)this.f() / this.h());
        int n6 = 0;
        fh fh2 = new fh("");
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList((Iterable)fa2);
        for (n4 = 0; n4 < arrayList2.size(); ++n4) {
            fa fa3 = (fa)arrayList2.get(n4);
            Object object = this.b(fa3.b().j() + fa3.e());
            int n7 = this.f.l.a((String)object);
            fh fh3 = new fh((String)object);
            fh3.a(fa3.b().l());
            boolean bl3 = false;
            if (n6 + n7 > n5) {
                String string;
                String string2 = this.f.l.a((String)object, n5 - n6, false);
                String string3 = string = string2.length() < ((String)object).length() ? ((String)object).substring(string2.length()) : null;
                if (string != null && string.length() > 0) {
                    int n8 = string2.lastIndexOf(" ");
                    if (n8 >= 0 && this.f.l.a(((String)object).substring(0, n8)) > 0) {
                        string2 = ((String)object).substring(0, n8);
                        string = ((String)object).substring(n8);
                    }
                    fh fh4 = new fh(string);
                    fh4.a(fa3.b().l());
                    arrayList2.add(n4 + 1, fh4);
                }
                object = string2;
                n7 = this.f.l.a((String)object);
                fh3 = new fh((String)object);
                fh3.a(fa3.b().l());
                bl3 = true;
            }
            if (n6 + n7 <= n5) {
                n6 += n7;
                fh2.a(fh3);
            } else {
                bl3 = true;
            }
            if (!bl3) continue;
            arrayList.add(fh2);
            n6 = 0;
            fh2 = new fh("");
        }
        arrayList.add(fh2);
        n4 = this.e() ? 1 : 0;
        for (Object object : arrayList) {
            if (n4 != 0 && this.j > 0) {
                this.k = true;
                this.b(1);
            }
            this.i.add(0, new aze(n3, (fa)object, n2));
        }
        while (this.i.size() > 100) {
            this.i.remove(this.i.size() - 1);
        }
        if (!bl2) {
            this.h.add(0, new aze(n3, fa2, n2));
            while (this.h.size() > 100) {
                this.h.remove(this.h.size() - 1);
            }
        }
    }

    public void b() {
        this.i.clear();
        this.d();
        for (int i2 = this.h.size() - 1; i2 >= 0; --i2) {
            aze aze2 = (aze)this.h.get(i2);
            this.a(aze2.a(), aze2.c(), aze2.b(), true);
        }
    }

    public List c() {
        return this.g;
    }

    public void a(String string) {
        if (this.g.isEmpty() || !((String)this.g.get(this.g.size() - 1)).equals(string)) {
            this.g.add(string);
        }
    }

    public void d() {
        this.j = 0;
        this.k = false;
    }

    public void b(int n2) {
        this.j += n2;
        int n3 = this.i.size();
        if (this.j > n3 - this.i()) {
            this.j = n3 - this.i();
        }
        if (this.j <= 0) {
            this.j = 0;
            this.k = false;
        }
    }

    public fa a(int n2, int n3) {
        if (!this.e()) {
            return null;
        }
        bat bat2 = new bat(this.f, this.f.d, this.f.e);
        int n4 = bat2.e();
        float f2 = this.h();
        int n5 = n2 / n4 - 3;
        int n6 = n3 / n4 - 27;
        n5 = oy.d((float)n5 / f2);
        n6 = oy.d((float)n6 / f2);
        if (n5 < 0 || n6 < 0) {
            return null;
        }
        int n7 = Math.min(this.i(), this.i.size());
        if (n5 <= oy.d((float)this.f() / this.h()) && n6 < this.f.l.a * n7 + n7) {
            int n8 = n6 / this.f.l.a + this.j;
            if (n8 >= 0 && n8 < this.i.size()) {
                aze aze2 = (aze)this.i.get(n8);
                int n9 = 0;
                for (fa fa2 : aze2.a()) {
                    if (!(fa2 instanceof fh) || (n9 += this.f.l.a(this.b(((fh)fa2).g()))) <= n5) continue;
                    return fa2;
                }
            }
            return null;
        }
        return null;
    }

    public boolean e() {
        return this.f.n instanceof bbj;
    }

    public void c(int n2) {
        aze aze2;
        Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            aze2 = (aze)iterator.next();
            if (aze2.c() != n2) continue;
            iterator.remove();
        }
        iterator = this.h.iterator();
        while (iterator.hasNext()) {
            aze2 = (aze)iterator.next();
            if (aze2.c() != n2) continue;
            iterator.remove();
            break;
        }
    }

    public int f() {
        return bav.a(this.f.u.E);
    }

    public int g() {
        return bav.b(this.e() ? this.f.u.G : this.f.u.F);
    }

    public float h() {
        return this.f.u.D;
    }

    public static int a(float f2) {
        int n2 = 320;
        int n3 = 40;
        return oy.d(f2 * (float)(n2 - n3) + (float)n3);
    }

    public static int b(float f2) {
        int n2 = 180;
        int n3 = 20;
        return oy.d(f2 * (float)(n2 - n3) + (float)n3);
    }

    public int i() {
        return this.g() / 9;
    }
}

