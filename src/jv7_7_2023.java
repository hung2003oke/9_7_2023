/*public class jv7_7_2023 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int age = 18;
        if (age > 20) {
            System.out.println("siuuuuu");
        } else {
            System.out.println("hoi nach");
        }

        // For loop
        for (int i = 0; i <= 4; i++) {
            System.out.println("siuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        }

        // While loop
        int x = 0;
        while (x < 3) {
            System.out.println("Ars vô dịch C1");
            x++;
        }
    }

}
*/


class Object {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "Maria";
        student1.score = 56;
        System.out.println("Name: " + student1.name);
        System.out.println("Score: " + student1.score);

        Student student2 = new Student();

        student2.name = "Johnny";
        student2.score = 32;
        System.out.println("Name: " + student2.name);
        System.out.println("Score: " + student2.score);
    }
}
