package de;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class StartApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Application.setUserAgentStylesheet(getClass().getResource("/css/primer-dark.css").toString());

        String javaVersion = SystemInfo.javaVersion();
        String javafxVersion = SystemInfo.javafxVersion();

        final FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/MainView.fxml"));
        final Parent root = (Parent) loader.load();

        stage.getIcons().add(new Image(getClass().getResource("/images/mainIcon.png").toString()));
        stage.setTitle("TicketPlanner");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
