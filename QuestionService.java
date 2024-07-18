import java.util.Scanner;

public class QuestionService {
 Question [] questions = new Question[5];
 String selection[] = new String[5];
 public QuestionService(){
    questions[0] = new Question(1, "what is this lang?", "java", "cpp", "python", "c#", "java");
    questions[1] = new Question(2, "what is ur fav lang", "java", "cpp", "python", "c#", "java");
    questions[2] = new Question(3, "what", "java", "cpp", "python", "c#", "java");
    questions[3] = new Question(4, "what", "java", "cpp", "python", "c#", "java");
    questions[4] = new Question(5, "what", "java", "cpp", "python", "c#", "java");
 }
 public void playquiz(){
    int i=0;
    for(Question q:questions){
        System.out.println("Question no: " + q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        System.out.println(q.getOpt4());
        Scanner sc  = new Scanner(System.in);
        System.out.println("whats ur answer");
        selection[i] =  sc.nextLine();
        i++;
    }
    
    for(String str:selection){
        System.out.println(str);

    }
 }

    public void score(){
        int score =0;
        for(int i=0;i<questions.length;i++){
           String ans = questions[i].getAns();
           String entry = selection[i];
           if(ans.equals(entry)){
            System.out.println("You are Fucking right!!");
            score++;
           }
           else{
            System.out.println("You are fucking Wrong!!");
           }
        }
        System.out.println("Your Total Score is : " + score);
    }

}
