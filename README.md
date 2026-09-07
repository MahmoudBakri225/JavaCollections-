# 🎓 University Registration System

> **Java Collections Assignment — Demonstrating Different Data Structures**

A Java-based **University Registration System** designed to demonstrate the practical use of different Java data structures and collection types.

The project shows how university-related data can be **stored, accessed, searched, modified, and displayed** using different structures, including:

* One-Dimensional Array
* Two-Dimensional Array
* List
* ArrayList
* LinkedList
* Set
* HashSet
* HashMap

Each data structure is selected according to the type of data it manages and the operations required.

---

# 📌 Project Overview

The main goal of this project is to demonstrate how different Java data structures can be used to solve different data-management problems within a university environment.

The application manages examples of:

```text
University Days
Class Schedule
Available Courses
Registered Students
Waiting List
University Departments
Student IDs
Student Information
```

The project demonstrates common operations such as:

```text
Display
    ↓
Access
    ↓
Search
    ↓
Modify
```

---

# 🧠 Data Structures Used

| Data Structure | Used For               | Why It Was Selected                                    |
| -------------- | ---------------------- | ------------------------------------------------------ |
| **Array**      | University days        | Suitable for a fixed number of values                  |
| **2D Array**   | Weekly class schedule  | Organizes related data in rows and columns             |
| **List**       | Available courses      | Maintains ordered data and supports easy modification  |
| **ArrayList**  | Registered students    | Suitable for a dynamic collection that maintains order |
| **LinkedList** | Student waiting list   | Suitable for frequent additions/removals               |
| **Set**        | University departments | Prevents duplicate departments                         |
| **HashSet**    | Student IDs            | Ensures student IDs are unique                         |
| **HashMap**    | Student information    | Maps student IDs to student names                      |

---

# 🏗️ System Architecture

```text
                  UNIVERSITY REGISTRATION SYSTEM
                              │
          ┌───────────────────┼───────────────────┐
          │                   │                   │
          ▼                   ▼                   ▼
     University           Academic Data      Student Data
        Data                    │                   │
          │                     │                   │
          │              ┌──────┴──────┐      ┌─────┴─────┐
          │              │             │      │           │
          ▼              ▼             ▼      ▼           ▼
       Array          2D Array        List  ArrayList  LinkedList
          │              │             │      │           │
          ▼              ▼             ▼      ▼           ▼
      University      Class         Courses Students   Waiting
        Days         Schedule                              List
          
          └───────────────────────────────────────────────┐
                                                          │
                                                          ▼
                                                   Set / HashSet
                                                          │
                                                          ▼
                                                Departments / IDs
                                                          │
                                                          ▼
                                                     HashMap
                                                          │
                                                          ▼
                                                Student Information
```

---

# 🔄 Core Operations

The application demonstrates four fundamental operations for different data structures:

### 1. Display

Shows all elements stored in the data structure.

### 2. Access

Retrieves a specific element using an index or key.

### 3. Search

Checks whether a specific value exists.

### 4. Modify

Changes, removes, or replaces existing data.

```text
┌─────────────┐
│    DATA     │
└──────┬──────┘
       │
       ├──────► Display
       │
       ├──────► Access
       │
       ├──────► Search
       │
       └──────► Modify
```

---

# 1️⃣ One-Dimensional Array

## 📅 University Days

A one-dimensional `String[]` array is used to store the university days.

```java
String[] universityDays = {
    "Saturday",
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday"
};
```

An array is appropriate because the number of university days in the example is fixed.

### Operations Demonstrated

**Display**

```text
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday
```

**Access**

```java
universityDays[2]
```

Result:

```text
Monday
```

**Search**

```text
Monday was found.
```

**Modify**

The value at index `5` is changed:

```java
universityDays[5] = "Friday";
```

Result:

```text
Day at index 5 after modification: Friday
```

The implementation explicitly uses the array for fixed university days and demonstrates indexing, searching, and modification.

---

# 2️⃣ Two-Dimensional Array

## 📚 Weekly Class Schedule

A two-dimensional array is used to represent the weekly class schedule.

```java
String[][] classSchedule = {
    {"Saturday", "Java Programming"},
    {"Sunday", "Software Testing"},
    {"Monday", "Data Structures"},
    {"Tuesday", "Database Systems"},
    {"Wednesday", "Web Development"},
    {"Thursday", "Computer Networks"}
};
```

Each row contains:

```text
Day + Course
```

### Example

