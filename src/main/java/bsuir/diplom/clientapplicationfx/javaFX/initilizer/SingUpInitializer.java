package bsuir.diplom.clientapplicationfx.javaFX.initilizer;

import bsuir.diplom.clientapplicationfx.javaFX.controller.SingUpController;
import bsuir.diplom.clientapplicationfx.javaFX.event.SingUpEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SingUpInitializer implements ApplicationListener<SingUpEvent> {

    private final FxWeaver fxWeaver;

    @Override
    public void onApplicationEvent(SingUpEvent event) {
        Stage stage = event.stage;
        Scene scene = new Scene(fxWeaver.loadView(SingUpController.class));
        stage.setScene(scene);
        stage.show();
    }
}
