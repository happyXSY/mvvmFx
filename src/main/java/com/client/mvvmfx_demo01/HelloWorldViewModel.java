package com.client.mvvmfx_demo01;

import de.saxsys.mvvmfx.ViewModel;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class HelloWorldViewModel implements ViewModel {
	private final StringProperty helloMessage = new SimpleStringProperty("你好 中国！");

	public StringProperty helloMessage() {
		return helloMessage;
	}

	public String getHelloMessage() {
		return helloMessage.get();
	}

	public void setHelloMessage(String message) {
		helloMessage.set(message);
	}
}
