# Low Level Design - Complete Learning Guide

A comprehensive Java project for mastering Low Level Design concepts, based on the structured curriculum from [codewitharyan.com](https://codewitharyan.com/system-design/low-level-design).

## 📚 Learning Curriculum

### 🚀 LLD Crash Course
Quick overview and fundamentals of Low Level Design

### 📖 Introduction to Low Level Design
- What is Low-level System Design
- How to Approach LLD Problems  
- LLD Interview Tips

### 🏗️ Object-Oriented Programming (OOPS)
Foundation concepts essential for LLD:
1. Introduction to Classes and Objects
2. Class Relationships - A Deep Dive
3. Constructor and its types
4. This Keyword in OOPS
5. Polymorphism and its Types
6. Inheritance and its types
7. Encapsulation
8. Abstraction
9. Generics and Wildcards
10. Access Modifiers

### 🎯 Design Principles
Core principles for clean, maintainable code:
- **SOLID Principles** - Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion
- **DRY Principle** - Don't Repeat Yourself
- **KISS Principle** - Keep It Simple, Stupid
- **YAGNI Principle** - You Aren't Gonna Need It

### 🎨 Design Patterns

#### Creational Design Patterns (6 topics)
Patterns for object creation:
- Factory Design Pattern
- Abstract Factory Pattern
- Builder Design Pattern
- Singleton Design Pattern
- Prototype Design Pattern

#### Structural Design Patterns (8 topics)
Patterns for object composition:
- Adapter Design Pattern
- Composite Design Pattern
- Facade Design Pattern
- Decorator Design Pattern
- Bridge Design Pattern
- Proxy Design Pattern
- Flyweight Design Pattern

#### Behavioral Design Patterns (11 topics)
Patterns for object interaction:
- Strategy Design Pattern
- Observer Design Pattern
- Iterator Design Pattern
- Command Design Pattern
- Mediator Design Pattern
- State Design Pattern
- Template Design Pattern
- Chain of Responsibility Pattern
- Visitor Design Pattern
- Memento Design Pattern

### 🧵 Concurrency in Java (9 topics)
Essential threading and concurrency concepts:
- Threads - Thread class and Runnable Interface
- Thread Pool and Thread Lifecycle
- Thread Executors
- Thread Synchronization
- Thread Communication
- Locks and Types of Locks
- Semaphore
- Java Concurrent Collections
- Future and CompletableFuture

### 🏢 LLD & Concurrency Interview Problems

#### LLD Problems (16 problems)
Real-world system design challenges:
- Design Tic Tac Toe Game
- Design Chess Game
- Design Snake and Ladders Game
- Design Parking Lot
- Design Elevator System
- Design Inventory Management System
- Design Car Rental System
- Design Vending Machine
- Design File System
- Design Logging System
- Design Splitwise
- Design ATM Machine
- Design Movie Ticket Booking System
- Design Cache
- Design Pub Sub Model like Kafka
- Design Rate Limiter

#### Concurrency Problems (5 problems)
Advanced threading challenges:
- Print Zero Even Odd
- Fizz Buzz Multithreaded
- Design Bounded Blocking Queue
- The Dining Philosophers
- Multithreaded Web Crawler

## 📁 Project Structure
```
design_patterns/
├── README.md                    # This learning guide
├── PROGRESS.md                  # Track your progress
├── Details.md                   # Original curriculum reference
├── build.sh                     # Build script
└── src/main/java/com/designpatterns/
    ├── Main.java               # Entry point
    ├── crashcourse/            # LLD crash course
    ├── introduction/           # LLD introduction
    │   ├── whatislld/
    │   ├── howtoapproach/
    │   └── interviewtips/
    ├── oops/                   # Object-oriented programming
    │   ├── classes/
    │   ├── relationships/
    │   ├── constructor/
    │   ├── thiskeyword/
    │   ├── polymorphism/
    │   ├── inheritance/
    │   ├── encapsulation/
    │   ├── abstraction/
    │   ├── generics/
    │   └── accessmodifiers/
    ├── principles/             # Design principles
    │   ├── solid/
    │   ├── dry/
    │   ├── kiss/
    │   └── yagni/
    ├── creational/             # Creational patterns
    │   ├── introduction/
    │   ├── factory/
    │   ├── abstractfactory/
    │   ├── builder/
    │   ├── singleton/
    │   └── prototype/
    ├── structural/             # Structural patterns
    │   ├── introduction/
    │   ├── adapter/
    │   ├── composite/
    │   ├── facade/
    │   ├── decorator/
    │   ├── bridge/
    │   ├── proxy/
    │   └── flyweight/
    ├── behavioral/             # Behavioral patterns
    │   ├── introduction/
    │   ├── strategy/
    │   ├── observer/
    │   ├── iterator/
    │   ├── command/
    │   ├── mediator/
    │   ├── state/
    │   ├── template/
    │   ├── chainofresponsibility/
    │   ├── visitor/
    │   └── memento/
    ├── concurrency/            # Java concurrency
    │   ├── threads/
    │   ├── threadpool/
    │   ├── executors/
    │   ├── synchronization/
    │   ├── communication/
    │   ├── locks/
    │   ├── semaphore/
    │   ├── collections/
    │   └── future/
    ├── lldproblems/            # LLD interview problems
    │   ├── tictactoe/
    │   ├── chess/
    │   ├── snakeladders/
    │   ├── parkinglot/
    │   ├── elevator/
    │   ├── inventory/
    │   ├── carrental/
    │   ├── vendingmachine/
    │   ├── filesystem/
    │   ├── logging/
    │   ├── splitwise/
    │   ├── atm/
    │   ├── moviebooking/
    │   ├── cache/
    │   ├── pubsub/
    │   └── ratelimiter/
    └── concurrencyproblems/    # Concurrency problems
        ├── printzero/
        ├── fizzbuzz/
        ├── blockingqueue/
        ├── philosophers/
        └── webcrawler/
```

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- Basic programming knowledge

### Build and Run
```bash
# Make build script executable
chmod +x build.sh

# Build the project
./build.sh

# Run the main class
java -cp out com.designpatterns.Main
```

## 📖 Recommended Learning Path

### Phase 1: Foundation (Weeks 1-3)
1. **LLD Crash Course** - Get overview
2. **Introduction to LLD** - Understand approach and tips
3. **OOPS Concepts** - Master all 10 topics thoroughly

### Phase 2: Design Principles (Week 4)
1. **SOLID Principles** - Critical foundation
2. **DRY, KISS, YAGNI** - Additional clean code principles

### Phase 3: Design Patterns (Weeks 5-10)
1. **Creational Patterns** (Weeks 5-6)
2. **Structural Patterns** (Weeks 7-8)  
3. **Behavioral Patterns** (Weeks 9-10)

### Phase 4: Concurrency (Weeks 11-12)
1. **Basic Threading** - Threads, pools, executors
2. **Advanced Concurrency** - Synchronization, locks, collections

### Phase 5: Problem Solving (Weeks 13-16)
1. **LLD Problems** - Start with simpler ones (Tic Tac Toe, Parking Lot)
2. **Concurrency Problems** - Apply threading knowledge
3. **Advanced Problems** - Complex systems (Chess, Elevator, Kafka)

## 📝 Study Strategy

### For Each Topic:
1. **Understand the Concept** - Read theory and examples
2. **Implement Code** - Write working examples
3. **Practice Variations** - Try different scenarios
4. **Document Learning** - Update PROGRESS.md with notes
5. **Review Regularly** - Reinforce understanding

### Best Practices:
- Follow the sequential order - each topic builds on previous ones
- Implement real examples, not just theoretical code
- Focus on understanding WHY each pattern/principle exists
- Practice explaining concepts in your own words
- Write clean, well-documented code

## 🎯 Progress Tracking

Use `PROGRESS.md` to track your journey:
- ⬜ Not Started
- 🔄 In Progress  
- ✅ Completed
- ❌ Needs Review

## 🔗 Resources

- **Primary Source**: [Code with Aryan - LLD](https://codewitharyan.com/system-design/low-level-design)
- **Books**: "Design Patterns" by Gang of Four, "Clean Code" by Robert Martin
- **Practice**: LeetCode, InterviewBit system design problems

---

**Happy Learning! 🎉**

Follow the structured path, implement each concept, and you'll master Low Level Design systematically!