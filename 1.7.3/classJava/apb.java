/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class apb
implements aot,
ayj {
    private static final Logger a = LogManager.getLogger();
    private List b = new ArrayList();
    private Set c = new HashSet();
    private Object d = new Object();
    private final File e;

    public apb(File file) {
        this.e = file;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public aoo a(afs afs2, int n2, int n3) {
        dg dg2 = null;
        afl afl2 = new afl(n2, n3);
        Object object = this.d;
        synchronized (object) {
            if (this.c.contains(afl2)) {
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    if (!((apc)this.b.get((int)i2)).a.equals(afl2)) continue;
                    dg2 = ((apc)this.b.get((int)i2)).b;
                    break;
                }
            }
        }
        if (dg2 == null) {
            object = apa.c(this.e, n2, n3);
            if (object != null) {
                dg2 = dr.a((DataInput)object);
            } else {
                return null;
            }
        }
        return this.a(afs2, n2, n3, dg2);
    }

    protected aoo a(afs afs2, int n2, int n3, dg dg2) {
        if (!dg2.b("Level", 10)) {
            a.error("Chunk file at " + n2 + "," + n3 + " is missing level data, skipping");
            return null;
        }
        if (!dg2.m("Level").b("Sections", 9)) {
            a.error("Chunk file at " + n2 + "," + n3 + " is missing block data, skipping");
            return null;
        }
        aoo aoo2 = this.a(afs2, dg2.m("Level"));
        if (!aoo2.a(n2, n3)) {
            a.error("Chunk file at " + n2 + "," + n3 + " is in the wrong location; relocating. (Expected " + n2 + ", " + n3 + ", got " + aoo2.g + ", " + aoo2.h + ")");
            dg2.a("xPos", n2);
            dg2.a("zPos", n3);
            aoo2 = this.a(afs2, dg2.m("Level"));
        }
        return aoo2;
    }

    @Override
    public void a(afs afs2, aoo aoo2) {
        afs2.G();
        try {
            dg dg2 = new dg();
            dg dg3 = new dg();
            dg2.a("Level", dg3);
            this.a(aoo2, afs2, dg3);
            this.a(aoo2.l(), dg2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(afl afl2, dg dg2) {
        Object object = this.d;
        synchronized (object) {
            if (this.c.contains(afl2)) {
                for (int i2 = 0; i2 < this.b.size(); ++i2) {
                    if (!((apc)this.b.get((int)i2)).a.equals(afl2)) continue;
                    this.b.set(i2, new apc(afl2, dg2));
                    return;
                }
            }
            this.b.add(new apc(afl2, dg2));
            this.c.add(afl2);
            ayi.a.a(this);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean c() {
        apc apc2 = null;
        Object object = this.d;
        synchronized (object) {
            if (this.b.isEmpty()) {
                return false;
            }
            apc2 = (apc)this.b.remove(0);
            this.c.remove(apc2.a);
        }
        if (apc2 != null) {
            try {
                this.a(apc2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return true;
    }

    private void a(apc apc2) {
        DataOutputStream dataOutputStream = apa.d(this.e, apc2.a.a, apc2.a.b);
        dr.a(apc2.b, (DataOutput)dataOutputStream);
        dataOutputStream.close();
    }

    @Override
    public void b(afs afs2, aoo aoo2) {
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        while (this.c()) {
        }
    }

    private void a(aoo aoo2, afs afs2, dg dg2) {
        dg dg3;
        dg2.a("V", (byte)1);
        dg2.a("xPos", aoo2.g);
        dg2.a("zPos", aoo2.h);
        dg2.a("LastUpdate", afs2.I());
        dg2.a("HeightMap", aoo2.f);
        dg2.a("TerrainPopulated", aoo2.k);
        dg2.a("LightPopulated", aoo2.l);
        dg2.a("InhabitedTime", aoo2.s);
        aoq[] aoqArray = aoo2.i();
        dp dp2 = new dp();
        boolean bl2 = !afs2.t.g;
        for (aoq object : aoqArray) {
            if (object == null) continue;
            dg3 = new dg();
            dg3.a("Y", (byte)(object.d() >> 4 & 0xFF));
            dg3.a("Blocks", object.g());
            if (object.i() != null) {
                dg3.a("Add", object.i().a);
            }
            dg3.a("Data", object.j().a);
            dg3.a("BlockLight", object.k().a);
            if (bl2) {
                dg3.a("SkyLight", object.l().a);
            } else {
                dg3.a("SkyLight", new byte[object.k().a.length]);
            }
            dp2.a(dg3);
        }
        dg2.a("Sections", dp2);
        dg2.a("Biomes", aoo2.m());
        aoo2.o = false;
        dp dp3 = new dp();
        for (int i2 = 0; i2 < aoo2.j.length; ++i2) {
            for (qr qr2 : aoo2.j[i2]) {
                if (!qr2.d(dg3 = new dg())) continue;
                aoo2.o = true;
                dp3.a(dg3);
            }
        }
        dg2.a("Entities", dp3);
        dp dp4 = new dp();
        for (ani ani2 : aoo2.i.values()) {
            dg3 = new dg();
            ani2.b(dg3);
            dp4.a(dg3);
        }
        dg2.a("TileEntities", dp4);
        List list = afs2.a(aoo2, false);
        if (list != null) {
            long l2 = afs2.I();
            dp dp5 = new dp();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                agj agj2 = (agj)iterator.next();
                dg dg4 = new dg();
                dg4.a("i", ahz.b(agj2.a()));
                dg4.a("x", agj2.a);
                dg4.a("y", agj2.b);
                dg4.a("z", agj2.c);
                dg4.a("t", (int)(agj2.d - l2));
                dg4.a("p", agj2.e);
                dp5.a(dg4);
            }
            dg2.a("TileTicks", dp5);
        }
    }

    private aoo a(afs afs2, dg dg2) {
        dp dp2;
        dp dp3;
        Object object;
        dp dp4;
        Object object2;
        int n2 = dg2.f("xPos");
        int n3 = dg2.f("zPos");
        aoo aoo2 = new aoo(afs2, n2, n3);
        aoo2.f = dg2.l("HeightMap");
        aoo2.k = dg2.n("TerrainPopulated");
        aoo2.l = dg2.n("LightPopulated");
        aoo2.s = dg2.g("InhabitedTime");
        dp dp5 = dg2.c("Sections", 10);
        int n4 = 16;
        aoq[] aoqArray = new aoq[n4];
        boolean bl2 = !afs2.t.g;
        for (int i2 = 0; i2 < dp5.c(); ++i2) {
            dg dg3 = dp5.b(i2);
            byte by2 = dg3.d("Y");
            object2 = new aoq(by2 << 4, bl2);
            ((aoq)object2).a(dg3.k("Blocks"));
            if (dg3.b("Add", 7)) {
                ((aoq)object2).a(new aom(dg3.k("Add"), 4));
            }
            ((aoq)object2).b(new aom(dg3.k("Data"), 4));
            ((aoq)object2).c(new aom(dg3.k("BlockLight"), 4));
            if (bl2) {
                ((aoq)object2).d(new aom(dg3.k("SkyLight"), 4));
            }
            ((aoq)object2).e();
            aoqArray[by2] = object2;
        }
        aoo2.a(aoqArray);
        if (dg2.b("Biomes", 7)) {
            aoo2.a(dg2.k("Biomes"));
        }
        if ((dp4 = dg2.c("Entities", 10)) != null) {
            for (int i3 = 0; i3 < dp4.c(); ++i3) {
                dg dg4 = dp4.b(i3);
                object2 = qx.a(dg4, afs2);
                aoo2.o = true;
                if (object2 == null) continue;
                aoo2.a((qr)object2);
                object = object2;
                dg dg5 = dg4;
                while (dg5.b("Riding", 10)) {
                    qr qr2 = qx.a(dg5.m("Riding"), afs2);
                    if (qr2 != null) {
                        aoo2.a(qr2);
                        ((qr)object).a(qr2);
                    }
                    object = qr2;
                    dg5 = dg5.m("Riding");
                }
            }
        }
        if ((dp3 = dg2.c("TileEntities", 10)) != null) {
            for (int i4 = 0; i4 < dp3.c(); ++i4) {
                object2 = dp3.b(i4);
                object = ani.c((dg)object2);
                if (object == null) continue;
                aoo2.a((ani)object);
            }
        }
        if (dg2.b("TileTicks", 9) && (dp2 = dg2.c("TileTicks", 10)) != null) {
            for (int i5 = 0; i5 < dp2.c(); ++i5) {
                object = dp2.b(i5);
                afs2.b(((dg)object).f("x"), ((dg)object).f("y"), ((dg)object).f("z"), ahz.e(((dg)object).f("i")), ((dg)object).f("t"), ((dg)object).f("p"));
            }
        }
        return aoo2;
    }
}

