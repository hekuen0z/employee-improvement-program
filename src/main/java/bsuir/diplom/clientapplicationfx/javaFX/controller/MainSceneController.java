package bsuir.diplom.clientapplicationfx.javaFX.controller;

import bsuir.diplom.clientapplicationfx.javaFX.service.MainSceneService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;


@Component
@RequiredArgsConstructor
@FxmlView("/fxml/SingInScene.fxml")
public class MainSceneController {

    private MainSceneService mainSceneService;

    @Autowired
    public MainSceneController(MainSceneService mainSceneService) {
        this.mainSceneService = mainSceneService;
    }

    @FXML
    private Label label;

    public void loadHelloMessage(ActionEvent actionEvent){
        this.label.setText(mainSceneService.getHelloMessage());
    }
}
