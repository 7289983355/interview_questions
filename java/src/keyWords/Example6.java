package keyWords;

import java.net.URL;
import java.net.URLClassLoader;

public class Example6 {
	static {
		System.out.println("Static block executed.");
	}

	public static void main(String[] args) throws Exception {
		ClassLoader classLoader = new URLClassLoader(new URL[] { new URL("file://path/to/classes/") });
		classLoader.loadClass("Example"); // Load the class using a custom class loader
	}
}
