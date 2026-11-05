/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;

public class bal {
    private final String a;
    private final String b;
    private final String c;
    private final bam d;

    public bal(String string, String string2, String string3, String string4) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = bam.a(string4);
    }

    public String a() {
        return "token:" + this.c + ":" + this.b;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public GameProfile e() {
        return new GameProfile(this.b(), this.c());
    }

    public bam f() {
        return this.d;
    }
}

