#read a file
ejemplo = "example1.txt"
file1 = open(ejemplo,"r")
file1

print(file1.name)

print(file1.mode)

lee = file1.read()
print(lee)

file1.close()

with open(ejemplo,"r") as archivo:
    FileContent = archivo.read()
    print(FileContent)

