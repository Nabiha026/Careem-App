# Careem-like Ride-Sharing App

This project is a mobile application inspired by Careem, built using Android Studio and Kotlin. The application includes user registration, OTP verification, and secure login functionality. The app is designed to simulate a ride-hailing service with a smooth navigation flow from splash screen to user verification.

## Features

### 1. Splash Screen
- The app starts with a splash screen that displays the app's logo.
- Automatically transitions to the welcome screen after a brief delay.

### 2. Welcome Screen
- The welcome screen provides two options:
  - **Continue with Phone Number**: Allows the user to sign in with a phone number.
  - **Continue Other Way**: Placeholder for other login methods (e.g., Google or Facebook).

### 3. Phone Number Verification
- When the user selects "Continue with Phone Number," they are navigated to a screen to enter their phone number.
- After entering the phone number, the app sends an OTP (One-Time Password) to the user's phone.

### 4. OTP Verification
- The user is prompted to enter the OTP received on their phone.
- On successful verification, the user is navigated to the secure login screen.

### 5. Secure Login Screen
- The app prompts the user to enable secure login using biometrics (e.g., fingerprint) for added security and faster access.

### 6. User-Friendly Navigation
- The app features smooth transitions between screens with back buttons and navigation logic to maintain user experience.
  
### 7. Custom UI Components
- The app includes custom buttons, text fields, and icons to enhance the visual appeal and usability.
- Components are styled using a combination of XML drawable files and Kotlin code to ensure a modern design aesthetic.

## Technology Stack

- **Android Studio**: Integrated Development Environment (IDE) used for app development.
- **Kotlin**: Programming language used for app logic and UI interaction.
- **XML**: Used for designing the app's UI elements such as buttons, text views, and layouts.
- **Firebase (optional)**: For phone number authentication and OTP verification.
  
## Screens and Navigation Flow

1. **Splash Screen**: Displays the app logo and automatically navigates to the welcome screen.
2. **Welcome Screen**: Allows the user to choose between login methods.
3. **Phone Number Screen**: Accepts the user's phone number and sends an OTP.
4. **OTP Screen**: Allows the user to enter the OTP and verify their phone number.
5. **Secure Login Screen**: Prompts the user to enable biometric authentication.

## Getting Started

### Prerequisites

- **Android Studio**: Ensure you have Android Studio installed. Download it from [here](https://developer.android.com/studio).
- **Kotlin**: Android Studio comes with built-in Kotlin support, so no additional setup is required.
- **Firebase (optional)**: If you are using Firebase for OTP verification, set up a Firebase project and enable phone authentication.

### Running the Project

1. **Clone the repository**:

   ```bash
   https://github.com/Nabiha026/Careem-App.git

