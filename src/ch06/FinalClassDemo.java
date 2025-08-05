package ch06;

public class FinalClassDemo {
	public static void main(String[] args) {
		Best b = new Best();
	}
}

class Good {
}

class Better extends Good {
}

final class Best extends Better {
}

//class Excellent extends Best {} // The type Excellent cannot subclass the final class Best