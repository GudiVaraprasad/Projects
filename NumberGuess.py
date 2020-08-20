
import random

n = random.randint(1, 100)
count = 1
guess_chances = 10

while 1 <= guess_chances:
    num = int(eval(input("Guess the Number: ")))
    if num > n:
        print("Your guess was too high: Guess a number lower than", num)
    elif num < n:
        print("Your guess was too low: Guess a number higher than", num)
    else:
        print(" You Win !! ")
        print(count, "gueses you took")
        break
    guess_chances -= 1
    print(guess_chances, "Guesses Left")
    count += 1
    print()

print("Game over !! ")
print("Number is : ", n)
