package intro_pt2.JavaFX.ParametersTest;

import javafx.application.Application;
import javafx.stage.Stage;

public class JavaFXApp extends Application
{
    @Override
    public void start(Stage stage)
    {
        Parameters params = getParameters();
        String title = params.getNamed().get("title");
        stage.setTitle(title);
        stage.show();
    }
}
