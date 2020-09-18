str = input()
vowels = 0
digits = 0
consonants = 0
spaces = 0
symbols = 0
str = str.lower()
for i in range(0, len(str)):
 if(str[i] == "a"or str[i] == "e" or str[i] == "i" or str[i] == 'o' or str[i] == 'u'):
  vowels = vowels + 1
 elif((str[i] >= 'a'and str[i] <= 'z')):
  consonants = consonants + 1
 elif( str[i] >= '0' and str[i] <= '9'):
  digits = digits + 1
 elif (str[i] ==' '):
  spaces = spaces + 1
 else:
  symbols = symbols + 1
print("Vowels:{}".format(vowels));
print("Consonants:{}".format(consonants));
print("White Spaces:{}".format(spaces));
print("Digits:{}".format(digits));
print("Symbols:{}".format(symbols));