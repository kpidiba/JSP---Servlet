# HTTPSESSION

In such case ,container creates  a session id for each user. The container uses this id to identify the particular user.

```java
HttpSession session = req.getSession();
session.setAttribute("objname","value");
session.getAttribute("objname");
session.removeAttribute("objname");
session.invalidate();
```
