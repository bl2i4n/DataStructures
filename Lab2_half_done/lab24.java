class lab24 {
	public static void main(String[] args) {

		String s1 = "Java is a programming language originally developed by James Gosling at Sun Microsystems and released in 1995 as a core component of Sun Microsystems Java platform.The language derives much of its syntax from C and C++ but has a simpler object model and fewer low-level facilities. Java applications are typically compiled to bytecode (class file) that can run on any Java Virtual Machine (JVM) regardless of computer architecture. Java is a general-purpose, concurrent, class-based, object-oriented language that is specifically designed to have as few implementation dependencies as possible. Java is currently one of the most popular programming languages in use, particularly for client-server web applications, with a reported 10 million users.";
		String s2 = "Java";

	}

	public static int countSubstring(String s1, String s2,int size1, int size2, int count) {
        if (size1 < size2) {
            return count;
        }
        else if (s1.substring(size1 - size2, size1).equals(s2)) {
            return countSubstring(s1, s2, size1 - 1, size2, count + 1);
        } else {
            return countSubstring(s1, s2, size1 - 1, size2, count);
        }

    }
}

