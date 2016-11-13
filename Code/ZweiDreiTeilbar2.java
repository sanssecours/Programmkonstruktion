class ZweiDreiTeilbar2 {
    public static void main(String[] args) {
        int zahl = 5;

        if (zahl % 2 == 0 && zahl % 3 == 0) {
            System.out.println("Zahl ist durch 2 und 3 teilbar.");
        } else if (zahl % 2 == 0) {
            System.out.println("Zahl ist durch 2 teilbar.");
        } else if (zahl % 3 == 0) {
            System.out.println("Zahl ist durch 3 teilbar.");
        } else {
            System.out.println("Zahl ist weder durch 2 noch durch 3 teilbar.");
        }
    }
}
