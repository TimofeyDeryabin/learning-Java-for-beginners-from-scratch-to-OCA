package lesson16;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "Чтоб мудро жизнь прожить, знать надобно немало,Два важных правила запомни для начала: Ты " +
                    "лучше голодай, чем что попало есть,И лучше будь один, чем вместе с кем попало.";

        String s2 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i) && i != 0){
                System.out.println();
                System.out.print(s1.charAt(i));
            } else {
                System.out.print(s1.charAt(i));
            }
        }
    }
}
