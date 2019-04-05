public class first2 {
    public static void main(String[] args) throws Exception {
        man m = new man();
        m.setAge(-21);
        System.out.println(m.getAge());
    }
}
class man{
    private String name;
    private int age;
    public man(){

    }

    public man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age>0 && age<200) {
            this.age = age;
        }
        //throw new Exception("不是人类了");
        throw new AGEException("这是自定义异常");
    }
}