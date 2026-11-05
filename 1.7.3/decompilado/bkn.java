/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  com.google.common.collect.Iterables
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
import com.google.common.base.Charsets;
import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;

class bkn
extends SimpleChannelInboundHandler {
    final /* synthetic */ bkm a;

    bkn(bkm bkm2) {
        this.a = bkm2;
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        super.channelActive(channelHandlerContext);
        ByteBuf byteBuf = Unpooled.buffer();
        byteBuf.writeByte(254);
        byteBuf.writeByte(1);
        byteBuf.writeByte(250);
        char[] cArray = "MC|PingHost".toCharArray();
        byteBuf.writeShort(cArray.length);
        for (char c2 : cArray) {
            byteBuf.writeChar((int)c2);
        }
        byteBuf.writeShort(7 + 2 * this.a.a.a().length());
        byteBuf.writeByte(127);
        cArray = this.a.a.a().toCharArray();
        byteBuf.writeShort(cArray.length);
        for (char c2 : cArray) {
            byteBuf.writeChar((int)c2);
        }
        byteBuf.writeInt(this.a.a.b());
        channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        short s2 = byteBuf.readUnsignedByte();
        if (s2 == 255) {
            String string = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), Charsets.UTF_16BE);
            String[] stringArray = (String[])Iterables.toArray((Iterable)bkk.d().split((CharSequence)string), String.class);
            if ("\u00a71".equals(stringArray[0])) {
                int n2 = oy.a(stringArray[1], 0);
                String string2 = stringArray[2];
                String string3 = stringArray[3];
                int n3 = oy.a(stringArray[4], -1);
                int n4 = oy.a(stringArray[5], -1);
                this.a.b.f = -1;
                this.a.b.g = string2;
                this.a.b.d = string3;
                this.a.b.c = (Object)((Object)a.h) + "" + n3 + "" + (Object)((Object)a.i) + "/" + (Object)((Object)a.h) + n4;
            }
        }
        channelHandlerContext.close();
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        channelHandlerContext.close();
    }

    protected /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) {
        this.a(channelHandlerContext, (ByteBuf)object);
    }
}

