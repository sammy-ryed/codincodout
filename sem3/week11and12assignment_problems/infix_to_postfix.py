def precedence(op):
    if op in ('+', '-'):
        return 1
    if op in ('*', '/'):
        return 2
    return 0

def infix_to_postfix(expression):
    stack = []
    result = ''
    for ch in expression:
        if ch.isalnum():
            result += ch
        elif ch == '(':
            stack.append(ch)
        elif ch == ')':
            while stack and stack[-1] != '(':
                result += stack.pop()
            stack.pop()
        else:
            while stack and precedence(stack[-1]) >= precedence(ch):
                result += stack.pop()
            stack.append(ch)
    while stack:
        result += stack.pop()
    return result

expr = input("Enter infix expression: ")
print("Postfix expression:", infix_to_postfix(expr))