import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class ExampleTest_3_17Test {
	public static void assertJavaBeansEqual(Object expected, Object actual) {
		if (expected != null && actual != null) {
			if (expected.getClass().equals(actual.getClass())) {
				for (PropertyDescriptor pd : Introspector.getBeanInfo(expected.getClass()).getPropertyDescriptors()) {
					Method getter = pd.getReadMethod();
					if (getter != null) {
						Object expectedValue = getter.invoke(expected);
						Object actualValue = getter.invoke(actual);
						Assertions.assertEquals(expectedValue, actualValue, "Values are not equal for property: " + pd.getName());
					}
				}
			}
			else {
				Assertions.fail("Objects are not of the same class");
			}
		}
		else {
			Assertions.fail("Objects are null");
		}
	}
}