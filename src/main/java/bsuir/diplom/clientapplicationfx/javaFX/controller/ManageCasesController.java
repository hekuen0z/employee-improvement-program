package bsuir.diplom.clientapplicationfx.javaFX.controller;

import javafx.scene.control.TableColumn;
import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@FxmlView("/fxml/ManageCasesScene.fxml")
public class ManageCasesController {
    public void handleClose(MouseEvent mouseEvent) {

    }

    public void onEditPosition(TableColumn.CellEditEvent cellEditEvent) {

    }
}
