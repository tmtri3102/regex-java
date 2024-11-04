Regex
    Validating input
    java.util.regex
Define a regex
    vd:   \d{1,2}[-|/]\d{1,2}[-|/]\d{4}

\d{1,2} : nghĩa là một số có 1 hoặc 2 chữ số (ngày và tháng).
[-|/]   : nghĩa là ký tự - hoặc /.
\d{4}   : nghĩa là một số có 4 chữ số (năm)

~ array
    matches
    replaceAll
    replaceFirst
    split
    split(regex, limit)
    compare
    compareTo: 
        a = "A", b = "B", a.compareTo(b) < 0 // 'A B'
    ...

java.util.regex.Pattern
java.util.regex.Matcher

1. Define regex: String regex = ".*r$";

2. Assign pattern: Pattern pattern = Pattern.compile(regex)
- Pattern = blueprint, no constructor, compile() to create obj

3. Validate by matcher: Matcher matcher = pattern.matcher(varOfInput)
- matcher() create pattern object
- PatternSyntaxException is syntax exception

4. Check: s.o.p(match.matches()) // true/false

====================

String
    String var = ... // create object in heap, and var is reference variable
    => the object is inside "String constant pool"
    => String s = new String("hello) = "hello"
    
CharSequence
    display string
    co cac class implements: String, StringBuffer, StringBuilder
    => pretty similar to create a string
    - String: immutable
    - StringBuffer/Builder: mutable, save mem, faster manipulate
        append, delete, insert, reverse, deleteCharAt, replace, setCharAt














