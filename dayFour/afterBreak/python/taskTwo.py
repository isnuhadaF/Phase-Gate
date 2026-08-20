
sum_total = 0
average = 0
counter = 0
counter = int(counter)

print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    sum_total = sum_total + score
    counter += 1
average = sum_total/counter
print("The average score is:", average)
