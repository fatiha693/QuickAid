# QuickAid

QuickAid is a comprehensive Java application designed to provide critical assistance during emergency situations. The application offers a range of features to help users quickly access essential services, medical information, and support resources.

## Features

### 1. User Authentication
- Secure user registration and login system
- User credentials stored locally
- Simple authentication mechanism

### 2. Emergency Services
- Direct access to emergency service calls
- Options for:
  - Ambulance
  - Police
  - Fire Service

### 3. Hospital Finder
- Locate nearby hospitals by area
- Predefined list of hospitals in different locations
- Easy area selection

### 4. Emergency Contacts Management
- Add and store up to 5 emergency contacts
- Quick access to important contact information

### 5. First Aid Guidelines
- Comprehensive first aid instructions
- Covers multiple emergency scenarios:
  - CPR
  - Burns
  - Choking
  - Fractures
  - Heart Attack
  - Poisoning

### 6. Medicine Reminders
- Create personalized medicine intake reminders
- View and manage your medication schedule

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Command-line interface or IDE that supports Java

## Installation

1. Clone the repository:
```bash
git clone https://github.com/fatiha693/QuickAid.git
```

2. Navigate to the project directory:
```bash
cd QuickAid
```

3. Compile the Java files:
```bash
javac *.java
```

4. Run the application:
```bash
java Main
```

## Usage

1. Register a new user or log in
2. Navigate through the menu options using numeric inputs
3. Select desired services like emergency calls, hospital finder, etc.

## File Structure

- `Main.java`: Central application logic and menu navigation
- `User.java`: User authentication and management
- `UserDatabase.java`: User data persistence
- `EmergencyService.java`: Emergency service calls
- `HospitalFinder.java`: Hospital location services
- `EmergencyContacts.java`: Contact management
- `FirstAidGuidelines.java`: Medical emergency guidelines
- `MedicineReminder.java`: Medication tracking

## Security Note

- User passwords are stored in plain text (recommend enhancing security in future versions)
- Local file storage for user credentials

## Contact

Email - fatiha@iut-dhaka.edu

Project Link: https://github.com/fatiha693/QuickAid.git
