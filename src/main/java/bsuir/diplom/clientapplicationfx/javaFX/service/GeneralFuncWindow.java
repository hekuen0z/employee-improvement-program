package bsuir.diplom.clientapplicationfx.javaFX.service;

import bsuir.diplom.clientapplicationfx.connection.LogicClientHandler;
import bsuir.diplom.clientapplicationfx.utilities.ProtoMessageUtil;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Log4j2
@Component
@RequiredArgsConstructor
public class GeneralFuncWindow {

    private final ProtoMessageUtil protoMessageUtil;

    public static void openNewScene(String sceneName) {

    }

    public void closeApplication(){
    }

}
