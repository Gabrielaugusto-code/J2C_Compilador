/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;

class mw
extends ChannelInitializer {
    final /* synthetic */ mv a;

    mw(mv mv2) {
        this.a = mv2;
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
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new ms(this.a)).addLast("splitter", (ChannelHandler)new et()).addLast("decoder", (ChannelHandler)new eq()).addLast("prepender", (ChannelHandler)new eu()).addLast("encoder", (ChannelHandler)new er());
        ef ef2 = new ef(false);
        mv.a(this.a).add(ef2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)ef2);
        ef2.a(new ne(mv.b(this.a), ef2));
    }
}

