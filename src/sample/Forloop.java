package sample;

public class Forloop {
	public static int play() {
        String input;int result;
        do {
        input = ("Do you want to play-Enter 1 if yes , 0 if no");
        result = Integer.parseInt(input);
        } while (result != 1 || result != 0);
        System.out.println("Hi");
        return result;
    }

}
