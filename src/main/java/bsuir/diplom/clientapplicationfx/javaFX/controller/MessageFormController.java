package bsuir.diplom.clientapplicationfx.javaFX.controller;

import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FxmlView("/fxml/MassageForm.fxml")
public class MessageFormController {
    public void handleClose(MouseEvent mouseEvent) {

    }
}
