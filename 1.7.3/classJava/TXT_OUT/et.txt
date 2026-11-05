/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;

public class et
extends ByteToMessageDecoder {
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List list) {
        byteBuf.markReaderIndex();
        byte[] byArray = new byte[3];
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (!byteBuf.isReadable()) {
                byteBuf.resetReaderIndex();
                return;
            }
            byArray[i2] = byteBuf.readByte();
            if (byArray[i2] < 0) continue;
            int n2 = new ep(Unpooled.wrappedBuffer((byte[])byArray)).a();
            if (byteBuf.readableBytes() < n2) {
                byteBuf.resetReaderIndex();
                return;
            }
            list.add(byteBuf.readBytes(n2));
            return;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}

