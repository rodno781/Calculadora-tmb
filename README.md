# BMR & TDEE Calculator in Java 🧮

A Java console application designed to calculate **Basal Metabolic Rate (BMR)** and **Total Daily Energy Expenditure (TDEE)** based on user inputs such as gender, age, weight, height, and physical activity level.

---

## 📌 Features

- **Input Validation:** Prevents invalid entries for age, weight, and height (must be greater than zero).
- **Flexible Text Recognition:** Accepts common gender inputs (e.g., `male`, `man`, `female`, `woman`).
- **Locale-Friendly Formatting:** Automatically normalizes decimal separators (replaces commas `,` with dots `.`).
- **Activity Level Factor:** Multiplies BMR by an activity multiplier to estimate total daily caloric needs.

---

## 🛠️ Technologies Used

- **Language:** Java (JDK 8+)
- **IDE / Environment:** VS Code
- **Core Library:** `java.util.Scanner`

---

## 📊 Formulas Used

### Mifflin-St Jeor Equation (BMR)
- **Male:** `BMR = (10 × weight) + (6.25 × height) - (5 × age) + 5`
- **Female:** `BMR = (10 × weight) + (6.25 × height) - (5 × age) - 161`

### Physical Activity Multipliers (TDEE)
- **Low Activity:** `BMR × 1.2`
- **Medium Activity:** `BMR × 1.375`
- **High Activity:** `BMR × 1.725`

---

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/rodno781/Calculadora-tmb.git