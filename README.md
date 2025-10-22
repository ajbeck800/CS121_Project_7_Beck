# CS121_Project_7_Beck
## (lab) The Java Guesser

### int main():
```
int keepGoing starts true
get menuRequest from menu()

while keepGoing = true:
    if menuRequest = 0:
        set keepGoing to false
    else if menuRequest = 1:
        send user to humanGuesser
    else if menuRequest = 2:
        send user to computerGuesser
    else:
        print "Invalid Selection. Select 0-2: "
```

### int menu():
```
Print a menu with options exit, human guesser, and computer guesser
Print "Select 0-2: "
Store input in string menuRequest

return menuRequest
```

### void humanGuesser():
```
int guess starts -999
int correct will be randomly generated later
int turns starts at 0
int keepGoing starts true

generate a random between 1 and 100, put in correct

while keepGoing is true:
    increment turns
    ask for a number
    put it in guess
    if guess < correct:
        print "too low..."
    else if guess > correct:
        print "too high..."
    else:
        print "got it!"
        set keepGoing to false
```

### void computerGuesser():
```
int guess is randomly generated
string feedback is inputted by user
int turns starts at 0
int keepGoing starts true

generate a random between 1 and 100, put in guess
print guess

while keepGoing is true:
    increment turns
    ask user to enter h, l, or c (Too High, Too Low, or Correct)
    put it in feedback
    if feedback = "h":
        generate a random between 1 and guess, put in guess
        print guess
    else if feedback = "l":
        generate a random between guess and 100, put in guess
        print guess
    else:
        set keepGoing to false
```