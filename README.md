# 🎮 Flipper Arcade – Design Patterns Project

## Overview

This project is a console-based **Flipper (Pinball) simulation** implemented in Java.  
The primary goal of the project is not graphical gameplay, but the structured and clean implementation of multiple **design patterns** in a cohesive architecture.

---

## Implemented Design Patterns

### 1. Singleton

The `Flipper` class is implemented as a Singleton.

- Ensures only one game machine exists.
- Provides global access via `getInstance()`.
- Controls state, score, credit, and game flow.
- Targets, Bumpers, Ramp entries and internal elements grant points when hit. Points are managed centrally by the `Flipper`.

---

### 2. State Pattern

The game flow is controlled using the State pattern.

Implemented states:
- `NoCreditState`
- `ReadyState`
- `PlayingState`

Responsibilities:
- Handle user input differently depending on current state.
- Control transitions (e.g., Ready → Playing → Game Over).
- Keep state-specific behavior separated.

---

### 3. Command Pattern

Commands encapsulate actions such as adding points.

Example:
- `PointAddCommand`

Benefits:
- Decouples action execution from invocation.

---

### 4. Macro Command

A macro command groups multiple commands into a single executable action.

---

### 5. Mediator Pattern

A `TargetMediator` coordinates interaction between:

- Targets
- ActionRamp

Responsibilities:
- Detect when all targets are hit.
- Trigger ramp opening.
- Centralize communication logic.

This avoids direct dependencies between elements.

---

### 6. Composite Pattern

The `ActionRamp` is implemented as a composite element.

- Implements the same `Element` interface as `Target` and `Bumper`.
- Can contain child elements (e.g., bumpers, ramp targets).
- Allows uniform treatment of single elements and grouped elements.

---

### 7. Adapter Pattern

A `LegacyObstacle` class was integrated using an adapter:

- `LegacyObstacleAdapter` implements `Element`.
- Wraps the incompatible legacy class.
- Enables seamless integration into the ramp.

This demonstrates how legacy systems can be integrated cleanly.

---

### 8. Abstract Factory Pattern

The display output is implemented using the Abstract Factory pattern.

Two font families are supported:
- Block-style ASCII font
- Retro-style ASCII font

The factory determines which display implementation is used.

Responsibilities:
- Generate display output such as:
  - "Press Start"
  - "Game Over"

The selected factory controls the appearance without modifying game logic.

---

### 9. Builder Pattern

The `FlipperBuilder` is responsible for constructing and configuring the flipper table.

Responsibilities:
- Add targets
- Add bumpers
- Add ramp
- Configure the machine

This removes construction logic from the `Flipper` class and improves separation of concerns.


