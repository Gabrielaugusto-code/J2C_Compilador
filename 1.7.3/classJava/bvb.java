/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  org.apache.logging.log4j.core.helpers.Strings
 *  org.lwjgl.opengl.GL11
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.VideoParams
 *  tv.twitch.chat.ChatMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
import com.google.common.collect.Maps;
import java.util.HashSet;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.core.helpers.Strings;
import org.lwjgl.opengl.GL11;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.chat.ChatMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class bvb
implements buq,
buu,
bux,
buz {
    private static final Logger b = LogManager.getLogger();
    public static final Marker a = MarkerManager.getMarker((String)"STREAM");
    private final bun c;
    private final bur d;
    private final azi e;
    private final fa f = new fh("Twitch");
    private final Map g = Maps.newHashMap();
    private bmz h;
    private boolean i;
    private int j = 30;
    private long k = 0L;
    private boolean l = false;
    private boolean m;
    private boolean n;
    private boolean o;
    private bva p = bva.a;
    private static boolean q;

    public bvb(azi azi2, String string) {
        this.e = azi2;
        this.c = new bun();
        this.d = new bur();
        this.c.a(this);
        this.d.a(this);
        this.c.a("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.d.a("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.f.b().a(a.f);
        if (Strings.isNotEmpty((CharSequence)string) && bwg.n) {
            bvc bvc2 = new bvc(this, "Twitch authenticator", string);
            bvc2.setDaemon(true);
            bvc2.start();
        }
    }

    @Override
    public void i() {
        b.debug(a, "Shutdown streaming");
        this.c.B();
        this.d.m();
    }

    @Override
    public void j() {
        int n2 = this.e.u.S;
        but but2 = this.d.j();
        if (n2 == 2) {
            if (but2 == but.d) {
                b.debug(a, "Disconnecting from twitch chat per user options");
                this.d.l();
            }
        } else if (n2 == 1) {
            if ((but2 == but.e || but2 == but.a) && this.c.q()) {
                b.debug(a, "Connecting to twitch chat per user options");
                this.I();
            }
        } else if (n2 == 0) {
            if ((but2 == but.e || but2 == but.a) && this.n()) {
                b.debug(a, "Connecting to twitch chat as user is streaming");
                this.I();
            } else if (but2 == but.d && !this.n()) {
                b.debug(a, "Disconnecting from twitch chat as user is no longer streaming");
                this.d.l();
            }
        }
        this.c.H();
        this.d.n();
    }

    protected void I() {
        but but2 = this.d.j();
        String string = this.c.l().name;
        if (but2 == but.a) {
            this.d.f(string);
            this.d.c = string;
        } else if (but2 == but.e) {
            this.d.d(string);
        } else {
            b.warn("Invalid twitch chat state {}", new Object[]{but2});
        }
    }

    @Override
    public void k() {
        long l2;
        boolean bl2;
        if (!this.c.m() || this.c.p()) {
            return;
        }
        long l3 = System.nanoTime();
        long l4 = l3 - this.k;
        boolean bl3 = bl2 = l4 >= (l2 = (long)(1000000000 / this.j));
        if (bl2) {
            FrameBuffer frameBuffer = this.c.N();
            bmz bmz2 = this.e.a();
            this.h.a(true);
            GL11.glMatrixMode((int)5889);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glOrtho((double)0.0, (double)this.h.c, (double)this.h.d, (double)0.0, (double)1000.0, (double)3000.0);
            GL11.glMatrixMode((int)5888);
            GL11.glPushMatrix();
            GL11.glLoadIdentity();
            GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            GL11.glViewport((int)0, (int)0, (int)this.h.c, (int)this.h.d);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3008);
            GL11.glDisable((int)3042);
            float f2 = this.h.c;
            float f3 = this.h.d;
            float f4 = (float)bmz2.c / (float)bmz2.a;
            float f5 = (float)bmz2.d / (float)bmz2.b;
            bmz2.c();
            GL11.glTexParameterf((int)3553, (int)10241, (float)9729.0f);
            GL11.glTexParameterf((int)3553, (int)10240, (float)9729.0f);
            bna bna2 = bna.a;
            bna2.b();
            bna2.a(0.0, f3, 0.0, 0.0, f5);
            bna2.a(f2, f3, 0.0, f4, f5);
            bna2.a(f2, 0.0, 0.0, f4, 0.0);
            bna2.a(0.0, 0.0, 0.0, 0.0, 0.0);
            bna2.a();
            bmz2.d();
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5889);
            GL11.glPopMatrix();
            GL11.glMatrixMode((int)5888);
            this.c.a(frameBuffer);
            this.h.e();
            this.c.b(frameBuffer);
            this.k = l3;
        }
    }

    @Override
    public boolean l() {
        return this.c.q();
    }

    @Override
    public boolean m() {
        return this.c.n();
    }

    @Override
    public boolean n() {
        return this.c.m();
    }

    @Override
    public void a(bum bum2, long l2) {
        if (!this.n() || !this.i) {
            return;
        }
        long l3 = this.c.x();
        if (!this.c.a(bum2.c(), l3 + l2, bum2.a(), bum2.b())) {
            b.warn(a, "Couldn't send stream metadata action at {}: {}", new Object[]{l3 + l2, bum2});
        } else {
            b.debug(a, "Sent stream metadata action at {}: {}", new Object[]{l3 + l2, bum2});
        }
    }

    @Override
    public boolean o() {
        return this.c.p();
    }

    @Override
    public void p() {
        if (this.c.D()) {
            b.debug(a, "Requested commercial from Twitch");
        } else {
            b.warn(a, "Could not request commercial from Twitch");
        }
    }

    @Override
    public void q() {
        this.c.F();
        this.n = true;
        this.s();
    }

    @Override
    public void r() {
        this.c.G();
        this.n = false;
        this.s();
    }

    @Override
    public void s() {
        if (this.n()) {
            float f2 = this.e.u.M;
            boolean bl2 = this.n || f2 <= 0.0f;
            this.c.b(bl2 ? 0.0f : f2);
            this.c.a(this.G() ? 0.0f : this.e.u.L);
        }
    }

    @Override
    public void t() {
        bac bac2 = this.e.u;
        VideoParams videoParams = this.c.a(bvb.b(bac2.N), bvb.a(bac2.O), bvb.c(bac2.K), (float)this.e.d / (float)this.e.e);
        switch (bac2.P) {
            case 2: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
                break;
            }
            case 1: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
                break;
            }
            case 0: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
            }
        }
        if (this.h == null) {
            this.h = new bmz(videoParams.outputWidth, videoParams.outputHeight, false);
        } else {
            this.h.a(videoParams.outputWidth, videoParams.outputHeight);
        }
        if (bac2.R != null && bac2.R.length() > 0) {
            for (IngestServer ingestServer : this.v()) {
                if (!ingestServer.serverUrl.equals(bac2.R)) continue;
                this.c.a(ingestServer);
                break;
            }
        }
        this.j = videoParams.targetFps;
        this.i = bac2.Q;
        this.c.a(videoParams);
        b.info(a, "Streaming at {}/{} at {} kbps to {}", new Object[]{videoParams.outputWidth, videoParams.outputHeight, videoParams.maxKbps, this.c.s().serverUrl});
        this.c.a(null, "Minecraft", null);
    }

    @Override
    public void u() {
        if (this.c.E()) {
            b.info(a, "Stopped streaming to Twitch");
        } else {
            b.warn(a, "Could not stop streaming to Twitch");
        }
    }

    @Override
    public void a(ErrorCode errorCode, AuthToken authToken) {
    }

    @Override
    public void a(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            b.debug(a, "Login attempt successful");
            this.m = true;
        } else {
            b.warn(a, "Login attempt unsuccessful: {} (error code {})", new Object[]{ErrorCode.getString((ErrorCode)errorCode), errorCode.getValue()});
            this.m = false;
        }
    }

    @Override
    public void a(ErrorCode errorCode, GameInfo[] gameInfoArray) {
    }

    @Override
    public void a(bup bup2) {
        b.debug(a, "Broadcast state changed to {}", new Object[]{bup2});
        if (bup2 == bup.b) {
            this.c.a(bup.d);
        }
    }

    @Override
    public void a() {
        b.info(a, "Logged out of twitch");
    }

    @Override
    public void a(StreamInfo streamInfo) {
        b.debug(a, "Stream info updated; {} viewers on stream ID {}", new Object[]{streamInfo.viewers, streamInfo.streamId});
    }

    @Override
    public void a(IngestList ingestList) {
    }

    @Override
    public void b(ErrorCode errorCode) {
        b.warn(a, "Issue submitting frame: {} (Error code {})", new Object[]{ErrorCode.getString((ErrorCode)errorCode), errorCode.getValue()});
        this.e.r.b().a(new fh("Issue streaming frame: " + errorCode + " (" + ErrorCode.getString((ErrorCode)errorCode) + ")"), 2);
    }

    @Override
    public void b() {
        this.s();
        b.info(a, "Broadcast to Twitch has started");
    }

    @Override
    public void c() {
        b.info(a, "Broadcast to Twitch has stopped");
    }

    @Override
    public void c(ErrorCode errorCode) {
        if (errorCode == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
            fi fi2 = new fi("stream.unavailable.soundflower.chat.link", new Object[0]);
            fi2.b().a(new ey(ez.a, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
            fi2.b().d(true);
            fi fi3 = new fi("stream.unavailable.soundflower.chat", fi2);
            fi3.b().a(a.e);
            this.e.r.b().a(fi3);
        } else {
            fi fi4 = new fi("stream.unavailable.unknown.chat", ErrorCode.getString((ErrorCode)errorCode));
            fi4.b().a(a.e);
            this.e.r.b().a(fi4);
        }
    }

    @Override
    public void a(buv buv2, buy buy2) {
        b.debug(a, "Ingest test state changed to {}", new Object[]{buy2});
        if (buy2 == buy.f) {
            this.l = true;
        }
    }

    public static int a(float f2) {
        return oy.d(10.0f + f2 * 50.0f);
    }

    public static int b(float f2) {
        return oy.d(230.0f + f2 * 3270.0f);
    }

    public static float c(float f2) {
        return 0.1f + f2 * 0.1f;
    }

    @Override
    public IngestServer[] v() {
        return this.c.t().getServers();
    }

    @Override
    public void x() {
        buv buv2 = this.c.J();
        if (buv2 != null) {
            buv2.a(this);
        }
    }

    @Override
    public buv y() {
        return this.c.w();
    }

    @Override
    public boolean z() {
        return this.c.o();
    }

    @Override
    public int A() {
        return this.n() ? this.c.j().viewers : 0;
    }

    @Override
    public void a(ChatMessage[] chatMessageArray) {
        for (ChatMessage chatMessage : chatMessageArray) {
            this.a(chatMessage.userName, chatMessage);
            if (!this.a(chatMessage.modes, chatMessage.subscriptions, this.e.u.T)) continue;
            fh fh2 = new fh(chatMessage.userName);
            fi fi2 = new fi("chat.stream." + (chatMessage.action ? "emote" : "text"), this.f, fh2, a.a(chatMessage.message));
            if (chatMessage.action) {
                fi2.b().b(true);
            }
            fh fh3 = new fh("");
            fh3.a(new fi("stream.userinfo.chatTooltip", new Object[0]));
            for (fa fa2 : bhm.a(chatMessage.modes, chatMessage.subscriptions, null)) {
                fh3.a("\n");
                fh3.a(fa2);
            }
            fh2.b().a(new fc(fd.a, fh3));
            fh2.b().a(new ey(ez.d, chatMessage.userName));
            this.e.r.b().a(fi2);
        }
    }

    private void a(String string, ChatMessage chatMessage) {
        ChatUserInfo chatUserInfo = (ChatUserInfo)this.g.get(string);
        if (chatUserInfo == null) {
            chatUserInfo = new ChatUserInfo();
            chatUserInfo.displayName = string;
            this.g.put(string, chatUserInfo);
        }
        chatUserInfo.subscriptions = chatMessage.subscriptions;
        chatUserInfo.modes = chatMessage.modes;
        chatUserInfo.emoticonSet = chatMessage.emoticonSet;
        chatUserInfo.nameColorARGB = chatMessage.nameColorARGB;
    }

    private boolean a(HashSet hashSet, HashSet hashSet2, int n2) {
        if (hashSet.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED)) {
            return false;
        }
        if (hashSet.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)) {
            return true;
        }
        if (hashSet.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)) {
            return true;
        }
        if (hashSet.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF)) {
            return true;
        }
        if (n2 == 0) {
            return true;
        }
        if (n2 == 1) {
            return hashSet2.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER);
        }
        return false;
    }

    @Override
    public void a(ChatUserInfo[] chatUserInfoArray, ChatUserInfo[] chatUserInfoArray2, ChatUserInfo[] chatUserInfoArray3) {
        for (ChatUserInfo chatUserInfo : chatUserInfoArray2) {
            this.g.remove(chatUserInfo.displayName);
        }
        for (ChatUserInfo chatUserInfo : chatUserInfoArray3) {
            this.g.put(chatUserInfo.displayName, chatUserInfo);
        }
        for (ChatUserInfo chatUserInfo : chatUserInfoArray) {
            this.g.put(chatUserInfo.displayName, chatUserInfo);
        }
    }

    @Override
    public void d() {
        b.debug(a, "Chat connected");
    }

    @Override
    public void e() {
        b.debug(a, "Chat disconnected");
        this.g.clear();
    }

    @Override
    public void f() {
    }

    @Override
    public boolean B() {
        return this.d.c() && this.d.c.equals(this.c.l().name);
    }

    @Override
    public String C() {
        return this.d.c;
    }

    @Override
    public ChatUserInfo a(String string) {
        return (ChatUserInfo)this.g.get(string);
    }

    @Override
    public void b(String string) {
        this.d.g(string);
    }

    @Override
    public boolean D() {
        return q && this.c.b();
    }

    @Override
    public ErrorCode E() {
        if (!q) {
            return ErrorCode.TTV_EC_OS_TOO_OLD;
        }
        return this.c.P();
    }

    @Override
    public boolean F() {
        return this.m;
    }

    @Override
    public void a(boolean bl2) {
        this.o = bl2;
        this.s();
    }

    @Override
    public boolean G() {
        boolean bl2 = this.e.u.U == 1;
        return this.n || this.e.u.L <= 0.0f || bl2 != this.o;
    }

    @Override
    public bva H() {
        return this.p;
    }

    static /* synthetic */ Logger J() {
        return b;
    }

    static /* synthetic */ bun a(bvb bvb2) {
        return bvb2.c;
    }

    static /* synthetic */ bur b(bvb bvb2) {
        return bvb2.d;
    }

    static /* synthetic */ bva a(bvb bvb2, bva bva2) {
        bvb2.p = bva2;
        return bvb2.p;
    }

    static {
        try {
            if (u.a() == v.c) {
                System.loadLibrary("avutil-ttv-51");
                System.loadLibrary("swresample-ttv-0");
                System.loadLibrary("libmp3lame-ttv");
                if (System.getProperty("os.arch").contains("64")) {
                    System.loadLibrary("libmfxsw64");
                } else {
                    System.loadLibrary("libmfxsw32");
                }
            }
            q = true;
        }
        catch (Throwable throwable) {
            q = false;
        }
    }
}

