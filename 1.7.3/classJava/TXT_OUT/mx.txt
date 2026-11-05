/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;

class mx
extends ChannelInitializer {
    final /* synthetic */ mv a;

    mx(mv mv2) {
        this.a = mv2;
    }

    protected void initChannel(Channel channel) {
        ef ef2 = new ef(false);
        ef2.a(new mt(mv.b(this.a), ef2));
        mv.a(this.a).add(ef2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)ef2);
    }
}

