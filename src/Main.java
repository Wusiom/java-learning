public class Main {
    public static void startLearning(Learnable learner) {
        learner.study();
    }
    public static void main(String[] args) {
        Student wusion = new Student("wusion", 18, 50);
        Teacher ad = new Teacher();
        startLearning(wusion);
        startLearning(ad);
    }
}
