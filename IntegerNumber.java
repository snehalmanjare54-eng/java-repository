package Assig1;

class IntegerNumber {
    private int n;

    IntegerNumber(int n) {
        this.n = n;
    }

    void square() {
        System.out.println("Square = " + (n * n));
    }

    void cube() {
        System.out.println("Cube = " + (n * n * n));
    }

    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);

        IntegerNumber obj = new IntegerNumber(x);

        obj.square();
        obj.cube();
    }
}