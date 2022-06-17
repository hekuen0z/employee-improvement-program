package bsuir.diplom.clientapplicationfx.utilities;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoop;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

@Log4j2
@Component
@RequiredArgsConstructor
public class NettyClient {

    private final Bootstrap bootstrap;
    public static String uid = null;
    public static String token = null;
    public static String sessionId = null;

    @PostConstruct
    public void start() {
        try {
            ChannelFuture channelFuture = bootstrap.connect();
            log.info("Client is trying to connect...");
            channelFuture.addListener((ChannelFuture future) -> {
                final EventLoop eventLoop = future.channel().eventLoop();
                if(future.isSuccess()){
                    log.info("Connect Netty server success");
                } else {
                    log.warn("Connection failed");
                    future.channel().eventLoop().schedule(() -> start(), 10, TimeUnit.SECONDS);
                }
            });
            //socketChannel = (SocketChannel) channelFuture.channel();
            channelFuture.channel().closeFuture().sync();
        } catch (Exception e){
            log.info("Exception throw");
            e.printStackTrace();
        }
    }

}
