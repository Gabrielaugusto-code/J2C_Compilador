/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;

class bkm
extends ChannelInitializer {
    final /* synthetic */ bkh a;
    final /* synthetic */ bki b;
    final /* synthetic */ bkk c;

    bkm(bkk bkk2, bkh bkh2, bki bki2) {
        this.c = bkk2;
        this.a = bkh2;
        this.b = bki2;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.IP_TOS, (Object)24);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)false);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new bkn(this)});
    }
}

