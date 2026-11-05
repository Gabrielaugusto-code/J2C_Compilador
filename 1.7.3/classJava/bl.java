/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bl
extends y {
    @Override
    public String c() {
        return "setblock";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.setblock.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 4) {
            Object object;
            afs afs2;
            int n2 = ac2.f_().a;
            int n3 = ac2.f_().b;
            int n4 = ac2.f_().c;
            n2 = oy.c(bl.a(ac2, n2, stringArray[0]));
            n3 = oy.c(bl.a(ac2, n3, stringArray[1]));
            n4 = oy.c(bl.a(ac2, n4, stringArray[2]));
            ahz ahz2 = y.g(ac2, stringArray[3]);
            int n5 = 0;
            if (stringArray.length >= 5) {
                n5 = bl.a(ac2, stringArray[4], 0, 15);
            }
            if (!(afs2 = ac2.d()).d(n2, n3, n4)) {
                throw new cc("commands.setblock.outOfWorld", new Object[0]);
            }
            dg dg2 = new dg();
            boolean bl2 = false;
            if (stringArray.length >= 7 && ahz2.u()) {
                object = bl.a(ac2, stringArray, 6).c();
                try {
                    du du2 = dx.a((String)object);
                    if (!(du2 instanceof dg)) {
                        throw new cc("commands.setblock.tagError", "Not a valid tag");
                    }
                    dg2 = (dg)du2;
                    bl2 = true;
                }
                catch (dw dw2) {
                    throw new cc("commands.setblock.tagError", dw2.getMessage());
                }
            }
            if (stringArray.length >= 6) {
                if (stringArray[5].equals("destroy")) {
                    afs2.a(n2, n3, n4, true);
                } else if (stringArray[5].equals("keep") && !afs2.c(n2, n3, n4)) {
                    throw new cc("commands.setblock.noChange", new Object[0]);
                }
            }
            if (!afs2.d(n2, n3, n4, ahz2, n5, 3)) {
                throw new cc("commands.setblock.noChange", new Object[0]);
            }
            if (bl2 && (object = afs2.o(n2, n3, n4)) != null) {
                dg2.a("x", n2);
                dg2.a("y", n3);
                dg2.a("z", n4);
                ((ani)object).a(dg2);
            }
            bl.a(ac2, "commands.setblock.success", new Object[0]);
            return;
        }
        throw new ch("commands.setblock.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 4) {
            return bl.a(stringArray, ahz.c.b());
        }
        if (stringArray.length == 6) {
            return bl.a(stringArray, "replace", "destroy", "keep");
        }
        return null;
    }
}

