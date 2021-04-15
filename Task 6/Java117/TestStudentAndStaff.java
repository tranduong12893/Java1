package Java117;

public class TestStudentAndStaff {
    public static void main(String[] args) {
        Student s1 = new Student("Tran tuan","123 Duy Tan","IT",2020,20113);
        System.out.println(s1);
        Staff s2 = new Staff("Hoang Anh","30 Khuc Thua Du","FPT Aptech",30000000);
        System.out.println(s2);
        s1.setProgram("Arena");
        s1.setFee(32516);
        s2.setPay(15000000);
        s2.setSchool("FPT Arena");
        System.out.println(s1);
        System.out.println(s2);
    }
}
