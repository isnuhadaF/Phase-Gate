#Level Two

#Fire Drill 1
def fire_drill_1(fathers_age, sons_age):
    years_Count = 0
    for number in range(sons_age, fathers_age):
        if (2 * sons_age) != fathers_age:
            sons_age += 1
            fathers_age += 1
            years_Count = years_Count + 1
        else:
            print(fathers_age-sons_age)
    print(years_Count)
fire_drill_1(15, 40)

#Fire Drill 2
def fire_drill_2(score1, score2, score3):
    grade = ''
    average = (score1 + score2 + score3)/3
    if average <= 100 and average >= 90:
        grade = 'A'
        print(grade)
    elif average <= 90 and average > 80:
        grade = 'B'
        print(grade)
    elif average <= 80 and average > 70:
        grade = 'C'
        print(grade)
    elif average <= 70 and average > 60:
        grade = 'D'
        print(grade)
    elif average <= 60 and average > 0:
        grade = 'F'
        print(grade)
    
fire_drill_2(70, 80, 90)
