class QuadNumbers {
    public static void main(String[] args) {
        int unterGrenze = 10;
        int obereGrenze = 15;

        for (int number = unterGrenze; number <= obereGrenze; number++) {
            System.out.println("Quadrat von " + number + ": " + number*number);
        }
    }
}
