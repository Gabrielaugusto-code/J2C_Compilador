/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.PixelFormat
 *  tv.twitch.broadcast.RTMPState
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.StatType
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.UserInfo
 *  tv.twitch.broadcast.VideoParams
 */
import java.util.ArrayList;
import java.util.List;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class buv
implements IStatCallbacks,
IStreamCallbacks {
    protected final boolean a = true;
    protected bux b = null;
    protected Stream c = null;
    protected IngestList d = null;
    protected buy e = buy.a;
    protected long f = 8000L;
    protected long g = 1000L;
    protected long h = 0L;
    protected RTMPState i = RTMPState.Invalid;
    protected VideoParams j = null;
    protected AudioParams k = null;
    protected long l = 0L;
    protected List m = null;
    protected boolean n = false;
    protected IStreamCallbacks o = null;
    protected IStatCallbacks p = null;
    protected IngestServer q = null;
    protected boolean r = false;
    protected boolean s = false;
    protected int t = -1;
    protected int u = 0;
    protected long v = 0L;
    protected float w = 0.0f;
    protected float x = 0.0f;
    protected boolean y = false;

    public void a(bux bux2) {
        this.b = bux2;
    }

    public IngestServer c() {
        return this.q;
    }

    public boolean e() {
        return this.e == buy.f || this.e == buy.g || this.e == buy.h;
    }

    public float h() {
        return this.x;
    }

    public void requestAuthTokenCallback(ErrorCode errorCode, AuthToken authToken) {
    }

    public void loginCallback(ErrorCode errorCode, ChannelInfo channelInfo) {
    }

    public void getIngestServersCallback(ErrorCode errorCode, IngestList ingestList) {
    }

    public void getUserInfoCallback(ErrorCode errorCode, UserInfo userInfo) {
    }

    public void getStreamInfoCallback(ErrorCode errorCode, StreamInfo streamInfo) {
    }

    public void getArchivingStateCallback(ErrorCode errorCode, ArchivingState archivingState) {
    }

    public void runCommercialCallback(ErrorCode errorCode) {
    }

    public void setStreamInfoCallback(ErrorCode errorCode) {
    }

    public void getGameNameListCallback(ErrorCode errorCode, GameInfoList gameInfoList) {
    }

    public void bufferUnlockCallback(long l2) {
    }

    public void startCallback(ErrorCode errorCode) {
        this.y = false;
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.a(buy.c);
            this.l = System.currentTimeMillis();
        } else {
            this.n = false;
            this.a(buy.e);
        }
    }

    public void stopCallback(ErrorCode errorCode) {
        this.y = false;
        this.a(buy.e);
    }

    public void sendActionMetaDataCallback(ErrorCode errorCode) {
    }

    public void sendStartSpanMetaDataCallback(ErrorCode errorCode) {
    }

    public void sendEndSpanMetaDataCallback(ErrorCode errorCode) {
    }

    public void statCallback(StatType statType, long l2) {
        switch (statType) {
            case TTV_ST_RTMPSTATE: {
                this.i = RTMPState.lookupValue((int)((int)l2));
                break;
            }
            case TTV_ST_RTMPDATASENT: {
                this.h = l2;
            }
        }
    }

    public buv(Stream stream, IngestList ingestList) {
        this.c = stream;
        this.d = ingestList;
    }

    protected void finalize() {
        if (this.q != null) {
            this.b(this.q);
        }
        this.o();
        super.finalize();
    }

    public void i() {
        if (this.e != buy.a) {
            return;
        }
        this.t = 0;
        this.r = false;
        this.s = false;
        this.p = this.c.getStatCallbacks();
        this.c.setStatCallbacks((IStatCallbacks)this);
        this.o = this.c.getStreamCallbacks();
        this.c.setStreamCallbacks((IStreamCallbacks)this);
        this.j = new VideoParams();
        this.j.targetFps = 60;
        this.j.maxKbps = 3500;
        this.j.outputWidth = 1280;
        this.j.outputHeight = 720;
        this.j.pixelFormat = PixelFormat.TTV_PF_BGRA;
        this.j.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        this.j.disableAdaptiveBitrate = true;
        this.j.verticalFlip = false;
        this.c.getDefaultParams(this.j);
        this.k = new AudioParams();
        this.k.audioEnabled = false;
        this.m = new ArrayList();
        int n2 = 3;
        for (int i2 = 0; i2 < n2; ++i2) {
            FrameBuffer frameBuffer = this.c.allocateFrameBuffer(this.j.outputWidth * this.j.outputHeight * 4);
            if (!frameBuffer.getIsValid()) {
                this.o();
                this.a(buy.h);
                return;
            }
            this.m.add(frameBuffer);
            this.c.randomizeFrameBuffer(frameBuffer);
        }
        this.a(buy.b);
        this.l = System.currentTimeMillis();
    }

    public void j() {
        if (this.e() || this.e == buy.a) {
            return;
        }
        if (this.y) {
            return;
        }
        if (this.r) {
            this.a(buy.g);
        }
        switch (this.e) {
            case b: 
            case e: {
                if (this.q != null) {
                    if (this.s || !this.n) {
                        this.q.bitrateKbps = 0.0f;
                        this.l = 0L;
                        this.y = false;
                    } else {
                        this.b(this.q);
                    }
                    this.q = null;
                    break;
                }
                if (this.y || this.m() < this.g) break;
                this.l = 0L;
                this.s = false;
                this.n = true;
                if (this.e != buy.b) {
                    ++this.t;
                }
                if (this.t < this.d.getServers().length) {
                    this.q = this.d.getServers()[this.t];
                    this.a(this.q);
                    break;
                }
                this.a(buy.f);
                break;
            }
            case c: 
            case d: {
                this.c(this.q);
                break;
            }
        }
        this.n();
        if (this.e == buy.g || this.e == buy.f) {
            if (this.q != null) {
                if (this.e == buy.g) {
                    this.q.bitrateKbps = 0.0f;
                }
                this.b(this.q);
                this.q = null;
            }
            if (this.m != null) {
                this.o();
            }
        }
    }

    public void l() {
        if (this.e()) {
            return;
        }
        this.r = true;
    }

    protected boolean a(IngestServer ingestServer) {
        this.n = true;
        this.h = 0L;
        this.i = RTMPState.Idle;
        this.q = ingestServer;
        this.a(buy.c);
        this.y = true;
        ErrorCode errorCode = this.c.start(this.j, this.k, ingestServer, StartFlags.TTV_Start_BandwidthTest, true);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.n = false;
            this.a(buy.e);
            return false;
        }
        this.v = this.h;
        ingestServer.bitrateKbps = 0.0f;
        this.u = 0;
        return true;
    }

    protected void b(IngestServer ingestServer) {
        this.y = true;
        this.c.stop(true);
        this.c.pollStats();
    }

    protected long m() {
        return System.currentTimeMillis() - this.l;
    }

    protected void n() {
        float f2 = this.m();
        switch (this.e) {
            case b: 
            case c: 
            case a: 
            case f: 
            case g: 
            case h: {
                this.x = 0.0f;
                break;
            }
            case e: {
                this.x = 1.0f;
                break;
            }
            default: {
                this.x = f2 / (float)this.f;
            }
        }
        switch (this.e) {
            case f: 
            case g: 
            case h: {
                this.w = 1.0f;
                break;
            }
            default: {
                this.w = (float)this.t / (float)this.d.getServers().length;
                this.w += this.x / (float)this.d.getServers().length;
            }
        }
    }

    protected boolean c(IngestServer ingestServer) {
        if (this.s || this.m() >= this.f) {
            this.a(buy.e);
            return true;
        }
        if (this.y) {
            return true;
        }
        ErrorCode errorCode = this.c.submitVideoFrame((FrameBuffer)this.m.get(this.u));
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.n = false;
            this.a(buy.e);
            return false;
        }
        this.u = (this.u + 1) % this.m.size();
        this.c.pollStats();
        if (this.i == RTMPState.SendVideo) {
            this.a(buy.d);
            long l2 = this.m();
            if (l2 > 0L && this.h > this.v) {
                ingestServer.bitrateKbps = (float)(this.h * 8L) / (float)this.m();
                this.v = this.h;
            }
        }
        return true;
    }

    protected void o() {
        this.q = null;
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                ((FrameBuffer)this.m.get(i2)).free();
            }
            this.m = null;
        }
        if (this.c.getStatCallbacks() == this) {
            this.c.setStatCallbacks(this.p);
            this.p = null;
        }
        if (this.c.getStreamCallbacks() == this) {
            this.c.setStreamCallbacks(this.o);
            this.o = null;
        }
    }

    protected void a(buy buy2) {
        if (buy2 == this.e) {
            return;
        }
        this.e = buy2;
        if (this.b != null) {
            this.b.a(this, buy2);
        }
    }

    public int p() {
        return this.t;
    }
}

