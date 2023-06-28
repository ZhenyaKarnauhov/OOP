import sys

geron = list(map(int, (sys.argv[1].split('='))[1].split(',')))
summ = 0
for num in geron:
    summ += 1 / num * 3
print(summ)
