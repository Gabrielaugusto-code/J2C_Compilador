/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import javax.crypto.Cipher;

public class ed
extends MessageToMessageDecoder {
    private final ec a;

    public ed(Cipher cipher) {
        this.a = new ec(cipher);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        list.add(this.a.a(channelHandlerContext, byteBuf));
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (ByteBuf)object, list);
    }
}

