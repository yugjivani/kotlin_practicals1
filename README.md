# 🟣 Kotlin Practicals – Practical 1

A collection of Kotlin programs demonstrating fundamental **Kotlin programming concepts**, including variables, type conversion, user input, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations.

## 🔗 Repository

**GitHub Repository:**  
https://github.com/yugjivani/kotlin_practicals1

---

# 📖 Practical-1

### Develop a Kotlin program for demonstrating various programming concepts.

This practical contains **11 different programming exercises** designed to understand the basics of Kotlin programming and Object-Oriented Programming concepts.

---

## 📌 Practical Contents

| No. | Practical | Concepts Covered |
|---|---|---|
| **1.1** | Store & Display Values in Different Variables | Data Types, Variables |
| **1.2** | Type Conversion | Type Casting, String Conversion |
| **1.3** | Student Information | User Input, String Interpolation |
| **1.4** | Odd or Even Number | `if-else`, Modulus |
| **1.5** | Display Month Name | `when` Expression |
| **1.6** | User-Defined Function | Functions, Arithmetic Operations |
| **1.7** | Factorial Calculation | Recursion |
| **1.8** | Working with Arrays | Arrays, Loops, Sorting |
| **1.9** | Maximum from ArrayList | ArrayList, Collections |
| **1.10** | Class and Constructor | Classes, Constructors, Objects |
| **1.11** | Operator Overloading & Matrix | Operator Overloading, Matrix Operations |

---

# 1.1️⃣ Store & Display Values in Different Variables

Demonstrates the declaration and display of variables using different Kotlin data types.

### Data Types Used

- `Int`
- `Double`
- `Float`
- `Long`
- `Short`
- `Byte`
- `Char`
- `Boolean`
- `String`

### Concepts

- Variable declaration
- `val` and `var`
- Kotlin data types
- Output using `println()`

---

# 1.2️⃣ Type Conversion

Demonstrates conversion between different data types.

### Conversions

```text
Integer → Double
String  → Integer
String  → Double
```

### Kotlin Functions

```kotlin
toDouble()
toInt()
```

This exercise demonstrates explicit type conversion and parsing of String values.

---

# 1.3️⃣ Student Information

Accepts student information from the user and displays the entered details.

### Information Includes

- Name
- Enrollment Number
- Branch
- Semester
- Other student details

### Concepts

- User input
- `readLine()`
- String interpolation
- Formatted output

---

# 1.4️⃣ Check Odd or Even Numbers

Determines whether a given number is **Odd or Even**.

The program demonstrates the use of conditional expressions and the modulus operator.

### Example

```text
Input: 10
Output: 10 is Even
```

### Concepts

- `if-else`
- `%` modulus operator
- Conditional expression
- `println()`

---

# 1.5️⃣ Display Month Name

Uses Kotlin's **`when` expression** to display the corresponding month name based on the number entered by the user.

### Example

```text
Input: 8
Output: August
```

### Concepts

- `when`
- User input
- Multiple conditions

---

# 1.6️⃣ User-Defined Function

Creates a user-defined function to perform arithmetic operations on two numbers.

### Operations

- Addition
- Subtraction
- Multiplication
- Division

### Concepts

- Function declaration
- Parameters
- Return values
- Arithmetic operators

---

# 1.7️⃣ Factorial Calculation with Recursion

Calculates the factorial of a number using **recursion**.

### Formula

```text
n! = n × (n - 1) × (n - 2) × ... × 1
```

### Example

```text
5! = 5 × 4 × 3 × 2 × 1
5! = 120
```

### Concepts

- Recursive function
- Base condition
- Recursive calls

---

# 1.8️⃣ Working with Arrays

Demonstrates different operations on Kotlin arrays.

### Operations Covered

- `Arrays.deepToString()`
- `contentDeepToString()`
- `IntArray.joinToString()`
- Array traversal
- Array manipulation
- Array sorting

