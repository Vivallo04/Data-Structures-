package com.cracking.interview;

public interface BigO {

    //Space Complexity ---------------------------------------------------

    /* Stack space in recursive calls count, too.
    For instance, code like this would take O(n) time
    and O(n) space. */

    static int sum(int n) {

        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    /*
    Because:
    sum(4)
    sum(3)
    sum(2)
    sum(1)
    sum(0)

    Therefore a stack is created in memory (stack recursion)
     and takes up actual memory. */

    /*However, just because we have n calls, doesn't means it takes O(n) space.
    Consider the next function which add adjacent elements beetween 0 and n:

     */
    static int pairSumSequence(int n) {
        int sum = 0;

        //add up a + b to sum until i == n
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    static int pairSum(int a, int b) {
        return a + b;
    }

    /* In that case there'll be roughly 0(n) calls to pairSum
    because those calls do not exist simultaneously on the call stack,
    so we only need O(1) space
     */


    //Drop the constants -------------------------------------------------------

    static  int[] minMax1(int[] array) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int x: array) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new int[] {min, max};
    }

    static int[] minMax2(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x: array){
            if (x < min) min = x;
        }

        for (int x: array) {
            if (x > max) max = x;
        }
        return new int[] {min, max};
    }

    /*
    Which one is faster? The first one does one for loop and the other one
    does two for loops. But then, the first solution has two lines of code per
    loop rather than one.

    We just need to accept that it doesn't mean that O(N) is always better than O(N^2)
     */


    //Multi-part Algorithms  -----------------------------------------------------------

    /* Suppose you have an algorithm that has two steps. Whe do you multiply the runtimes
    and when do you add them?
     */

    static void addRuntimes(int[] a, int[] b) {
        for (int num: a) {
            System.out.println(num);
        }

        for (int num: b) {
            System.out.println(num);
        }
    }

    static void multiplyRuntimes(int[] a, int[] b) {
        for (int num: a) {
            for (int bnum: b) {
                System.out.println(num + "," + b);
            }
        }

    }

    /* In the example addRuntimes example we do A chunks of work and then B chunks
    of work. Therefore the total amount of work is O(a + b)

    In multiplyRuntimes, we do B chunks of work for each element in A.
    Therefore, the total amount of work is O(A * B) */

    //Log N Runtimes ----------------------------------------------------------------

    static int binarySearch(int[] array, int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - 1) / 2;

            if (array[mid] == x) {
                return mid;
            }

            if (array[mid] > x) {
                return binarySearch(array, l, mid - 1, x);
            }

            return binarySearch(array, l, mid + 1, x);
        }
        throw new IllegalArgumentException("Element not found");
    }

    //Recursive Runtimes -------------------------------------------------------------

    static int f(int n) {
        if (n <= 1) {
            return 0;
        } else {
            return f(n - 1) + f(n - 1);
        }

    }


    //Big O Practice ------------------------------------------------------------------

    //What is the runtime of the code below?
    static void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for (int i = 0; i <array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + "," + product);
    }

    static void printPairs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }

    static void printUnorderedPairs(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + "," + array[j]);
            }
        }
    }









}
