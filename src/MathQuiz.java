public class MathQuiz {
    double bok;

    MathQuiz(double bok){
        this.bok = bok;
    }

    public boolean question1(double bok){
        return bok == 15;
    }

    public boolean question2(double bok){
        return bok == 144;
    }

    public boolean question3(double bok){
        return bok == Math.sqrt(15129);
    }

}
