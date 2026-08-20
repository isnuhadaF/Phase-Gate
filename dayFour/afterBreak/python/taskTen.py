valid_sum_total = 0
valid_average = 0
valid_counter = 0
print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    if score >= 0 and score <= 100:
        valid_sum_total = valid_sum_total + score
        valid_counter += 1
    else:
        print('Invalid Score')
valid_average = valid_sum_total/valid_counter
print("The average of valid scores is:", valid_average)