```text
Saturday : Java Programming
Sunday : Software Testing
Monday : Data Structures
Tuesday : Database Systems
Wednesday : Web Development
Thursday : Computer Networks
```

### Access

```java
classSchedule[2][1]
```

Result:

```text
Course on Monday: Data Structures
```

### Search

The program searches for:

```text
Database Systems
```

Result:

```text
Database Systems was found on Tuesday
```

### Modify

The Thursday course is modified:

```java
classSchedule[5][1] = "Artificial Intelligence";
```

Result:

```text
Thursday course after modification: Artificial Intelligence
```

The 2D array is used to organize related schedule information by rows and columns.

---

# 3️⃣ List

## 📚 Available Courses

The project uses the `List` interface with an `ArrayList` implementation to store available courses.

```java
List<String> courses = new ArrayList<>();
```

Courses include:

```text
Java Programming
Software Testing
Data Structures
Database Systems
Web Development
Computer Networks
```

### Why List?

A `List` is appropriate because the courses are maintained in an ordered collection and need to be accessed, searched, and modified.

### Access

```java
courses.get(1)
```

Result:

```text
Software Testing
```

### Search

```java
courses.contains("Software Testing")
```

Result:

```text
Software Testing was found.
```

### Modify

```java
courses.set(5, "Artificial Intelligence");
```

Result:

```text
Course at index 5 after modification: Artificial Intelligence
```

The project uses the `List` interface and demonstrates adding, accessing, searching, and modifying course data.

---

# 4️⃣ ArrayList

## 👨‍🎓 Registered Students

An `ArrayList` is used to store registered students.

```java
ArrayList<String> students = new ArrayList<>();
```

Initial students:

```text
Mahmoud
Mohamed
Ahmed
Ali
Khaleed
```

### Why ArrayList?

The number of registered students can change over time.

`ArrayList` provides convenient operations for:

* Adding students
* Accessing students by index
* Searching for students
* Modifying students
* Maintaining insertion order

### Access

```java
students.get(2)
```

Result:

```text
Student at index 2: Ahmed
```

### Search

```java
students.contains("Ahmed")
```

Result:

```text
Ahmed was found in the registered students.
```

### Modify

```java
students.set(4, "Nader");
```

Result:

```text
Student at index 4 after modification: Nader
```

The implementation uses `ArrayList<String>` for the registered students and demonstrates all of these operations.

---

# 5️⃣ LinkedList

## ⏳ Student Waiting List

A `LinkedList` is used to manage students waiting for registration or processing.

```java
LinkedList<String> waitingList = new LinkedList<>();
```

Initial waiting list:

```text
Fady
Amr
Hassan
Hashim
```

### Why LinkedList?

A waiting list may require students to join or leave the list while maintaining their order.

### Access

The first student is accessed using:

```java
waitingList.getFirst()
```

Result:

```text
First student in waiting list: Fady
```

### Search

```java
waitingList.contains("Hassan")
```

Result:

```text
Hassan was found in the waiting list.
```

### Modify

The student at index `2` is changed:

```java
waitingList.set(2, "Karim");
```

Result:

```text
Student at index 2 after modification: Karim
```

The project specifically uses `LinkedList` for the waiting list and demonstrates display, access, search, and modification.

---

# 6️⃣ Set

## 🏢 University Departments

A `Set` is used to store university departments.

```java
Set<String> departments = new HashSet<>();
```

Departments include:

```text
Software Engineering
Computer Science
Information Systems
Information Technology
```

The program also attempts to add:

```text
Computer Science
```

again.

Because a `Set` does not allow duplicate values, the duplicate department is not stored.

### Why Set?

A department should appear only once.

### Search

```java
departments.contains("Computer Science")
```

Result:

```text
Computer Science was found.
```

### Modify

The program removes:

```text
Information Systems
```

and adds:

```text
Artificial Intelligence
```

The implementation uses the `Set` interface with `HashSet` to maintain unique departments.

---

# 7️⃣ HashSet

## 🆔 Student IDs

A `HashSet<Integer>` is used to store unique student IDs.

```java
HashSet<Integer> studentIds = new HashSet<>();
```

Initial IDs:

```text
1001
1002
1003
1004
```

The program also attempts to add:

```text
1001
```

again.

The duplicate ID is automatically ignored by the `HashSet`.

### Why HashSet?

Student IDs must be unique.

`HashSet` also provides convenient membership checking using:

```java
contains()
```

