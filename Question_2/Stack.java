package Question_2;
public class Stack {
    int[] numArray;
    static int top=-1;
    static int size=0;
    int[] nums;

    public int size() {
        return size;
    }
    void  push(int[] nums,int value) {
        if (!isFull()) {
            nums[++top] = value;
            size++;
        }
        else {
            System.out.println("Full");
        }
    }
    public static int pop(int[] nums) {
        if (!isEmpty()) {
            int data = nums[top--];
            size--;
            return data;
        }
        return -1;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static boolean isFull() {
        return size == nums.length;
    }
    public int peek() {
        if(top >= 0) {
            return nums[top];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = new int[5];
        push(nums,11);
        push(nums,22);
        push(nums,33);
        push(nums,44);
        pop(nums);
        pop(nums);
        for (int n:nums) {
            System.out.println(n+" ");
        }
    }
}
