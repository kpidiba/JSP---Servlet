## SESSION TRACKING IN SERVLET

**Session Tracking(State management)** is a way to maintain state (data) of an user.

### COOKIES IN SERVLET

**Cookies** are the textual  information which are stored in key value pair format to the client's browser during multiple requests.

- In order to use Cookie in java,there are **Cookie** class in java present in **javax.servlet.http** package.

```java
Cookie co = new Cookie("name","value");
```

- to add cookie to the response , just use **addCookie()** method of response interface.

- recuperer request.getCookies() : tableau de cookies.

- cookie are used in client side

- cookies defined in key value pair



### SESSIONS TRACKING TECHNIQUES

- Cookies

- hidden form field

- urld rewriting

- HttpSession
