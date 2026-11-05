/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.minecraft.server.MinecraftServer;

public class btj
extends lg {
    private dg c;

    public btj(btk btk2) {
        super(btk2);
        this.a(10);
    }

    @Override
    protected void b(mp mp2) {
        if (mp2.b_().equals(this.s().K())) {
            this.c = new dg();
            mp2.e(this.c);
        }
        super.b(mp2);
    }

    @Override
    public String a(SocketAddress socketAddress, GameProfile gameProfile) {
        if (gameProfile.getName().equalsIgnoreCase(this.s().K()) && this.e(gameProfile.getName()) != null) {
            return "That name is already taken.";
        }
        return super.a(socketAddress, gameProfile);
    }

    public btk s() {
        return (btk)super.p();
    }

    @Override
    public dg q() {
        return this.c;
    }

    @Override
    public /* synthetic */ MinecraftServer p() {
        return this.s();
    }
}

