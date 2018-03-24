def name = 'UserName'
def text = 'hello %s'
def result = String.format(text, name)
println(result)
assert result == 'hello UserName'