## CREATE SERVLET USING javax.servlet.Servlet interface



### 1. LIVE CYCLE METHOD OF INTERFACE

```java
public abstract void init(javax.servlet.ServletConfig);
public ServletConfig getServletConfig();
public void service(javax.servlet.ServletRequest,javax.servlet.ServletResponse);
public abstract java.lang.String getServletInfo();
public abstract void destroy();
```

- web.xml :deployement descriptor

**NB:** javax become jakarta.
