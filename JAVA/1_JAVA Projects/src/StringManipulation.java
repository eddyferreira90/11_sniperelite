public class StringManipulation {

    public static void main(String[] args) {

        String str = "http://www.academiadecodigo.org";

        String domain = ""; // www.academiadecodigo.org
        String name = ""; // < Academia de Codigo_ >

    /*
     print the following message at the end
     I am a Code Cadet at < Academia de Codigo_ >, www.academiadecodigo.org
    */


        String dominio = str.substring(7);
        String academia = dominio.substring(4,12);
        String de = dominio.substring(12,14);
        String codigo = dominio.substring(14,20);
        String A = academia.replaceFirst("a", "A");
        String C = codigo.replaceFirst("c", "C");




        System.out.println("I am a Code Cadet at < " + A + " " + de + " " + C + "_ >," + dominio);
    }
}
