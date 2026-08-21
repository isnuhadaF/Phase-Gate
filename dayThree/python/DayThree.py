#DayThree

#Question 1: Reverse a given string using a for loop.
def string_reversal():
	string = "something"
	for letter in string:
		print(letter)
string_reversal()

#Question 2: Print the reverse of an integer number.
def integer_Reversal(number):
    revered_number = 0
    temp_holder = 0
    
    #while number > 0:
integer_Reversal(200)

#Question 3: Count how many uppercase letters are in a string.
#Question 4: Count how many lowercase letters are in a string.
#Question 5: Find the position of the first vowel in a string.
def vowel_position_in_a_string(string):
    for index in range(len(string)):
        if index == 'a' or index == 'e' or index == 'i' or index == 'o' or index == 'u' or index == 'A' or index == 'E' or index == 'I' or index == 'O' or index == 'U':
            print(index)
vowel_position_in_a_string('bla-bla-blacksheep')




#Question 6: Print each character of a string with its ASCII value.
def ascii_value_printer():
    name = 'Oludotun'
    for letter in name:
        print(ord(letter))
ascii_value_printer()

#Question 7: Find the average of numbers from 1-10.
def average_of_numbers_1_to_10():
    total = 0
    count = 0
    for number in range(1,11):
        total += number
        count += 1
    average = total/count
    print('\n\nThe average of numbers 1 to 10 is:', average)
average_of_numbers_1_to_10()

#Question 8: Print the divisors of a given number.
def divisor_printer(a_given_number):
    for divisor in range(1, a_given_number+1):
        if a_given_number % divisor == 0:
            print(divisor, 'is a divisor of',a_given_number)
divisor_printer(100)
    
#Question 9: Count the number of divisors of a given number.
def divisor_counter(a_given_number):
    divisor_count = 0
    for divisor in range(1, a_given_number+1):
        if a_given_number % divisor == 0:
            divisor_count += 1
    print(a_given_number, 'has', divisor_count, 'divisors')
divisor_counter(200)
