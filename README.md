# Project Title

## Introduction
Brief overview of the project, its objectives, and its significance.

## Technologies Used
This project leverages several key technologies:
- **Java**: Used as the primary programming language.
- **Spring JPA**: Utilized for efficient data persistence and management.
- **Lombok**: Simplifies code by reducing boilerplate, such as getters, setters, and constructors.
- **Maven**: Manages project dependencies and streamlines build processes.

## Strategies for Enhanced Robustness and Maintainability
Our approach to ensuring a robust and maintainable codebase includes:

### Type Safety with Enums
- Implemented enums to enforce strict type safety, enhancing code robustness. Example: `ENUM RANK`.

### Self-Testing Code
- Conducted rigorous tests to identify and fix potential breaks, ensuring code robustness.

### Encapsulation
- Used appropriate access modifiers to secure and organize code better. Example: `updatePlayersAsWinLoseOrTie`.

### Modularity
- Broke down the code into smaller, manageable problems for improved readability and maintainability. Examples: `startRound`, `validateEmail`.

### DRY Principle
- Employed helper methods with private access to minimize code repetition. Example: `decideAndSetWinners`.

### Single Responsibility Principle
- Organized the game into distinct phases (Engine, AuthPlayer, PreGame, PlayerInput, Actions, GameLogic, PostGame) to adhere to the single responsibility principle.

## Enhancements and Features
- **User Interface**: Developed a fun and engaging UI.
- **Algorithm**: Created bespoke algorithms for both the bot and the dealer.
- **Logging**: Opted for comprehensive logging over file storage for efficiency.
  
## Additional Notes
- **SQL Queries**: Ensure to run the specified SQL queries as part of the initial setup.
- **Documentation**: Refer to `README.md` for comprehensive documentation on system setup and usage.

## Challenges and Solutions
### Circular Dependency
- Fixed a stack overflow issue due to mutual references between Player and Log.

### Persistence Issues
- Resolved using `entityManager.merge()` for transactional and JPA persist issues.

### Win Lose Issues
- Utilized numeric values (-2, -1, 0, 1, 2) to represent win/lose/tie states instead of booleans.

### UI Enhancement
- Improved user experience by printing cards in the same line.

### Dependency Injection
- Fixed `Engine` autowiring issues by implementing it as lazy to resolve circular dependencies.

### Code Restructuring
- Adapted the system to accommodate a separate dealer entity following a major structural change.

