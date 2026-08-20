
sum_total = 0

print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    sum_total = sum_total + score
print("The total of the scores input is:", sum_total)
