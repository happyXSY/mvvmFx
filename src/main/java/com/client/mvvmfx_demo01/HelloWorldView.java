package com.client.mvvmfx_demo01;

import java.net.URL;
import java.util.ResourceBundle;

import de.saxsys.mvvmfx.FxmlView;
import de.saxsys.mvvmfx.InjectViewModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HelloWorldView implements FxmlView<HelloWorldViewModel>, Initializable {

	@FXML
	private Label helloLabel;
	@InjectViewModel
	private HelloWorldViewModel viewModel;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		helloLabel.textProperty().bind(viewModel.helloMessage());
	}

}
