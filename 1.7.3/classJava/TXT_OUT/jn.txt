/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class jn
extends fk {
    private GameProfile a;

    public jn() {
    }

    public jn(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    @Override
    public void a(ep ep2) {
        this.a = new GameProfile(null, ep2.c(16));
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a.getName());
    }

    public void a(jm jm2) {
        jm2.a(this);
    }

    public GameProfile c() {
        return this.a;
    }
}

