/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class jt {
    private final int a;
    private final int b;
    private GameProfile[] c;

    public jt(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public GameProfile[] c() {
        return this.c;
    }

    public void a(GameProfile[] gameProfileArray) {
        this.c = gameProfileArray;
    }
}

