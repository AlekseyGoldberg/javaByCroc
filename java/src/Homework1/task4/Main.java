package Homework1.task4;

public class Main {
    public static void main(String[] args) {
        AnnotatedImage annotatedImage=new AnnotatedImage("234",new Annotation[]{
                new Annotation(new Rectangle(1,1,5,5),"Дерево"),
                new Annotation(new Rectangle(7,7,9,9),"Елка"),
                new Annotation(new Circale(2,3,8),"Мяч")});
        //Вывод фигур до изменения
       printAnotated(annotatedImage);
        System.out.println("Фигура, которая содержит подстроку \"Дер\" имеет параметры: "+annotatedImage.findByLabel("Дер"));
        System.out.println("Фигура, которая содержит точки (7,7) имеет параметры: "+annotatedImage.findByPoint(7,7));
        Annotation[] ant=annotatedImage.getAnnotations();
        //Вывод фигур после изменения. Фигура, которая создавалась второй сместилась на 10 координат по каждой оси
        ant[1].getFigure().move(10,10);
        printAnotated(annotatedImage);
    }


    //Метод выводит массив наших разметок
    public static void printAnotated(AnnotatedImage annotatedImage){
        for (int i=0;i<annotatedImage.getAnnotations().length;i++){
            System.out.println(annotatedImage.getAnnotations()[i]);
        }
    }

}
