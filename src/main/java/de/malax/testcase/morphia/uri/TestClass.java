package de.malax.testcase.morphia.uri;

import com.google.code.morphia.annotations.*;

import java.net.*;

public class TestClass {
	@Id
	private int id;
	private URI uriProperty;
	private String foobarUnusedAndNull = null;

	public TestClass(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public URI getUriProperty() {
		return uriProperty;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUriProperty(URI uriProperty) {
		this.uriProperty = uriProperty;
	}
}
