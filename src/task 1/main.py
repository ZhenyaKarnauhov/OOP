import math
import lo_sqrt

user = float(input('Enter x:'))
print(f'My sqrt implementation: {lo_sqrt.lo_sqrt(user):.8f}')
print(f'Python STDLIB Math result: {math.sqrt(user):.8f}')
print(f'Python sum result: {lo_sqrt.lo_sqrt(user) - math.sqrt(user):.1f}')
