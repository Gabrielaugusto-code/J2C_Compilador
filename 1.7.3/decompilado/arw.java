/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Random;

public class arw {
    private static final ask[] a = new ask[]{new ask(arz.class, 30, 0, true), new ask(arx.class, 10, 4), new ask(asl.class, 10, 4), new ask(asm.class, 10, 3), new ask(asi.class, 5, 2), new ask(asc.class, 5, 1)};
    private static final ask[] b = new ask[]{new ask(asf.class, 25, 0, true), new ask(asd.class, 15, 5), new ask(asg.class, 5, 10), new ask(ase.class, 5, 10), new ask(asa.class, 10, 3, true), new ask(asb.class, 7, 2), new ask(ash.class, 5, 2)};

    public static void a() {
        aty.a(arx.class, "NeBCr");
        aty.a(ary.class, "NeBEF");
        aty.a(arz.class, "NeBS");
        aty.a(asa.class, "NeCCS");
        aty.a(asb.class, "NeCTB");
        aty.a(asc.class, "NeCE");
        aty.a(asd.class, "NeSCSC");
        aty.a(ase.class, "NeSCLT");
        aty.a(asf.class, "NeSC");
        aty.a(asg.class, "NeSCRT");
        aty.a(ash.class, "NeCSR");
        aty.a(asi.class, "NeMT");
        aty.a(asl.class, "NeRC");
        aty.a(asm.class, "NeSR");
        aty.a(asn.class, "NeStart");
    }

    private static asj b(ask ask2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        Class clazz = ask2.a;
        asj asj2 = null;
        if (clazz == arz.class) {
            asj2 = arz.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == arx.class) {
            asj2 = arx.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asl.class) {
            asj2 = asl.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asm.class) {
            asj2 = asm.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asi.class) {
            asj2 = asi.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asc.class) {
            asj2 = asc.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asf.class) {
            asj2 = asf.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asg.class) {
            asj2 = asg.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == ase.class) {
            asj2 = ase.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asa.class) {
            asj2 = asa.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asb.class) {
            asj2 = asb.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == asd.class) {
            asj2 = asd.a(list, random, n2, n3, n4, n5, n6);
        } else if (clazz == ash.class) {
            asj2 = ash.a(list, random, n2, n3, n4, n5, n6);
        }
        return asj2;
    }

    static /* synthetic */ asj a(ask ask2, List list, Random random, int n2, int n3, int n4, int n5, int n6) {
        return arw.b(ask2, list, random, n2, n3, n4, n5, n6);
    }

    static /* synthetic */ ask[] b() {
        return a;
    }

    static /* synthetic */ ask[] c() {
        return b;
    }
}

