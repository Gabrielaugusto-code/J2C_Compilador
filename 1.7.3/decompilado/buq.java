/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.StreamInfo
 */
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;

public interface buq {
    public void a(ErrorCode var1, AuthToken var2);

    public void a(ErrorCode var1);

    public void a(ErrorCode var1, GameInfo[] var2);

    public void a(bup var1);

    public void a();

    public void a(StreamInfo var1);

    public void a(IngestList var1);

    public void b(ErrorCode var1);

    public void b();

    public void c();

    public void c(ErrorCode var1);
}

