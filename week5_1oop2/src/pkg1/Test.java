
package pkg1;


public class Test {
    public static void main(String[] args) {
        for(int i = 0; i < 100 ;i++){
            SingletonTest test = SingletonTest.getInstance();
            test.hello();
        }
    }
}