### Search

```java
studentIds.contains(1003)
```

Result:

```text
Student ID 1003 was found.
```

### Modify

The program removes:

```text
1004
```

and adds:

```text
1005
```

The implementation uses `HashSet<Integer>` specifically for unique student IDs.

---

# 8️⃣ HashMap

## 👤 Student Information

A `HashMap<Integer, String>` is used to associate each student ID with a student name.

```java
HashMap<Integer, String> studentMap = new HashMap<>();
```

### Structure

```text
Student ID → Student Name
```

Example:

```text
1001 → Mahmoud
1002 → Mohamed
1003 → Ahmed
1004 → Ali
```

### Why HashMap?

The student ID can be used as a key to quickly access the corresponding student's name.

### Access

```java
studentMap.get(1002)
```

Result:

```text
Student with ID 1002: Mohamed
```

### Search

```java
studentMap.containsKey(1003)
```

Result:

```text
Student ID 1003 was found.
```

### Modify

The student associated with ID `1004` is changed:

```java
studentMap.put(1004, "Nader");
```

Result:

```text
Before modification: Ali
After modification: Nader
```

The implementation uses the student ID as the key and the student's name as the value.

---

# 📊 Collection Comparison

| Structure  | Ordered | Duplicates  | Index Access | Key-Value | Main Usage            |
| ---------- | ------- | ----------- | ------------ | --------- | --------------------- |
| Array      | ✅       | ✅           | ✅            | ❌         | Fixed university days |
| 2D Array   | ✅       | ✅           | ✅            | ❌         | Class schedule        |
| List       | ✅       | ✅           | ✅            | ❌         | Available courses     |
| ArrayList  | ✅       | ✅           | ✅            | ❌         | Registered students   |
| LinkedList | ✅       | ✅           | Limited      | ❌         | Waiting list          |
| Set        | ❌       | ❌           | ❌            | ❌         | Departments           |
| HashSet    | ❌       | ❌           | ❌            | ❌         | Student IDs           |
| HashMap    | By key  | Keys unique | ❌            | ✅         | Student information   |

---

# 🧪 Complete Demonstration

The application demonstrates the following operations across the different structures:

```text
┌──────────────────────────┐
│       University Data    │
└────────────┬─────────────┘
             │
      ┌──────┴──────┐
      │             │
    Store         Manage
      │             │
      ▼             ▼
  Different     Display
  Structures      Access
                  Search
                  Modify
```

---

# 🖥️ Program Output

The project was successfully compiled and executed using **Apache NetBeans and Maven**.

```text
==============================================
       UNIVERSITY REGISTRATION SYSTEM
==============================================

--- University Days ---
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday

--- Access Day ---
Day at index 2: Monday

--- Search Day ---
Monday was found.

--- Modify Day ---
Day at index 5 after modification: Friday

--- Weekly Class Schedule ---
Saturday : Java Programming
Sunday : Software Testing
Monday : Data Structures
Tuesday : Database Systems
Wednesday : Web Development
Thursday : Computer Networks

--- Access Schedule ---
Course on Monday: Data Structures

--- Search Course ---
Database Systems was found on Tuesday

--- Modify Schedule ---
Thursday course after modification: Artificial Intelligence

--- Available Courses ---
Java Programming
Software Testing
Data Structures
Database Systems
Web Development
Computer Networks

--- Access Course ---
Course at index 1: Software Testing

--- Search Course ---
Software Testing was found.

--- Modify Course ---
Course at index 5 after modification: Artificial Intelligence

--- Registered Students ---
Mahmoud
Mohamed
Ahmed
Ali
Khaleed

--- Access Student ---
Student at index 2: Ahmed

--- Search Student ---
Ahmed was found in the registered students.

--- Modify Student ---
Student at index 4 after modification: Nader

--- Waiting List ---
Fady
Amr
Hassan
Hashim

--- Access Waiting Student ---
First student in waiting list: Fady

--- Search Waiting Student ---
Hassan was found in the waiting list.

--- Modify Waiting Student ---
Student at index 2 after modification: Karim

--- University Departments ---
Software Engineering
Computer Science
Information Systems
Information Technology

--- Search Department ---
Computer Science was found.

--- Modify Department ---
Departments after modification:
Software Engineering
Artificial Intelligence
Computer Science
Information Technology

--- Student IDs ---
1001
1002
1003
1004

--- Search Student ID ---
Student ID 1003 was found.

--- Modify Student ID ---
Student IDs after modification:
1001
1002
1003
1005

--- Student Information ---
Student ID: 1001 | Name: Mahmoud
Student ID: 1002 | Name: Mohamed
Student ID: 1003 | Name: Ahmed
Student ID: 1004 | Name: Ali

--- Access Student ---
Student with ID 1002: Mohamed

--- Search Student ---
Student ID 1003 was found.

--- Modify Student ---
Before modification: Ali
After modification: Nader

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time: 1.538 s
```

