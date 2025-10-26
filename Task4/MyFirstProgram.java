class MyFirstClass {
    public static void main(String[] s) {
        // Создание объекта MySecondClass с числами 0 и 0
        MySecondClass o = new MySecondClass(0, 0);
        
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirstNumber(i);
                o.setSecondNumber(j);
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {

    private int firstNumber;
    private int secondNumber;

    public MySecondClass(int first, int second) {
        firstNumber = first;
        secondNumber = second;
    }

    public int getFirstNumber() {
        return firstNumber;
    }
    
    public int getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(int value) {
        firstNumber = value;
    }
    
    public void setSecondNumber(int value) {
        secondNumber = value;
    }
    
    public int multiply() {
        return firstNumber * secondNumber;
    }
}