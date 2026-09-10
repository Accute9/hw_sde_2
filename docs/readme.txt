Pseudocode:

track number of correct guesses and incorrect guesses
get sonnet in a list
generate random index within the length of the list
print every word until that index
ask user to guess word
compare guess to the word from the sonnet array at that random index
if correct, increase correct guesses by 1, else increase incorrect guesses by 1
repeat while correct guesses and incorrect guesses less than 3

Note: Punctuation must be included

Tests:
1. word = "eternal", guess = "eternal", num_correct = 2, num_wrong = 1 -> correct: num_correct = 3, num_wrong = 1, end loop
2. word = "death", guess = "brag", num_correct = 1, num_wrong = 0 -> wrong: num_correct = 1, num_wrong = 2, continue
3. word = "possession", guess = "possession", num_correct = 1, num_wrong = 2 -> correct: num_correct = 2, num_wrong = 2, continue
4. word = "day?", guess = "day", num_correct = 1, num_wrong = 2 -> wrong: num_correct = 1, num_wrong = 3, end loop
5. word = "wander'st", guess = "wander'st", num_correct = 0, num_wrong = 0 -> correct, num_correct = 1, num_wrong = 0