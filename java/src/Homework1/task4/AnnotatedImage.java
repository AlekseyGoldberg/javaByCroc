package Homework1.task4;

import javax.security.auth.login.AccountNotFoundException;

public class AnnotatedImage {
    private final String imagePath;

    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation[] annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {return this.imagePath;}

    public Annotation[] getAnnotations() {
        return this.annotations;
    }

    //метод позваоляет найти фигуру, которая содержит координаты х и у. В противном случае вернется null
    public Annotation findByPoint(int x,int y){
        Annotation ant = null;
        for (int i=0;i<annotations.length;i++){
            if (annotations[i].getFigure().getX()==x&&annotations[i].getFigure().getY()==y){
                ant=annotations[i];
            }
        }
        return ant;
    }

    //метод позволяет найти фигуру, которая содержит в своей подписи подстроку label, и вернуть эту фигуру.
    // В противном случае вернется null
    Annotation findByLabel(String label){
        Annotation ant=null;
        for (int i=0;i<annotations.length;i++){
            if (annotations[i].getSignature().contains(label)){
                ant=annotations[i];
            }
        }
        return ant;
    }

}
