even_sum_total = 0
even_counter = 0
even_counter = int(even_counter)

print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    if score % 2 == 0:
        even_sum_total = even_sum_total + score
        even_counter += 1
print("The sum of even scores is:", even_sum_total)
