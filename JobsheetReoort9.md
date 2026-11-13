# REPORT JOBSHEET 9: ARRAY 1

Name: Davina Tegar Putri Ervia
NIM: 264107020083
GitHub: https://github.com/davinategar

# 1. Objective

* Students are able to understand the concept of one-dimensional arrays and how to declare, initialize,and access their elements in the Java programming language.
* Students are able to write programs that use one-dimensional arrays to store and process data,including the use of for and foreach loops.
* Students are able to apply arithmetic operations to array elements, such as calculating the total,average, highest value, and lowest value.
* Students are able to apply simple searching and sorting algorithms to one-dimensional arrays.
* Students are able to apply one-dimensional arrays to solve case studies that are relevant to campuslife and everyday situations.

# 2. Lab Exercises

## 2.1 Experiment 1: Declaring, Initializing, Filling, and Displaying Array Elements

**The code:**

```
import java.util.Arrays;

public class NumberArray07 {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = -7;
        numbers[3] = 17;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}
```

**Result:**

![result-experiment1-1-jobsheet9](result-experiment1-1-jobsheet9.png)

**Questions:**

1. If the elements of the numbers array are changed to ```5.0, 12867, 7.5, 2000000```, what happens? Why does this happen?

    Answer: when i want to run the program it will be error, because in my code i input it ```int``` so when i writhe those numbers it will causes error. If we want to get output those numbers, we have to use ```double```.

2. Modify the program above by initializing the array elements at the same time the array is declared (without new ```int[4]``` and without filling the elements one by one)

   Code:

   ```
   import java.util.Arrays;

    public class NumberArray07 {
        public static void main(String[] args) {
            int[] numbers = {5, 13, -7, 17};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers));
      }
   }
   ```

   Result:

   ![result-experiment1-1-jobsheet9](result-experiment1-1-jobsheet9.png)

   _note: still same like the previous code_

3. Change the display statement in step 4 to the following: ```System.out.println("numbers[" + i + "] = " +numbers[i] + ", doubled = " + (numbers[i] * 2));``` What is the output of the program? Explain themeaning of the statement.

   Answer: This line is used to display each array element along with the result            of multiplying it by 2.

   Result:
   
    ![result-experiment1-2-jobsheet9](result-experiment1-2-jobsheet9.png)

4. If the condition in the for loop above is changed to ```i <= 4```, what is the output of the program? Why?

   Answer: The program will produce an ArrayIndexOutOfBoundsException because                the array has only 4 elements, with indexes from 0 to 3. When i                  becomes 4, the program tries to access ```numbers[4]```, which does              not exist. Therefore, the program stops before executing the next                loops.

5. What is the difference between displaying an array using a for loop, a foreach loop, andArrays.toString() in step 5? When should each one be used?

   Answer: The for loop uses an index to access array elements, while the                   foreach loop accesses each element directly without using an index.              Arrays.toString() displays all array elements in one line. A for loop            is useful when we need the index, a foreach loop is useful when we               only need to read the elements, and Arrays.toString() is useful for d            isplaying the entire array quickly.

## Experiment 2: SIAKAD Case Study — Entering Student Scores and Pass/Fail Status  

The code:
