class SiebenUndZwanzigWhile {
    public static void main(String[] args) {
        int obereGrenze = 21;

        for (int number = 0; number <= obereGrenze; number++) {
            if (number % 7 == 0 || number % 20 == 0) {
                System.out.println(number);
            }
        }
    }
}
