package com.QuickReview_AllJava;

class AccessModifiers {

	public int publicInt = 10;
	private int privateInt = 20;
	protected int protectedInt = 30;
	int defaultInt = 40;

	public void printPublicInt() {
		System.out.println("Public int: " + publicInt);
	}

	private void printPrivateInt() {
		System.out.println("Private int: " + privateInt);
	}

	protected void printProtectedInt() {
		System.out.println("Protected int: " + protectedInt);
	}

	void printDefaultInt() {
		System.out.println("Default int: " + defaultInt);
	}
}

class Main2 {
	public static void main(String[] args) {
		AccessModifiers example = new AccessModifiers();

		example.printPublicInt();
		example.printProtectedInt();
		example.printDefaultInt();
	}
}

// In the above code, AccessModifiersExample class has four fields: publicInt,
// privateInt, protectedInt, and defaultInt. These fields are examples of
// different access modifiers in Java: public, private, protected, and default.
// The public modifier makes a field or method accessible from anywhere. The
// private modifier makes a field or method accessible only within the same
// class. The protected modifier makes a field or method accessible within the
// same class and any subclasses. The default modifier makes a field or method
// accessible only within the same package.

//In the Main class, we create an instance of AccessModifiersExample and call its 
//printPublicInt, printProtectedInt, and printDefaultInt methods. Because printPublicInt is public,
//it can be called from anywhere. Because printProtectedInt is protected, it can be called 
//from the same class or any subclasses. Because printDefaultInt has default access, it can be called
//from the same package. Because printPrivateInt is private, it can only be called within the AccessModifiersExample class.