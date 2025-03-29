//overloaded method for validate name and age
public class challenge5 {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");

    }
    static boolean validate(int age){
       return age>=3 && age<=15;
    }
    public static void main(String[] args) {
        System.out.println(validate("ja@nvi"));
        System.out.println(validate(8));
    }
}
