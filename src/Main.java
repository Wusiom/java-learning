public class Main {

    public static void main(String[] args) {
        int score = 23;
        String text;
        if (score < 0 || score > 100) {
            text = "分数无效";
        } else if (score >= 90) {
            text = "优秀";
        } else if (score >= 60) {
            text = "及格";
        } else {
            text = "不及格";
        }
        System.out.println(text);
    }
}
