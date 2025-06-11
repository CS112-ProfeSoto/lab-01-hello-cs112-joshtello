public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        methodOne();
        System.out.println("10 * 100 = " + methodTwo(10));
        VideoGame game1 = new VideoGame("Space Invaders");
        VideoGame game2 = new VideoGame("Space Invaders");
        System.out.println(game1.equals(game2));
    }

    public static void methodOne() {
        System.out.println("I hope you are excited to continue your CS journey!");
    }

    public static int methodTwo(int num) {
        int newnum = num * 100;
        return newnum;
    }
}