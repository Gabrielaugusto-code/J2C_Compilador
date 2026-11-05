/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;

public class acy
extends abs {
    private float a;
    private final abt b;

    public acy(abt abt2) {
        this.b = abt2;
        this.h = 1;
        this.f(abt2.a());
        this.a(aak.j);
        this.a = 4.0f + abt2.c();
    }

    public float i() {
        return this.b.c();
    }

    @Override
    public float a(abu abu2, ahz ahz2) {
        if (ahz2 == aie.G) {
            return 15.0f;
        }
        avk avk2 = ahz2.o();
        if (avk2 == avk.k || avk2 == avk.l || avk2 == avk.v || avk2 == avk.j || avk2 == avk.C) {
            return 1.5f;
        }
        return 1.0f;
    }

    @Override
    public boolean a(abu abu2, rm rm2, rm rm3) {
        abu2.a(1, rm3);
        return true;
    }

    @Override
    public boolean a(abu abu2, afs afs2, ahz ahz2, int n2, int n3, int n4, rm rm2) {
        if ((double)ahz2.f(afs2, n2, n3, n4) != 0.0) {
            abu2.a(2, rm2);
        }
        return true;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public acz d(abu abu2) {
        return acz.d;
    }

    @Override
    public int d_(abu abu2) {
        return 72000;
    }

    @Override
    public abu a(abu abu2, afs afs2, xq xq2) {
        xq2.a(abu2, this.d_(abu2));
        return abu2;
    }

    @Override
    public boolean b(ahz ahz2) {
        return ahz2 == aie.G;
    }

    @Override
    public int c() {
        return this.b.e();
    }

    public String j() {
        return this.b.toString();
    }

    @Override
    public boolean a(abu abu2, abu abu3) {
        if (this.b.f() == abu3.b()) {
            return true;
        }
        return super.a(abu2, abu3);
    }

    @Override
    public Multimap k() {
        Multimap multimap = super.k();
        multimap.put((Object)xa.e.a(), (Object)new sa(f, "Weapon modifier", this.a, 0));
        return multimap;
    }
}

