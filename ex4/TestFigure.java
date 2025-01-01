package ex4;

public class TestFigure {
    public static void main(String[] args) {
        
        new Carre(0, 0, 1, 5);
        new Carre(2, 3, 2, 10);
        new Rectangle(1, 1, 3, 4, 6);
        new Rectangle(5, 5, 4, 8, 3);
        new Figure(10, 10, 5);

        System.out.println("Toutes les figures :");
        for (Figure f : Figure.getInstances()) {
            System.out.println(f);
        }

        System.out.println("\nToutes les instances de Carré :");
        for (Figure f : Carre.getInstances()) {
            Carre c = (Carre) f; 
            System.out.println(c);
        }

        System.out.println("\nToutes les instances de Rectangle :");
        for (Figure f : Rectangle.getInstances()) {
            Rectangle r = (Rectangle) f; 
            System.out.println(r);
        }
    }
}
