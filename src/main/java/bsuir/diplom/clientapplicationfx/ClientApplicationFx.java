package bsuir.diplom.clientapplicationfx;

import bsuir.diplom.clientapplicationfx.javaFX.JavaFxApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplicationFx {

    public static void main(String[] args) {
        Application.launch(JavaFxApplication.class, args);
    }

}
