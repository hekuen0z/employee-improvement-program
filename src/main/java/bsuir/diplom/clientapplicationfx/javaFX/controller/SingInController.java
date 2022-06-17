package bsuir.diplom.clientapplicationfx.javaFX.controller;

import bsuir.diplom.clientapplicationfx.javaFX.service.SingInService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@FxmlView("/fxml/SingInScene.fxml")
public class SingInController {

    public PasswordField password_field;
    public TextField login_field;
    public Hyperlink forgotPasswordButton;
    public ImageView lock_icon;
    public Button singInButton;
    public Button singUpButton;
    public Label msg_label;
    private SingInService singInService;

    @Autowired
    public SingInController(SingInService singInService) {
        this.singInService = singInService;
    }

    @FXML
    private Label label;

    public void handleClose(MouseEvent mouseEvent) {

    }
}
