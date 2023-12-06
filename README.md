## About Utility System

---

In video game AI, a utility system, or utility AI, is a simple but effective way to model behaviors for non-player characters. Using
numbers, formulas, and scores to rate the relative benefit of possible actions, one can assign utilities to each action. A behavior can then
be selected based on which one scores the highest "utility" or by using those scores to seed the probability distribution for a weighted
random selection. The result is that the character is selecting the "best" behavior for the given situation at the moment based on how those
behaviors are defined mathematically.

## Utility System Concept

---

| Concept   | Explanation                                                                         |
|-----------|-------------------------------------------------------------------------------------|
| Selector  | Selects the best Qualifier from the Qualifiers attached to the Selector             |
| Qualifier | Calculates a score that represents the utility/usefulness of its associated action. |
| Scorer    | A method for calculating scores that can be reused across Qualifiers.               |
| Action    | The action that the AI executes when a specific Qualifier is selected.              |
| Context   | The information available to the AI when calculating the scores.                    |