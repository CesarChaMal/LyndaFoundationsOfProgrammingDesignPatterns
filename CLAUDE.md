# CLAUDE.md - AI Assistant Guide

## Repository Overview

This repository contains Java implementations of classic Gang of Four (GoF) design patterns from the Lynda/LinkedIn Learning course "Foundations of Programming: Design Patterns" taught by Elisabeth Robson and Eric Freeman.

**Purpose**: Educational reference implementations demonstrating proper usage of fundamental object-oriented design patterns.

**Language**: Java (no specific version specified, uses standard Java features)

**Build System**: None - standalone Java files meant for direct compilation and execution

## Repository Structure

```
LyndaFoundationsOfProgrammingDesignPatterns/
├── README.md                           # Course information and content overview
├── .gitignore                          # Standard Java/IDE exclusions
├── AdapterPattern/
│   ├── Adapter Design Pattern.JPG     # Visual diagram of pattern
│   └── src/                            # Pattern implementation
│       ├── AdapterPatternDemo.java    # Demo/entry point
│       ├── Duck.java                   # Target interface
│       ├── MallardDuck.java           # Concrete implementation
│       ├── Drone.java                  # Adaptee interface
│       ├── SuperDrone.java            # Adaptee implementation
│       └── DroneAdapter.java          # Adapter class
├── DecoratorPattern/
│   ├── Decorator Design Pattern.JPG
│   └── src/
│       ├── DecoratorPatternDemo.java
│       ├── Pizza.java                  # Component base
│       ├── ThinCrustPizza.java        # Concrete component
│       ├── ThickCrustPizza.java       # Concrete component
│       ├── Toppings.java              # Decorator base
│       ├── Cheese.java                # Concrete decorator
│       ├── Olives.java                # Concrete decorator
│       └── Peppers.java               # Concrete decorator
├── FactoryPattern/
│   ├── Factory Design Pattern.JPG
│   └── src/
│       ├── FactoryPatternDemo.java
│       ├── ZoneFactory.java           # Factory class (static factory method)
│       ├── Zone.java                   # Product interface
│       ├── ZoneType.java              # Enum for factory selection
│       ├── ZoneUS*.java               # Concrete products (4 time zones)
│       └── Calendar.java / PacificCalendar.java
├── IteratorPattern/
│   ├── Iterator Design Pattern.JPG
│   └── src/
│       ├── IteratorPatternDemo.java
│       ├── Iterator.java              # Custom iterator interface
│       ├── Menu.java                   # Aggregate interface
│       ├── DinerMenu.java             # Concrete aggregate (array-based)
│       ├── DinerCodeMenu.java         # Concrete aggregate (List-based)
│       ├── DinerMenuIterator.java     # Iterator for array
│       └── DinerCodeMenuIterator.java # Iterator for List
├── ObserverPattern/
│   ├── Observer Design Pattern.JPG
│   └── src/
│       ├── ObserverPatternDemo.java
│       ├── Subject.java                # Observable base class
│       ├── Observer.java               # Observer interface
│       ├── WeatherStation.java        # Concrete subject
│       ├── UserInterface.java         # Concrete observer
│       └── LoggerInterface.java       # Concrete observer
└── StrategyPattern/
    ├── Strategy Design Pattern.JPG
    └── src/
        ├── StrategyPatternDemo.java
        ├── PhoneCameraApp.java        # Context (abstract base)
        ├── BasicCameraApp.java        # Concrete context
        ├── CameraPlusApp.java         # Concrete context
        ├── ShareStrategy.java         # Strategy interface
        ├── ShareByEmail.java          # Concrete strategy
        ├── ShareByText.java           # Concrete strategy
        └── ShareBySocial.java         # Concrete strategy
```

## Design Pattern Implementations

### 1. Strategy Pattern
**Location**: `StrategyPattern/src/`

**Purpose**: Encapsulates interchangeable algorithms (sharing strategies) and makes them available at runtime.

**Key Classes**:
- `PhoneCameraApp` - Abstract context with composition-based strategy
- `ShareStrategy` - Strategy interface
- Demo shows runtime strategy switching via `setShareStrategy()`

**Pattern**: Composition over inheritance for behavior variation

### 2. Observer Pattern
**Location**: `ObserverPattern/src/`

**Purpose**: One-to-many dependency where subjects notify observers of state changes.

**Key Classes**:
- `Subject` - Maintains observer list, implements add/remove/notify
- `Observer` - Interface with `update(Subject)` method
- `WeatherStation` - Concrete subject with weather data
- Uses Java 8 lambda in `notifyObservers()`: `observerList.forEach(observer -> observer.update(subject))`

**Pattern**: Push model (subject passed to update method)

### 3. Decorator Pattern
**Location**: `DecoratorPattern/src/`

**Purpose**: Dynamically adds responsibilities to objects without inheritance.

**Key Classes**:
- `Pizza` - Component interface (abstract class)
- `ThinCrustPizza`/`ThickCrustPizza` - Concrete components
- `Toppings` - Decorator base (extends Pizza, wraps Pizza)
- `Cheese`/`Olives`/`Peppers` - Concrete decorators

