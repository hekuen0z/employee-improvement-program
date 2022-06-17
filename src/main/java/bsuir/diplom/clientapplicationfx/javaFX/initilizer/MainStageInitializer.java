package bsuir.diplom.clientapplicationfx.javaFX.initilizer;

import bsuir.diplom.clientapplicationfx.javaFX.controller.SingInController;
import bsuir.diplom.clientapplicationfx.javaFX.event.StageReadyEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainStageInitializer implements ApplicationListener<StageReadyEvent> {

    public final FxWeaver fxWeaver;

//    @FXML
//    void initialize() {
//
//    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.stage;
        Scene scene = new Scene(fxWeaver.loadView(SingInController.class));
        stage.setScene(scene);
        stage.show();
    }

}
