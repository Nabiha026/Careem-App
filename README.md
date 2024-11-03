# Careem App Clone

This is a Careem-like application developed using Kotlin and Jetpack Compose (or XML layouts, depending on the screens provided) in Android Studio. This app offers a ride-hailing experience with screens for onboarding, phone verification, and a services dashboard. The app structure includes a splash screen, onboarding screens, and a main screen with various services.

## Features

- **Splash Screen**: A welcoming splash screen with the app's logo.
- **Main Activity (Welcome Screen)**: A screen with options to continue with Google or a phone number, displaying a warm welcome message.
- **Phone Verification Screen**: A screen to input a phone number and verify the user.
- **OTP Verification Screen**: Allows users to input an OTP code received via SMS.
- **Home/Dashboard Screen**: Displays various services and options available in the app.
- **Saved Addresses**: Shows the saved addresses of the user or allows them to add new addresses if none exist.
- **Notifications**: Displays notifications about promotions or offers.

## Screens

1. **Splash Screen**
   - Displays the app logo on a green background, centered for a welcoming experience.

2. **Main Activity (Welcome Screen)**
   - Shows a greeting message with buttons to:
     - **Continue with Google**
     - **Continue with Phone Number**
   - A message "Good to see you again!" appears above the options.

3. **Phone Verification Screen**
   - Contains a back arrow and help icon at the top.
   - Asks the user to enter their phone number with a continue button to proceed.

4. **OTP Verification Screen**
   - Prompts the user to enter the OTP code received.
   - Has a submit button to verify the OTP and proceed to the home screen.

5. **Home/Dashboard Screen**
   - Displays multiple services the user can navigate through, such as Rides, Delivery, Send Money, etc., with icons and labels for each service.

6. **Saved Addresses Screen**
   - Shows a message and an illustration if no addresses are saved.
   - Includes a button labeled "Add new address" to add an address.

7. **Notifications Screen**
   - Displays notifications regarding offers and discounts with details and dates.

## Getting Started

### Prerequisites

- **Android Studio**: The app is developed with Android Studio; make sure you have it installed.
- **Kotlin**: The app uses Kotlin as the programming language.
- **Jetpack Compose / XML Layouts**: Depending on the UI implementation, either Jetpack Compose or XML layouts are used for the interface.

### Installation

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/careemapp-clone.git
