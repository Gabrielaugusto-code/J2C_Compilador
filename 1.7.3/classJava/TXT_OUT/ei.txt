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

final class ei
extends ChannelInitializer {
    final /* synthetic */ ef a;

    ei(ef ef2) {
        this.a = ef2;
    }

    protected void initChannel(Channel channel) {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.a);
    }
}

