/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class li
extends ayw {
    private final MinecraftServer a;
    private final Set b = new HashSet();
    private ayx c;

    public li(MinecraftServer minecraftServer) {
        this.a = minecraftServer;
    }

    @Override
    public void a(ayt ayt2) {
        super.a(ayt2);
        if (this.b.contains(ayt2.d())) {
            this.a.af().a(new hv(ayt2, 0));
        }
        this.b();
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.a.af().a(new hv(string));
        this.b();
    }

    @Override
    public void a(int n2, ayr ayr2) {
        ayr ayr3 = this.a(n2);
        super.a(n2, ayr2);
        if (ayr3 != ayr2 && ayr3 != null) {
            if (this.h(ayr3) > 0) {
                this.a.af().a(new hm(n2, ayr2));
            } else {
                this.g(ayr3);
            }
        }
        if (ayr2 != null) {
            if (this.b.contains(ayr2)) {
                this.a.af().a(new hm(n2, ayr2));
            } else {
                this.e(ayr2);
            }
        }
        this.b();
    }

    @Override
    public boolean a(String string, String string2) {
        if (super.a(string, string2)) {
            ays ays2 = this.e(string2);
            this.a.af().a(new hu(ays2, Arrays.asList(string), 3));
            this.b();
            return true;
        }
        return false;
    }

    @Override
    public void a(String string, ays ays2) {
        super.a(string, ays2);
        this.a.af().a(new hu(ays2, Arrays.asList(string), 4));
        this.b();
    }

    @Override
    public void a(ayr ayr2) {
        super.a(ayr2);
        this.b();
    }

    @Override
    public void b(ayr ayr2) {
        super.b(ayr2);
        if (this.b.contains(ayr2)) {
            this.a.af().a(new ht(ayr2, 2));
        }
        this.b();
    }

    @Override
    public void c(ayr ayr2) {
        super.c(ayr2);
        if (this.b.contains(ayr2)) {
            this.g(ayr2);
        }
        this.b();
    }

    @Override
    public void a(ays ays2) {
        super.a(ays2);
        this.a.af().a(new hu(ays2, 0));
        this.b();
    }

    @Override
    public void b(ays ays2) {
        super.b(ays2);
        this.a.af().a(new hu(ays2, 2));
        this.b();
    }

    @Override
    public void c(ays ays2) {
        super.c(ays2);
        this.a.af().a(new hu(ays2, 1));
        this.b();
    }

    public void a(ayx ayx2) {
        this.c = ayx2;
    }

    protected void b() {
        if (this.c != null) {
            this.c.c();
        }
    }

    public List d(ayr ayr2) {
        ArrayList<fk> arrayList = new ArrayList<fk>();
        arrayList.add(new ht(ayr2, 0));
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.a(i2) != ayr2) continue;
            arrayList.add(new hm(i2, ayr2));
        }
        for (ayt ayt2 : this.i(ayr2)) {
            arrayList.add(new hv(ayt2, 0));
        }
        return arrayList;
    }

    public void e(ayr ayr2) {
        List list = this.d(ayr2);
        for (mp mp2 : this.a.af().a) {
            for (fk fk2 : list) {
                mp2.a.a(fk2);
            }
        }
        this.b.add(ayr2);
    }

    public List f(ayr ayr2) {
        ArrayList<fk> arrayList = new ArrayList<fk>();
        arrayList.add(new ht(ayr2, 1));
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.a(i2) != ayr2) continue;
            arrayList.add(new hm(i2, ayr2));
        }
        return arrayList;
    }

    public void g(ayr ayr2) {
        List list = this.f(ayr2);
        for (mp mp2 : this.a.af().a) {
            for (fk fk2 : list) {
                mp2.a.a(fk2);
            }
        }
        this.b.remove(ayr2);
    }

    public int h(ayr ayr2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.a(i2) != ayr2) continue;
            ++n2;
        }
        return n2;
    }
}

