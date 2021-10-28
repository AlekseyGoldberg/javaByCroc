package Homework1.task6;

public class Main {
    //однострочный комментарий
    /* это многострочный комментарий*/
    public static void main(String[] args) {
        String source = "/*\n" +
                " * My first ever program in Java!\n" +
                " */\n" +
                "class Hello { // class body starts here \n" +
                "  \n" +
                "  /* main method */\n" +
                "  public static void main(String[] args/* we put command line arguments here*/) {\n" +
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n";
        String noComments = removeJavaComments(source);
        System.out.println(noComments);
    }

    public static String removeJavaComments(String source) {
        StringBuilder newSource = new StringBuilder();
        String[] sourceMass = source.split("");
        for (int i = 0; i < sourceMass.length; i++) {
            if (!(sourceMass[i].equals("/") || sourceMass[i].equals("*"))) {
                newSource.append(sourceMass[i]);
            }
        }
        return newSource.toString();
    }
}
