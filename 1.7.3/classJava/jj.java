/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class jj
extends fk {
    private GameProfile a;

    public jj() {
    }

    public jj(GameProfile gameProfile) {
        this.a = gameProfile;
    }

    @Override
    public void a(ep ep2) {
        String string = ep2.c(36);
        String string2 = ep2.c(16);
        this.a = new GameProfile(string, string2);
    }

    @Override
    public void b(ep ep2) {
        ep2.a(this.a.getId());
        ep2.a(this.a.getName());
    }

    public void a(ji ji2) {
        ji2.a(this);
    }

    @Override
    public boolean a() {
        return true;
    }
}

