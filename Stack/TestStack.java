package Stack;

public class TestStack {
    public static void main(String[] args) {
        StackArrayBased<Integer> stack = new StackArrayBased<>()<Integer>();

        for(int i = 0; i<=5; i++){
            Integer num = i;
            stack.push(num);
            
        }
        System.out.println("original stack");
        System.out.println(stack.toString());
        System.out.println();

        System.out.println("test pop");
        for(int i = 0; i<=3; i++){
            System.out.println(stack.pop());

        }
        System.out.println(stack);
        
        System.out.println();
        System.out.println("test Pop All");
        
    }
    
}
