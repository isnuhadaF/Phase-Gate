sum_total = 0

print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    if score >= 0 and score <= 100:
        sum_total = sum_total + score
    else:
        print('Invalid Score')
print("The sum of scores is:", sum_total)
