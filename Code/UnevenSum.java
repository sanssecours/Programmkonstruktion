class UnevenSum {
    public static void main(String[] args) {
        int low = 123;
        int high = 456;
        // Start with first odd number
        int number = (low % 2 == 0) ? low + 1 : low;
        int sum = 0;

        while(number <= high) {
            sum += number;
            number += 2;
        }

        System.out.println("Summe der ungeraden Zahlen [" +
                           low + ", " + high + "] : " + sum);
    }
}
