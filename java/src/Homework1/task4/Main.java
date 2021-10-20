package Homework1.task4;

public class Main {
    public static void main(String[] args) {
        Annotation[]annotations=new Annotation[]{
                new Annotation(new Rectangle(1,1,5,5),"Дерево"),
                new Annotation(new Rectangle(7,7,9,9),"Елка"),
                new Annotation(new Circale(2.4,3.6,8.5),"Мяч")};
        AnnotatedImage annotatedImage=new AnnotatedImage("234",annotations);
        for (int i=0;i<annotations.length;i++){
            System.out.println(annotations[i]);
        }

    }
}
