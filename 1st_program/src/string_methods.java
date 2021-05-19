import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
//        String a = "Rishikesh";
//        String a1 = new String("Puri");
//        System.out.println(a);
//        System.out.println(a1);

//        int value = a.length();
//        System.out.println(value);
//        System.out.println(a1.length());
//        String s1 = a.toLowerCase();
//        System.out.println(s1);
//
//        String s2 = a.toUpperCase();
//        System.out.println(s2);
//
//
//        String nonTrimString = "      Rishi   qqq";
//        System.out.println(nonTrimString);
//
//        String TrimString = "      Rishi    qqq";
//        System.out.println(TrimString.trim());
//
//        String x = "   asdddd";
//        String st = x.trim();
//        System.out.println(st);

//        System.out.println();
//        System.out.println(a.substring(1));
//        System.out.println(a.substring(1,5));
//        System.out.println();
//        System.out.println(a.replace('i', 'w'));
//        System.out.println(a1.replace("i", "vkkkk"));
//        System.out.println(a1.replace("ur", "www123"));
//        System.out.println(a1.replace("ri", "gggg"));
//
//        System.out.println();
//        System.out.println(a.startsWith("Ri"));
//        System.out.println(a.endsWith("ah"));

//        System.out.println();
//        System.out.println(a.charAt(5));
//
//        System.out.println();
//        System.out.println(a.indexOf("h"));
//
//        System.out.println();
//        String newStr = "Purriuurri";
//        System.out.println(newStr.indexOf("ri"));
//
//        System.out.println();
//        System.out.println(newStr.indexOf("ri",5));
//        System.out.println(newStr.indexOf("u",5));
//
//        System.out.println();
//        System.out.println(newStr.lastIndexOf("ri"));
//        System.out.println(newStr.lastIndexOf("ri", 5));
//
//        System.out.println(a1.equals("puri"));
//        System.out.println(a1.equals("Puri"));
//
//        System.out.println();
//        System.out.println(a1.equalsIgnoreCase("puRI"));

//        System.out.println("my name is \" Rishikesh Puri");
//        System.out.println("my name is \\ Rishikesh Puri");
//        System.out.println("my name is \n Rishikesh Puri");
//        System.out.println("my name is \t Rishikesh Puri");
//        System.out.println("my name is \b Rishikesh Puri");

        String name = "This is my   book";
        System.out.println(name.replace(" ", "_"));

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter);
        letter = letter.replace("<|name|>", "Puri");
        System.out.println(letter);

        System.out.println();

        System.out.println(name.replace("  ", "$"));



    }
}
