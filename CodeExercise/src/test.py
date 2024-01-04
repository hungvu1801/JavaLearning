def getLargestPrime(number):
    if number <= 1:
        return -1
    for i in range(2, int(number + 1)):
        if number % i == 0:
            return getLargestPrime(int(number / i))
    return number
def print_start(number):
    for rowNum in range(1, number + 1):
        for colNum in range(1, number + 1):
            if rowNum == 1 or rowNum == number:
                print('*', end="")
            elif colNum == 1 or colNum == number:
                print('*', end="")
        print()
# getLargestPrime(21)
print_start(5)