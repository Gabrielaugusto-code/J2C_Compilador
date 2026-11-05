/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class og {
    protected static Map a = new HashMap();
    public static List b = new ArrayList();
    public static List c = new ArrayList();
    public static List d = new ArrayList();
    public static List e = new ArrayList();
    public static ny f = new nv("stat.leaveGame", new fi("stat.leaveGame", new Object[0])).i().h();
    public static ny g = new nv("stat.playOneMinute", new fi("stat.playOneMinute", new Object[0]), ny.h).i().h();
    public static ny h = new nv("stat.walkOneCm", new fi("stat.walkOneCm", new Object[0]), ny.i).i().h();
    public static ny i = new nv("stat.swimOneCm", new fi("stat.swimOneCm", new Object[0]), ny.i).i().h();
    public static ny j = new nv("stat.fallOneCm", new fi("stat.fallOneCm", new Object[0]), ny.i).i().h();
    public static ny k = new nv("stat.climbOneCm", new fi("stat.climbOneCm", new Object[0]), ny.i).i().h();
    public static ny l = new nv("stat.flyOneCm", new fi("stat.flyOneCm", new Object[0]), ny.i).i().h();
    public static ny m = new nv("stat.diveOneCm", new fi("stat.diveOneCm", new Object[0]), ny.i).i().h();
    public static ny n = new nv("stat.minecartOneCm", new fi("stat.minecartOneCm", new Object[0]), ny.i).i().h();
    public static ny o = new nv("stat.boatOneCm", new fi("stat.boatOneCm", new Object[0]), ny.i).i().h();
    public static ny p = new nv("stat.pigOneCm", new fi("stat.pigOneCm", new Object[0]), ny.i).i().h();
    public static ny q = new nv("stat.horseOneCm", new fi("stat.horseOneCm", new Object[0]), ny.i).i().h();
    public static ny r = new nv("stat.jump", new fi("stat.jump", new Object[0])).i().h();
    public static ny s = new nv("stat.drop", new fi("stat.drop", new Object[0])).i().h();
    public static ny t = new nv("stat.damageDealt", new fi("stat.damageDealt", new Object[0]), ny.j).h();
    public static ny u = new nv("stat.damageTaken", new fi("stat.damageTaken", new Object[0]), ny.j).h();
    public static ny v = new nv("stat.deaths", new fi("stat.deaths", new Object[0])).h();
    public static ny w = new nv("stat.mobKills", new fi("stat.mobKills", new Object[0])).h();
    public static ny x = new nv("stat.animalsBred", new fi("stat.animalsBred", new Object[0])).h();
    public static ny y = new nv("stat.playerKills", new fi("stat.playerKills", new Object[0])).h();
    public static ny z = new nv("stat.fishCaught", new fi("stat.fishCaught", new Object[0])).h();
    public static ny A = new nv("stat.junkFished", new fi("stat.junkFished", new Object[0])).h();
    public static ny B = new nv("stat.treasureFished", new fi("stat.treasureFished", new Object[0])).h();
    public static final ny[] C = new ny[4096];
    public static final ny[] D = new ny[32000];
    public static final ny[] E = new ny[32000];
    public static final ny[] F = new ny[32000];

    public static void a() {
        og.c();
        og.d();
        og.e();
        og.b();
        nt.a();
        qx.a();
    }

    private static void b() {
        HashSet<abs> hashSet = new HashSet<abs>();
        for (adx object : adv.a().b()) {
            if (object.b() == null) continue;
            hashSet.add(object.b().b());
        }
        for (abu abu2 : adr.a().b().values()) {
            hashSet.add(abu2.b());
        }
        for (abs abs2 : hashSet) {
            if (abs2 == null) continue;
            int n2 = abs.b(abs2);
            og.D[n2] = new nw("stat.craftItem." + n2, (fa)new fi("stat.craftItem", new abu(abs2).E()), abs2).h();
        }
        og.a(D);
    }

    private static void c() {
        for (ahz ahz2 : ahz.c) {
            if (abs.a(ahz2) == null) continue;
            int n2 = ahz.b(ahz2);
            if (!ahz2.G()) continue;
            og.C[n2] = new nw("stat.mineBlock." + n2, (fa)new fi("stat.mineBlock", new abu(ahz2).E()), abs.a(ahz2)).h();
            e.add((nw)C[n2]);
        }
        og.a(C);
    }

    private static void d() {
        for (abs abs2 : abs.e) {
            if (abs2 == null) continue;
            int n2 = abs.b(abs2);
            og.E[n2] = new nw("stat.useItem." + n2, (fa)new fi("stat.useItem", new abu(abs2).E()), abs2).h();
            if (abs2 instanceof zy) continue;
            d.add((nw)E[n2]);
        }
        og.a(E);
    }

    private static void e() {
        for (abs abs2 : abs.e) {
            if (abs2 == null) continue;
            int n2 = abs.b(abs2);
            if (!abs2.p()) continue;
            og.F[n2] = new nw("stat.breakItem." + n2, (fa)new fi("stat.breakItem", new abu(abs2).E()), abs2).h();
        }
        og.a(F);
    }

    private static void a(ny[] nyArray) {
        og.a(nyArray, aie.j, aie.i);
        og.a(nyArray, aie.l, aie.k);
        og.a(nyArray, aie.aP, aie.aK);
        og.a(nyArray, aie.am, aie.al);
        og.a(nyArray, aie.ay, aie.ax);
        og.a(nyArray, aie.aS, aie.aR);
        og.a(nyArray, aie.bV, aie.bU);
        og.a(nyArray, aie.aA, aie.az);
        og.a(nyArray, aie.bv, aie.bu);
        og.a(nyArray, aie.Q, aie.P);
        og.a(nyArray, aie.T, aie.U);
        og.a(nyArray, aie.bw, aie.bx);
        og.a(nyArray, aie.c, aie.d);
        og.a(nyArray, aie.ak, aie.d);
    }

    private static void a(ny[] nyArray, ahz ahz2, ahz ahz3) {
        int n2 = ahz.b(ahz2);
        int n3 = ahz.b(ahz3);
        if (nyArray[n2] != null && nyArray[n3] == null) {
            nyArray[n3] = nyArray[n2];
            return;
        }
        b.remove(nyArray[n2]);
        e.remove(nyArray[n2]);
        c.remove(nyArray[n2]);
        nyArray[n2] = nyArray[n3];
    }

    public static ny a(qy qy2) {
        String string = qx.b(qy2.a);
        if (string == null) {
            return null;
        }
        return new ny("stat.killEntity." + string, new fi("stat.entityKill", new fi("entity." + string + ".name", new Object[0]))).h();
    }

    public static ny b(qy qy2) {
        String string = qx.b(qy2.a);
        if (string == null) {
            return null;
        }
        return new ny("stat.entityKilledBy." + string, new fi("stat.entityKilledBy", new fi("entity." + string + ".name", new Object[0]))).h();
    }

    public static ny a(String string) {
        return (ny)a.get(string);
    }
}

