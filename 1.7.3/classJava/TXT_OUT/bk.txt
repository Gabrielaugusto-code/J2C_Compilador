/*
 * Decompiled with CFR 0.152.
 */
import net.minecraft.server.MinecraftServer;

public class bk
extends z
implements x {
    public bk() {
        this.a(new by());
        this.a(new ar());
        this.a(new aq());
        this.a(new al());
        this.a(new aw());
        this.a(new bz());
        this.a(new ca());
        this.a(new ap());
        this.a(new bu());
        this.a(new at());
        this.a(new am());
        this.a(new ao());
        this.a(new an());
        this.a(new bp());
        this.a(new au());
        this.a(new ak());
        this.a(new az());
        this.a(new ah());
        this.a(new bo());
        this.a(new bm());
        this.a(new as());
        this.a(new ai());
        this.a(new bx());
        this.a(new bq());
        this.a(new be());
        this.a(new bj());
        this.a(new ae());
        this.a(new bt());
        this.a(new bl());
        this.a(new bw());
        this.a(new ba());
        if (MinecraftServer.G().V()) {
            this.a(new bb());
            this.a(new aj());
            this.a(new bs());
            this.a(new bg());
            this.a(new bh());
            this.a(new bi());
            this.a(new af());
            this.a(new bc());
            this.a(new ag());
            this.a(new ax());
            this.a(new bd());
            this.a(new av());
            this.a(new ay());
            this.a(new cb());
            this.a(new bn());
        } else {
            this.a(new bf());
        }
        y.a(this);
    }

    @Override
    public void a(ac ac2, int n2, String string, Object ... objectArray) {
        boolean bl2 = true;
        if (ac2 instanceof afg && !MinecraftServer.G().b[0].O().b("commandBlockOutput")) {
            bl2 = false;
        }
        fi fi2 = new fi("chat.type.admin", ac2.b_(), new fi(string, objectArray));
        fi2.b().a(a.h);
        fi2.b().b(true);
        if (bl2) {
            for (mp mp2 : MinecraftServer.G().af().a) {
                if (mp2 == ac2 || !MinecraftServer.G().af().d(mp2.b_())) continue;
                mp2.a(fi2);
            }
        }
        if (ac2 != MinecraftServer.G()) {
            MinecraftServer.G().a(fi2);
        }
        if ((n2 & 1) != 1) {
            ac2.a(new fi(string, objectArray));
        }
    }
}

