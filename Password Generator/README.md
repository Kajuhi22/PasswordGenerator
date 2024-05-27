**Challanges Faced** :

-Creating a code that works similar to the sorce code.

-importing the nessesory modules

-setting up required jdk

-Generating password and encrypting it.

-controlling loops



### Overview
This Java program generates a random password based on user-defined criteria and offers the option to encrypt the generated password using Base64 encoding. The program runs in a loop, allowing users to generate multiple passwords until they choose to exit.

### Main Components
1. **Imports**:
    - `java.util.Base64`: For encoding the password.
    - `java.util.Random`: For generating random numbers.
    - `java.util.Scanner`: For reading user input.

2. **Main Method**:
    - The main method contains the primary loop that allows users to generate and optionally encrypt passwords repeatedly.
    - It calls `generatePassword` to create a password based on user input.
    - It offers the option to encrypt the generated password using Base64 encoding.
    - It asks the user if they want to generate another password and breaks the loop if the user chooses not to.

3. **generatePassword Method**:
    - Prompts the user to enter the desired length of the password.
    - Presents options for the types of characters to include in the password (letters, digits, special characters).
    - Collects the chosen character sets and generates a password using the `generateRandomPassword` method.
    - Prints and returns the generated password.

4. **generateRandomPassword Method**:
    - Takes a string of characters and the desired length of the password.
    - Uses the `Random` class to select random characters from the provided character set.
    - Constructs and returns a password of the specified length.

### Detailed Description

#### Main Method
- **Initialization**:
    - Creates a `Scanner` object to read user input.
- **Loop**:
    - Continuously generates passwords until the user decides to stop.
    - Calls `generatePassword(scanner)` to create a password.
    - Encodes the password using Base64 if the user chooses to encrypt it.
    - Asks if the user wants to generate another password and exits the loop if the user declines.

#### generatePassword Method
- **Input**:
    - Prompts the user for the length of the password.
    - Displays options to include letters, digits, and special characters in the password.
- **Character Selection**:
    - Allows the user to pick character sets until they choose to exit.
    - Appends the selected character sets to a list.
- **Password Generation**:
    - Calls `generateRandomPassword(list.toString(), length)` to create a random password from the selected characters.
    - Prints and returns the generated password.

#### generateRandomPassword Method
- **Random Selection**:
    - Uses a `Random` object to generate random indices within the bounds of the provided character set.
    - Constructs a password by selecting characters at these random indices.
- **Output**:
    - Returns the constructed password as a string.

**Programmed By** `pranai`
