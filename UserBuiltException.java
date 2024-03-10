public class UserBuiltException {

    public static void main(String[] args) {
        try{
            int a=10, b=0, c=2;
            //int f = a / b;
            int e = 0;
            if(e == 0){
                throw new MyException("My own Exception");
            }
        }catch(MyException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }




}


class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}