/*
 * Decompiled with CFR 0.152.
 */
public class afi
extends pn {
    public final dg b;
    public final String c;
    final /* synthetic */ afh d;

    public afi(afh afh2, dg dg2) {
        this.d = afh2;
        super(dg2.f("Weight"));
        dg dg3 = dg2.m("Properties");
        String string = dg2.j("Type");
        if (string.equals("Minecart")) {
            if (dg3 != null) {
                switch (dg3.f("Type")) {
                    case 1: {
                        string = "MinecartChest";
                        break;
                    }
                    case 2: {
                        string = "MinecartFurnace";
                        break;
                    }
                    case 0: {
                        string = "MinecartRideable";
                    }
                }
            } else {
                string = "MinecartRideable";
            }
        }
        this.b = dg3;
        this.c = string;
    }

    public afi(afh afh2, dg dg2, String string) {
        this.d = afh2;
        super(1);
        if (string.equals("Minecart")) {
            if (dg2 != null) {
                switch (dg2.f("Type")) {
                    case 1: {
                        string = "MinecartChest";
                        break;
                    }
                    case 2: {
                        string = "MinecartFurnace";
                        break;
                    }
                    case 0: {
                        string = "MinecartRideable";
                    }
                }
            } else {
                string = "MinecartRideable";
            }
        }
        this.b = dg2;
        this.c = string;
    }

    public dg a() {
        dg dg2 = new dg();
        dg2.a("Properties", this.b);
        dg2.a("Type", this.c);
        dg2.a("Weight", this.a);
        return dg2;
    }
}

