sum_total = 0
even_index_counter = 0
even_index_counter = int(even_index_counter)

print("Enter your scores below: ")
for scores in range(1, 11):
    score = int(input())
    if scores % 2 == 0:
        sum_total = sum_total + score
        even_index_counter += 1
print("The sum of even-indexed scores is:", sum_total)
