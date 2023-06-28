def lo_sqrt(x):
    if x == 0:
        print("Невозможно посчитать корень")
        return ValueError
    elif x < 0:
        print("Невозможно посчитать корень")
        return ValueError
    else:
        i = 1
        xn = 1
        while i <= 1000:
            res = 1 / 2 * (xn + (x / xn))
            xn = res
            i += 1

        return res
