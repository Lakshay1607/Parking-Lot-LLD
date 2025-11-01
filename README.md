# 🅿️ Dynamic Parking Lot Management System  
![Java](https://img.shields.io/badge/Language-Java-blue)
![Design](https://img.shields.io/badge/Focus-LLD%20%26%20OOP-green)
![Status](https://img.shields.io/badge/Status-Complete-success)

---

## 🧩 Overview  
A **scalable Parking Lot Management System** designed using object-oriented principles and clean low-level design practices.  
The system supports multiple floors, spot types, payment methods, and ensures thread-safe booking and release operations.

---

## ⚙️ Features  
- 🚗 Supports multiple vehicle types (Car, Bike, Truck, EV, etc.)  
- 🏢 Handles multiple floors and dynamic spot allocation  
- 💳 Multiple payment methods (Cash, Card, UPI)  
- 🧵 Thread-safe booking using concurrency control  
- 🧰 Modular and extensible design using Strategy & Factory patterns  
- 🧾 Clear separation of concerns between models, services, and managers  

---

## 🧱 Architecture & Design  
The system is modeled around **real-world entities** like Floors, Spots, Vehicles, Tickets, and Payment Modules.  
Each class encapsulates its responsibilities following SOLID principles.  

### Class Overview  
| Layer | Description |
|-------|--------------|
| **Model Layer** | Entities like `Vehicle`, `ParkingSpot`, `Ticket`, etc. |
| **Service Layer** | Handles core logic like spot allocation, ticketing, and payments |
| **Manager Layer** | Entry point to control system behavior and orchestration |
| **Util Layer** | Helper classes and enums |

---

## 💡 Design Patterns Used  
### 🧱 Creational Patterns  
- **Singleton Pattern** → Used for `ParkingLotManager` to ensure a single access point for managing parking floors and spots.  
- **Factory Pattern** → Handles creation of different `Vehicle` or `Payment` objects dynamically based on type.

### ⚙️ Structural Patterns  
- **Adapter Pattern** → Integrates multiple payment gateways with a unified interface.

### 🔄 Behavioral Patterns  
- **Strategy Pattern** → Used for dynamic selection of pricing algorithms or payment methods.  
- **Observer Pattern** → Used for notification or event-driven updates (e.g., spot availability or payment completion).  
- **Command Pattern** → Used for handling parking actions (entry, exit, pay) as commands for better logging and retry support. 

---

## 🧠 Learning Outcomes  
- Practiced **object-oriented decomposition** using the *Noun-Verb Technique*.  
- Applied **design principles** (SRP, OCP, DIP).  
- Implemented **thread-safe operations** and modular architecture.  
- Understood **trade-offs** between extensibility, performance, and simplicity.
