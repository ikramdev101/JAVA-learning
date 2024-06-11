
### 1. Arithmetic Operators

- **Addition (`+`)**: Adds two operands.
  int result = 5 + 3; // result is 8
  ```
- **Subtraction (`-`)**: Subtracts the second operand from the first.
  int result = 5 - 3; // result is 2
- **Multiplication (`*`)**: Multiplies two operands.
  int result = 5 * 3; // result is 15
  
- **Division (`/`)**: Divides the first operand by the second.
  int result = 15 / 3; // result is 5
- **Modulus (`%`)**: Returns the remainder of the division of the first operand by the second.
  
  int result = 5 % 3; // result is 2

### 2. Unary Operators
These operators operate on a single operand.

- **Unary plus (`+`)**: Indicates a positive value (usually omitted).

  int result = +5; // result is 5
  
- **Unary minus (`-`)**: Negates an expression.

  int result = -5; // result is -5
- **Increment (`++`)**: Increases the value of a variable by one.
  int a = 5;
  int result = ++a; // result is 6, a is 6
  int a = 5;
  int result = a++; // result is 5, a is 6
- **Decrement (`--`)**: Decreases the value of a variable by one.
  int a = 5;
  int result = --a; // result is 4, a is 4
  int a = 5;
  int result = a--; // result is 5, a is 4
- **Logical complement (`!`)**: Inverts the value of a boolean.
  boolean result = !true; // result is false
  

### 3. Relational Operators
These operators are used to compare two values.

- **Equal to (`==`)**: Checks if two values are equal.
  boolean result = (5 == 5); // result is true
- **Not equal to (`!=`)**: Checks if two values are not equal.
  boolean result = (5 != 3); // result is true
  
- **Greater than (`>`)**: Checks if the first value is greater than the second.
  boolean result = (5 > 3); // result is true
- **Less than (`<`)**: Checks if the first value is less than the second.
  boolean result = (5 < 3); // result is false
  
- **Greater than or equal to (`>=`)**: Checks if the first value is greater than or equal to the second.
  boolean result = (5 >= 3); // result is true
  
- **Less than or equal to (`<=`)**: Checks if the first value is less than or equal to the second.
  boolean result = (5 <= 3); // result is false

### 4. Logical Operators
These operators are used to combine multiple boolean expressions.

- **Logical AND (`&&`)**: Returns true if both expressions are true.
  boolean result = (true && false); // result is false
- **Logical OR (`||`)**: Returns true if at least one of the expressions is true.
  boolean result = (true || false); // result is true
  
- **Logical NOT (`!`)**: Inverts the value of a boolean.
  
  boolean result = !true; // result is false

### 5. Bitwise Operators
These operators are used to perform bit-level operations on integer types.

- **Bitwise AND (`&`)**: Performs a bitwise AND.
  int result = 5 & 3; // result is 1 (0101 & 0011)
- **Bitwise OR (`|`)**: Performs a bitwise OR.
  int result = 5 | 3; // result is 7 (0101 | 0011)
- **Bitwise XOR (`^`)**: Performs a bitwise XOR.
  int result = 5 ^ 3; // result is 6 (0101 ^ 0011)
- **Bitwise Complement (`~`)**: Inverts all the bits.
  int result = ~5; // result is -6 (inverts all bits of 5)
  
- **Left Shift (`<<`)**: Shifts bits to the left.
  int result = 5 << 1; // result is 10 (0101 << 1 is 1010)
- **Right Shift (`>>`)**: Shifts bits to the right.
  int result = 5 >> 1; // result is 2 (0101 >> 1 is 0010)
- **Unsigned Right Shift (`>>>`)**: Shifts bits to the right with zero fill.
  int result = 5 >>> 1; // result is 2 (0101 >>> 1 is 0010)

### 6. Assignment Operators
These operators are used to assign values to variables.

- **Assignment (`=`)**: Assigns the right-hand side value to the left-hand side variable.
  int a = 5; // a is 5
- **Add and Assign (`+=`)**: Adds the right-hand side value to the left-hand side variable and assigns the result to the left-hand side variable.
  int a = 5;
  a += 3; // a is 8
- **Subtract and Assign (`-=`)**: Subtracts the right-hand side value from the left-hand side variable and assigns the result to the left-hand side variable.
  int a = 5;
  a -= 3; // a is 2
- **Multiply and Assign (`*=`)**: Multiplies the left-hand side variable by the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a *= 3; // a is 15
- **Divide and Assign (`/=`)**: Divides the left-hand side variable by the right-hand side value and assigns the result to the left-hand side variable.
  int a = 15;
  a /= 3; // a is 5
- **Modulus and Assign (`%=`)**: Takes the modulus using the left-hand side variable by the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a %= 3; // a is 2
- **Bitwise AND and Assign (`&=`)**: Performs a bitwise AND operation on the left-hand side variable and the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a &= 3; // a is 1
- **Bitwise OR and Assign (`|=`)**: Performs a bitwise OR operation on the left-hand side variable and the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a |= 3; // a is 7
  
- **Bitwise XOR and Assign (`^=`)**: Performs a bitwise XOR operation on the left-hand side variable and the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a ^= 3; // a is 6
- **Left Shift and Assign (`<<=`)**: Left shifts the left-hand side variable by the number of bits specified by the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a <<= 1; // a is 10
- **Right Shift and Assign (`>>=`)**: Right shifts the left-hand side variable by the number of bits specified by the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a >>= 1; // a is 2
- **Unsigned Right Shift and Assign (`>>>=`)**: Right shifts the left-hand side variable with zero fill by the number of bits specified by the right-hand side value and assigns the result to the left-hand side variable.
  int a = 5;
  a >>>= 1; // a is 2

