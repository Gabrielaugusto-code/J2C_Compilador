/*
 * Decompiled with CFR 0.152.
 */
public class aw
extends y {
    @Override
    public String c() {
        return "kill";
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public String c(ac ac2) {
        return "commands.kill.usage";
    }

    @Override
    public void b(ac ac2, String[] stringArray) {
        mp mp2 = aw.b(ac2);
        ((xq)mp2).a(qf.i, Float.MAX_VALUE);
        ac2.a(new fi("commands.kill.success", new Object[0]));
    }
}

