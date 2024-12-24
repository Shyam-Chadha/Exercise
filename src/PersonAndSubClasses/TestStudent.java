package PersonAndSubClasses;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Shyam","Delhi","MCA",2024,240000);
        System.out.println(s1);
        System.out.println(s1.getAddress());
        System.out.println(s1.getFee());
        s1.setFee(12000);
        System.out.println(s1);
        s1.setProgram("MCA 2year");
        System.out.println(s1.getProgram());
        System.out.println(s1.getName());
        System.out.println(s1);
    }
}
