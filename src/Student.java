public class Student extends People implements Learnable {

    private int score;
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public boolean isQualified() {
        return this.score >= 60;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("分数是："+ this.score);
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        if(score >= 0 && score <= 100) {
            this.score = score;
        }
    }

    @Override
    public void study() {
        System.out.println("学习提示");
    }
}
