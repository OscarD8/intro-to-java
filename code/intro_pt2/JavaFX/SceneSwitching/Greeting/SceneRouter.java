package intro_pt2.JavaFX.SceneSwitching.Greeting;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SceneRouter
{
    private final Stage stage;
    private final Map<SceneKey, Supplier<Scene>> scenes = new HashMap<>();
    private final AppState appState;

    public SceneRouter(Stage stage, AppState appState) {
        this.stage = stage;
        this.appState = appState;
        initScenes();
    }

    public void initScenes() {
        scenes.put(SceneKey.GREETER,      () -> SceneFactory.generateGreeter(this, appState));
        scenes.put(SceneKey.CONFIRMATION, () -> SceneFactory.generateConfirmation(appState));
    }

    public void setScene(SceneKey key) {
        stage.setScene(scenes.get(key).get());
    }

    public Scene getScene(SceneKey key) {
        return scenes.get(key).get();
    }
}
