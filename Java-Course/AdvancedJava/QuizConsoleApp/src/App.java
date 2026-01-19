public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
    
    
    QuestionService qs = new QuestionService();
    qs.playQuiz();
    
    qs.calculateScore();
    
    
    
    }
}
