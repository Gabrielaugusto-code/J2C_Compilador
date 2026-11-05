/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class eu
extends MessageToByteEncoder {
    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n2 = byteBuf.readableBytes();
        int n3 = ep.a(n2);
        if (n3 > 3) {
            throw new IllegalArgumentException("unable to fit " + n2 + " into " + 3);
        }
        ep ep2 = new ep(byteBuf2);
        ep2.ensureWritable(n3 + n2);
        ep2.b(n2);
        ep2.writeBytes(byteBuf, byteBuf.readerIndex(), n2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) {
        this.a(channelHandlerContext, (ByteBuf)object, byteBuf);
    }
}

