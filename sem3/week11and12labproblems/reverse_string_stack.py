def reverse_string(s):
    stack = []
    for ch in s:
        stack.append(ch)
    rev = ''
    while stack:
        rev += stack.pop()
    return rev

s = input("Enter a string: ")
print("Reversed string:", reverse_string(s))