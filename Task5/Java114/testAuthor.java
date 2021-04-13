package Java114;

public class testAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("tran van duong", "teck@mama.com", 'm');
        System.out.println(ahTeck);

        ahTeck.setEmail("teck@papa.com");
        System.out.println(ahTeck);
        System.out.println("name is: "+ahTeck.getName());
        System.out.println("gender is: "+ ahTeck.getGender());
        System.out.println("email is: "+ ahTeck.getEmail());
    }
}
