/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;
import java.util.Set;

public class aax
extends abs {
    private Set c;
    protected float a = 4.0f;
    private float d;
    protected abt b;

    protected aax(float f2, abt abt2, Set set) {
        this.b = abt2;
        this.c = set;
        this.h = 1;
        this.f(abt2.a());
        this.a = abt2.b();
        this.d = f2 + abt2.c();
        this.a(aak.i);
    }

    @Override
    public float a(abu abu2, ahz ahz2) {
        return this.c.contains(ahz2) ? this.a : 1.0f;
    }

    @Override
    public boolean a(abu abu2, rm rm2, rm rm3) {
        abu2.a(2, rm3);
        return true;
    }

    @Override
    public boolean a(abu abu2, afs afs2, ahz ahz2, int n2, int n3, int n4, rm rm2) {
        if ((double)ahz2.f(afs2, n2, n3, n4) != 0.0) {
            abu2.a(1, rm2);
        }
        return true;
    }

    @Override
    public boolean f() {
        return true;
    }

    public abt i() {
        return this.b;
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
        multimap.put((Object)xa.e.a(), (Object)new sa(f, "Tool modifier", this.d, 0));
        return multimap;
    }
}