### Looping Techniques

The program demonstrates different Kotlin looping/range operations such as:

```kotlin
range
downTo
until
```

### Sorting

The array is sorted using:

1. A manually implemented sorting technique
2. Kotlin's built-in sorting functions

### Concepts

- Arrays
- Nested arrays
- Loops
- Ranges
- Sorting algorithms
- Built-in functions

---

# 1.9️⃣ Find Maximum Number from ArrayList

Finds the maximum value from an `ArrayList` containing integers.

### Example

```text
ArrayList: [10, 25, 7, 45, 18]

Maximum Number: 45
```

### Concepts

- `ArrayList`
- Collections
- Iteration
- Finding maximum values

---

# 1.🔟 Class and Constructor Creation

Demonstrates the creation and use of classes and constructors using a **`Car` class**.

### Car Properties

```text
Type
Model
Price
Owner
Miles Driven
```

### Functions

The class provides functionality to:

- Get car information
- Display car information
- Get original car price
- Calculate/display current car price

### Concepts

- Classes
- Constructors
- Properties
- Objects
- Member functions
- Encapsulation

---

# 1.1️⃣1️⃣ Operator Overloading & Matrix Operations

Demonstrates **operator overloading** using a custom `Matrix` class.

### Matrix Operations

The program implements:

```text
Matrix Addition
Matrix Subtraction
Matrix Multiplication
```

### Operator Overloading

Kotlin allows operators to be overloaded for user-defined classes.

For example:

```kotlin
matrix1 + matrix2
matrix1 - matrix2
matrix1 * matrix2
```

These operators can be implemented using:

```kotlin
operator fun plus()
operator fun minus()
operator fun times()
```

### `toString()` Overloading

The `toString()` function is overridden to provide a customized matrix representation when the object is printed.

### Concepts

- Classes
- Operator overloading
- `plus()`
- `minus()`
- `times()`
- Matrix operations
- Function overriding
- `toString()`

---

# 📂 Project Structure

```text
kotlin_practicals1/
│
├── .idea/
│
├── src/
│   └── ...
│
├── .gitignore
├── kotlin_practicals.iml
└── README.md
```

---

# 🛠️ Technologies Used

| Technology | Details |
|---|---|
| Language | Kotlin |
| IDE | IntelliJ IDEA |
| JDK | Java Development Kit |
| Version Control | Git |
| Repository | GitHub |

---

# ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/yugjivani/kotlin_practicals1.git
```

### 2. Open the Project

Open the cloned project in **IntelliJ IDEA**.

### 3. Navigate to `src`

Open the required Kotlin `.kt` file.

### 4. Run the Program

Click the **Run ▶** button in IntelliJ IDEA.

---

# 🎯 Learning Outcomes

After completing this practical, the following Kotlin concepts are demonstrated:

- ✅ Variables and Data Types
- ✅ Type Conversion
- ✅ User Input
- ✅ Conditional Statements
- ✅ `when` Expression
- ✅ User-Defined Functions
- ✅ Recursion
- ✅ Arrays
- ✅ Loops and Ranges
- ✅ Array Sorting
- ✅ ArrayList
- ✅ Classes and Objects
- ✅ Constructors
- ✅ Encapsulation
- ✅ Operator Overloading
- ✅ Matrix Operations
- ✅ Function Overriding

---

# 🎓 Conclusion

**Practical-1** provides a strong foundation in Kotlin programming by covering both basic programming concepts and introductory Object-Oriented Programming concepts.

The practical progresses from basic variables and type conversion to more advanced concepts such as **recursion, arrays, classes, operator overloading, and matrix operations**.

---

## 👨‍💻 Author

**Yug Jivani**

B.Tech – Information Technology

---

⭐ If you find this practical useful, consider giving the repository a **Star** on GitHub.

**Repository:**  
https://github.com/yugjivani/kotlin_practicals1
