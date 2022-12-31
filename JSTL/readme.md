# JSTL

The JSP Standard Tag Library    (JSTL) represents a set of tags to simplify the JSP development.

```java
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```

### ADVANTAGES

- Fast Development JSTL provides many tags that simplify the JSP

- Code Reusability We can use the JSTL Tags on various pages

- NO need to use scriptlet tag it avoids to use of scriptlet tag



### JSTL TAGS

- Core Tags

- Functions Tags

- Formatting Tags

- XML Tags

- Sql Tags



1. **c:out** = It display the result of an expression , similar to the way <%=%>

2. **c:import** = It retrieves relative or an absolute url and display the contents to either a String in 'var' , a Reader in 'varReader' or a Page

3. **c:set**  = It sets the result of an expression under evaluation in a 'scope' variable

4. **c:remove** = It used  for removing the specified scope variable from a particular

5. **c:catch** = It is used to Catch any Throwable Exception that occurs in the body

6. **c:if** = It is conditional tag used for testing condition and display body content if condition is true 

7. **c:choose,c:when,c:otherwise** = It is simple conditional tag that includes  its body content  if evaluated condition is true 

8. **c:forEach** = It is a basic iteration tag

9. **c:forTokens** = It iterates over tokens which is separated by  the supplied delimiters

10. **c:param** = It adds a parameter in a containing 'import' tag's URL

11. **c:redirect** = It redirects to new url

12. **c:url** = creates a URL with optional query parameters



### FUNCTIONS TAG

It provides a number of standard functions ,most of these  function are common string manipulation functions

```java
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
```

- fn:contains();

- fn:trime();

- fn:split();

- fn:toLowerCase;

- ...



### FILTERS

- A filter is an object that is invoked at the preprocessing   and postprocessing of a request

- **Before** and **After** servlet execution to  filter data.

- 
