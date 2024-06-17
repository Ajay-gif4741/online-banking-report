# Online Banking System Using Java Swing

## Overview

This project is an Online Banking System implemented using Java Swing. The system allows users to perform basic banking operations such as creating a new account, logging in, depositing, withdrawing, and transferring money between accounts. Additionally, users can view a list of all customer accounts present in the database.

## Features

1. **Login Page**: 
    - Users can log in to their accounts.
    - New users can create an account by entering basic details.

2. **Account Management**:
    - After logging in, users can edit their account details.
    - View the list of all customer accounts available in the database.

3. **Banking Operations**:
    - **Withdraw Money**: Users can withdraw money from their account.
    - **Deposit Money**: Users can deposit money into their account.
    - **Transfer Money**: Users can transfer money to other accounts in the database.

## Prerequisites

- Java Development Kit (JDK) installed on your system.
- Integrated Development Environment (IDE) such as NetBeans.
- Basic understanding of Java Swing and JDBC for database connectivity.
- SQLlite for the database.

## Installation

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/vishnuvvr-cloud/online-banking-system.git
    ```

2. **Open the Project in NetBeans**:
    - Open NetBeans.
    - Go to `File` -> `Open Project`.
    - Navigate to the cloned repository directory and select it.

3. **Resolve Dependencies**:
    - You may need to resolve some issues like adding external JAR files. Ensure the following JAR files are added to the project libraries:
        - `rs2xml.jar`
        - `sqlite-(version).jar`
        - `jcalendar.jar`
    - To add these JAR files:
        - Right-click on the project in NetBeans.
        - Select `Properties`.
        - Go to `Libraries` -> `Add JAR/Folder`.
        - Browse and add the required JAR files.

4. **Clean and Build the Project**:
    - After adding the necessary JAR files, right-click on the project.
    - Select `Clean and Build`.

5. **Run the Project**:
    - Right-click on the project.
    - Select `Run`.

## Usage
 [Note : You can't change your account number , MICR number , Username]
1. **Run the Application**
    
2. **Login/Create Account**:
    - On the login page, either enter your credentials to log in or click on the "Create New Account" button to create a new account.

3. **Perform Banking Operations**:
    - Once logged in, you can:
        - View and edit your account details.
        - Withdraw, deposit, or transfer money.
        - View the list of all customer accounts.

## Code Structure

- `src/`
  - `Authentication.java`: Handles the login and account creation.
  - `Account.java`: Here user can make new account creation.
  - `MyPage.java`: Main dashboard after logging in, where users can manage their accounts.
  - `dbconnect.java`: Handles database connectivity and operations.

## Contributing

1. Fork the repository.
2. Create your feature branch: `git checkout -b feature/feature-name`.
3. Commit your changes: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature/feature-name`.
5. Open a pull request.

## Contact Information
For support or questions, please contact [chintavishnuvardhan@gmail.com](mailto:chintavishnuvardhan@gmail.com).
