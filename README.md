---

# 🐶 Pet Simulator (Java Console App)

A console-based **Java pet simulation game** where you take care of a virtual dog named **Rover**. Manage Rover’s needs by choosing actions that affect their stats—while keeping everything within healthy limits.

This project was created as part of the Java Checkpoint Project on **Codédex**.

---

## 📖 Overview

[**Pet Simulator**](https://www.codedex.io/@Ajaw/build/pet-simulator) is an interactive Java program that simulates caring for a pet through simple text commands. The player chooses actions like playing, eating, or sleeping, and each action affects Rover’s stats.

The game continues until the player quits—or Rover’s needs are pushed too far 😬.

---

## 📊 Pet Stats

Rover has **three core stats**, each starting at **10**:

* 🍗 **Hunger**
* ⚡ **Energy**
* 🐾 **Social**

### Stat Rules

* Stats must stay between **0 and 10**
* If an action would push a stat **above 10 or below 0**, the action is blocked
* Rover reacts with dialogue and ASCII art when limits are reached

---

## 🎮 Available Actions

| Key | Action    | Effect                          |
| --- | --------- | ------------------------------- |
| `p` | **Play**  | -1 Social, -2 Hunger, -2 Energy |
| `e` | **Eat**   | +2 Hunger, -1 Energy            |
| `s` | **Sleep** | +2 Energy, +1 Social            |
| `q` | **Quit**  | Ends the simulation             |

Each action displays **custom ASCII art** and feedback from Rover.

---

## 🧠 How It Works

* Uses a `Scanner` to read player input
* Temporary variables (`tempSocial`, `tempHunger`, `tempEnergy`) are used to **validate actions before applying them**
* Two helper methods enforce stat boundaries:

  * `tooMuch()` → prevents stats from exceeding 10
  * `tooLess()` → prevents stats from dropping below 0
* The simulation runs in a loop until the user quits

---

## 🛠️ Technologies Used

* **Java**
* Console input/output (`Scanner`)
* Control flow (`while`, `switch`)
* Static methods and variables

---

## ▶️ How to Run

1. Clone the repository
2. Compile the program:

   ```bash
   javac HelloWorld.java
   ```
3. Run the simulator:

   ```bash
   java HelloWorld
   ```

---

## 🎨 ASCII Art Credits

All ASCII art used in this project is sourced from:

🔗 [https://www.asciiart.eu/animals/dogs](https://www.asciiart.eu/animals/dogs)

---

## Project Context

This project was completed for the **Java Checkpoint Project** at Codédex:
🔗 [https://www.codedex.io/java/checkpoint-project/pet-simulator](https://www.codedex.io/java/checkpoint-project/pet-simulator)

---

## Possible Improvements

* Add difficulty levels
* Save/load pet state
* Convert to an object-oriented design with a `Pet` class

---
