

Variables in Java are declared with a data type followed by a variable name. For example:


int 9;
String hellow ' hellow its ekram';


Variables must be initialized before they can be used. Initialization assigns an initial value to the variable:

int myNumber = 5;
String myString = "Hello, World!";

### Data Types
#### Primitive Data Types


1. **byte**: 
   - Size: 8-bit
   - Range: -128 to 127
   - Example: `byte a = 100;`

2. **short**: 
   - Size: 16-bit
   - Range: -32,768 to 32,767
   - Example: `short s = 10000;`

3. **int**: 
   - Size: 32-bit
   - Range: -2^31 to 2^31-1
   - Example: `int i = 100000;`

4. **long**: 
   - Size: 64-bit
   - Range: -2^63 to 2^63-1
   - Example: `long l = 100000L;`

5. **float**: 
   - Size: 32-bit
   - Range: approximately ±3.40282347E+38F
   - Example: `float f = 234.5f;`

6. **double**: 
   - Size: 64-bit
   - Range: approximately ±1.79769313486231570E+308
   - Example: `double d = 123.4;`

7. **boolean**: 
   - Size: 1-bit (although size is not explicitly defined)
   - Values: `true` or `false`
   - Example: `boolean flag = true;`

8. **char**: 
   - Size: 16-bit (Unicode character)
   - Range: '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
   - Example: `char letter = 'A';`

#### Reference Data Types


1. **Objects**:
   - Example: `String str = "Hello";`

2. **Arrays**:
   - Example: `int[] arr = new int[10];`

### Variable Scope

The scope of a variable is the region of the program within which the variable can be accessed. There are several types of scopes in Java:

1. **Local Variables**: 
   - Declared inside a method or block.
   - Example:
     ```java
     public void myMethod() {
         int localVar = 10; // local variable
     }
     ```

2. **Instance Variables**: 
   - Declared inside a class but outside any method.
   - They are also known as non-static fields.
   - Example:
     ```java
     public class MyClass {
         int instanceVar = 20; // instance variable
     }
     ```

3. **Class Variables**: 
   - Declared inside a class with the `static` keyword.
   - They are also known as static fields.
   - Example:
     ```java
     public class MyClass {
         static int classVar = 30; // class variable
     }
     ```

### Type Conversion
1. **Implicit Type Conversion**: Automatic conversion by the Java compiler.
   - Example:
     ```java
     int i = 100;
     long l = i; // implicit conversion
     ```

2. **Explicit Type Conversion** (Casting): Requires explicit casting by the programmer.
   - Example:
     ```java
     double d = 100.04;
     int i = (int) d; // explicit casting
     ```

