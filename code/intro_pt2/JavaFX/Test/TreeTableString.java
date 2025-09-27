package intro_pt2.JavaFX.Test;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class TreeTableString extends Application
{
    // Standard entry point for intro_pt2.JavaFX apps.
    @Override
    public void start(Stage window) { // 'window' is our Theatre Building.
        window.setTitle("Tree Table View Samples"); // Name the Theatre.

        // Create the content for *one specific* scene/set.
        // We need a root container for this scene. Let's use a basic Group.
        // The scene itself will be 200x400 pixels.
        final Scene scene = new Scene(new Group(), 200, 400); // 'scene' is Act I set. The root is a new Group (the stage floor).

        // Get a direct reference to the root container (the stage floor) of 'scene'.
        // We know it's a Group, so we cast it.
        Group sceneRoot = (Group)scene.getRoot(); // 'sceneRoot' is our handle to Act I's stage floor.

        /* --- Now setting up the DATA for the TreeTableView --- */
        // These TreeItems are like the *data points* or *information* we want to display,
        // not the visual elements themselves yet. Think of them as inventory item stats,
        // quest details, or character attributes.
        final TreeItem<String> childNode1 = new TreeItem<>("Health Potion"); // Data Item 1
        final TreeItem<String> childNode2 = new TreeItem<>("Mana Potion");   // Data Item 2
        final TreeItem<String> childNode3 = new TreeItem<>("Sword");         // Data Item 3

        // This 'root' TreeItem is the top-level category for our data hierarchy.
        // This is DIFFERENT from 'sceneRoot'. This 'root' is for the DATA STRUCTURE.
        final TreeItem<String> root = new TreeItem<>("Inventory"); // Data Category: Inventory
        root.setExpanded(true); // Show its children by default.

        // Organize the data: Put the potions and sword *under* the Inventory category.
        root.getChildren().setAll(childNode1, childNode2, childNode3);

        /* --- Now setting up the VISUAL TreeTableView control --- */

        // Create a column for our table. This defines *how* data is displayed horizontally.
        // Think of it as a column header in a spreadsheet or list view.
        TreeTableColumn<String, String> column = new TreeTableColumn<>("Item Name"); // Visual Column Header
        column.setPrefWidth(150);

        // CRUCIAL: Tell the 'Item Name' column HOW to get the text to display for each row (TreeItem).
        // For each TreeItem ('p.getValue()'), get its associated String value ('p.getValue().getValue()').
        // This links the visual column to the data items.
        column.setCellValueFactory((TreeTableColumn.CellDataFeatures<String, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue()));

        // Create the actual TreeTableView UI control (the visual table).
        // Give it the ROOT of our DATA hierarchy ('root' TreeItem - "Inventory").
        // This is like creating the physical notice board prop.
        final TreeTableView<String> treeTableView = new TreeTableView<>(root); // The visual table UI element, using 'Inventory' data.

        // Add the "Item Name" column definition to our visual table.
        treeTableView.getColumns().add(column);
        treeTableView.setPrefWidth(152);
        treeTableView.setShowRoot(true); // Make the "Inventory" category itself visible as a row. If false, you'd only see the potions/sword directly.

        /* --- Connecting the Visual Control to the Scene --- */

        // Add the TreeTableView UI Control (our notice board prop) to the scene's root container (the stage floor).
        // Now the table is part of the scene's visual layout.
        sceneRoot.getChildren().add(treeTableView); // Place the table onto the stage floor.

        /* --- Displaying the Scene --- */

        // Tell the main window ('window' - the Theatre) to display the 'scene' (Act I set) we just prepared.
        // The 'scene' object implicitly contains 'sceneRoot' and everything added to it (like the treeTableView).
        // That's why you don't mention 'sceneRoot' here. You're setting the whole pre-assembled scene.
        window.setScene(scene); // Set Act I onto the Theatre's stage.

        // Make the window (and the scene within it) visible.
        window.show(); // Raise the curtain!
    }


    // This is the traditional main method
    public static void main(String[] args) {
        launch(args); // calls start()
    }
}
