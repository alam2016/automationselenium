package com.automation;

/**
 * Hello world!
 */
public class App {

    public String getGreeting() {
        return "Hello";
    }

    public String getFizzBuzz(int n) {

        if (n % 3 == 0 || n % 5 == 0) {

            if (n % 3 == 0 && n % 5 == 0) {

                return "fizz buzz";

            } else if (n % 3 == 0) {

                return "fizz";

            } else if (n % 5 == 0) {

                return "buzz";

            }
        }

        return "unknown";

    }

    public int getFacto(int n){

        int i, f = 1;

        for(i = 2; i <= n; i++){
            f = f * i;
        }

        return f;

    }

}