The output demonstrates the complete execution of the collection examples, including access, searching, modification, and display operations.

---

# 📁 Project Structure

```text
UniversityRegistrationSystem/
│
├── pom.xml
│
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── universityregistrationsystem/
                        │
                        └── UniversityRegistrationSystem.java
```

---

# 💻 Technologies Used

| Technology                     | Purpose                      |
| ------------------------------ | ---------------------------- |
| **Java**                       | Application development      |
| **Java Collections Framework** | Data management              |
| **Array**                      | Fixed-size data              |
| **ArrayList**                  | Dynamic ordered collection   |
| **LinkedList**                 | Waiting-list management      |
| **HashSet**                    | Unique values                |
| **HashMap**                    | Key-value mapping            |
| **Maven**                      | Project build and management |
| **Apache NetBeans**            | Development environment      |

The source imports and uses the required Java collection types: `ArrayList`, `HashMap`, `HashSet`, `LinkedList`, `List`, and `Set`.

---

# ▶️ How to Run

## Prerequisites

Make sure you have:

* Java JDK installed
* Apache Maven installed
* Apache NetBeans, IntelliJ IDEA, or Eclipse

---

## Run with Maven

Navigate to the project directory:

```bash
cd UniversityRegistrationSystem
```

Compile the project:

```bash
mvn clean compile
```

Run the application:

```bash
mvn exec:java
```

You can also run the main class directly from your IDE:

```text
UniversityRegistrationSystem.java
```

---

# ✅ Assignment Requirements

| Requirement                 | Status |
| --------------------------- | ------ |
| One-dimensional Array       | ✅      |
| Two-dimensional Array       | ✅      |
| List                        | ✅      |
| ArrayList                   | ✅      |
| LinkedList                  | ✅      |
| Set                         | ✅      |
| HashSet                     | ✅      |
| HashMap                     | ✅      |
| Store data                  | ✅      |
| Access data                 | ✅      |
| Search data                 | ✅      |
| Modify data                 | ✅      |
| Display data                | ✅      |
| Explain structure selection | ✅      |
| Maven Project               | ✅      |
| Successful execution        | ✅      |

---

# 🎓 Learning Outcomes

This project demonstrates practical understanding of the **Java Collections Framework** and basic data-structure selection.

By completing this project, the following concepts are demonstrated:

* One-dimensional arrays
* Two-dimensional arrays
* Java `List`
* `ArrayList`
* `LinkedList`
* `Set`
* `HashSet`
* `HashMap`
* Index-based access
* Key-based access
* Searching with `contains()`
* Searching with `containsKey()`
* Adding elements
* Removing elements
* Modifying elements
* Handling duplicate values
* Key-value relationships
* Choosing a data structure based on requirements

---

# 💡 Key Takeaway

Different data structures are appropriate for different problems.

```text
Fixed Number of Values
        ↓
      Array


Rows & Columns
        ↓
    2D Array


Ordered Collection
        ↓
       List


Dynamic Indexed Data
        ↓
    ArrayList


Waiting / Sequential List
        ↓
    LinkedList


Unique Values
        ↓
       Set


Unique IDs
        ↓
     HashSet


Key → Value Relationship
        ↓
     HashMap
```

The project demonstrates that selecting the appropriate data structure depends on the required operations, uniqueness requirements, ordering, and way the data needs to be accessed.

---

# 🚀 Future Improvements

Possible improvements for a larger version of the system include:

* Add student registration and course enrollment.
* Connect students with specific courses.
* Add course capacity management.
* Add student grades.
* Add department-course relationships.
* Add student search by multiple attributes.
* Add persistent storage using a database.
* Add a graphical user interface.
* Add unit testing.
* Separate each functionality into dedicated classes.

---

# 👨‍💻 Author

**Mahmoud Bakri**

**Java | Software Testing & Quality Assurance | Object-Oriented Programming**

---

## 📄 License

This project was created for **educational purposes** as part of a Java Collections assignment.
