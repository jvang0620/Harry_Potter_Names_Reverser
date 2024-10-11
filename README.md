# Harry Potter Names Reverser Project

## Overview

This Java program is designed to reverse the names of students at Hogwarts School of Witchcraft and Wizardry, simulating how students are served at feasts in reverse order from their listing. Given an array of student names, the program returns an `ArrayList` containing the names in reversed order.

## Features

- **Reverse Method**: Accepts an array of strings (student names) and returns an `ArrayList` with the names in reverse order.
- **Error Handling**: Throws an exception if the input array is empty.
- **Testing in Main Method**: Includes a main method to test the functionality with a sample array of names.

## Requirements

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor to run Java code

## Usage

1. Clone or download the repository.
2. Compile the program using the following command:

   ```bash
   javac maq/harrypotter/HarryPotter.java
   ```

3. Run the program

   ```bash
   java maq.harrypotter.HarryPotter
   ```

## Code Explanation

### Classes and Methods

- **Class**: `HarryPotter`

  - Contains the main method and the `reverse` method.

- **Method**: `reverse(String[] wizards) throws Exception`
  - **Parameters**:
    - `wizards`: An array of student names to be reversed.
  - **Returns**: An `ArrayList<String>` containing the names in reversed order.
  - **Throws**: An exception if the input array is empty.

### Main Method

- Initializes a string array of names.
- Calls the `reverse` method and handles any potential exceptions.
- Prints the reversed list of names.

### Example

Given the input:

```java
String[] w = {"Harry Potter", "Ronald Bilius", "Hermione Jean Granger"};
```

The out will be:

```bash
[Hermione Jean Granger, Ronald Bilius, Harry Potter]
```

### Exception Handling

If the input array is empty, the program will catch the exception and print:

```bash
There was something wrong with the array input!
```

## License

This project is open-source and available under the [MIT License](LICENSE).
# Harry_Potter_Names_Reverser
