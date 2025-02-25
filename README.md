# Inverse-Multiplicative-Algorithm-in-Java

This is a showcase of an implementation of the Extended Euclidean Algorithm for finding the inverse multiplicative of a key with a known modulus.
This algorithm finds common use in the cryptographic algorithm RSA.

The value of b in the following equation

`` a * b ≡ 1 (mod m) ``

can be calculated as:

```java
int b = inverseKey(m, a)
```

Note however that this function is merely a showcase and not a class which can be directly imported.
