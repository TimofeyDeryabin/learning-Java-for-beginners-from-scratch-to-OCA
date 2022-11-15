package lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");

        String s10 = s1.substring(3);
        System.out.println(s10);
        System.out.println(s1);

        String s11 = s1.substring(3, 4);
        System.out.println(s11);

        String s12 = s1.trim();
        System.out.println(s12);

        String s13 = s1.substring(3, 6);
        System.out.println(s13);

        String s14 = s1.replace('o', 'Z');
        System.out.println(s14);
        System.out.println(s1);

        String s15 = s1.replace("vet", "vivka");
        System.out.println(s15);

        String s2 = "poka";
        String s3 = s2.replace("k", "k");
        System.out.println(s2 == s3);

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
        System.out.println(s5 + s6);
    }
}
