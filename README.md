# Word-Game
A basic word game

A player (user) is playing a game of words with the computer. The computer repeatedly asks a question to the player whose answer consists of fixed and known number of letters (characters). The first question has an answer of 4 letters, the second has 5 and finally the last question’s answer consists of exactly 6 letters. Each question has exactly one unique answer so that the players answers can be compared with the correct ones stored in the program as String arrays as will be explained later.
When a question is presented to the screen, after seeing the question the player has two choices: either gives the answer or requests a letter of the answer.
Example: Some possible scenarios for a question whose answer is “table” (having five letters).
Question to be displayed to the player (with an answer of 5 letters):


Scenario i:
A furniture to sit around for eating or studying?
Enter the answer 1 or request a letter 2: 1 ENTER
table ENTER
Correct! You gained 500 points.


Scenario ii:
A furniture sit around for eating or studying?
Enter the answer 1 or request a letter 2: 1 ENTER
chair ENTER
Wrong! You lost 500 points.


Scenario iii:
A furniture sit around for eating or studying?
Enter the answer 1 or request a letter 2: 2 ENTER
*a***
Enter the answer 1 or request a letter 2: 2 ENTER
*ab**
Enter the answer 1 or request a letter 2: 1 ENTER
table
Correct! You gained 300 points.


Scenario iv:
A furniture sit around for eating or studying
Enter the answer 1 or request a letter 2: 2 ENTER
**b**
Enter the answer 1 or request a letter 1: 1 ENTER
board
Wrong! You lost 400 points.


If the player gives an answer and it is correct, s/he will gain (letters-numberOfLettersRequested)*100 points. If the answer is wrong, s/he will lose (letters-numberOfLettersRequested)*100 points. Here, letter is the number of characters of the answer and numberOfLetersRequest is the total number of letters requested by the user before giving them the answer for this question.

In the above example letter is 5 (as the answer of the question has 5 letters world – “table”).
In scenario “i” at the first time without requesting a letter the user gives the correct answer (table). Hence, numberOfLettersRequest is 0 and s/he gains (5-0)*100 = 500 points (their accumulated points is increased by 500).

In scenario “ii” at the first time without requesting a letter the user gives the answer “chair” which is wrong, hence, (numberOfLettersReq is 0) s/he loses (5-0)*100 = 500 points (their accumulated pints is decreased by 500).

In scenario “iii” at the first time the user requests a letter (a randomly selected letter of “table” in this case its second letter ‘a’ is presented “*a***”), hence, numberOfLettersReq becomes 1, then the player requests a letter again (a second letter of the correct answer - in this case the third letter ‘b’ is presented together with the ‘a’ – “*ab**”). At this stage numberOfLettersReq becomes 2 after seeing “*ab**”; the user gives the correct answer and s/he gains (5-2)*100 = 300 points.

In scenario “iv” at the first time the user requests a letter (a randomly selected letter of “table” in this case its third letter ‘b’ is presented – “**b**”), hence, numberOfLettersReq is 1, then the user gives the answer but it is incorrect. So, numberOfLettersReq is still 1, and s/he loses (5-1)*100 = 400 points.
