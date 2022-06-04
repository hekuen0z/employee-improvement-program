package bsuir.diplom.clientapplicationfx.javaFX.controller;

import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FxmlView("/fxml/FeedBackAdminScene.fxml")
public class FeedBackAdminController {
    public void handleClose(MouseEvent mouseEvent) {

    }
}
