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
            checkScore(score);
            this.score = score;
    }
    private void checkScore(int score) {
        if(score >= 0 && score <= 100) {
            System.out.println("分数合格");
        } else {
            throw new IllegalArgumentException("分数不合法");
        }
    }

    @Override
    public void study() {
        System.out.println("学习提示");
    }
}
