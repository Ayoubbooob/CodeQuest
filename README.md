# CodeQuest
A 6-Month Journey into Computer Science


## JAVA Missing Semester
### Exceptions
#### What are Exceptions?
##### Exception 
is an unwanted or unexpected event, which occurs during execution of a progaram. Exception can be caught and handled by the program
##### Errors 
A serious problem that reasonable app should not try to catch

#### Exception Hierarchy
![Screenshot that shows exceptions hierarchy](https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png)


#### Type of Exceptions
![Screenshot that shows type of exceptions ](https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png)
1. Checked Exceptions : Are compiled time exceptions
2. Unchecked Exceptions : Are run-time exceptions
3. User-Defined Exceptions : User can also create his own exceptions if built-in exception are not enough

#### Basic Exception Handling Program
```
Class Exception{
  public static void main(String args[]){
    try{
      //CODE THAT MAY RAISE AN EXCEPTION
    }
    catch(Exception e){
      //REST OF THE PROGRAM
      //THAT WILL RUN IF AN EXCEPTION ARISE
    }
  }
}
```

#### Built-in Exeptions
1. ArithmeticException: It is thrown when an exception occurred due to some arithmetic operations.
2. ArrayIndexOutOfBoundException
3. NumberFormatException
 ```
class HelloWorld{
  public static void main(String args[]){
    try{
      int num = Integer.parseInt("9A");
      System.out.println(num);
    }
    catch(NumberFormatException e){
      System.out.println("INVALID NUMBER FORMAT");
    }
  }
}
```

4. StringIndexOutOfBoundsException
``` 
class HelloWorld{
  public static void main(String args[]){
    try{
      String word = "My Name is Prithvi";
      System.out.println(word.charAt(19));
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println("String Index Out of limits");
    }
  }
}
```

#### User Defined Exceptions
```
class HelloWorld{
  public static void main(String args[]){
    try{
    int a = 9;
    int b = 0;
    int c = 10;
    //int e = a / b;
    int f = a / c;
    System.out.println("Result is:" + f);
    if(f == 0){
        throw new MyException("My Designed Exception");
    }
    }
    catch(ArithmeticException e){
        System.out.println("ERROR IN DIVIDING");
    }
    catch(MyException e1){
        System.out.println(e1.getMessage());
    }
  }
}
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
```
#### Exceptions Handling Keywords
![](https://miro.medium.com/v2/resize:fit:720/format:webp/1*f86qisy-4w68aMKy-mEsqg.png)
1. try: used to specify a block where we should place the exception
2. catch: a block to handle exception
   
syntax: 
```
catch(Exception e){//handling exception}
```
exemple:
```
//Multiple Catch
class HelloWorld {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("9A");
            System.out.println(num);
        }
            catch(NumberFormatException e){
            System.out.println("INVALID NUMBER FORMAT");
        }
           catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array ondex out of limits");
        }
       catch(ArithmeticException e){
            System.out.println("Cant divide number by zero");
        }
    }
}
```
3. finally: This code will run anyway, even if the exception has not been handled. It's usually used to close connections or streams, ...
```
class HelloWorld {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt("9A");
            System.out.println(num);
        }
        finally{
            System.out.println("I WILL RUN EVEN IF PROGRAM IS NOT RUNNING");
        }
    }
}
```

4. throw: used to throw an exception
```
class HelloWorld{
    static void print(){
    try{
      throw new StringIndexOutOfBoundsException("TESTING");
    }
    catch(StringIndexOutOfBoundsException e){
      System.out.println("String Index Out of limits, hence worked");
    }
    }
  public static void main(String args[]){
    print();
  }
}
```
5. throws: Always used with the method signature, it's used to tell that there can be an exception, but it doesn't throw any exception  
```
class HelloWorld{
    static void print() throws NumberFormatException{
        System.out.print("Function1");
        throw new NumberFormatException("HELLO FUNCTION 1");
    }
  public static void main(String args[]){
    try{
        print();
    }
    finally{
        System.out.print("GOT THE EXCEPTION");
    }
  }
}
```
#### Exceptioon Propagation
Is a concept of transferring the exception from one method to its previous method in order to handle the exception
exemple 
![](https://miro.medium.com/v2/resize:fit:382/format:webp/1*KhXbQs-c46FjrtBS28EZbA.png)
the caller method m1() is responsible to handle the exception

#### Error vs Exception
![](https://miro.medium.com/v2/resize:fit:786/format:webp/1*p_7JTU-5DVFzXo-B7bD3tA.png)

#### throw vs throws
![](https://miro.medium.com/v2/resize:fit:828/format:webp/1*FcWn_d2Tka0yJ12hvRbahw.png) 