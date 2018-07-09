import java.util.Scanner;

public class QuizController {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        MathQuiz quiz = new MathQuiz(15);
        int result = 0;

        System.out.println("Jaki jest wynik mnożenia liczb 3 i 5?");
        if(quiz.question1(scan1.nextDouble())){
            System.out.println("Twoja odpowiedź jest prawidłowa");
            result++;
        }
        else{
            System.out.println("Przykro mi ale udzieliłeś błędnej odpowiedzi");
        }

        System.out.println("Jakie jest pole kwadratu o boku 12");
        if(quiz.question2(scan1.nextDouble())){
            System.out.println("Twoja odpowiedź jest prawidłowa");
            result++;
        }
        else{
            System.out.println("Przykro mi ale udzieliłeś błędnej odpowiedzi");
        }

        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129?");
        if(quiz.question3(scan1.nextDouble())){
            System.out.println("Twoja odpowiedz jest prawidłowa");
            result++;
        }
        else{
            System.out.println("Przykro mi ale udzieliłeś błędnej odpowiedzi");
        }

        System.out.println("Udzieliłeś poprawnej odpoowiedzi na " + result + " z 3 pytań");
    }
}
