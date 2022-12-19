package it.DevelHope.ExerciseJava32;

public class Start {

    public static void main(String[] args) {

        String veryLongString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        //REPLACES OF 'um' WITH 'HUM'
        veryLongString = veryLongString.replaceAll("um","HUM");

        System.out.println(veryLongString);

        //FIND INDEX OF THE WORD 'aliquip'

        System.out.println(veryLongString.indexOf("aliquip"));

        //DIVISION OF 'veryLongString' IN 2 PARTS AND ASSIGN THEM TO 'sub1' AND 'sub2'
        String sub1 = veryLongString.substring(0, 200);
        String sub2 = veryLongString.substring(200, veryLongString.length());

        //PRINT OF 'sub1' AND 'sub2' WITHOUT BLANK SPACE
        System.out.println(sub1.trim() + "\n" + sub2.trim());

        //SEARCH OF THE WORD 'est' AND PRINT THE EXCLUSIVE OR OF THE 2 SEARCHES
        System.out.println(sub1.contains("est") ^ sub2.contains("est"));

    }
}
