package sample.practice;
public class StringDemo {
     public static void main(String[] args) {
        
        String name = "helloworldalien";
        

        System.out.println(name.charAt(2));
        System.out.println(name.concat("world"));
        System.out.println(name.contains("to"));
        System.out.println(name.length());
        System.out.println(name.endsWith("ae"));
        System.out.println(name.startsWith("hi"));
        System.out.println(name.indexOf("g"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.replace("a", "z"));
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,10));
    }
}
