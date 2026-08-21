even_sum_total = 0
even_score_average = 0
even_counter = 0
even_counter = int(even_counter)

print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    if score % 2 == 0:
        even_sum_total = even_sum_total + score
        even_counter += 1

even_score_average = even_sum_total/even_counter
print("The average of even scores is:", even_score_verage)
print("The sum of even scores is:", even_sum_total)
