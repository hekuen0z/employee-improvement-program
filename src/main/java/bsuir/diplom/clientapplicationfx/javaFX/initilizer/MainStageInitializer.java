package bsuir.diplom.clientapplicationfx.javaFX.initilizer;

import bsuir.diplom.clientapplicationfx.javaFX.controller.MainSceneController;
import bsuir.diplom.clientapplicationfx.javaFX.event.StageReadyEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainStageInitializer implements ApplicationListener<StageReadyEvent> {

    public final FxWeaver fxWeaver;

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.stage;
        Scene scene = new Scene(fxWeaver.loadView(MainSceneController.class), 400, 300);
        stage.setScene(scene);
        stage.show();
    }
}
