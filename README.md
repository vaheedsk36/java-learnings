## Java Notes

## Introduction

- We need JDK for developing java applications
- Every machine have jvm responsible for running java code
- jvm do not understand, java code it only can understand byte code (non human readable format)
- Using Javac i.e java compiler we convert java code to byte code
- Byte code is processed by jvm
- When working with the java we will use certain packages and to run it, we would require JRE (Java Runtime Environment)
- So, jdk => jre => jvm (setup for development)
- Java applications, at times are said to be WORA (work once run anywhere)
- Any machine having jvm support can run java programs
- The user machine, need not require to have JDK, but it must have JRE and JVM in it

## Data types in Java

- Data items defined by the values. In java we need to specify the data type which is to be stored in the variable
- There are 2 types in it: (1) Primitive  (2) Non-Primitive
- (1) Primitive: Boolean, char, byte, int, short, long, float, and double
- (2)Non Primitive: Array, class, interfaces,string,enum
- Primitive Data Types Table – Default Value, Size, and Range
+---------+---------------+---------------------+----------------------------------------------+
| Data    | Default Value | Default Size        | Range                                        |
| Type    |               | (in bits)           |                                              |
+---------+---------------+---------------------+----------------------------------------------+
| byte    | 0             | 8 bits (1 byte)     | -128 to 127                                  |
| short   | 0             | 16 bits (2 bytes)   | -32,768 to 32,767                            |
| int     | 0             | 32 bits (4 bytes)   | -2,147,483,648 to 2,147,483,647              |
| long    | 0             | 64 bits (8 bytes)   | -9,223,372,036,854,775,808 to                 |
|         |               |                     | 9,223,372,036,854,775,807                    |
| float   | 0.0f          | 32 bits (4 bytes)   | 1.4e-045 to 3.4e+038                         |
| double  | 0.0d          | 64 bits (8 bytes)   | 4.9e-324 to 1.8e+308                        |
| char    | '\u0000'      | 16 bits (2 bytes)   | 0 to 65536                                  |
| boolean | FALSE         | 1 bit (1 byte)      | 0 or 1                                       |
+---------+---------------+---------------------+----------------------------------------------+
- class and object notes pending

### Method Overloading (ClassesAnObject file)

Method overloading in Java allows a class to have multiple methods with the same name but different parameters. The parameters can differ in the number of parameters or their types. The compiler determines which method to invoke based on the number and types of arguments provided.