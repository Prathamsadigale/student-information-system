# Student Information System – Project Documentation

## 1. Project Overview

The **Student Information System** is a console-based Java application developed to manage student records efficiently. The system allows users to add, view, and search student details through a simple menu-driven interface.

The purpose of this project is to demonstrate the implementation of core Java programming concepts including object-oriented programming, data structures, input validation, and user interaction.

### Project Objectives

* Implement a Java console application
* Demonstrate Object-Oriented Programming concepts
* Manage student records using dynamic data structures
* Implement a menu-driven user interface
* Perform input validation for user-entered data

---

# 2. Setup Instructions

Follow the steps below to compile and run the project.

### Step 1: Install Java

Ensure Java JDK is installed on your system.

Check installation:

```
java -version
javac -version
```

### Step 2: Navigate to Source Folder

Open terminal and navigate to the src folder:

```
cd StudentInformationSystem/src
```

### Step 3: Compile the Program

Compile all Java files:

```
javac *.java
```

### Step 4: Run the Program

Run the main class:

```
java StudentInformationSystem
```

The program will start and display the menu.

---

# 3. Code Structure

The project follows a modular structure with separate classes for different responsibilities.

```
StudentInformationSystem
│
├── README.md
│
├── src
│   ├── Student.java
│   ├── StudentManager.java
│   ├── ValidationUtil.java
│   └── StudentInformationSystem.java
│
├── docs
│   └── documentation.md
│
├── test_data
│   └── sample_students.txt
│
└── screenshots
```

### Description of Files

**Student.java**

Defines the Student class which stores student attributes such as:

* Student ID
* Name
* Age
* Grade
* Contact Information

It also provides methods to retrieve and display student details.

---

**StudentManager.java**

Handles student operations such as:

* Adding a student
* Viewing all students
* Searching for a student by ID

The class stores student objects using an ArrayList.

---

**ValidationUtil.java**

Contains validation methods used to ensure valid user input.

Validation rules include:

* Age must be positive
* Grade must be between 0 and 100

---

**StudentInformationSystem.java**

This is the main class containing the program's entry point.

Responsibilities include:

* Displaying the menu
* Handling user input
* Calling appropriate methods from StudentManager

---

# 4. Visual Documentation

The project includes screenshots demonstrating the functionality of the application.

Screenshots include:

* Main menu interface
* Adding a student record
* Viewing all student records
* Searching for a student

All screenshots are stored in the **screenshots folder**.

---

# 5. Technical Details

### Programming Language

Java

### Concepts Used

Object-Oriented Programming:

* Classes and Objects
* Encapsulation
* Method usage

Java Collections Framework:

* ArrayList for dynamic data storage

Input Handling:

* Scanner class for user input

Validation:

* Custom validation methods to ensure correct input values

### Data Structure Used

ArrayList is used to store student objects dynamically. This allows the system to store multiple student records and easily perform operations like adding, searching, and displaying students.

### Algorithms Implemented

**Add Student**

1. Accept student information from user
2. Validate age and grade
3. Create Student object
4. Store object in ArrayList

---

**View Students**

1. Check if student list is empty
2. Display all student records with formatted output

---

**Search Student**

1. Accept student ID
2. Traverse ArrayList
3. Compare student IDs
4. Display matching student details

---

# 6. Testing Evidence

The system was tested using sample student data stored in:

```
test_data/sample_students.txt
```

### Sample Test Data

```
S001, John , 20, 85, john@email.com
S002, Jane Smith, 20, 92.0, janesmith@email.com
S003, Bob Wilson, 21, 90, babubhai@email.com
```

### Test Cases Performed

| Test Case      | Description            | Expected Result             |
| -------------- | ---------------------- | --------------------------- |
| Add Student    | Enter student details  | Student successfully added  |
| View Students  | Display all students   | All student records appear  |
| Search Student | Search by valid ID     | Correct student displayed   |
| Invalid Search | Search non-existing ID | "Student not found" message |

These tests confirm that the system works correctly for managing student data.

# How Technical Requirements Were Met

This project was developed to meet the technical requirements specified in the internship task. Each requirement has been implemented as described below.

## 1. Student Class with Required Attributes

A `Student` class was created in **Student.java** to represent individual student records.
The class includes the following attributes:

* `studentId`
* `name`
* `age`
* `grade`
* `contact`

These attributes store the student's information. Getter methods are provided to retrieve these values and a display method is used to print the student information in a formatted manner.

---

## 2. Data Storage Using ArrayList

Student records are stored using an **ArrayList** in the `StudentManager` class.

ArrayList was chosen because it allows dynamic storage of objects and easy addition or retrieval of student records. Each student entered by the user is stored as a `Student` object inside the ArrayList.

---

## 3. Menu-Driven Interface

The main class **StudentInformationSystem.java** provides a menu-driven interface for user interaction.

The menu allows the user to perform the following operations:

1. Add Student
2. View All Students
3. Search Student
4. Exit

The program runs in a loop until the user selects the exit option.

---

## 4. Input Handling Using Scanner

User input is handled using the **Scanner** class from the Java standard library.
The program collects student details such as ID, name, age, grade, and contact information from the user through the console.

---

## 5. Input Validation

Input validation is implemented using a separate utility class **ValidationUtil.java**.

Validation rules implemented include:

* Age must be greater than zero.
* Grade must be between 0 and 100.

This ensures that invalid data is not stored in the system.

---

## 6. Student Operations Implementation

All major student operations are implemented inside **StudentManager.java**.

The operations include:

* Adding new students to the system
* Viewing all stored student records
* Searching for a student using the student ID

These operations demonstrate basic data management functionality.

---

## 7. Formatted Output

Student information is displayed using formatted output with `System.out.printf()` to ensure that the student records appear in a clean table-like format when viewed.

---

## 8. Error Handling

Basic error handling is included to manage situations such as:

* Searching for a student that does not exist
* Viewing student records when the list is empty
* Invalid input values for age and grade

Appropriate messages are displayed to guide the user.

---

## 9. Test Data and Screenshots

Sample student records are provided in the **test_data/sample_students.txt** file for testing purposes.

Screenshots demonstrating the working of the program are included in the **screenshots** folder, showing:

* Adding student records
* Viewing student records
* Searching for students
* Menu interface


---

# Conclusion

The Student Information System project successfully demonstrates the use of Java programming fundamentals including object-oriented design, dynamic data storage using ArrayList, input validation, and menu-driven program execution.

The project provides a solid foundation for understanding how management systems can be developed using Java.
