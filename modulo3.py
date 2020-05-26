#use equality sign to compare the strings
print("ACDC" == "Michael Jackson")

#compare characters
print('BA'>'AB')

#if statetment example
age = 19
if age > 18:
    print("Eres legal")
print("Ya se salió")

#if else
age = 19
if age > 18:
    print("Eres legal")
else:
    print("Go see Meat Loaf")
print("Ya se salió")

#elif
age = 19
if age > 18:
    print("Eres legal")
elif age == 18:
    print("legal")
else:
    print("carcel seguro")
print("Ya se salió")

#or
manzana = 19
if(manzana<18)or(manzana>20):
    print("comprar")
else:
    print("no compres")

#loop for
dates = [1982,1980,1973]
N = len(dates)

for i in range(N):
    print(dates[i])

#loop while
dates = [1982,1980,1973,2000]
i = 0
year = 0
while(year != 1973):
    year = dates[i]
    i += 1
    print(year)
print("It took ", i, " repeticiones del ciclo")

#function example
def add(a):
    b = a + 1
    print(a, " si agregamos uno más ", b)
    return(b)

add(1)

#function to multiply two numbers
def mult(a,b):
    c = a*b
    return(c)

mult(9,2)