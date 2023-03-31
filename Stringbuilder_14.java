public class Stringbuilder_14 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rohit");
        System.out.println(sb);

        // chat at index x
        System.out.println(sb.charAt(0));

        // set char at index x
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert char at index x
        sb.insert(0, 'o');
        System.out.println(sb);

        // delete the extra n
        sb.delete(2, 3);
        System.out.println(sb);

        StringBuilder name = new StringBuilder("h");
        // apprend the string
        name.append("e");
        name.append("l");
        name.append("l");
        name.append("o");
        System.out.println(name);

        // string length
        System.out.println(name.length());

        // string reverse
        name.reverse();
        System.out.println(name);
    }
}