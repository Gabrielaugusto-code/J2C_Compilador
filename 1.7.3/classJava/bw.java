/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bw
extends y {
    @Override
    public String c() {
        return "testforblock";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.testforblock.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 4) {
            int n2;
            Object object;
            Object object2;
            afs afs2;
            int n3 = ac2.f_().a;
            int n4 = ac2.f_().b;
            int n5 = ac2.f_().c;
            n3 = oy.c(bw.a(ac2, n3, stringArray[0]));
            n4 = oy.c(bw.a(ac2, n4, stringArray[1]));
            n5 = oy.c(bw.a(ac2, n5, stringArray[2]));
            ahz ahz2 = ahz.b(stringArray[3]);
            if (ahz2 == null) {
                throw new cd("commands.setblock.notFound", stringArray[3]);
            }
            int n6 = -1;
            if (stringArray.length >= 5) {
                n6 = bw.a(ac2, stringArray[4], -1, 15);
            }
            if (!(afs2 = ac2.d()).d(n3, n4, n5)) {
                throw new cc("commands.testforblock.outOfWorld", new Object[0]);
            }
            dg dg2 = new dg();
            boolean bl2 = false;
            if (stringArray.length >= 6 && ahz2.u()) {
                object2 = bw.a(ac2, stringArray, 5).c();
                try {
                    object = dx.a((String)object2);
                    if (!(object instanceof dg)) {
                        throw new cc("commands.setblock.tagError", "Not a valid tag");
                    }
                    dg2 = (dg)object;
                    bl2 = true;
                }
                catch (dw dw2) {
                    throw new cc("commands.setblock.tagError", dw2.getMessage());
                }
            }
            if ((object2 = afs2.a(n3, n4, n5)) != ahz2) {
                throw new cc("commands.testforblock.failed.tile", n3, n4, n5, ((ahz)object2).F(), ahz2.F());
            }
            if (n6 > -1 && (n2 = afs2.e(n3, n4, n5)) != n6) {
                throw new cc("commands.testforblock.failed.data", n3, n4, n5, n2, n6);
            }
            if (bl2) {
                object = afs2.o(n3, n4, n5);
                if (object == null) {
                    throw new cc("commands.testforblock.failed.tileEntity", n3, n4, n5);
                }
                dg dg3 = new dg();
                ((ani)object).b(dg3);
                if (!this.a(dg2, dg3)) {
                    throw new cc("commands.testforblock.failed.nbt", n3, n4, n5);
                }
            }
            ac2.a(new fi("commands.testforblock.success", n3, n4, n5));
            return;
        }
        throw new ch("commands.testforblock.usage", new Object[0]);
    }

    public boolean a(du du2, du du3) {
        if (du2 == du3) {
            return true;
        }
        if (du2 == null) {
            return true;
        }
        if (du3 == null) {
            return false;
        }
        if (!du2.getClass().equals(du3.getClass())) {
            return false;
        }
        if (du2 instanceof dg) {
            dg dg2 = (dg)du2;
            dg dg3 = (dg)du3;
            for (String string : dg2.c()) {
                du du4 = dg2.a(string);
                if (this.a(du4, dg3.a(string))) continue;
                return false;
            }
            return true;
        }
        return du2.equals(du3);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 4) {
            return bw.a(stringArray, ahz.c.b());
        }
        return null;
    }
}

