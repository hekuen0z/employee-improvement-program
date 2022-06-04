package bsuir.diplom.clientapplicationfx.javaFX.controller;

import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FxmlView("/fxml/EditingProfileScene.fxml")
public class EditingProfileController {
    public void closeHandler(MouseEvent mouseEvent) {

    }
}
