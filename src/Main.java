public class Main {
    public static void main(String[] args) {

        //Задание 1
        int [] newArray = new int [] {1,2,3};

        double [] newDoubleArray = {1.57, 7.654, 9.986};

        boolean [] newBooleanArray = new boolean [4];
        newBooleanArray[0] = true;
        newBooleanArray[1] = false;
        newBooleanArray[2] = true;
        newBooleanArray[3] = false;

        //Задание 2
        for (int i = 0; i < 3; i++) {
            System.out.print(newArray[i]);
            if(i < newArray.length - 1)
                System.out.print(", ");
            else
                System.out.print("\n");
        }

        for (int i = 0; i < 3; i++) {
            System.out.print(newDoubleArray[i]);
            if(i < newDoubleArray.length - 1)
                System.out.print(", ");
            else
                System.out.print("\n");
        }

        for (int i = 0; i < newBooleanArray.length; i++) {
            System.out.print(newBooleanArray[i]);
            if(i < newBooleanArray.length - 1)
                System.out.print(", ");
            else
                System.out.print("\n");
        }

        //Задание 3
        for (int i = 2; i >= 0; i--) {
            System.out.print(newArray[i]);
            if(i > 0)
                System.out.print(", ");
            else
                System.out.print("\n");
        }

        for (int i = 2; i >= 0; i--) {
            System.out.print(newDoubleArray[i]);
            if(i > 0)
                System.out.print(", ");
            else
                System.out.print("\n");
        }

        for (int i = newBooleanArray.length - 1; i >= 0 ; i--) {
            System.out.print(newBooleanArray[i]);
            if(i > 0)
                System.out.print(", ");
            else
                System.out.print("\n");
        }

        //Задание 4
        for (int i = 0; i < 3; i++) {
            if(newArray[i] % 2 != 0)
                newArray[i]++;
            System.out.print(newArray[i]);
            if(i < newArray.length - 1)
                System.out.print(", ");
            else
                System.out.print("\n");
        }
    }
}