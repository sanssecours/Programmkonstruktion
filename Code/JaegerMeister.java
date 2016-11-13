class JaegerMeister {
    public static void main(String[] args) {
        int number = 10;

        while (number > 0) {
            System.out.println(number + " kleine" +
                               (number == 1 ? "r" : "")  +
                               " Jägermeister");
            number = number - 1;
        }
    }
}
