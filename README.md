# Library Management System

A comprehensive Java-based library management application that supports both physical and digital book management with advanced search and borrowing features.

## 📚 Overview

The Library Management System provides a robust platform for managing library resources, supporting both traditional physical books and digital content. The application follows object-oriented principles with inheritance, interfaces, and polymorphism to create a flexible and maintainable codebase.

## ✨ Key Features

- **Dual Library Modes**: Supports both standard and digital library management
- **Book Management**: Add, remove, search, and borrow books
- **Digital Content**: Download electronic books
- **Search Functionality**: Find books by title, author, or ISBN
- **Availability Tracking**: Monitor which books are available for borrowing
- **User-friendly Interface**: Simple command-line prompts guide users through all operations

## 🏗️ Architecture

The application is built on a modular architecture with several key components:

### Class Structure

- **`Actions` Interface**: Defines the core operations for any library implementation
- **`Library` Class**: Implements the standard library functionality
- **`DigitalLibrary` Class**: Extends the base library with digital-specific features
- **`Book` Class**: Represents a library resource with metadata and availability
- **`LibraryPojo` Class**: Manages the data storage for all book resources
- **`Main` Class**: Entry point for the application

### Inheritance Hierarchy

```
             Actions (Interface)
                   │
                   ▼
               Library
                   │
                   ▼
           DigitalLibrary
```

## 📋 Functionality Details

### Standard Library Features

- **Add Books**: Register new books with title, author, ISBN, and format details
- **Remove Books**: Remove books by title or ISBN
- **Search Books**: Find books by title or author
- **Borrow Books**: Check out available books
- **List Books**: View all books in the collection

### Digital Library Extensions

- **Download Books**: Download digital books by title or ISBN
- **Digital-Only Listing**: Filter and display only digital resources

## 🚀 Installation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command-line interface

### Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/library-management.git
   cd library-management
   ```

2. Compile the Java files:
   ```bash
   javac Main.java Library.java DigitalLibrary.java Book.java LibraryPojo.java Actions.java
   ```

## 💻 Usage

1. Run the application:
   ```bash
   java Main
   ```

2. Follow the interactive prompts to:
   - Choose between standard or digital library mode
   - Select operations (add, remove, search, borrow, list, download)
   - Enter book details as prompted

### Main Menu Options

#### Standard Library Mode
```
------------------------------
Welcome to the Library
Would u like to Digital Library Mode(Y/n)
Available options are listed below
1.Add   2.Remove  3.Search  4.Borrow 5.List Books 6.Exit
```

#### Digital Library Mode
```
1.Add   2.Remove  3.Search  4.Borrow 5.List Books 6.Download 7.Exit(D-Library)
```

## 📊 Data Model

### Book Properties

- **Title**: Name of the book
- **Author**: Book's author
- **ISBN**: Unique International Standard Book Number
- **Availability**: Current borrowing status
- **Format**: Physical or digital

## 🧩 Code Structure

```
library-management/
├── Actions.java         # Interface defining library operations
├── Book.java            # Book entity with properties and methods
├── DigitalLibrary.java  # Digital library implementation
├── Library.java         # Standard library implementation
├── LibraryPojo.java     # Data management class
├── Main.java            # Application entry point
└── README.md            # Project documentation
```

## 🔍 Key Methods

| Class           | Method           | Description                                    |
|-----------------|------------------|------------------------------------------------|
| Library         | add()            | Add new books to the collection                |
| Library         | remove()         | Remove books by title or ISBN                  |
| Library         | search()         | Find books by title or author                  |
| Library         | borrow()         | Check out available books                      |
| Library         | listBooks()      | Display all available books                    |
| DigitalLibrary  | downloadBooks()  | Download digital format books                  |
| DigitalLibrary  | listBooks()      | Display digital books (overrides base method)  |

## 🛠️ Technical Implementation

### Notable Features

- **Polymorphism**: Library operations behave differently based on implementation
- **Encapsulation**: Book properties are private with accessor methods
- **Inheritance**: DigitalLibrary extends base Library functionality
- **Interface-based design**: Actions interface ensures consistent API
- **Data Management**: Centralized data storage through LibraryPojo

## 🔄 Process Flow

1. User starts the application and chooses library mode
2. User selects an operation from the menu
3. Application prompts for necessary information
4. Operation is performed on the book collection
5. Results are displayed to the user
6. User returns to the main menu for additional operations
