package intro_pt2.JavaFX.SceneSwitching.Greeting;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application
{
    @Override
    public void start(Stage stage)
    {
        AppState appState = new AppState();
        SceneRouter sceneRouter = new SceneRouter(stage, appState);

        sceneRouter.setScene(SceneKey.GREETER);
        stage.show();
    }
}
