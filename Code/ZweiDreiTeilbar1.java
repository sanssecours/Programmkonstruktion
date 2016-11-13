class ZweiDreiTeilbar1 {
    public static void main(String[] args) {
        int zahl = 20;

        if (zahl % 2 == 0) {
            System.out.println("Zahl ist durch 2 teilbar.");
        }

        if (zahl % 3 == 0) {
            System.out.println("Zahl ist durch 3 teilbar.");
        }

        if (zahl % 2 != 0 && zahl % 2 != 0) {
            System.out.println("Zahl ist weder durch 2 noch durch 3 teilbar.");
        }
    }
}