**Pattern**: Wrapper objects that delegate to wrapped component while adding behavior

### 4. Adapter Pattern
**Location**: `AdapterPattern/src/`

**Purpose**: Converts interface of a class into another interface clients expect.

**Key Classes**:
- `Duck` - Target interface (what client expects)
- `Drone` - Adaptee interface (what we have)
- `DroneAdapter` - Adapter (implements Duck, wraps Drone)
- Maps `quack()` → `beep()`, `fly()` → `spinRotors()` + `takeOff()`

**Pattern**: Object adapter (composition-based)

### 5. Factory Pattern
**Location**: `FactoryPattern/src/`

**Purpose**: Encapsulates object creation logic.

**Key Classes**:
- `ZoneFactory` - Static factory method pattern
- `ZoneType` - Enum for selecting product type
- `Zone` - Product interface
- Uses switch statement on enum to create appropriate Zone implementation

**Pattern**: Simple factory (static factory method), not full Factory Method pattern

### 6. Iterator Pattern
**Location**: `IteratorPattern/src/`

**Purpose**: Provides sequential access to aggregate elements without exposing internal structure.

**Key Classes**:
- Custom `Iterator<E>` interface (not using java.util.Iterator)
- `Menu` - Aggregate interface
- `DinerMenu` - Uses array internally
- `DinerCodeMenu` - Uses ArrayList internally
- Separate iterator implementations for each aggregate type

**Pattern**: External iterator with custom interface

## Code Conventions

### Naming Conventions
- **Pattern files**: `<Pattern>PatternDemo.java` for entry points
- **Interfaces**: Clear role names (Observer, Iterator, Strategy)
- **Concrete classes**: Descriptive names indicating specific implementation
- **Methods**: camelCase, descriptive (e.g., `addObserver`, `setShareStrategy`)

### Code Style
- **No package declarations** - All classes in default package
- **Minimal imports** - Only java.util classes when needed
- **Simple structure** - Educational clarity over production complexity
- **Comments**: Section separators in some classes (e.g., `/*------------- Common behaviours --------------*/`)
- **Access modifiers**: Appropriate use of public/private/protected
- **Abstract classes vs Interfaces**:
  - Abstract classes when base implementation needed (Pizza, PhoneCameraApp)
  - Interfaces for pure contracts (Observer, Iterator, Strategy)

### Design Principles Applied
1. **Open/Closed Principle** - Open for extension via inheritance/composition
2. **Dependency Inversion** - Depend on abstractions (interfaces/abstract classes)
3. **Favor composition over inheritance** - Strategy and Decorator patterns demonstrate this
4. **Program to an interface** - All patterns use polymorphism
5. **Encapsulate what varies** - Strategies, decorators, concrete products

## Development Workflow

### Running Examples

Each pattern has a `*PatternDemo.java` class with a `main()` method:

```bash
# Navigate to pattern directory
cd StrategyPattern/src

# Compile all Java files
javac *.java

# Run demo
java StrategyPatternDemo

# Clean up
rm *.class
```

### Adding New Pattern Implementations

1. Create new directory: `<Pattern>Pattern/`
2. Add `src/` subdirectory
3. Create demo class: `<Pattern>PatternDemo.java` with main method
4. Implement pattern structure following existing conventions
5. Optionally add diagram image at pattern root

### Modifying Existing Patterns

1. **Read demo class first** - Understand usage example
2. **Identify interfaces/abstractions** - These define the contract
3. **Modify concrete implementations** - Keep interface contracts intact
4. **Update demo** if showing new functionality
5. **Test manually** - Compile and run demo to verify

## Working with This Codebase as an AI Assistant

### Key Guidelines

1. **Maintain Educational Clarity**
   - Keep code simple and readable
   - Prioritize demonstrating pattern concepts over production features
   - Don't add unnecessary complexity (logging frameworks, error handling, etc.)
   - Preserve the teaching-focused nature of implementations

2. **Preserve Pattern Integrity**
   - Each pattern demonstrates specific GoF design pattern
   - Don't mix patterns unless explicitly requested
   - Maintain clear separation of roles (Subject/Observer, Component/Decorator, etc.)
   - Keep pattern structure recognizable to students

3. **No Build System Dependencies**
   - Don't add Maven/Gradle unless explicitly requested
   - Keep compilable via simple `javac *.java`
   - No external dependencies beyond Java standard library
   - All code in default package

4. **File Organization**
   - All pattern code in `<Pattern>/src/` directory
   - One public class per file
   - Demo class shows typical usage scenario
   - Keep related pattern components together

5. **Code Modifications**
   - When adding functionality, follow existing style
   - Use abstract classes when base implementation needed
   - Use interfaces for pure behavioral contracts
   - Demonstrate runtime polymorphism in demos

6. **Testing Approach**
   - Demo classes serve as "tests" showing pattern usage
   - Manual verification via compilation and execution
   - Output to console demonstrating pattern behavior
   - No formal unit testing framework needed

