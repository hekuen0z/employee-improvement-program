package bsuir.diplom.clientapplicationfx.javaFX.event;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class SingUpEvent extends ApplicationEvent {

    public final Stage stage;

    public SingUpEvent(Stage stage) {
        super(stage);
        this.stage = stage;
    }
}
