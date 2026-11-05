/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public class bt
extends y {
    @Override
    public String c() {
        return "summon";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String c(ac ac2) {
        return "commands.summon.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        if (stringArray.length >= 1) {
            Object object;
            Object object2;
            afs afs2;
            String string = stringArray[0];
            double d2 = (double)ac2.f_().a + 0.5;
            double d3 = ac2.f_().b;
            double d4 = (double)ac2.f_().c + 0.5;
            if (stringArray.length >= 4) {
                d2 = bt.a(ac2, d2, stringArray[1]);
                d3 = bt.a(ac2, d3, stringArray[2]);
                d4 = bt.a(ac2, d4, stringArray[3]);
            }
            if (!(afs2 = ac2.d()).d((int)d2, (int)d3, (int)d4)) {
                bt.a(ac2, "commands.summon.outOfWorld", new Object[0]);
                return;
            }
            dg dg2 = new dg();
            boolean bl2 = false;
            if (stringArray.length >= 5) {
                object2 = bt.a(ac2, stringArray, 4);
                try {
                    object = dx.a(object2.c());
                    if (!(object instanceof dg)) {
                        bt.a(ac2, "commands.summon.tagError", "Not a valid tag");
                        return;
                    }
                    dg2 = (dg)object;
                    bl2 = true;
                }
                catch (dw dw2) {
                    bt.a(ac2, "commands.summon.tagError", dw2.getMessage());
                    return;
                }
            }
            dg2.a("id", string);
            object2 = qx.a(dg2, afs2);
            if (object2 != null) {
                ((qr)object2).b(d2, d3, d4, ((qr)object2).y, ((qr)object2).z);
                if (!bl2 && object2 instanceof rn) {
                    ((rn)object2).a((rp)null);
                }
                afs2.d((qr)object2);
                object = object2;
                dg dg3 = dg2;
                while (dg3.b("Riding", 10)) {
                    qr qr2 = qx.a(dg3.m("Riding"), afs2);
                    if (qr2 != null) {
                        qr2.b(d2, d3, d4, qr2.y, qr2.z);
                        afs2.d(qr2);
                        ((qr)object).a(qr2);
                    }
                    object = qr2;
                    dg3 = dg3.m("Riding");
                }
                bt.a(ac2, "commands.summon.success", new Object[0]);
                return;
            }
            bt.a(ac2, "commands.summon.failed", new Object[0]);
            return;
        }
        throw new ch("commands.summon.usage", new Object[0]);
    }

    @Override
    public List a(ac ac2, String[] stringArray) {
        if (stringArray.length == 1) {
            return bt.a(stringArray, this.d());
        }
        return null;
    }

    protected String[] d() {
        return qx.b().toArray(new String[0]);
    }
}

