# JSP TAG



- Use Tomcat 9 not 10

- **JSTL**

```java
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```



### CUSTOM TAG

- create tld file in WEB-INF

- access

```java
<%@ taglib prefix="t" uri="/WEB-INF/tlds/custom.tld" %>
```



### IMPLICIT OBJECT

There are 9 jsp implicit objects .These objects are created  by the web container that are available to all jsp pages.

La liste : **out, request,response,config,application,session,pageContext,page,exception** .



- web.xml

```java
        <init-param>
            <param-name>dname</param-name>
            <param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>
        </init-param>
```

```java
<context-param>
        <param-name>David</param-name>
        <param-value>David is a developper</param-value>
    </context-param>
```

The do the same thing :ne pas les mettre ensemble
