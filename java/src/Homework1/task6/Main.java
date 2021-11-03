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
                "String k=\"ddd//che /*dsgf*/\""+
                "    // this line prints my first greeting to the screen\n" +
                "    System.out.println(\"Hi!\"); // :)\n" +
                "  }\n" +
                "} // the end\n" +
                "// to be continued...\n";
        System.out.println(source);
        String noComments = removeJavaComments(source);
        System.out.println(noComments);
    }

    public static String removeJavaComments(String source) {
        StringBuilder newSource = new StringBuilder();
        String[] sourceMass = source.split("");
        boolean k=true;
        for (int i = 0; i < sourceMass.length-1; i++) {
            if (sourceMass[i].equals("\""))k=!k;
            if (sourceMass[i].equals("/") && sourceMass[i + 1].equals("/")&&k) {
                i = deleteSingleComment(sourceMass, i);
            }
            if (sourceMass[i].equals("/") && sourceMass[i + 1].equals("*")&&k){
                i=deleteMultilineComment(sourceMass,i);
            }
            newSource.append(sourceMass[i]);
        }
        return newSource.toString();
    }

    public static int deleteSingleComment(String[] sourceMass, int i) {
        for (; i < sourceMass.length; i++) {
            if (sourceMass[i].equals("\n")) {
                return i;
            }
        }
        return 0;
    }
    public static int deleteMultilineComment(String[] sourceMass,int i){
        for (;i<sourceMass.length-1;i++){
            if (sourceMass[i].equals("*")&&sourceMass[i+1].equals("/")){
                return i+2;
            }
        }
        return 0;
    }

}
