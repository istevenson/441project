This is the final project for CS 441: Programming Languages and Applications taught by Professor Brian Hare.

The following is the game logic per the project guidelines.

THE PROBLEM:
Consider a simple game consisting of a series of n coins (n is even) of various denominations laid in a
row. (For our purposes, the denominations do not have to match any actual real-world coins, but all
have a value greater than 0.) Two players take turns, alternately removing a coin from either end of the
row and keeping the coin so removed. Play continues until all coins are removed; the object is to end
with a higher total value than the opponent.

THE SOLUTION:
User is asked for the name of an input file. The file contains nothing but
integers; the first integer is the number of coins, followed by the values of each coin, in the order
they will be arranged for the game. All values are separated by whitespace. Once the values have been read, the expected score for each player is calculated assuming best play by both sides. The program should also times how long it takes to reach the correct answer, excluding I/O time.

The final solution is multithreaded. 
