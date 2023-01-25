package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int reversedNum =0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reversedNum);
    }
}