### Common Tasks

#### Adding a New Concrete Implementation
Example: Adding a new sharing strategy

```java
// 1. Implement the interface
public class ShareByMessenger implements ShareStrategy {
    @Override
    public void share() {
        System.out.println("Sharing via Messenger");
    }
}

// 2. Update demo to show usage
cameraApp.setShareStrategy(new ShareByMessenger());
cameraApp.share();
```

#### Extending an Existing Pattern
Example: Adding observer to weather station

```java
// 1. Create new observer implementation
public class AlertSystem implements Observer {
    @Override
    public void update(Subject subject) {
        // Implementation
    }
}

// 2. Register in demo
Observer alertSystem = new AlertSystem();
weatherStation.addObserver(alertSystem);
```

#### Explaining Pattern Usage
When asked to explain a pattern:
1. Reference the demo class showing usage
2. Identify key abstractions (interfaces/abstract classes)
3. Show concrete implementations
4. Explain relationships and runtime behavior
5. Reference the JPG diagram if discussing structure

### Anti-Patterns to Avoid

1. **Don't add packages** - Keep default package for simplicity
2. **Don't add frameworks** - No Spring, no testing frameworks, etc.
3. **Don't over-engineer** - This is educational code, not production
4. **Don't break existing demos** - Demos should always compile and run
5. **Don't add IDEs/build files** - Keep IDE-agnostic (already in .gitignore)
6. **Don't add error handling** unless demonstrating a pattern concept
7. **Don't use advanced Java features** - Keep compatible with basic Java

### When to Suggest Improvements

**DO suggest**:
- Better demonstration of pattern benefits
- Additional concrete implementations showing pattern flexibility
- Clearer variable/class names
- More illustrative console output
- Bug fixes in pattern implementation

**DON'T suggest**:
- Production-grade error handling
- Logging frameworks
- Database integration
- Web frameworks
- Complex build systems
- Advanced language features that obscure pattern

## Git Workflow

### Branch Structure
- **Main branch**: Stable pattern implementations
- **Feature branches**: Use `claude/` prefix for AI-generated changes
- Current working branch: `claude/claude-md-mhy258ztbczty8ht-01F74QchJYDFUyRFVHMN9ccY`

### Commit Guidelines
- Clear, descriptive messages
- Reference pattern name in commits
- Example: "Add ShareByMessenger strategy to Strategy Pattern"
- Group related changes (all files for one pattern feature)

### Push Protocol
```bash
# Always use -u flag for new branches
git push -u origin <branch-name>

# Branch must start with 'claude/' and match session ID
# Retry on network errors with exponential backoff (2s, 4s, 8s, 16s)
```

## Reference Materials

### Course Information
- **Provider**: Lynda (LinkedIn Learning)
- **Course**: Foundations of Programming: Design Patterns
- **Instructors**: Elisabeth Robson, Eric Freeman
- **Course URL**: http://www.lynda.com/Developer-Programming-Foundations-tutorials/Foundations-Programming-Design-Patterns/135365-2.html

### External Resources
- Gang of Four "Design Patterns" book
- Head First Design Patterns (by the same instructors)
- Each pattern directory contains JPG diagram for visual reference

## Quick Reference

### Pattern Classification

| Pattern | Type | Key Intent |
|---------|------|------------|
| Strategy | Behavioral | Encapsulate interchangeable algorithms |
| Observer | Behavioral | One-to-many change notification |
| Iterator | Behavioral | Sequential access without exposing structure |
| Decorator | Structural | Add responsibilities dynamically |
| Adapter | Structural | Convert incompatible interfaces |
| Factory | Creational | Encapsulate object creation |

### Key Files by Pattern

| Pattern | Demo Entry Point | Core Abstraction | Example Concrete |
|---------|-----------------|------------------|------------------|
| Strategy | StrategyPatternDemo.java | ShareStrategy | ShareByEmail |
| Observer | ObserverPatternDemo.java | Observer | UserInterface |
| Decorator | DecoratorPatternDemo.java | Pizza/Toppings | Cheese |
| Adapter | AdapterPatternDemo.java | Duck | DroneAdapter |
| Factory | FactoryPatternDemo.java | Zone | ZoneUSPacific |
| Iterator | IteratorPatternDemo.java | Iterator | DinerMenuIterator |

## Troubleshooting

### Compilation Issues
- Ensure all .java files in pattern's src/ directory are compiled together
- Check for *.class files in working directory (should be gitignored)
- Verify no package declarations were accidentally added

### Runtime Issues
- Run from the src/ directory containing compiled .class files
- Use class name without .java extension: `java StrategyPatternDemo`
- Check for proper main() method signature

### Pattern Understanding
1. Read the Demo class first to see usage
2. Identify the main abstraction (interface/abstract class)
3. Find concrete implementations
4. Trace execution flow from main()
5. Refer to JPG diagram for structure

---

**Last Updated**: 2025-11-13
**Repository**: LyndaFoundationsOfProgrammingDesignPatterns
**For**: AI assistants working with this educational design patterns codebase
