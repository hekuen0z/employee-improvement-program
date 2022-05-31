package bsuir.diplom.clientapplicationfx.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ConfigurationProperties(prefix = "netty")
public class NettyProperties {
    @NotNull
    @Size(min=1000, max=65535)
    private int serverPort;

    @NotNull
    private String serverIp;

    @NotNull
    private boolean keepAlive;

    @NotNull
    private boolean tcpDelay;
}
