package bsuir.diplom.clientapplicationfx.connection;

import bsuir.diplom.clientapplicationfx.constants.ResponseMessageProto;
import bsuir.diplom.clientapplicationfx.constants.ResponseMessageProto.ResponseMessage;
import bsuir.diplom.clientapplicationfx.utilities.NettyClient;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

import static bsuir.diplom.clientapplicationfx.utilities.ProtoMessageUtil.createAuthRequest;


@Log4j2
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class AuthClientHandler extends SimpleChannelInboundHandler<ResponseMessage> {

    @NotNull
    private String username = "test client #1";
    @NotNull
    private String password = "1111";

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("Client active...");
        ResponseMessage handShake = createAuthRequest(username, password);
        ChannelFuture future = ctx.channel().writeAndFlush(handShake);
        if(future.isSuccess()){
            log.info("Authorisation request sent successfully");
        } else
            log.error("Authorisation request caused errors");
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ResponseMessage msg) throws Exception {
        if(msg.getCommandType() == ResponseMessageProto.CommandType.AUTH_BACK) {
            ResponseMessageProto.AuthResponse authResponse = msg.getAuthResponse();
            if(authResponse.getResult()) {
                log.info("Authorisation response got with successful result");
                log.info("Server msg:" + authResponse.getMsg());
                NettyClient.uid = authResponse.getUid();
                NettyClient.token = authResponse.getToken();
                NettyClient.sessionId = authResponse.getSessionId();
            } else {
                log.error("Authorisation not completed on the server side. Error:" + msg.getAuthResponse().getCode());
                log.info("Server msg:" + msg.getAuthResponse().getMsg());
                ctx.close();
            }
        } else
            ctx.fireChannelRead(msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        log.info("Channel {} disabled", ctx.channel().id().asLongText());
    }
}
