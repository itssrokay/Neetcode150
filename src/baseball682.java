
import java.util.Stack;

class baseball682 {
    public static int calPoints(String[] operations) {
        Stack <Integer> stack=new Stack<>();
        int sum=0;

        for(int i=0;i<operations.length;i++){
            if (isNumeric(operations[i])){
                stack.push(Integer.parseInt(operations[i]));
            }
            else if(operations[i].equals("+")){
                int top=stack.pop();
                int twoSum=top+stack.peek();
                stack.push(top);
                stack.push(twoSum);


            }
            else if(operations[i].equals("D")){
                stack.push(2*(stack.peek()));
            }
            else if(operations[i].equals("C")){
                stack.pop();

            }

        }
        while(!stack.isEmpty()){
            sum+=stack.pop();

        }
        return sum;
    }
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] arr ={"5","2","C","D","+"};
        int a=calPoints(arr);
        System.out.println(a);
    }
}
