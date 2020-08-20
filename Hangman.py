# library that we use in order to choose
# on random words from a list of words

import random

# Here the user is asked to enter the name first
print(" WELCOME to HANG MAN Gaming den !! ")
print("------------------------------------")
name = input("Enter your name : ")
print("All the best", name)

words = [
    "assumption", "gate", "independence", "currency", "youth", "technology", "actor", "length", "music", 
    "analysis", "investment", "singer", "night", "basis", "president", "lady", "drama", "college", "agency", "equipment"
    "engineering", "bonus", "department", "vehicle", "tennis", "meaning", "direction", "version", "cell", "university",
]

# Function will choose one random
# word from this list of words
word = random.choice(words)

print("\n Guess the characters")
guesses = ""

# any number of turns can be used here
turns = 15

while turns > 0:
    # counts the number of times a user fails
    failed = 0

    # all characters from the input
    # word taking one at a time.
    for char in word:
        if char in guesses:
            print(char, end="")
        else:
            print("_", end="")
            # for every failure 1 will be
            # incremented in failure
            failed += 1

    if failed == 0:
        # user will win the game if failure is 0
        print("\n\n Congartulations",name,"!! You Win :) ")

        # this print the correct word
        print("\n The word is : ", word)
        break

    # if user has input the wrong alphabet then
    # it will ask user to enter another alphabet
    guess = input("\n\n Guess the character : ")

    # every input character will be stored in guesses
    guesses += guess

    # check input with the character in word
    if guess not in word:
        turns -= 1

        # if the character doesn’t match the word
        # then “ Sorry, Try Again !! ” will be given as output
        print("\n Sorry, Try Again !! ")

        # this will print the number of
        # turns left for the user
        print("\n You have", +turns, "chances to guess... ")

        if turns == 0:
            print("\n\n Better luck next time !! ",name, "  :( ")
            
print("\n Thank you for playing !!! ")

