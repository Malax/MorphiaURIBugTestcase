package de.malax.testcase.morphia.uri;

import com.google.code.morphia.*;
import com.google.code.morphia.query.*;
import com.mongodb.*;
import com.mongodb.util.*;

import java.net.*;

public class MorphiaBugTestcase {
	
	public static void main(String[] args) throws Throwable {
		Mongo mongo = new Mongo("localhost");
		Morphia morphia = new Morphia();

		Datastore datastore = morphia.createDatastore(mongo, "uriTestcase");
		
		TestClass brokenClass = new TestClass(1);
		
		TestClass nonBrokenClass = new TestClass(2);
		nonBrokenClass.setUriProperty(URI.create("urn:non-null-property"));

		// This works perfectly fine because there the URI property is not null:
		datastore.save(nonBrokenClass);

		// But this wont work because its null.
		datastore.save(brokenClass);
	}
}
