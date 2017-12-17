package com.client.mvvmfx_demo01;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
	public static void main(String[] args) {
		launch(args);
    }

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("hello world!");
		final ViewTuple<HelloWorldView, HelloWorldViewModel> viewTuple = FluentViewLoader.fxmlView(HelloWorldView.class)
				.load();

		final Parent root = viewTuple.getView();
		primaryStage.setScene(new Scene(root));

		primaryStage.show();
	}
}
