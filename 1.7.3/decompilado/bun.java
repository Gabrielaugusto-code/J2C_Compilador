/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  tv.twitch.AuthToken
 *  tv.twitch.Core
 *  tv.twitch.CoreAPI
 *  tv.twitch.ErrorCode
 *  tv.twitch.MessageLevel
 *  tv.twitch.StandardCoreAPI
 *  tv.twitch.VideoEncoder
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.AudioDeviceType
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.DesktopStreamAPI
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.PixelFormat
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.StatType
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.StreamAPI
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.StreamInfoForSetting
 *  tv.twitch.broadcast.UserInfo
 *  tv.twitch.broadcast.VideoParams
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.CoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.MessageLevel;
import tv.twitch.StandardCoreAPI;
import tv.twitch.VideoEncoder;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamAPI;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.StreamInfoForSetting;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class bun
implements IStatCallbacks,
IStreamCallbacks {
    private static final Logger B = LogManager.getLogger();
    protected final int a = 30;
    protected final int b = 3;
    private static final ot C = new ot(String.class, 50);
    private String D = null;
    protected buq c = null;
    protected String d = "";
    protected String e = "";
    protected String f = "";
    protected boolean g = true;
    protected Core h = null;
    protected Stream i = null;
    protected List j = new ArrayList();
    protected List k = new ArrayList();
    protected boolean l = false;
    protected boolean m = false;
    protected boolean n = false;
    protected bup o = bup.a;
    protected String p = null;
    protected VideoParams q = null;
    protected AudioParams r = null;
    protected IngestList s = new IngestList(new IngestServer[0]);
    protected IngestServer t = null;
    protected AuthToken u = new AuthToken();
    protected ChannelInfo v = new ChannelInfo();
    protected UserInfo w = new UserInfo();
    protected StreamInfo x = new StreamInfo();
    protected ArchivingState y = new ArchivingState();
    protected long z = 0L;
    protected buv A = null;
    private ErrorCode E;

    public void requestAuthTokenCallback(ErrorCode errorCode, AuthToken authToken) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.u = authToken;
            this.a(bup.d);
        } else {
            this.u.data = "";
            this.a(bup.b);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("RequestAuthTokenDoneCallback got failure: %s", string));
        }
        try {
            if (this.c != null) {
                this.c.a(errorCode, authToken);
            }
        }
        catch (Exception exception) {
            this.d(exception.toString());
        }
    }

    public void loginCallback(ErrorCode errorCode, ChannelInfo channelInfo) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.v = channelInfo;
            this.a(bup.f);
            this.m = true;
        } else {
            this.a(bup.b);
            this.m = false;
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("LoginCallback got failure: %s", string));
        }
        try {
            if (this.c != null) {
                this.c.a(errorCode);
            }
        }
        catch (Exception exception) {
            this.d(exception.toString());
        }
    }

    public void getIngestServersCallback(ErrorCode errorCode, IngestList ingestList) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.s = ingestList;
            this.t = this.s.getDefaultServer();
            this.a(bup.h);
            try {
                if (this.c != null) {
                    this.c.a(ingestList);
                }
            }
            catch (Exception exception) {
                this.d(exception.toString());
            }
        } else {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("IngestListCallback got failure: %s", string));
            this.a(bup.e);
        }
    }

    public void getUserInfoCallback(ErrorCode errorCode, UserInfo userInfo) {
        this.w = userInfo;
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("UserInfoDoneCallback got failure: %s", string));
        }
    }

    public void getStreamInfoCallback(ErrorCode errorCode, StreamInfo streamInfo) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.x = streamInfo;
            try {
                if (this.c != null) {
                    this.c.a(streamInfo);
                }
            }
            catch (Exception exception) {
                this.d(exception.toString());
            }
        } else {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.e(String.format("StreamInfoDoneCallback got failure: %s", string));
        }
    }

    public void getArchivingStateCallback(ErrorCode errorCode, ArchivingState archivingState) {
        this.y = archivingState;
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            // empty if block
        }
    }

    public void runCommercialCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.e(String.format("RunCommercialCallback got failure: %s", string));
        }
    }

    public void setStreamInfoCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.e(String.format("SetStreamInfoCallback got failure: %s", string));
        }
    }

    public void getGameNameListCallback(ErrorCode errorCode, GameInfoList gameInfoList) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("GameNameListCallback got failure: %s", string));
        }
        try {
            if (this.c != null) {
                this.c.a(errorCode, gameInfoList == null ? new GameInfo[]{} : gameInfoList.list);
            }
        }
        catch (Exception exception) {
            this.d(exception.toString());
        }
    }

    public void bufferUnlockCallback(long l2) {
        FrameBuffer frameBuffer = FrameBuffer.lookupBuffer((long)l2);
        this.k.add(frameBuffer);
    }

    public void startCallback(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            try {
                if (this.c != null) {
                    this.c.b();
                }
            }
            catch (Exception exception) {
                this.d(exception.toString());
            }
            this.a(bup.k);
        } else {
            this.q = null;
            this.r = null;
            this.a(bup.i);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.c.c(errorCode);
            this.d(String.format("startCallback got failure: %s", string));
        }
    }

    public void stopCallback(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.q = null;
            this.r = null;
            this.M();
            try {
                if (this.c != null) {
                    this.c.c();
                }
            }
            catch (Exception exception) {
                this.d(exception.toString());
            }
            if (this.m) {
                this.a(bup.i);
            } else {
                this.a(bup.b);
            }
        } else {
            this.a(bup.i);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("stopCallback got failure: %s", string));
        }
    }

    public void sendActionMetaDataCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.e("Failed sending action metadata: " + ErrorCode.getString((ErrorCode)errorCode));
        }
    }

    public void sendStartSpanMetaDataCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.e("Failed sending span metadata start: " + ErrorCode.getString((ErrorCode)errorCode));
        }
    }

    public void sendEndSpanMetaDataCallback(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.e("Failed sending span metadata end: " + ErrorCode.getString((ErrorCode)errorCode));
        }
    }

    public void statCallback(StatType statType, long l2) {
    }

    public void a(buq buq2) {
        this.c = buq2;
    }

    public boolean b() {
        return this.l;
    }

    public void a(String string) {
        this.d = string;
    }

    public StreamInfo j() {
        return this.x;
    }

    public ChannelInfo l() {
        return this.v;
    }

    public boolean m() {
        return this.o == bup.k || this.o == bup.m;
    }

    public boolean n() {
        return this.o == bup.i;
    }

    public boolean o() {
        return this.o == bup.n;
    }

    public boolean p() {
        return this.o == bup.m;
    }

    public boolean q() {
        return this.m;
    }

    public IngestServer s() {
        return this.t;
    }

    public void a(IngestServer ingestServer) {
        this.t = ingestServer;
    }

    public IngestList t() {
        return this.s;
    }

    public void a(float f2) {
        this.i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, f2);
    }

    public void b(float f2) {
        this.i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, f2);
    }

    public buv w() {
        return this.A;
    }

    public long x() {
        return this.i.getStreamTime();
    }

    protected boolean y() {
        return true;
    }

    public bun() {
        this.h = new Core((CoreAPI)new StandardCoreAPI());
        this.i = new Stream((StreamAPI)new DesktopStreamAPI());
    }

    protected PixelFormat z() {
        return PixelFormat.TTV_PF_RGBA;
    }

    public boolean A() {
        if (this.l) {
            return false;
        }
        ErrorCode errorCode = this.h.initialize(this.d, VideoEncoder.TTV_VID_ENC_DEFAULT, System.getProperty("java.library.path"));
        if (!this.a(errorCode)) {
            this.E = errorCode;
            return false;
        }
        this.i.setStreamCallbacks((IStreamCallbacks)this);
        if (!this.a(errorCode)) {
            this.i.setStreamCallbacks(null);
            this.E = errorCode;
            return false;
        }
        errorCode = this.h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
        if (!this.a(errorCode)) {
            this.i.setStreamCallbacks(null);
            this.E = errorCode;
            return false;
        }
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.l = true;
            this.a(bup.b);
            return true;
        }
        this.E = errorCode;
        return false;
    }

    public boolean B() {
        if (!this.l) {
            return true;
        }
        if (this.o()) {
            return false;
        }
        this.n = true;
        this.C();
        this.i.setStreamCallbacks(null);
        this.i.setStatCallbacks(null);
        ErrorCode errorCode = this.h.shutdown();
        this.a(errorCode);
        this.l = false;
        this.n = false;
        this.a(bup.a);
        return true;
    }

    public boolean a(String string, AuthToken authToken) {
        if (this.o()) {
            return false;
        }
        this.C();
        if (string == null || string.isEmpty()) {
            this.d("Username must be valid");
            return false;
        }
        if (authToken == null || authToken.data == null || authToken.data.isEmpty()) {
            this.d("Auth token must be valid");
            return false;
        }
        this.p = string;
        this.u = authToken;
        if (this.b()) {
            this.a(bup.d);
        }
        return true;
    }

    public boolean C() {
        if (this.o()) {
            return false;
        }
        if (this.m()) {
            this.i.stop(false);
        }
        this.p = "";
        this.u = new AuthToken();
        if (!this.m) {
            return false;
        }
        this.m = false;
        if (!this.n) {
            try {
                if (this.c != null) {
                    this.c.a();
                }
            }
            catch (Exception exception) {
                this.d(exception.toString());
            }
        }
        this.a(bup.b);
        return true;
    }

    public boolean a(String string, String string2, String string3) {
        if (!this.m) {
            return false;
        }
        if (string == null || string.equals("")) {
            string = this.p;
        }
        if (string2 == null) {
            string2 = "";
        }
        if (string3 == null) {
            string3 = "";
        }
        StreamInfoForSetting streamInfoForSetting = new StreamInfoForSetting();
        streamInfoForSetting.streamTitle = string3;
        streamInfoForSetting.gameName = string2;
        ErrorCode errorCode = this.i.setStreamInfo(this.u, string, streamInfoForSetting);
        this.a(errorCode);
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    public boolean D() {
        if (!this.m()) {
            return false;
        }
        ErrorCode errorCode = this.i.runCommercial(this.u);
        this.a(errorCode);
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    public VideoParams a(int n2, int n3, float f2, float f3) {
        int[] nArray = this.i.getMaxResolution(n2, n3, f2, f3);
        VideoParams videoParams = new VideoParams();
        videoParams.maxKbps = n2;
        videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        videoParams.pixelFormat = this.z();
        videoParams.targetFps = n3;
        videoParams.outputWidth = nArray[0];
        videoParams.outputHeight = nArray[1];
        videoParams.disableAdaptiveBitrate = false;
        videoParams.verticalFlip = false;
        return videoParams;
    }

    public boolean a(VideoParams videoParams) {
        if (videoParams == null || !this.n()) {
            return false;
        }
        this.q = videoParams.clone();
        this.r = new AudioParams();
        boolean bl2 = this.r.audioEnabled = this.g && this.y();
        if (!this.L()) {
            this.q = null;
            this.r = null;
            return false;
        }
        ErrorCode errorCode = this.i.start(videoParams, this.r, this.t, StartFlags.None, true);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.M();
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("Error while starting to broadcast: %s", string));
            this.q = null;
            this.r = null;
            return false;
        }
        this.a(bup.j);
        return true;
    }

    public boolean E() {
        if (!this.m()) {
            return false;
        }
        ErrorCode errorCode = this.i.stop(true);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("Error while stopping the broadcast: %s", string));
            return false;
        }
        this.a(bup.l);
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    public boolean F() {
        if (!this.m()) {
            return false;
        }
        ErrorCode errorCode = this.i.pauseVideo();
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.E();
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("Error pausing stream: %s\n", string));
        } else {
            this.a(bup.m);
        }
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    public boolean G() {
        if (!this.p()) {
            return false;
        }
        this.a(bup.k);
        return true;
    }

    public boolean a(String string, long l2, String string2, String string3) {
        ErrorCode errorCode = this.i.sendActionMetaData(this.u, string, l2, string2, string3);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string4 = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("Error while sending meta data: %s\n", string4));
            return false;
        }
        return true;
    }

    protected void a(bup bup2) {
        if (bup2 == this.o) {
            return;
        }
        this.o = bup2;
        try {
            if (this.c != null) {
                this.c.a(bup2);
            }
        }
        catch (Exception exception) {
            this.d(exception.toString());
        }
    }

    public void H() {
        if (this.i == null || !this.l) {
            return;
        }
        ErrorCode errorCode = this.i.pollTasks();
        this.a(errorCode);
        if (this.o()) {
            this.A.j();
            if (this.A.e()) {
                this.A = null;
                this.a(bup.i);
            }
        }
        switch (this.o) {
            case d: {
                this.a(bup.e);
                errorCode = this.i.login(this.u);
                if (!ErrorCode.failed((ErrorCode)errorCode)) break;
                String string = ErrorCode.getString((ErrorCode)errorCode);
                this.d(String.format("Error in TTV_Login: %s\n", string));
                break;
            }
            case f: {
                this.a(bup.g);
                errorCode = this.i.getIngestServers(this.u);
                if (!ErrorCode.failed((ErrorCode)errorCode)) break;
                this.a(bup.f);
                String string = ErrorCode.getString((ErrorCode)errorCode);
                this.d(String.format("Error in TTV_GetIngestServers: %s\n", string));
                break;
            }
            case h: {
                String string;
                this.a(bup.i);
                errorCode = this.i.getUserInfo(this.u);
                if (ErrorCode.failed((ErrorCode)errorCode)) {
                    string = ErrorCode.getString((ErrorCode)errorCode);
                    this.d(String.format("Error in TTV_GetUserInfo: %s\n", string));
                }
                this.I();
                errorCode = this.i.getArchivingState(this.u);
                if (!ErrorCode.failed((ErrorCode)errorCode)) break;
                string = ErrorCode.getString((ErrorCode)errorCode);
                this.d(String.format("Error in TTV_GetArchivingState: %s\n", string));
                break;
            }
            case j: 
            case l: {
                break;
            }
            case g: 
            case c: 
            case b: 
            case a: 
            case n: {
                break;
            }
            case m: 
            case k: {
                this.I();
                break;
            }
        }
    }

    protected void I() {
        long l2 = System.nanoTime();
        long l3 = (l2 - this.z) / 1000000000L;
        if (l3 < 30L) {
            return;
        }
        this.z = l2;
        ErrorCode errorCode = this.i.getStreamInfo(this.u, this.p);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            this.d(String.format("Error in TTV_GetStreamInfo: %s", string));
        }
    }

    public buv J() {
        if (!this.n() || this.s == null) {
            return null;
        }
        if (this.o()) {
            return null;
        }
        this.A = new buv(this.i, this.s);
        this.A.i();
        this.a(bup.n);
        return this.A;
    }

    protected boolean L() {
        for (int i2 = 0; i2 < 3; ++i2) {
            FrameBuffer frameBuffer = this.i.allocateFrameBuffer(this.q.outputWidth * this.q.outputHeight * 4);
            if (!frameBuffer.getIsValid()) {
                this.d(String.format("Error while allocating frame buffer", new Object[0]));
                return false;
            }
            this.j.add(frameBuffer);
            this.k.add(frameBuffer);
        }
        return true;
    }

    protected void M() {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            FrameBuffer frameBuffer = (FrameBuffer)this.j.get(i2);
            frameBuffer.free();
        }
        this.k.clear();
        this.j.clear();
    }

    public FrameBuffer N() {
        if (this.k.size() == 0) {
            this.d(String.format("Out of free buffers, this should never happen", new Object[0]));
            return null;
        }
        FrameBuffer frameBuffer = (FrameBuffer)this.k.get(this.k.size() - 1);
        this.k.remove(this.k.size() - 1);
        return frameBuffer;
    }

    public void a(FrameBuffer frameBuffer) {
        try {
            this.i.captureFrameBuffer_ReadPixels(frameBuffer);
        }
        catch (Throwable throwable) {
            b b2 = b.a(throwable, "Trying to submit a frame to Twitch");
            k k2 = b2.a("Broadcast State");
            k2.a("Last reported errors", Arrays.toString(C.c()));
            k2.a("Buffer", frameBuffer);
            k2.a("Free buffer count", this.k.size());
            k2.a("Capture buffer count", this.j.size());
            throw new s(b2);
        }
    }

    public ErrorCode b(FrameBuffer frameBuffer) {
        if (this.p()) {
            this.G();
        } else if (!this.m()) {
            return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
        }
        ErrorCode errorCode = this.i.submitVideoFrame(frameBuffer);
        if (errorCode != ErrorCode.TTV_EC_SUCCESS) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                this.e(String.format("Warning in SubmitTexturePointer: %s\n", string));
            } else {
                this.d(String.format("Error in SubmitTexturePointer: %s\n", string));
                this.E();
            }
            if (this.c != null) {
                this.c.b(errorCode);
            }
        }
        return errorCode;
    }

    protected boolean a(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.d(ErrorCode.getString((ErrorCode)errorCode));
            return false;
        }
        return true;
    }

    protected void d(String string) {
        this.D = string;
        C.a("<Error> " + string);
        B.error(bvb.a, "[Broadcast controller] {}", new Object[]{string});
    }

    protected void e(String string) {
        C.a("<Warning> " + string);
        B.warn(bvb.a, "[Broadcast controller] {}", new Object[]{string});
    }

    public ErrorCode P() {
        return this.E;
    }
}

