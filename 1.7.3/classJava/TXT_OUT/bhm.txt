/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class bhm
extends bcl {
    private static final a a = a.c;
    private static final a f = a.m;
    private static final a g = a.f;
    private final ChatUserInfo h;
    private final fa i;
    private final List r = Lists.newArrayList();
    private final buz s;
    private int t;

    public bhm(buz buz2, ChatUserInfo chatUserInfo) {
        this.s = buz2;
        this.h = chatUserInfo;
        this.i = new fh(chatUserInfo.displayName);
        this.r.addAll(bhm.a(chatUserInfo.modes, chatUserInfo.subscriptions, buz2));
    }

    public static List a(Set set, Set set2, buz buz2) {
        fh fh2;
        fa fa2;
        String string = buz2 == null ? null : buz2.C();
        boolean bl2 = buz2 != null && buz2.B();
        ArrayList arrayList = Lists.newArrayList();
        for (ChatUserMode chatUserMode : set) {
            fa2 = bhm.a(chatUserMode, string, bl2);
            if (fa2 == null) continue;
            fh2 = new fh("- ");
            fh2.a(fa2);
            arrayList.add(fh2);
        }
        for (ChatUserMode chatUserMode : set2) {
            fa2 = bhm.a((ChatUserSubscription)chatUserMode, string, bl2);
            if (fa2 == null) continue;
            fh2 = new fh("- ");
            fh2.a(fa2);
            arrayList.add(fh2);
        }
        return arrayList;
    }

    public static fa a(ChatUserSubscription chatUserSubscription, String string, boolean bl2) {
        fi fi2 = null;
        if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) {
            fi2 = string == null ? new fi("stream.user.subscription.subscriber", new Object[0]) : (bl2 ? new fi("stream.user.subscription.subscriber.self", new Object[0]) : new fi("stream.user.subscription.subscriber.other", string));
            fi2.b().a(a);
        } else if (chatUserSubscription == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO) {
            fi2 = new fi("stream.user.subscription.turbo", new Object[0]);
            fi2.b().a(g);
        }
        return fi2;
    }

    public static fa a(ChatUserMode chatUserMode, String string, boolean bl2) {
        fi fi2 = null;
        if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) {
            fi2 = new fi("stream.user.mode.administrator", new Object[0]);
            fi2.b().a(g);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BANNED) {
            fi2 = string == null ? new fi("stream.user.mode.banned", new Object[0]) : (bl2 ? new fi("stream.user.mode.banned.self", new Object[0]) : new fi("stream.user.mode.banned.other", string));
            fi2.b().a(f);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER) {
            fi2 = string == null ? new fi("stream.user.mode.broadcaster", new Object[0]) : (bl2 ? new fi("stream.user.mode.broadcaster.self", new Object[0]) : new fi("stream.user.mode.broadcaster.other", new Object[0]));
            fi2.b().a(a);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) {
            fi2 = string == null ? new fi("stream.user.mode.moderator", new Object[0]) : (bl2 ? new fi("stream.user.mode.moderator.self", new Object[0]) : new fi("stream.user.mode.moderator.other", string));
            fi2.b().a(a);
        } else if (chatUserMode == ChatUserMode.TTV_CHAT_USERMODE_STAFF) {
            fi2 = new fi("stream.user.mode.staff", new Object[0]);
            fi2.b().a(g);
        }
        return fi2;
    }

    @Override
    public void r_() {
        int n2 = this.l / 3;
        int n3 = n2 - 130;
        this.n.add(new bau(1, n2 * 0 + n3 / 2, this.m - 70, 130, 20, bsc.a("stream.userinfo.timeout", new Object[0])));
        this.n.add(new bau(0, n2 * 1 + n3 / 2, this.m - 70, 130, 20, bsc.a("stream.userinfo.ban", new Object[0])));
        this.n.add(new bau(2, n2 * 2 + n3 / 2, this.m - 70, 130, 20, bsc.a("stream.userinfo.mod", new Object[0])));
        this.n.add(new bau(5, n2 * 0 + n3 / 2, this.m - 45, 130, 20, bsc.a("gui.cancel", new Object[0])));
        this.n.add(new bau(3, n2 * 1 + n3 / 2, this.m - 45, 130, 20, bsc.a("stream.userinfo.unban", new Object[0])));
        this.n.add(new bau(4, n2 * 2 + n3 / 2, this.m - 45, 130, 20, bsc.a("stream.userinfo.unmod", new Object[0])));
        int n4 = 0;
        for (fa fa2 : this.r) {
            n4 = Math.max(n4, this.q.a(fa2.d()));
        }
        this.t = this.l / 2 - n4 / 2;
    }

    @Override
    protected void a(bau bau2) {
        if (!bau2.l) {
            return;
        }
        if (bau2.k == 0) {
            this.s.b("/ban " + this.h.displayName);
        } else if (bau2.k == 3) {
            this.s.b("/unban " + this.h.displayName);
        } else if (bau2.k == 2) {
            this.s.b("/mod " + this.h.displayName);
        } else if (bau2.k == 4) {
            this.s.b("/unmod " + this.h.displayName);
        } else if (bau2.k == 1) {
            this.s.b("/timeout " + this.h.displayName);
        }
        this.k.a((bcl)null);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.q_();
        this.a(this.q, this.i.c(), this.l / 2, 70, 0xFFFFFF);
        int n4 = 80;
        for (fa fa2 : this.r) {
            this.b(this.q, fa2.d(), this.t, n4, 0xFFFFFF);
            n4 += this.q.a;
        }
        super.a(n2, n3, f2);
    }
}

