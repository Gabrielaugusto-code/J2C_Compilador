/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public abstract class bma
extends xq {
    public static final brq b = new brq("textures/entity/steve.png");
    private bqk a;
    private bqk c;
    private brq d;
    private brq e;

    public bma(afs afs2, GameProfile gameProfile) {
        super(afs2, gameProfile);
        this.n();
    }

    protected void n() {
        String string = this.b_();
        if (string.isEmpty()) {
            return;
        }
        this.d = bma.e(string);
        this.e = bma.f(string);
        this.a = bma.a(this.d, string);
        this.c = bma.b(this.e, string);
    }

    public bqk r() {
        return this.a;
    }

    public bqk s() {
        return this.c;
    }

    public brq t() {
        return this.d;
    }

    public brq u() {
        return this.e;
    }

    public static bqk a(brq brq2, String string) {
        return bma.a(brq2, bma.c(string), b, new bmv());
    }

    public static bqk b(brq brq2, String string) {
        return bma.a(brq2, bma.d(string), null, null);
    }

    private static bqk a(brq brq2, String string, brq brq3, bmq bmq2) {
        bqy bqy2 = azi.B().P();
        bra bra2 = bqy2.b(brq2);
        if (bra2 == null) {
            bra2 = new bqk(string, brq3, bmq2);
            bqy2.a(brq2, bra2);
        }
        return (bqk)bra2;
    }

    public static String c(String string) {
        return String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", pe.a(string));
    }

    public static String d(String string) {
        return String.format("http://skins.minecraft.net/MinecraftCloaks/%s.png", pe.a(string));
    }

    public static brq e(String string) {
        return new brq("skins/" + pe.a(string));
    }

    public static brq f(String string) {
        return new brq("cloaks/" + pe.a(string));
    }

    public static brq g(String string) {
        return new brq("skull/" + pe.a(string));
    }
}

