A simple 20 line templating engine written in Java. If you need something simple and to the point
This is the tool for you. Please don't complain it lacks feature, it's SIMPLE.

## Java Tiny Templating engine

```java
new T("Hello {who}!").add("who", "Java").render()
 // return Hello Java!
 
new T("Hello {who}! It's {time} ms since epoch. Yay {who}")
  .add("who", "Java")
  .add("time", "17-Mar-2010")
  .render()
 // return Hello Java! It's 17-Mar-2010 ms since epoch. Yay Java
```

> The `toString` method of the object passed must be implemented of the object ID will be returned during transposing process

[![Build Status](https://travis-ci.org/ferronrsmith/tiny-template-engine-java.svg)](https://travis-ci.org/ferronrsmith/tiny-template-engine-java)

A JavaScript version can be foud here : [Tiny Template Engine](https://github.com/ferronrsmith/tiny-template-engine)
