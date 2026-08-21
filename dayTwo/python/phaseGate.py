#Question 1
text_1 = "Hello"
text_2 = "World"

print(text_1 + text_2)

#Question 2
def mean_and_median():
    number_one = 50
    number_two = 70
    number_three = 20
    mean = (number_one + number_two + number_three)/3
    median = 0
    if number_one > number_two and number_one < number_three or (number_one < number_two and number_one >   number_three):
        median = number_one
    elif number_two > number_one and number_two < number_three or (number_two < number_one and number_two > number_three):
        median = number_two
    elif number_three > number_one and number_three < number_two or (number_three < number_one and number_three > number_two):
        median = number_three  
    print(median)
    print(mean)
mean_and_median()


#Question 3
def number_printer():
    for number in range(1,101):
        if number > 10:
            if ((number/10)+(number%10)) % 3 == 0:
                print("Skip")
            print(number)
        print(number)
number_printer()

#Question 4
def question4():
    for number in range(1,101):
        if number % 3 == 0:
            print("hello")
        elif number % 5 == 0:
            print("world")
        elif number % 7 == 0:
            print("orion")
        print(number)
question4()
