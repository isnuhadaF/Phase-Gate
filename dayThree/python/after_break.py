#After Break
# Write a function that takes a string and returns the count of case sensitive alphabetic characters and numeric digits that occurs more than once in the inputted string. The input string can be assumed to contain any alphabet, both upper or lower case

def character_counter(string):
    character_count = 0
    for character in string:
        if character == character.upper() and character == character.lower():
            character_count += 1
        elif character == '1' or character == '2' or character == '3' or character == '4' or character == '5' or character == '6' or character == '7' or character == '8' or character == '9':
            character_Count += 1
            print(character)
    print(string, 'has', character_count, 'characters')    
string = input("Enter a random collection of characters: ")
character_counter(string)
