package bsuir.diplom.clientapplicationfx.config;

import bsuir.diplom.clientapplicationfx.connection.NettyClientInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(NettyProperties.class)
public class NettyConfiguration {

    private final NettyProperties nettyProperties;

    @Bean(name = "bootstrap")
    public Bootstrap bootstrap(NettyClientInitializer nettyClientInitializer, EventLoopGroup group) {
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, nettyProperties.isKeepAlive())
                .option(ChannelOption.TCP_NODELAY, nettyProperties.isTcpDelay())
                .handler(nettyClientInitializer);
        bootstrap.remoteAddress(nettyProperties.getServerIp(), nettyProperties.getServerPort());
        return bootstrap;
    }

    @Bean(name = "eventLoopGroup")
    public EventLoopGroup getEventGroup(){
        return new NioEventLoopGroup();
    }

    @Bean
    public InetSocketAddress serverPort() {
        return new InetSocketAddress(nettyProperties.getServerPort());
    }

    @Bean
    public String getServerIp() {
        return nettyProperties.getServerIp();
    }

}
