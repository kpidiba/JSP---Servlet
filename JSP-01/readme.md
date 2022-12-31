# JSP

- file with extension **jsp**

- JSP is an extension to Servlet because  it provides  more functionnality than servlet such as expression language, JSTL

- A JSP page consists of HTML tags and JSP tags

- The JSP pages are easier to maintain than Servlet because we can separate design and development

- it provides additonal features sucha as Expression Language, Custom Tags,etc.

- Less code than Servlet

- **Fast Developmen**t : no need to recompile and redeploy like **Servlet** 

### TAGS

- Declaration tag

```java
<%! int a =10,String name="jojo" %>
```

- Expression tag

```java
<%= a %>
```

- Scriptlet Tag

```java
<% req.getParameter();out.print("ok") %>
```

### JSP DIRECTIVES

There are messages that tells the web container how to translate a JSP page to corresponding servlet.    

There are three types of directivess

- **page directive** : defines attributes that apply  to an entire JSP page.

```java
<%@ page  attribute="value" %>
```

 **Attributes** : import,contentType,extends,info,buffer,language,isELIgnored,isThreadSafe,autoFlush,session,pageEconding,errorPage,isErrorPage.

- **include directive**

```java

```

- **taglib directive**
