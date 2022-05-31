package bsuir.diplom.clientapplicationfx.connection;

import bsuir.diplom.clientapplicationfx.constants.ResponseMessageProto.ResponseMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class LogicClientHandler extends SimpleChannelInboundHandler<ResponseMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ResponseMessage msg) throws Exception {
        switch (msg.getCommandType()){
            case PING -> {
            }
            case PONG -> {
            }
            case AUTH -> {
            }
            case LOGOUT -> {
            }
            case DOWNLOAD_DATA -> {
            }
            case UPLOAD_DATA -> {
            }
            case SEND_MESSAGE -> {
            }
            case AUTH_BACK -> {
            }
            case LOGOUT_BACK -> {
            }
            case DOWNLOAD_DATA_BACK -> {
            }
            case UPLOAD_DATA_BACK -> {
            }
            case SEND_MESSAGE_BACK -> {
            }
            case UNRECOGNIZED -> {
            }
        }
    }
}
