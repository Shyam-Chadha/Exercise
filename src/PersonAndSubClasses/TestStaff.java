package PersonAndSubClasses;

public class TestStaff {
    public static void main(String[] args) {
        Staff a1 = new Staff("Shyam","Delhi","Ryan",1100000);
        System.out.println(a1);
        System.out.println(a1.getSchool());
        a1.setSchool("Ryan International School");
        System.out.println(a1);
        System.out.println(a1.getPay());
        a1.setPay(2100000);
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getAddress());
        a1.setAddress("Pitampura");
        System.out.println(a1);
    }
}
