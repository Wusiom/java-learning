public class People {
    private String name;
    private int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("姓名："+this.name+",年龄："+ this.age);
    }
}
