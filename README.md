# CS121_Project_7_Beck
## (lab) The Java Guesser

### void main():
```
boolean keepGoing starts true
set int menuRequest to -999

while keepGoing = true:
    call menu(), put result in menuRequest
    if menuRequest = 0:
        set keepGoing to false
    else if menuRequest = 1:
        call humanGuesser()
    else if menuRequest = 2:
        call computerGuesser()
    else:
        print "Invalid Selection. Select 0-2: "
```

### int menu():
```
Print a menu with options exit, human guesser, and computer guesser
Print "Select 0-2: "
Store input in int menuRequest

return menuRequest
```

### void humanGuesser():
```
int guess starts -999
int turns starts at 0
int keepGoing starts true

correct generate a random between 1 and 100, set to int correct

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
int guess starts -999
int lower starts at 1
int upper starts at 100
int turns starts at 0
int keepGoing starts true

while keepGoing is true:
    set int guess to the mean of lower and upper
    use a rounding function to round guess down
    increment turns
    ask user to enter h, l, or c (Too High, Too Low, or Correct)
    put it in string feedback
    if feedback = "h":
        set upper to guess
    else if feedback = "l":
        set lower to guess
    else:
        set keepGoing to false
```