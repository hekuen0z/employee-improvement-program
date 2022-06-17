package bsuir.diplom.clientapplicationfx.javaFX.controller;

import bsuir.diplom.clientapplicationfx.javaFX.event.SingUpEvent;
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

    @FXML
    public PasswordField password_field;

    @FXML
    public TextField login_field;

    @FXML
    public Hyperlink forgotPasswordButton;

    @FXML
    public ImageView lock_icon;

    @FXML
    public Button singInButton;

    @FXML
    public Button singUpButton;

    @FXML
    public Label msgLabel;

    private SingInService singInService;

    @Autowired
    public SingInController(SingInService singInService) {
        this.singInService = singInService;
    }

    public void redirectToSignUpScene(ActionEvent actionEvent) {

    }

    public void sendRequestToSignIn(ActionEvent actionEvent) {

    }

    public void handleClose(MouseEvent mouseEvent) {

    }
}
